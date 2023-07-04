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

import com.ability.genero.server.NoSuchnormasInteracionalesException;
import com.ability.genero.server.model.impl.normasInteracionalesImpl;
import com.ability.genero.server.model.impl.normasInteracionalesModelImpl;
import com.ability.genero.server.model.normasInteracionales;

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
 * The persistence implementation for the normas interacionales service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see normasInteracionalesPersistence
 * @see normasInteracionalesUtil
 * @generated
 */
public class normasInteracionalesPersistenceImpl extends BasePersistenceImpl<normasInteracionales>
	implements normasInteracionalesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link normasInteracionalesUtil} to access the normas interacionales persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = normasInteracionalesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(normasInteracionalesModelImpl.ENTITY_CACHE_ENABLED,
			normasInteracionalesModelImpl.FINDER_CACHE_ENABLED,
			normasInteracionalesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(normasInteracionalesModelImpl.ENTITY_CACHE_ENABLED,
			normasInteracionalesModelImpl.FINDER_CACHE_ENABLED,
			normasInteracionalesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(normasInteracionalesModelImpl.ENTITY_CACHE_ENABLED,
			normasInteracionalesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the normas interacionales in the entity cache if it is enabled.
	 *
	 * @param normasInteracionales the normas interacionales
	 */
	public void cacheResult(normasInteracionales normasInteracionales) {
		EntityCacheUtil.putResult(normasInteracionalesModelImpl.ENTITY_CACHE_ENABLED,
			normasInteracionalesImpl.class,
			normasInteracionales.getPrimaryKey(), normasInteracionales);

		normasInteracionales.resetOriginalValues();
	}

	/**
	 * Caches the normas interacionaleses in the entity cache if it is enabled.
	 *
	 * @param normasInteracionaleses the normas interacionaleses
	 */
	public void cacheResult(List<normasInteracionales> normasInteracionaleses) {
		for (normasInteracionales normasInteracionales : normasInteracionaleses) {
			if (EntityCacheUtil.getResult(
						normasInteracionalesModelImpl.ENTITY_CACHE_ENABLED,
						normasInteracionalesImpl.class,
						normasInteracionales.getPrimaryKey()) == null) {
				cacheResult(normasInteracionales);
			}
			else {
				normasInteracionales.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all normas interacionaleses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(normasInteracionalesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(normasInteracionalesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the normas interacionales.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(normasInteracionales normasInteracionales) {
		EntityCacheUtil.removeResult(normasInteracionalesModelImpl.ENTITY_CACHE_ENABLED,
			normasInteracionalesImpl.class, normasInteracionales.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<normasInteracionales> normasInteracionaleses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (normasInteracionales normasInteracionales : normasInteracionaleses) {
			EntityCacheUtil.removeResult(normasInteracionalesModelImpl.ENTITY_CACHE_ENABLED,
				normasInteracionalesImpl.class,
				normasInteracionales.getPrimaryKey());
		}
	}

	/**
	 * Creates a new normas interacionales with the primary key. Does not add the normas interacionales to the database.
	 *
	 * @param id the primary key for the new normas interacionales
	 * @return the new normas interacionales
	 */
	public normasInteracionales create(int id) {
		normasInteracionales normasInteracionales = new normasInteracionalesImpl();

		normasInteracionales.setNew(true);
		normasInteracionales.setPrimaryKey(id);

		return normasInteracionales;
	}

	/**
	 * Removes the normas interacionales with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the normas interacionales
	 * @return the normas interacionales that was removed
	 * @throws com.ability.genero.server.NoSuchnormasInteracionalesException if a normas interacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public normasInteracionales remove(int id)
		throws NoSuchnormasInteracionalesException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the normas interacionales with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the normas interacionales
	 * @return the normas interacionales that was removed
	 * @throws com.ability.genero.server.NoSuchnormasInteracionalesException if a normas interacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public normasInteracionales remove(Serializable primaryKey)
		throws NoSuchnormasInteracionalesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			normasInteracionales normasInteracionales = (normasInteracionales)session.get(normasInteracionalesImpl.class,
					primaryKey);

			if (normasInteracionales == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchnormasInteracionalesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(normasInteracionales);
		}
		catch (NoSuchnormasInteracionalesException nsee) {
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
	protected normasInteracionales removeImpl(
		normasInteracionales normasInteracionales) throws SystemException {
		normasInteracionales = toUnwrappedModel(normasInteracionales);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, normasInteracionales);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(normasInteracionales);

		return normasInteracionales;
	}

	@Override
	public normasInteracionales updateImpl(
		com.ability.genero.server.model.normasInteracionales normasInteracionales,
		boolean merge) throws SystemException {
		normasInteracionales = toUnwrappedModel(normasInteracionales);

		boolean isNew = normasInteracionales.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, normasInteracionales, merge);

			normasInteracionales.setNew(false);
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

		EntityCacheUtil.putResult(normasInteracionalesModelImpl.ENTITY_CACHE_ENABLED,
			normasInteracionalesImpl.class,
			normasInteracionales.getPrimaryKey(), normasInteracionales);

		return normasInteracionales;
	}

	protected normasInteracionales toUnwrappedModel(
		normasInteracionales normasInteracionales) {
		if (normasInteracionales instanceof normasInteracionalesImpl) {
			return normasInteracionales;
		}

		normasInteracionalesImpl normasInteracionalesImpl = new normasInteracionalesImpl();

		normasInteracionalesImpl.setNew(normasInteracionales.isNew());
		normasInteracionalesImpl.setPrimaryKey(normasInteracionales.getPrimaryKey());

		normasInteracionalesImpl.setId(normasInteracionales.getId());
		normasInteracionalesImpl.setConferencias(normasInteracionales.getConferencias());
		normasInteracionalesImpl.setAnhio(normasInteracionales.getAnhio());
		normasInteracionalesImpl.setUrl(normasInteracionales.getUrl());

		return normasInteracionalesImpl;
	}

	/**
	 * Returns the normas interacionales with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the normas interacionales
	 * @return the normas interacionales
	 * @throws com.liferay.portal.NoSuchModelException if a normas interacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public normasInteracionales findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the normas interacionales with the primary key or throws a {@link com.ability.genero.server.NoSuchnormasInteracionalesException} if it could not be found.
	 *
	 * @param id the primary key of the normas interacionales
	 * @return the normas interacionales
	 * @throws com.ability.genero.server.NoSuchnormasInteracionalesException if a normas interacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public normasInteracionales findByPrimaryKey(int id)
		throws NoSuchnormasInteracionalesException, SystemException {
		normasInteracionales normasInteracionales = fetchByPrimaryKey(id);

		if (normasInteracionales == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchnormasInteracionalesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return normasInteracionales;
	}

	/**
	 * Returns the normas interacionales with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the normas interacionales
	 * @return the normas interacionales, or <code>null</code> if a normas interacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public normasInteracionales fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the normas interacionales with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the normas interacionales
	 * @return the normas interacionales, or <code>null</code> if a normas interacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public normasInteracionales fetchByPrimaryKey(int id)
		throws SystemException {
		normasInteracionales normasInteracionales = (normasInteracionales)EntityCacheUtil.getResult(normasInteracionalesModelImpl.ENTITY_CACHE_ENABLED,
				normasInteracionalesImpl.class, id);

		if (normasInteracionales == _nullnormasInteracionales) {
			return null;
		}

		if (normasInteracionales == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				normasInteracionales = (normasInteracionales)session.get(normasInteracionalesImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (normasInteracionales != null) {
					cacheResult(normasInteracionales);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(normasInteracionalesModelImpl.ENTITY_CACHE_ENABLED,
						normasInteracionalesImpl.class, id,
						_nullnormasInteracionales);
				}

				closeSession(session);
			}
		}

		return normasInteracionales;
	}

	/**
	 * Returns all the normas interacionaleses.
	 *
	 * @return the normas interacionaleses
	 * @throws SystemException if a system exception occurred
	 */
	public List<normasInteracionales> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the normas interacionaleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of normas interacionaleses
	 * @param end the upper bound of the range of normas interacionaleses (not inclusive)
	 * @return the range of normas interacionaleses
	 * @throws SystemException if a system exception occurred
	 */
	public List<normasInteracionales> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the normas interacionaleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of normas interacionaleses
	 * @param end the upper bound of the range of normas interacionaleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of normas interacionaleses
	 * @throws SystemException if a system exception occurred
	 */
	public List<normasInteracionales> findAll(int start, int end,
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

		List<normasInteracionales> list = (List<normasInteracionales>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NORMASINTERACIONALES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NORMASINTERACIONALES.concat(normasInteracionalesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<normasInteracionales>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<normasInteracionales>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the normas interacionaleses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (normasInteracionales normasInteracionales : findAll()) {
			remove(normasInteracionales);
		}
	}

	/**
	 * Returns the number of normas interacionaleses.
	 *
	 * @return the number of normas interacionaleses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NORMASINTERACIONALES);

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
	 * Initializes the normas interacionales persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.normasInteracionales")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<normasInteracionales>> listenersList = new ArrayList<ModelListener<normasInteracionales>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<normasInteracionales>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(normasInteracionalesImpl.class.getName());
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
	private static final String _SQL_SELECT_NORMASINTERACIONALES = "SELECT normasInteracionales FROM normasInteracionales normasInteracionales";
	private static final String _SQL_COUNT_NORMASINTERACIONALES = "SELECT COUNT(normasInteracionales) FROM normasInteracionales normasInteracionales";
	private static final String _ORDER_BY_ENTITY_ALIAS = "normasInteracionales.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No normasInteracionales exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(normasInteracionalesPersistenceImpl.class);
	private static normasInteracionales _nullnormasInteracionales = new normasInteracionalesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<normasInteracionales> toCacheModel() {
				return _nullnormasInteracionalesCacheModel;
			}
		};

	private static CacheModel<normasInteracionales> _nullnormasInteracionalesCacheModel =
		new CacheModel<normasInteracionales>() {
			public normasInteracionales toEntityModel() {
				return _nullnormasInteracionales;
			}
		};
}