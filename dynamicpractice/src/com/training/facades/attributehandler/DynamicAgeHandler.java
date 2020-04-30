package com.training.facades.attributehandler;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.dynamicattribute.model.CustomerDeatilsModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;

import java.util.Calendar;
import java.util.Date;


public class DynamicAgeHandler extends AbstractDynamicAttributeHandler<Integer, CustomerModel>
{

	public static int age;

	public Integer get(final CustomerDeatilsModel model)
	{
		int customerAge = 0;
		try
		{
			final Date customerdob = model.getDob();
			final Calendar cal = Calendar.getInstance();
			cal.setTime(customerdob);
			final int registeredYear = cal.get(Calendar.YEAR);
			final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
			customerAge = currentYear - registeredYear;
		}
		catch (final Exception e)
		{
			e.printStackTrace();
		}
		return customerAge;
	}


}



