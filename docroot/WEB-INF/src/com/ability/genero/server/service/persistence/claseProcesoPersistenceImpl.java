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

import com.ability.genero.server.NoSuchclaseProcesoException;
import com.ability.genero.server.model.claseProceso;
import com.ability.genero.server.model.impl.claseProcesoImpl;
import com.ability.genero.server.model.impl.claseProcesoModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the clase proceso service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see claseProcesoPersistence
 * @see claseProcesoUtil
 * @generated
 */
public class claseProcesoPersistenceImpl extends BasePersistenceImpl<claseProceso>
	implements claseProcesoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link claseProcesoUtil} to access the clase proceso persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = claseProcesoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(claseProcesoModelImpl.ENTITY_CACHE_ENABLED,
			claseProcesoModelImpl.FINDER_CACHE_ENABLED, claseProcesoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(claseProcesoModelImpl.ENTITY_CACHE_ENABLED,
			claseProcesoModelImpl.FINDER_CACHE_ENABLED, claseProcesoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(claseProcesoModelImpl.ENTITY_CACHE_ENABLED,
			claseProcesoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the clase proceso in the entity cache if it is enabled.
	 *
	 * @param claseProceso the clase proceso
	 */
	public void cacheResult(claseProceso claseProceso) {
		EntityCacheUtil.putResult(claseProcesoModelImpl.ENTITY_CACHE_ENABLED,
			claseProcesoImpl.class, claseProceso.getPrimaryKey(), claseProceso);

		claseProceso.resetOriginalValues();
	}

	/**
	 * Caches the clase procesos in the entity cache if it is enabled.
	 *
	 * @param claseProcesos the clase procesos
	 */
	public void cacheResult(List<claseProceso> claseProcesos) {
		for (claseProceso claseProceso : claseProcesos) {
			if (EntityCacheUtil.getResult(
						claseProcesoModelImpl.ENTITY_CACHE_ENABLED,
						claseProcesoImpl.class, claseProceso.getPrimaryKey()) == null) {
				cacheResult(claseProceso);
			}
			else {
				claseProceso.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all clase procesos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(claseProcesoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(claseProcesoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the clase proceso.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(claseProceso claseProceso) {
		EntityCacheUtil.removeResult(claseProcesoModelImpl.ENTITY_CACHE_ENABLED,
			claseProcesoImpl.class, claseProceso.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<claseProceso> claseProcesos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (claseProceso claseProceso : claseProcesos) {
			EntityCacheUtil.removeResult(claseProcesoModelImpl.ENTITY_CACHE_ENABLED,
				claseProcesoImpl.class, claseProceso.getPrimaryKey());
		}
	}

	/**
	 * Creates a new clase proceso with the primary key. Does not add the clase proceso to the database.
	 *
	 * @param id the primary key for the new clase proceso
	 * @return the new clase proceso
	 */
	public claseProceso create(int id) {
		claseProceso claseProceso = new claseProcesoImpl();

		claseProceso.setNew(true);
		claseProceso.setPrimaryKey(id);

		return claseProceso;
	}

	/**
	 * Removes the clase proceso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the clase proceso
	 * @return the clase proceso that was removed
	 * @throws com.ability.genero.server.NoSuchclaseProcesoException if a clase proceso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public claseProceso remove(int id)
		throws NoSuchclaseProcesoException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the clase proceso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the clase proceso
	 * @return the clase proceso that was removed
	 * @throws com.ability.genero.server.NoSuchclaseProcesoException if a clase proceso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public claseProceso remove(Serializable primaryKey)
		throws NoSuchclaseProcesoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			claseProceso claseProceso = (claseProceso)session.get(claseProcesoImpl.class,
					primaryKey);

			if (claseProceso == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchclaseProcesoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(claseProceso);
		}
		catch (NoSuchclaseProcesoException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected claseProceso removeImpl(claseProceso claseProceso)
		throws SystemException {
		claseProceso = toUnwrappedModel(claseProceso);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, claseProceso);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(claseProceso);

		return claseProceso;
	}

	@Override
	public claseProceso updateImpl(
		com.ability.genero.server.model.claseProceso claseProceso, boolean merge)
		throws SystemException {
		claseProceso = toUnwrappedModel(claseProceso);

		boolean isNew = claseProceso.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, claseProceso, merge);

			claseProceso.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(claseProcesoModelImpl.ENTITY_CACHE_ENABLED,
			claseProcesoImpl.class, claseProceso.getPrimaryKey(), claseProceso);

		return claseProceso;
	}

	protected claseProceso toUnwrappedModel(claseProceso claseProceso) {
		if (claseProceso instanceof claseProcesoImpl) {
			return claseProceso;
		}

		claseProcesoImpl claseProcesoImpl = new claseProcesoImpl();

		claseProcesoImpl.setNew(claseProceso.isNew());
		claseProcesoImpl.setPrimaryKey(claseProceso.getPrimaryKey());

		claseProcesoImpl.setId(claseProceso.getId());
		claseProcesoImpl.setClaseProceso(claseProceso.getClaseProceso());

		return claseProcesoImpl;
	}

	/**
	 * Returns the clase proceso with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the clase proceso
	 * @return the clase proceso
	 * @throws com.liferay.portal.NoSuchModelException if a clase proceso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public claseProceso findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the clase proceso with the primary key or throws a {@link com.ability.genero.server.NoSuchclaseProcesoException} if it could not be found.
	 *
	 * @param id the primary key of the clase proceso
	 * @return the clase proceso
	 * @throws com.ability.genero.server.NoSuchclaseProcesoException if a clase proceso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public claseProceso findByPrimaryKey(int id)
		throws NoSuchclaseProcesoException, SystemException {
		claseProceso claseProceso = fetchByPrimaryKey(id);

		if (claseProceso == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchclaseProcesoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return claseProceso;
	}

	/**
	 * Returns the clase proceso with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the clase proceso
	 * @return the clase proceso, or <code>null</code> if a clase proceso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public claseProceso fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the clase proceso with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the clase proceso
	 * @return the clase proceso, or <code>null</code> if a clase proceso with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public claseProceso fetchByPrimaryKey(int id) throws SystemException {
		claseProceso claseProceso = (claseProceso)EntityCacheUtil.getResult(claseProcesoModelImpl.ENTITY_CACHE_ENABLED,
				claseProcesoImpl.class, id);

		if (claseProceso == _nullclaseProceso) {
			return null;
		}

		if (claseProceso == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				claseProceso = (claseProceso)session.get(claseProcesoImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (claseProceso != null) {
					cacheResult(claseProceso);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(claseProcesoModelImpl.ENTITY_CACHE_ENABLED,
						claseProcesoImpl.class, id, _nullclaseProceso);
				}

				closeSession(session);
			}
		}

		return claseProceso;
	}

	/**
	 * Returns all the clase procesos.
	 *
	 * @return the clase procesos
	 * @throws SystemException if a system exception occurred
	 */
	public List<claseProceso> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the clase procesos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of clase procesos
	 * @param end the upper bound of the range of clase procesos (not inclusive)
	 * @return the range of clase procesos
	 * @throws SystemException if a system exception occurred
	 */
	public List<claseProceso> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the clase procesos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of clase procesos
	 * @param end the upper bound of the range of clase procesos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of clase procesos
	 * @throws SystemException if a system exception occurred
	 */
	public List<claseProceso> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<claseProceso> list = (List<claseProceso>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CLASEPROCESO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CLASEPROCESO;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<claseProceso>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<claseProceso>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the clase procesos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (claseProceso claseProceso : findAll()) {
			remove(claseProceso);
		}
	}

	/**
	 * Returns the number of clase procesos.
	 *
	 * @return the number of clase procesos
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CLASEPROCESO);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the clase proceso persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.claseProceso")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<claseProceso>> listenersList = new ArrayList<ModelListener<claseProceso>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<claseProceso>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(claseProcesoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = auditoriaPersistence.class)
	protected auditoriaPersistence auditoriaPersistence;
	@BeanReference(type = casoLVPersistence.class)
	protected casoLVPersistence casoLVPersistence;
	@BeanReference(type = categoriaPersistence.class)
	protected categoriaPersistence categoriaPersistence;
	@BeanReference(type = claseProcesoPersistence.class)
	protected claseProcesoPersistence claseProcesoPersistence;
	@BeanReference(type = distritoGPersistence.class)
	protected distritoGPersistence distritoGPersistence;
	@BeanReference(type = encuestaCriteriosPersistence.class)
	protected encuestaCriteriosPersistence encuestaCriteriosPersistence;
	@BeanReference(type = encuestaEnfoDifePersistence.class)
	protected encuestaEnfoDifePersistence encuestaEnfoDifePersistence;
	@BeanReference(type = generoUsuarioPersistence.class)
	protected generoUsuarioPersistence generoUsuarioPersistence;
	@BeanReference(type = generoUsuarioComitePersistence.class)
	protected generoUsuarioComitePersistence generoUsuarioComitePersistence;
	@BeanReference(type = juresprudenciaInternacionalPersistence.class)
	protected juresprudenciaInternacionalPersistence juresprudenciaInternacionalPersistence;
	@BeanReference(type = juresprudenciaNacionalPersistence.class)
	protected juresprudenciaNacionalPersistence juresprudenciaNacionalPersistence;
	@BeanReference(type = normasInteracionalesPersistence.class)
	protected normasInteracionalesPersistence normasInteracionalesPersistence;
	@BeanReference(type = normasNacionalesPersistence.class)
	protected normasNacionalesPersistence normasNacionalesPersistence;
	@BeanReference(type = preguntasClavePersistence.class)
	protected preguntasClavePersistence preguntasClavePersistence;
	@BeanReference(type = subcategoriaPersistence.class)
	protected subcategoriaPersistence subcategoriaPersistence;
	@BeanReference(type = tipoDecisionPersistence.class)
	protected tipoDecisionPersistence tipoDecisionPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_CLASEPROCESO = "SELECT claseProceso FROM claseProceso claseProceso";
	private static final String _SQL_COUNT_CLASEPROCESO = "SELECT COUNT(claseProceso) FROM claseProceso claseProceso";
	private static final String _ORDER_BY_ENTITY_ALIAS = "claseProceso.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No claseProceso exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(claseProcesoPersistenceImpl.class);
	private static claseProceso _nullclaseProceso = new claseProcesoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<claseProceso> toCacheModel() {
				return _nullclaseProcesoCacheModel;
			}
		};

	private static CacheModel<claseProceso> _nullclaseProcesoCacheModel = new CacheModel<claseProceso>() {
			public claseProceso toEntityModel() {
				return _nullclaseProceso;
			}
		};
}