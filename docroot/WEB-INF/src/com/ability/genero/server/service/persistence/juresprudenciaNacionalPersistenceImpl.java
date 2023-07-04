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

import com.ability.genero.server.NoSuchjuresprudenciaNacionalException;
import com.ability.genero.server.model.impl.juresprudenciaNacionalImpl;
import com.ability.genero.server.model.impl.juresprudenciaNacionalModelImpl;
import com.ability.genero.server.model.juresprudenciaNacional;

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
 * The persistence implementation for the juresprudencia nacional service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see juresprudenciaNacionalPersistence
 * @see juresprudenciaNacionalUtil
 * @generated
 */
public class juresprudenciaNacionalPersistenceImpl extends BasePersistenceImpl<juresprudenciaNacional>
	implements juresprudenciaNacionalPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link juresprudenciaNacionalUtil} to access the juresprudencia nacional persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = juresprudenciaNacionalImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(juresprudenciaNacionalModelImpl.ENTITY_CACHE_ENABLED,
			juresprudenciaNacionalModelImpl.FINDER_CACHE_ENABLED,
			juresprudenciaNacionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(juresprudenciaNacionalModelImpl.ENTITY_CACHE_ENABLED,
			juresprudenciaNacionalModelImpl.FINDER_CACHE_ENABLED,
			juresprudenciaNacionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(juresprudenciaNacionalModelImpl.ENTITY_CACHE_ENABLED,
			juresprudenciaNacionalModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the juresprudencia nacional in the entity cache if it is enabled.
	 *
	 * @param juresprudenciaNacional the juresprudencia nacional
	 */
	public void cacheResult(juresprudenciaNacional juresprudenciaNacional) {
		EntityCacheUtil.putResult(juresprudenciaNacionalModelImpl.ENTITY_CACHE_ENABLED,
			juresprudenciaNacionalImpl.class,
			juresprudenciaNacional.getPrimaryKey(), juresprudenciaNacional);

		juresprudenciaNacional.resetOriginalValues();
	}

	/**
	 * Caches the juresprudencia nacionals in the entity cache if it is enabled.
	 *
	 * @param juresprudenciaNacionals the juresprudencia nacionals
	 */
	public void cacheResult(
		List<juresprudenciaNacional> juresprudenciaNacionals) {
		for (juresprudenciaNacional juresprudenciaNacional : juresprudenciaNacionals) {
			if (EntityCacheUtil.getResult(
						juresprudenciaNacionalModelImpl.ENTITY_CACHE_ENABLED,
						juresprudenciaNacionalImpl.class,
						juresprudenciaNacional.getPrimaryKey()) == null) {
				cacheResult(juresprudenciaNacional);
			}
			else {
				juresprudenciaNacional.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all juresprudencia nacionals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(juresprudenciaNacionalImpl.class.getName());
		}

		EntityCacheUtil.clearCache(juresprudenciaNacionalImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the juresprudencia nacional.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(juresprudenciaNacional juresprudenciaNacional) {
		EntityCacheUtil.removeResult(juresprudenciaNacionalModelImpl.ENTITY_CACHE_ENABLED,
			juresprudenciaNacionalImpl.class,
			juresprudenciaNacional.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<juresprudenciaNacional> juresprudenciaNacionals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (juresprudenciaNacional juresprudenciaNacional : juresprudenciaNacionals) {
			EntityCacheUtil.removeResult(juresprudenciaNacionalModelImpl.ENTITY_CACHE_ENABLED,
				juresprudenciaNacionalImpl.class,
				juresprudenciaNacional.getPrimaryKey());
		}
	}

	/**
	 * Creates a new juresprudencia nacional with the primary key. Does not add the juresprudencia nacional to the database.
	 *
	 * @param id the primary key for the new juresprudencia nacional
	 * @return the new juresprudencia nacional
	 */
	public juresprudenciaNacional create(int id) {
		juresprudenciaNacional juresprudenciaNacional = new juresprudenciaNacionalImpl();

		juresprudenciaNacional.setNew(true);
		juresprudenciaNacional.setPrimaryKey(id);

		return juresprudenciaNacional;
	}

	/**
	 * Removes the juresprudencia nacional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the juresprudencia nacional
	 * @return the juresprudencia nacional that was removed
	 * @throws com.ability.genero.server.NoSuchjuresprudenciaNacionalException if a juresprudencia nacional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public juresprudenciaNacional remove(int id)
		throws NoSuchjuresprudenciaNacionalException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the juresprudencia nacional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the juresprudencia nacional
	 * @return the juresprudencia nacional that was removed
	 * @throws com.ability.genero.server.NoSuchjuresprudenciaNacionalException if a juresprudencia nacional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public juresprudenciaNacional remove(Serializable primaryKey)
		throws NoSuchjuresprudenciaNacionalException, SystemException {
		Session session = null;

		try {
			session = openSession();

			juresprudenciaNacional juresprudenciaNacional = (juresprudenciaNacional)session.get(juresprudenciaNacionalImpl.class,
					primaryKey);

			if (juresprudenciaNacional == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchjuresprudenciaNacionalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(juresprudenciaNacional);
		}
		catch (NoSuchjuresprudenciaNacionalException nsee) {
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
	protected juresprudenciaNacional removeImpl(
		juresprudenciaNacional juresprudenciaNacional)
		throws SystemException {
		juresprudenciaNacional = toUnwrappedModel(juresprudenciaNacional);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, juresprudenciaNacional);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(juresprudenciaNacional);

		return juresprudenciaNacional;
	}

	@Override
	public juresprudenciaNacional updateImpl(
		com.ability.genero.server.model.juresprudenciaNacional juresprudenciaNacional,
		boolean merge) throws SystemException {
		juresprudenciaNacional = toUnwrappedModel(juresprudenciaNacional);

		boolean isNew = juresprudenciaNacional.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, juresprudenciaNacional, merge);

			juresprudenciaNacional.setNew(false);
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

		EntityCacheUtil.putResult(juresprudenciaNacionalModelImpl.ENTITY_CACHE_ENABLED,
			juresprudenciaNacionalImpl.class,
			juresprudenciaNacional.getPrimaryKey(), juresprudenciaNacional);

		return juresprudenciaNacional;
	}

	protected juresprudenciaNacional toUnwrappedModel(
		juresprudenciaNacional juresprudenciaNacional) {
		if (juresprudenciaNacional instanceof juresprudenciaNacionalImpl) {
			return juresprudenciaNacional;
		}

		juresprudenciaNacionalImpl juresprudenciaNacionalImpl = new juresprudenciaNacionalImpl();

		juresprudenciaNacionalImpl.setNew(juresprudenciaNacional.isNew());
		juresprudenciaNacionalImpl.setPrimaryKey(juresprudenciaNacional.getPrimaryKey());

		juresprudenciaNacionalImpl.setId(juresprudenciaNacional.getId());
		juresprudenciaNacionalImpl.setReferencias(juresprudenciaNacional.getReferencias());
		juresprudenciaNacionalImpl.setCorporacion(juresprudenciaNacional.getCorporacion());
		juresprudenciaNacionalImpl.setUrl(juresprudenciaNacional.getUrl());
		juresprudenciaNacionalImpl.setAmbito(juresprudenciaNacional.getAmbito());

		return juresprudenciaNacionalImpl;
	}

	/**
	 * Returns the juresprudencia nacional with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the juresprudencia nacional
	 * @return the juresprudencia nacional
	 * @throws com.liferay.portal.NoSuchModelException if a juresprudencia nacional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public juresprudenciaNacional findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the juresprudencia nacional with the primary key or throws a {@link com.ability.genero.server.NoSuchjuresprudenciaNacionalException} if it could not be found.
	 *
	 * @param id the primary key of the juresprudencia nacional
	 * @return the juresprudencia nacional
	 * @throws com.ability.genero.server.NoSuchjuresprudenciaNacionalException if a juresprudencia nacional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public juresprudenciaNacional findByPrimaryKey(int id)
		throws NoSuchjuresprudenciaNacionalException, SystemException {
		juresprudenciaNacional juresprudenciaNacional = fetchByPrimaryKey(id);

		if (juresprudenciaNacional == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchjuresprudenciaNacionalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return juresprudenciaNacional;
	}

	/**
	 * Returns the juresprudencia nacional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the juresprudencia nacional
	 * @return the juresprudencia nacional, or <code>null</code> if a juresprudencia nacional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public juresprudenciaNacional fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the juresprudencia nacional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the juresprudencia nacional
	 * @return the juresprudencia nacional, or <code>null</code> if a juresprudencia nacional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public juresprudenciaNacional fetchByPrimaryKey(int id)
		throws SystemException {
		juresprudenciaNacional juresprudenciaNacional = (juresprudenciaNacional)EntityCacheUtil.getResult(juresprudenciaNacionalModelImpl.ENTITY_CACHE_ENABLED,
				juresprudenciaNacionalImpl.class, id);

		if (juresprudenciaNacional == _nulljuresprudenciaNacional) {
			return null;
		}

		if (juresprudenciaNacional == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				juresprudenciaNacional = (juresprudenciaNacional)session.get(juresprudenciaNacionalImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (juresprudenciaNacional != null) {
					cacheResult(juresprudenciaNacional);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(juresprudenciaNacionalModelImpl.ENTITY_CACHE_ENABLED,
						juresprudenciaNacionalImpl.class, id,
						_nulljuresprudenciaNacional);
				}

				closeSession(session);
			}
		}

		return juresprudenciaNacional;
	}

	/**
	 * Returns all the juresprudencia nacionals.
	 *
	 * @return the juresprudencia nacionals
	 * @throws SystemException if a system exception occurred
	 */
	public List<juresprudenciaNacional> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the juresprudencia nacionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of juresprudencia nacionals
	 * @param end the upper bound of the range of juresprudencia nacionals (not inclusive)
	 * @return the range of juresprudencia nacionals
	 * @throws SystemException if a system exception occurred
	 */
	public List<juresprudenciaNacional> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the juresprudencia nacionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of juresprudencia nacionals
	 * @param end the upper bound of the range of juresprudencia nacionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of juresprudencia nacionals
	 * @throws SystemException if a system exception occurred
	 */
	public List<juresprudenciaNacional> findAll(int start, int end,
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

		List<juresprudenciaNacional> list = (List<juresprudenciaNacional>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_JURESPRUDENCIANACIONAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JURESPRUDENCIANACIONAL.concat(juresprudenciaNacionalModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<juresprudenciaNacional>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<juresprudenciaNacional>)QueryUtil.list(q,
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
	 * Removes all the juresprudencia nacionals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (juresprudenciaNacional juresprudenciaNacional : findAll()) {
			remove(juresprudenciaNacional);
		}
	}

	/**
	 * Returns the number of juresprudencia nacionals.
	 *
	 * @return the number of juresprudencia nacionals
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JURESPRUDENCIANACIONAL);

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
	 * Initializes the juresprudencia nacional persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.juresprudenciaNacional")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<juresprudenciaNacional>> listenersList = new ArrayList<ModelListener<juresprudenciaNacional>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<juresprudenciaNacional>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(juresprudenciaNacionalImpl.class.getName());
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
	private static final String _SQL_SELECT_JURESPRUDENCIANACIONAL = "SELECT juresprudenciaNacional FROM juresprudenciaNacional juresprudenciaNacional";
	private static final String _SQL_COUNT_JURESPRUDENCIANACIONAL = "SELECT COUNT(juresprudenciaNacional) FROM juresprudenciaNacional juresprudenciaNacional";
	private static final String _ORDER_BY_ENTITY_ALIAS = "juresprudenciaNacional.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No juresprudenciaNacional exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(juresprudenciaNacionalPersistenceImpl.class);
	private static juresprudenciaNacional _nulljuresprudenciaNacional = new juresprudenciaNacionalImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<juresprudenciaNacional> toCacheModel() {
				return _nulljuresprudenciaNacionalCacheModel;
			}
		};

	private static CacheModel<juresprudenciaNacional> _nulljuresprudenciaNacionalCacheModel =
		new CacheModel<juresprudenciaNacional>() {
			public juresprudenciaNacional toEntityModel() {
				return _nulljuresprudenciaNacional;
			}
		};
}