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
 * This class is a wrapper for {@link despachoService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       despachoService
 * @generated
 */
public class despachoServiceWrapper implements despachoService,
	ServiceWrapper<despachoService> {
	public despachoServiceWrapper(despachoService despachoService) {
		_despachoService = despachoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _despachoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_despachoService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _despachoService.invokeMethod(name, parameterTypes, arguments);
	}

	public java.util.List<com.ability.genero.server.model.despacho> findByDespachoCodigo(
		java.lang.String codigo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoService.findByDespachoCodigo(codigo);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public despachoService getWrappeddespachoService() {
		return _despachoService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappeddespachoService(despachoService despachoService) {
		_despachoService = despachoService;
	}

	public despachoService getWrappedService() {
		return _despachoService;
	}

	public void setWrappedService(despachoService despachoService) {
		_despachoService = despachoService;
	}

	private despachoService _despachoService;
}