/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ability.genero.server.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link juresprudenciaNacionalService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       juresprudenciaNacionalService
 * @generated
 */
public class juresprudenciaNacionalServiceWrapper
	implements juresprudenciaNacionalService,
		ServiceWrapper<juresprudenciaNacionalService> {
	public juresprudenciaNacionalServiceWrapper(
		juresprudenciaNacionalService juresprudenciaNacionalService) {
		_juresprudenciaNacionalService = juresprudenciaNacionalService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _juresprudenciaNacionalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_juresprudenciaNacionalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _juresprudenciaNacionalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public juresprudenciaNacionalService getWrappedjuresprudenciaNacionalService() {
		return _juresprudenciaNacionalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedjuresprudenciaNacionalService(
		juresprudenciaNacionalService juresprudenciaNacionalService) {
		_juresprudenciaNacionalService = juresprudenciaNacionalService;
	}

	public juresprudenciaNacionalService getWrappedService() {
		return _juresprudenciaNacionalService;
	}

	public void setWrappedService(
		juresprudenciaNacionalService juresprudenciaNacionalService) {
		_juresprudenciaNacionalService = juresprudenciaNacionalService;
	}

	private juresprudenciaNacionalService _juresprudenciaNacionalService;
}