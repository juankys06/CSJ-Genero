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

import com.ability.genero.server.NoSuchnormasNacionalesException;
import com.ability.genero.server.model.impl.normasNacionalesImpl;
import com.ability.genero.server.model.impl.normasNacionalesModelImpl;
import com.ability.genero.server.model.normasNacionales;

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
 * The persistence implementation for the normas nacionales service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see normasNacionalesPersistence
 * @see normasNacionalesUtil
 * @generated
 */
public class normasNacionalesPersistenceImpl extends BasePersistenceImpl<normasNacionales>
	implements normasNacionalesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link normasNacionalesUtil} to access the normas nacionales persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = normasNacionalesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(normasNacionalesModelImpl.ENTITY_CACHE_ENABLED,
			normasNacionalesModelImpl.FINDER_CACHE_ENABLED,
			normasNacionalesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(normasNacionalesModelImpl.ENTITY_CACHE_ENABLED,
			normasNacionalesModelImpl.FINDER_CACHE_ENABLED,
			normasNacionalesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(normasNacionalesModelImpl.ENTITY_CACHE_ENABLED,
			normasNacionalesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the normas nacionales in the entity cache if it is enabled.
	 *
	 * @param normasNacionales the normas nacionales
	 */
	public void cacheResult(normasNacionales normasNacionales) {
		EntityCacheUtil.putResult(normasNacionalesModelImpl.ENTITY_CACHE_ENABLED,
			normasNacionalesImpl.class, normasNacionales.getPrimaryKey(),
			normasNacionales);

		normasNacionales.resetOriginalValues();
	}

	/**
	 * Caches the normas nacionaleses in the entity cache if it is enabled.
	 *
	 * @param normasNacionaleses the normas nacionaleses
	 */
	public void cacheResult(List<normasNacionales> normasNacionaleses) {
		for (normasNacionales normasNacionales : normasNacionaleses) {
			if (EntityCacheUtil.getResult(
						normasNacionalesModelImpl.ENTITY_CACHE_ENABLED,
						normasNacionalesImpl.class,
						normasNacionales.getPrimaryKey()) == null) {
				cacheResult(normasNacionales);
			}
			else {
				normasNacionales.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all normas nacionaleses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(normasNacionalesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(normasNacionalesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the normas nacionales.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(normasNacionales normasNacionales) {
		EntityCacheUtil.removeResult(normasNacionalesModelImpl.ENTITY_CACHE_ENABLED,
			normasNacionalesImpl.class, normasNacionales.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<normasNacionales> normasNacionaleses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (normasNacionales normasNacionales : normasNacionaleses) {
			EntityCacheUtil.removeResult(normasNacionalesModelImpl.ENTITY_CACHE_ENABLED,
				normasNacionalesImpl.class, normasNacionales.getPrimaryKey());
		}
	}

	/**
	 * Creates a new normas nacionales with the primary key. Does not add the normas nacionales to the database.
	 *
	 * @param id the primary key for the new normas nacionales
	 * @return the new normas nacionales
	 */
	public normasNacionales create(int id) {
		normasNacionales normasNacionales = new normasNacionalesImpl();

		normasNacionales.setNew(true);
		normasNacionales.setPrimaryKey(id);

		return normasNacionales;
	}

	/**
	 * Removes the normas nacionales with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the normas nacionales
	 * @return the normas nacionales that was removed
	 * @throws com.ability.genero.server.NoSuchnormasNacionalesException if a normas nacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public normasNacionales remove(int id)
		throws NoSuchnormasNacionalesException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the normas nacionales with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the normas nacionales
	 * @return the normas nacionales that was removed
	 * @throws com.ability.genero.server.NoSuchnormasNacionalesException if a normas nacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public normasNacionales remove(Serializable primaryKey)
		throws NoSuchnormasNacionalesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			normasNacionales normasNacionales = (normasNacionales)session.get(normasNacionalesImpl.class,
					primaryKey);

			if (normasNacionales == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchnormasNacionalesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(normasNacionales);
		}
		catch (NoSuchnormasNacionalesException nsee) {
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
	protected normasNacionales removeImpl(normasNacionales normasNacionales)
		throws SystemException {
		normasNacionales = toUnwrappedModel(normasNacionales);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, normasNacionales);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(normasNacionales);

		return normasNacionales;
	}

	@Override
	public normasNacionales updateImpl(
		com.ability.genero.server.model.normasNacionales normasNacionales,
		boolean merge) throws SystemException {
		normasNacionales = toUnwrappedModel(normasNacionales);

		boolean isNew = normasNacionales.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, normasNacionales, merge);

			normasNacionales.setNew(false);
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

		EntityCacheUtil.putResult(normasNacionalesModelImpl.ENTITY_CACHE_ENABLED,
			normasNacionalesImpl.class, normasNacionales.getPrimaryKey(),
			normasNacionales);

		return normasNacionales;
	}

	protected normasNacionales toUnwrappedModel(
		normasNacionales normasNacionales) {
		if (normasNacionales instanceof normasNacionalesImpl) {
			return normasNacionales;
		}

		normasNacionalesImpl normasNacionalesImpl = new normasNacionalesImpl();

		normasNacionalesImpl.setNew(normasNacionales.isNew());
		normasNacionalesImpl.setPrimaryKey(normasNacionales.getPrimaryKey());

		normasNacionalesImpl.setId(normasNacionales.getId());
		normasNacionalesImpl.setNormativas(normasNacionales.getNormativas());
		normasNacionalesImpl.setAnhio(normasNacionales.getAnhio());
		normasNacionalesImpl.setUrl(normasNacionales.getUrl());
		normasNacionalesImpl.setAmbito(normasNacionales.getAmbito());

		return normasNacionalesImpl;
	}

	/**
	 * Returns the normas nacionales with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the normas nacionales
	 * @return the normas nacionales
	 * @throws com.liferay.portal.NoSuchModelException if a normas nacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public normasNacionales findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the normas nacionales with the primary key or throws a {@link com.ability.genero.server.NoSuchnormasNacionalesException} if it could not be found.
	 *
	 * @param id the primary key of the normas nacionales
	 * @return the normas nacionales
	 * @throws com.ability.genero.server.NoSuchnormasNacionalesException if a normas nacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public normasNacionales findByPrimaryKey(int id)
		throws NoSuchnormasNacionalesException, SystemException {
		normasNacionales normasNacionales = fetchByPrimaryKey(id);

		if (normasNacionales == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchnormasNacionalesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return normasNacionales;
	}

	/**
	 * Returns the normas nacionales with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the normas nacionales
	 * @return the normas nacionales, or <code>null</code> if a normas nacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public normasNacionales fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the normas nacionales with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the normas nacionales
	 * @return the normas nacionales, or <code>null</code> if a normas nacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public normasNacionales fetchByPrimaryKey(int id) throws SystemException {
		normasNacionales normasNacionales = (normasNacionales)EntityCacheUtil.getResult(normasNacionalesModelImpl.ENTITY_CACHE_ENABLED,
				normasNacionalesImpl.class, id);

		if (normasNacionales == _nullnormasNacionales) {
			return null;
		}

		if (normasNacionales == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				normasNacionales = (normasNacionales)session.get(normasNacionalesImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (normasNacionales != null) {
					cacheResult(normasNacionales);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(normasNacionalesModelImpl.ENTITY_CACHE_ENABLED,
						normasNacionalesImpl.class, id, _nullnormasNacionales);
				}

				closeSession(session);
			}
		}

		return normasNacionales;
	}

	/**
	 * Returns all the normas nacionaleses.
	 *
	 * @return the normas nacionaleses
	 * @throws SystemException if a system exception occurred
	 */
	public List<normasNacionales> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the normas nacionaleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of normas nacionaleses
	 * @param end the upper bound of the range of normas nacionaleses (not inclusive)
	 * @return the range of normas nacionaleses
	 * @throws SystemException if a system exception occurred
	 */
	public List<normasNacionales> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the normas nacionaleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of normas nacionaleses
	 * @param end the upper bound of the range of normas nacionaleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of normas nacionaleses
	 * @throws SystemException if a system exception occurred
	 */
	public List<normasNacionales> findAll(int start, int end,
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

		List<normasNacionales> list = (List<normasNacionales>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NORMASNACIONALES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NORMASNACIONALES.concat(normasNacionalesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<normasNacionales>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<normasNacionales>)QueryUtil.list(q,
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
	 * Removes all the normas nacionaleses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (normasNacionales normasNacionales : findAll()) {
			remove(normasNacionales);
		}
	}

	/**
	 * Returns the number of normas nacionaleses.
	 *
	 * @return the number of normas nacionaleses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NORMASNACIONALES);

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
	 * Initializes the normas nacionales persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.normasNacionales")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<normasNacionales>> listenersList = new ArrayList<ModelListener<normasNacionales>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<normasNacionales>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(normasNacionalesImpl.class.getName());
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
	private static final String _SQL_SELECT_NORMASNACIONALES = "SELECT normasNacionales FROM normasNacionales normasNacionales";
	private static final String _SQL_COUNT_NORMASNACIONALES = "SELECT COUNT(normasNacionales) FROM normasNacionales normasNacionales";
	private static final String _ORDER_BY_ENTITY_ALIAS = "normasNacionales.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No normasNacionales exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(normasNacionalesPersistenceImpl.class);
	private static normasNacionales _nullnormasNacionales = new normasNacionalesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<normasNacionales> toCacheModel() {
				return _nullnormasNacionalesCacheModel;
			}
		};

	private static CacheModel<normasNacionales> _nullnormasNacionalesCacheModel = new CacheModel<normasNacionales>() {
			public normasNacionales toEntityModel() {
				return _nullnormasNacionales;
			}
		};
}