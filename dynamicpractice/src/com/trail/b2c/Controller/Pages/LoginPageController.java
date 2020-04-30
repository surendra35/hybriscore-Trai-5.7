/**
 *
 */
package com.trail.b2c.Controller.Pages;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.trail.b2c.facade.CustomerFacade;
import com.trail.b2c.learning.forms.RegisterForm;


/**
 * @author admin
 *
 */
public class LoginPageController
{
	@Autowired
	private CustomerFacade customerFacade;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String doRegister(@RequestHeader(value = "referer", required = false)
	final String referer, final RegisterForm form, final BindingResult bindingResult, final Model model,
			final HttpServletRequest request, final HttpServletResponse response, final RedirectAttributes redirectModel)
			throws ClassNotFoundException

	{
		// getRegistrationValidator().validate(form, bindingResult);
		return processRegisterUserRequest(referer, form, bindingResult, model, request, response, redirectModel);
	}

	protected String processRegisterUserRequest(final String referer, final RegisterForm form, final BindingResult bindingResult,
			final Model model, final HttpServletRequest request, final HttpServletResponse response,
			final RedirectAttributes redirectModel) throws ClassNotFoundException
	{

		if (bindingResult.hasErrors())
		{
			model.addAttribute(form);
		}

		final RegisterForm data = new RegisterForm();

		data.setDob(form.getDob());
		System.out.println(" data is set" + form.getDob());
		try
		{
			getCustomerFacade().register();

		}
		catch (final Exception e)
		{
			e.printStackTrace();

		}

		//return REDIRECT_PREFIX + getSuccessRedirect(request, response);
		return "g";
	}


	/**
	 * @return the customerFacade
	 */
	public CustomerFacade getCustomerFacade()
	{
		return customerFacade;
	}

	/**
	 * @param customerFacade
	 *           the customerFacade to set
	 */
	public void setCustomerFacade(final CustomerFacade customerFacade)
	{
		this.customerFacade = customerFacade;
	}
}
