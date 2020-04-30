/**
 *
 */
package com.trail.b2c.serviceimpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.trail.b2c.DAO.CustomerDAO;
import com.trail.b2c.service.customerService;


/**
 * @author admin
 *
 */
public class DefaultCustomerServiceimpl implements customerService
{
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public Date search()
	{
		return customerDAO.search();
	}


}
