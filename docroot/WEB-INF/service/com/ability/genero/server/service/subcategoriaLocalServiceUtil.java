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
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the subcategoria local service. This utility wraps {@link com.ability.genero.server.service.impl.subcategoriaLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author DELL Villartech
 * @see subcategoriaLocalService
 * @see com.ability.genero.server.service.base.subcategoriaLocalServiceBaseImpl
 * @see com.ability.genero.server.service.impl.subcategoriaLocalServiceImpl
 * @generated
 */
public class subcategoriaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ability.genero.server.service.impl.subcategoriaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the subcategoria to the database. Also notifies the appropriate model listeners.
	*
	* @param subcategoria the subcategoria
	* @return the subcategoria that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria addsubcategoria(
		com.ability.genero.server.model.subcategoria subcategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addsubcategoria(subcategoria);
	}

	/**
	* Creates a new subcategoria with the primary key. Does not add the subcategoria to the database.
	*
	* @param id the primary key for the new subcategoria
	* @return the new subcategoria
	*/
	public static com.ability.genero.server.model.subcategoria createsubcategoria(
		int id) {
		return getService().createsubcategoria(id);
	}

	/**
	* Deletes the subcategoria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the subcategoria
	* @return the subcategoria that was removed
	* @throws PortalException if a subcategoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria deletesubcategoria(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletesubcategoria(id);
	}

	/**
	* Deletes the subcategoria from the database. Also notifies the appropriate model listeners.
	*
	* @param subcategoria the subcategoria
	* @return the subcategoria that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria deletesubcategoria(
		com.ability.genero.server.model.subcategoria subcategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletesubcategoria(subcategoria);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.ability.genero.server.model.subcategoria fetchsubcategoria(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchsubcategoria(id);
	}

	/**
	* Returns the subcategoria with the primary key.
	*
	* @param id the primary key of the subcategoria
	* @return the subcategoria
	* @throws PortalException if a subcategoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria getsubcategoria(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getsubcategoria(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the subcategorias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of subcategorias
	* @param end the upper bound of the range of subcategorias (not inclusive)
	* @return the range of subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.subcategoria> getsubcategorias(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getsubcategorias(start, end);
	}

	/**
	* Returns the number of subcategorias.
	*
	* @return the number of subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public static int getsubcategoriasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getsubcategoriasCount();
	}

	/**
	* Updates the subcategoria in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subcategoria the subcategoria
	* @return the subcategoria that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria updatesubcategoria(
		com.ability.genero.server.model.subcategoria subcategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatesubcategoria(subcategoria);
	}

	/**
	* Updates the subcategoria in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subcategoria the subcategoria
	* @param merge whether to merge the subcategoria with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the subcategoria that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria updatesubcategoria(
		com.ability.genero.server.model.subcategoria subcategoria, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatesubcategoria(subcategoria, merge);
	}

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

	public static java.util.List<com.ability.genero.server.model.subcategoria> findBysubCatXCat(
		int idCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBysubCatXCat(idCategoria);
	}

	public static void clearService() {
		_service = null;
	}

	public static subcategoriaLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					subcategoriaLocalService.class.getName());

			if (invokableLocalService instanceof subcategoriaLocalService) {
				_service = (subcategoriaLocalService)invokableLocalService;
			}
			else {
				_service = new subcategoriaLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(subcategoriaLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(subcategoriaLocalService service) {
	}

	private static subcategoriaLocalService _service;
}