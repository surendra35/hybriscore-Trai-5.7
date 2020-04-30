/**
 *
 */
package com.trail.b2c.DAO.impl;

import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.Date;

import com.trail.b2c.DAO.CustomerDAO;


/**
 * @author admin
 *
 *
 */
public class DeafultCutomerDAOimpl implements CustomerDAO
{

	private FlexibleSearchService flexibleSearchService;

	@Override
	public Date search()
	{
		/*
		 * new FlexibleSearchQuery("select {s.dob} from {customer as s} where dob=" + 06/03/2015); return 0;
		 */


		final FlexibleSearchQuery query = new FlexibleSearchQuery(
				"select {s.dob} from {CustomerDeatils as s} where s.custId='100'");
		final SearchResult<Date> result = (SearchResult<Date>) getFlexibleSearchService().search(query);
		return result.getResult().get(0);

	}

	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}
}
