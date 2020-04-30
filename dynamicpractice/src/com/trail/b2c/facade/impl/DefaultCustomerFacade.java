/**
 *
 */
package com.trail.b2c.facade.impl;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.trail.b2c.facade.CustomerFacade;
import com.trail.b2c.service.customerService;


public class DefaultCustomerFacade implements CustomerFacade
{
	@Autowired
	private customerService customerservice;

	@Override
	public Date register()
	{
		return customerservice.search();
	}
}
