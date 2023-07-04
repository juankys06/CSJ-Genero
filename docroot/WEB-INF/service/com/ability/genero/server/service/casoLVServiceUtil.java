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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * The utility for the caso l v remote service. This utility wraps {@link com.ability.genero.server.service.impl.casoLVServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author DELL Villartech
 * @see casoLVService
 * @see com.ability.genero.server.service.base.casoLVServiceBaseImpl
 * @see com.ability.genero.server.service.impl.casoLVServiceImpl
 * @generated
 */
public class casoLVServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ability.genero.server.service.impl.casoLVServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.ability.genero.server.model.casoLV> findByDespacho(
		java.lang.String despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDespacho(despacho);
	}

	public static java.util.List<com.ability.genero.server.model.casoLV> findByDespachoAnhio(
		java.lang.String despacho, java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDespachoAnhio(despacho, anhio);
	}

	public static java.util.List<com.ability.genero.server.model.casoLV> findByDespachoAnhioAdmin(
		java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDespachoAnhioAdmin(anhio);
	}

	public static void clearService() {
		_service = null;
	}

	public static casoLVService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					casoLVService.class.getName());

			if (invokableService instanceof casoLVService) {
				_service = (casoLVService)invokableService;
			}
			else {
				_service = new casoLVServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(casoLVServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(casoLVService service) {
	}

	private static casoLVService _service;
}