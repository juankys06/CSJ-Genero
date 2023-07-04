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
 * This class is a wrapper for {@link generoUsuarioService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       generoUsuarioService
 * @generated
 */
public class generoUsuarioServiceWrapper implements generoUsuarioService,
	ServiceWrapper<generoUsuarioService> {
	public generoUsuarioServiceWrapper(
		generoUsuarioService generoUsuarioService) {
		_generoUsuarioService = generoUsuarioService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _generoUsuarioService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_generoUsuarioService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _generoUsuarioService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public com.ability.genero.server.model.generoUsuario findByPorUsuario(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _generoUsuarioService.findByPorUsuario(id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public generoUsuarioService getWrappedgeneroUsuarioService() {
		return _generoUsuarioService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedgeneroUsuarioService(
		generoUsuarioService generoUsuarioService) {
		_generoUsuarioService = generoUsuarioService;
	}

	public generoUsuarioService getWrappedService() {
		return _generoUsuarioService;
	}

	public void setWrappedService(generoUsuarioService generoUsuarioService) {
		_generoUsuarioService = generoUsuarioService;
	}

	private generoUsuarioService _generoUsuarioService;
}