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
 * This class is a wrapper for {@link subcategoriaService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       subcategoriaService
 * @generated
 */
public class subcategoriaServiceWrapper implements subcategoriaService,
	ServiceWrapper<subcategoriaService> {
	public subcategoriaServiceWrapper(subcategoriaService subcategoriaService) {
		_subcategoriaService = subcategoriaService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _subcategoriaService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_subcategoriaService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _subcategoriaService.invokeMethod(name, parameterTypes, arguments);
	}

	public java.util.List<com.ability.genero.server.model.subcategoria> findBysubCatXCat(
		int idCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subcategoriaService.findBysubCatXCat(idCategoria);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public subcategoriaService getWrappedsubcategoriaService() {
		return _subcategoriaService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedsubcategoriaService(
		subcategoriaService subcategoriaService) {
		_subcategoriaService = subcategoriaService;
	}

	public subcategoriaService getWrappedService() {
		return _subcategoriaService;
	}

	public void setWrappedService(subcategoriaService subcategoriaService) {
		_subcategoriaService = subcategoriaService;
	}

	private subcategoriaService _subcategoriaService;
}