/**
 *
 */
package com.trail.b2c.learning.forms;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * @author admin
 *
 */
public class RegisterForm
{

	private Date Dob;

	@DateTimeFormat(pattern = "dd/mm/yyyy")
	public Date getDob()
	{
		return Dob;
	}


	public void setDob(final Date dob)
	{
		Dob = dob;
	}



}
