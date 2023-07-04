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
 * This class is a wrapper for {@link casoLVService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       casoLVService
 * @generated
 */
public class casoLVServiceWrapper implements casoLVService,
	ServiceWrapper<casoLVService> {
	public casoLVServiceWrapper(casoLVService casoLVService) {
		_casoLVService = casoLVService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _casoLVService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_casoLVService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _casoLVService.invokeMethod(name, parameterTypes, arguments);
	}

	public java.util.List<com.ability.genero.server.model.casoLV> findByDespacho(
		java.lang.String despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVService.findByDespacho(despacho);
	}

	public java.util.List<com.ability.genero.server.model.casoLV> findByDespachoAnhio(
		java.lang.String despacho, java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVService.findByDespachoAnhio(despacho, anhio);
	}

	public java.util.List<com.ability.genero.server.model.casoLV> findByDespachoAnhioAdmin(
		java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVService.findByDespachoAnhioAdmin(anhio);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public casoLVService getWrappedcasoLVService() {
		return _casoLVService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedcasoLVService(casoLVService casoLVService) {
		_casoLVService = casoLVService;
	}

	public casoLVService getWrappedService() {
		return _casoLVService;
	}

	public void setWrappedService(casoLVService casoLVService) {
		_casoLVService = casoLVService;
	}

	private casoLVService _casoLVService;
}