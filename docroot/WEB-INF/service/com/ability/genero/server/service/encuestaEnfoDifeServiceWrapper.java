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
 * This class is a wrapper for {@link encuestaEnfoDifeService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       encuestaEnfoDifeService
 * @generated
 */
public class encuestaEnfoDifeServiceWrapper implements encuestaEnfoDifeService,
	ServiceWrapper<encuestaEnfoDifeService> {
	public encuestaEnfoDifeServiceWrapper(
		encuestaEnfoDifeService encuestaEnfoDifeService) {
		_encuestaEnfoDifeService = encuestaEnfoDifeService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _encuestaEnfoDifeService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_encuestaEnfoDifeService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _encuestaEnfoDifeService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public encuestaEnfoDifeService getWrappedencuestaEnfoDifeService() {
		return _encuestaEnfoDifeService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedencuestaEnfoDifeService(
		encuestaEnfoDifeService encuestaEnfoDifeService) {
		_encuestaEnfoDifeService = encuestaEnfoDifeService;
	}

	public encuestaEnfoDifeService getWrappedService() {
		return _encuestaEnfoDifeService;
	}

	public void setWrappedService(
		encuestaEnfoDifeService encuestaEnfoDifeService) {
		_encuestaEnfoDifeService = encuestaEnfoDifeService;
	}

	private encuestaEnfoDifeService _encuestaEnfoDifeService;
}