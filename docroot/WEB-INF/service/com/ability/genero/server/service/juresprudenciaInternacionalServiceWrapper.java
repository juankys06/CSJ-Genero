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
 * This class is a wrapper for {@link juresprudenciaInternacionalService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       juresprudenciaInternacionalService
 * @generated
 */
public class juresprudenciaInternacionalServiceWrapper
	implements juresprudenciaInternacionalService,
		ServiceWrapper<juresprudenciaInternacionalService> {
	public juresprudenciaInternacionalServiceWrapper(
		juresprudenciaInternacionalService juresprudenciaInternacionalService) {
		_juresprudenciaInternacionalService = juresprudenciaInternacionalService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _juresprudenciaInternacionalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_juresprudenciaInternacionalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _juresprudenciaInternacionalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public juresprudenciaInternacionalService getWrappedjuresprudenciaInternacionalService() {
		return _juresprudenciaInternacionalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedjuresprudenciaInternacionalService(
		juresprudenciaInternacionalService juresprudenciaInternacionalService) {
		_juresprudenciaInternacionalService = juresprudenciaInternacionalService;
	}

	public juresprudenciaInternacionalService getWrappedService() {
		return _juresprudenciaInternacionalService;
	}

	public void setWrappedService(
		juresprudenciaInternacionalService juresprudenciaInternacionalService) {
		_juresprudenciaInternacionalService = juresprudenciaInternacionalService;
	}

	private juresprudenciaInternacionalService _juresprudenciaInternacionalService;
}