/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 29, 2020 11:16:43 AM                    ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.dynamicattribute.jalo;

import de.hybris.platform.dynamicattribute.constants.DynamicpracticeConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Customer;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.Customer CustomerDeatils}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCustomerDeatils extends Customer
{
	/** Qualifier of the <code>CustomerDeatils.custId</code> attribute **/
	public static final String CUSTID = "custId";
	/** Qualifier of the <code>CustomerDeatils.dob</code> attribute **/
	public static final String DOB = "dob";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Customer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CUSTID, AttributeMode.INITIAL);
		tmp.put(DOB, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerDeatils.custId</code> attribute.
	 * @return the custId
	 */
	public Integer getCustId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CUSTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerDeatils.custId</code> attribute.
	 * @return the custId
	 */
	public Integer getCustId()
	{
		return getCustId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerDeatils.custId</code> attribute. 
	 * @return the custId
	 */
	public int getCustIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCustId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerDeatils.custId</code> attribute. 
	 * @return the custId
	 */
	public int getCustIdAsPrimitive()
	{
		return getCustIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerDeatils.custId</code> attribute. 
	 * @param value the custId
	 */
	public void setCustId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CUSTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerDeatils.custId</code> attribute. 
	 * @param value the custId
	 */
	public void setCustId(final Integer value)
	{
		setCustId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerDeatils.custId</code> attribute. 
	 * @param value the custId
	 */
	public void setCustId(final SessionContext ctx, final int value)
	{
		setCustId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerDeatils.custId</code> attribute. 
	 * @param value the custId
	 */
	public void setCustId(final int value)
	{
		setCustId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerDeatils.dob</code> attribute.
	 * @return the dob
	 */
	public Date getDob(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerDeatils.dob</code> attribute.
	 * @return the dob
	 */
	public Date getDob()
	{
		return getDob( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerDeatils.dob</code> attribute. 
	 * @param value the dob
	 */
	public void setDob(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DOB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerDeatils.dob</code> attribute. 
	 * @param value the dob
	 */
	public void setDob(final Date value)
	{
		setDob( getSession().getSessionContext(), value );
	}
	
}
