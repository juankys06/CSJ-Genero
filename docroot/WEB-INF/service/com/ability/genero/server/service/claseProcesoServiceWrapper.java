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
 * This class is a wrapper for {@link claseProcesoService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       claseProcesoService
 * @generated
 */
public class claseProcesoServiceWrapper implements claseProcesoService,
	ServiceWrapper<claseProcesoService> {
	public claseProcesoServiceWrapper(claseProcesoService claseProcesoService) {
		_claseProcesoService = claseProcesoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _claseProcesoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_claseProcesoService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _claseProcesoService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public claseProcesoService getWrappedclaseProcesoService() {
		return _claseProcesoService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedclaseProcesoService(
		claseProcesoService claseProcesoService) {
		_claseProcesoService = claseProcesoService;
	}

	public claseProcesoService getWrappedService() {
		return _claseProcesoService;
	}

	public void setWrappedService(claseProcesoService claseProcesoService) {
		_claseProcesoService = claseProcesoService;
	}

	private claseProcesoService _claseProcesoService;
}