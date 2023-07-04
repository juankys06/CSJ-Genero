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

package com.ability.genero.server.service.persistence;

import com.ability.genero.server.model.tipoDecision;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the tipo decision service. This utility wraps {@link tipoDecisionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see tipoDecisionPersistence
 * @see tipoDecisionPersistenceImpl
 * @generated
 */
public class tipoDecisionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(tipoDecision tipoDecision) {
		getPersistence().clearCache(tipoDecision);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<tipoDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<tipoDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<tipoDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static tipoDecision update(tipoDecision tipoDecision, boolean merge)
		throws SystemException {
		return getPersistence().update(tipoDecision, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static tipoDecision update(tipoDecision tipoDecision, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tipoDecision, merge, serviceContext);
	}

	/**
	* Caches the tipo decision in the entity cache if it is enabled.
	*
	* @param tipoDecision the tipo decision
	*/
	public static void cacheResult(
		com.ability.genero.server.model.tipoDecision tipoDecision) {
		getPersistence().cacheResult(tipoDecision);
	}

	/**
	* Caches the tipo decisions in the entity cache if it is enabled.
	*
	* @param tipoDecisions the tipo decisions
	*/
	public static void cacheResult(
		java.util.List<com.ability.genero.server.model.tipoDecision> tipoDecisions) {
		getPersistence().cacheResult(tipoDecisions);
	}

	/**
	* Creates a new tipo decision with the primary key. Does not add the tipo decision to the database.
	*
	* @param id the primary key for the new tipo decision
	* @return the new tipo decision
	*/
	public static com.ability.genero.server.model.tipoDecision create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tipo decision with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tipo decision
	* @return the tipo decision that was removed
	* @throws com.ability.genero.server.NoSuchtipoDecisionException if a tipo decision with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.tipoDecision remove(int id)
		throws com.ability.genero.server.NoSuchtipoDecisionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.ability.genero.server.model.tipoDecision updateImpl(
		com.ability.genero.server.model.tipoDecision tipoDecision, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tipoDecision, merge);
	}

	/**
	* Returns the tipo decision with the primary key or throws a {@link com.ability.genero.server.NoSuchtipoDecisionException} if it could not be found.
	*
	* @param id the primary key of the tipo decision
	* @return the tipo decision
	* @throws com.ability.genero.server.NoSuchtipoDecisionException if a tipo decision with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.tipoDecision findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchtipoDecisionException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tipo decision with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tipo decision
	* @return the tipo decision, or <code>null</code> if a tipo decision with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.tipoDecision fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tipo decisions.
	*
	* @return the tipo decisions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.tipoDecision> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tipo decisions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tipo decisions
	* @param end the upper bound of the range of tipo decisions (not inclusive)
	* @return the range of tipo decisions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.tipoDecision> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tipo decisions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tipo decisions
	* @param end the upper bound of the range of tipo decisions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipo decisions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.tipoDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tipo decisions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tipo decisions.
	*
	* @return the number of tipo decisions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static tipoDecisionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (tipoDecisionPersistence)PortletBeanLocatorUtil.locate(com.ability.genero.server.service.ClpSerializer.getServletContextName(),
					tipoDecisionPersistence.class.getName());

			ReferenceRegistry.registerReference(tipoDecisionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(tipoDecisionPersistence persistence) {
	}

	private static tipoDecisionPersistence _persistence;
}