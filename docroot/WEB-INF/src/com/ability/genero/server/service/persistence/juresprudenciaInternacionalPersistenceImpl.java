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

import com.ability.genero.server.NoSuchjuresprudenciaInternacionalException;
import com.ability.genero.server.model.impl.juresprudenciaInternacionalImpl;
import com.ability.genero.server.model.impl.juresprudenciaInternacionalModelImpl;
import com.ability.genero.server.model.juresprudenciaInternacional;

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
 * The persistence implementation for the juresprudencia internacional service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see juresprudenciaInternacionalPersistence
 * @see juresprudenciaInternacionalUtil
 * @generated
 */
public class juresprudenciaInternacionalPersistenceImpl
	extends BasePersistenceImpl<juresprudenciaInternacional>
	implements juresprudenciaInternacionalPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link juresprudenciaInternacionalUtil} to access the juresprudencia internacional persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = juresprudenciaInternacionalImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(juresprudenciaInternacionalModelImpl.ENTITY_CACHE_ENABLED,
			juresprudenciaInternacionalModelImpl.FINDER_CACHE_ENABLED,
			juresprudenciaInternacionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(juresprudenciaInternacionalModelImpl.ENTITY_CACHE_ENABLED,
			juresprudenciaInternacionalModelImpl.FINDER_CACHE_ENABLED,
			juresprudenciaInternacionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(juresprudenciaInternacionalModelImpl.ENTITY_CACHE_ENABLED,
			juresprudenciaInternacionalModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	/**
	 * Caches the juresprudencia internacional in the entity cache if it is enabled.
	 *
	 * @param juresprudenciaInternacional the juresprudencia internacional
	 */
	public void cacheResult(
		juresprudenciaInternacional juresprudenciaInternacional) {
		EntityCacheUtil.putResult(juresprudenciaInternacionalModelImpl.ENTITY_CACHE_ENABLED,
			juresprudenciaInternacionalImpl.class,
			juresprudenciaInternacional.getPrimaryKey(),
			juresprudenciaInternacional);

		juresprudenciaInternacional.resetOriginalValues();
	}

	/**
	 * Caches the juresprudencia internacionals in the entity cache if it is enabled.
	 *
	 * @param juresprudenciaInternacionals the juresprudencia internacionals
	 */
	public void cacheResult(
		List<juresprudenciaInternacional> juresprudenciaInternacionals) {
		for (juresprudenciaInternacional juresprudenciaInternacional : juresprudenciaInternacionals) {
			if (EntityCacheUtil.getResult(
						juresprudenciaInternacionalModelImpl.ENTITY_CACHE_ENABLED,
						juresprudenciaInternacionalImpl.class,
						juresprudenciaInternacional.getPrimaryKey()) == null) {
				cacheResult(juresprudenciaInternacional);
			}
			else {
				juresprudenciaInternacional.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all juresprudencia internacionals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(juresprudenciaInternacionalImpl.class.getName());
		}

		EntityCacheUtil.clearCache(juresprudenciaInternacionalImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the juresprudencia internacional.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		juresprudenciaInternacional juresprudenciaInternacional) {
		EntityCacheUtil.removeResult(juresprudenciaInternacionalModelImpl.ENTITY_CACHE_ENABLED,
			juresprudenciaInternacionalImpl.class,
			juresprudenciaInternacional.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<juresprudenciaInternacional> juresprudenciaInternacionals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (juresprudenciaInternacional juresprudenciaInternacional : juresprudenciaInternacionals) {
			EntityCacheUtil.removeResult(juresprudenciaInternacionalModelImpl.ENTITY_CACHE_ENABLED,
				juresprudenciaInternacionalImpl.class,
				juresprudenciaInternacional.getPrimaryKey());
		}
	}

	/**
	 * Creates a new juresprudencia internacional with the primary key. Does not add the juresprudencia internacional to the database.
	 *
	 * @param id the primary key for the new juresprudencia internacional
	 * @return the new juresprudencia internacional
	 */
	public juresprudenciaInternacional create(int id) {
		juresprudenciaInternacional juresprudenciaInternacional = new juresprudenciaInternacionalImpl();

		juresprudenciaInternacional.setNew(true);
		juresprudenciaInternacional.setPrimaryKey(id);

		return juresprudenciaInternacional;
	}

	/**
	 * Removes the juresprudencia internacional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the juresprudencia internacional
	 * @return the juresprudencia internacional that was removed
	 * @throws com.ability.genero.server.NoSuchjuresprudenciaInternacionalException if a juresprudencia internacional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public juresprudenciaInternacional remove(int id)
		throws NoSuchjuresprudenciaInternacionalException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the juresprudencia internacional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the juresprudencia internacional
	 * @return the juresprudencia internacional that was removed
	 * @throws com.ability.genero.server.NoSuchjuresprudenciaInternacionalException if a juresprudencia internacional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public juresprudenciaInternacional remove(Serializable primaryKey)
		throws NoSuchjuresprudenciaInternacionalException, SystemException {
		Session session = null;

		try {
			session = openSession();

			juresprudenciaInternacional juresprudenciaInternacional = (juresprudenciaInternacional)session.get(juresprudenciaInternacionalImpl.class,
					primaryKey);

			if (juresprudenciaInternacional == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchjuresprudenciaInternacionalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(juresprudenciaInternacional);
		}
		catch (NoSuchjuresprudenciaInternacionalException nsee) {
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
	protected juresprudenciaInternacional removeImpl(
		juresprudenciaInternacional juresprudenciaInternacional)
		throws SystemException {
		juresprudenciaInternacional = toUnwrappedModel(juresprudenciaInternacional);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, juresprudenciaInternacional);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(juresprudenciaInternacional);

		return juresprudenciaInternacional;
	}

	@Override
	public juresprudenciaInternacional updateImpl(
		com.ability.genero.server.model.juresprudenciaInternacional juresprudenciaInternacional,
		boolean merge) throws SystemException {
		juresprudenciaInternacional = toUnwrappedModel(juresprudenciaInternacional);

		boolean isNew = juresprudenciaInternacional.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, juresprudenciaInternacional, merge);

			juresprudenciaInternacional.setNew(false);
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

		EntityCacheUtil.putResult(juresprudenciaInternacionalModelImpl.ENTITY_CACHE_ENABLED,
			juresprudenciaInternacionalImpl.class,
			juresprudenciaInternacional.getPrimaryKey(),
			juresprudenciaInternacional);

		return juresprudenciaInternacional;
	}

	protected juresprudenciaInternacional toUnwrappedModel(
		juresprudenciaInternacional juresprudenciaInternacional) {
		if (juresprudenciaInternacional instanceof juresprudenciaInternacionalImpl) {
			return juresprudenciaInternacional;
		}

		juresprudenciaInternacionalImpl juresprudenciaInternacionalImpl = new juresprudenciaInternacionalImpl();

		juresprudenciaInternacionalImpl.setNew(juresprudenciaInternacional.isNew());
		juresprudenciaInternacionalImpl.setPrimaryKey(juresprudenciaInternacional.getPrimaryKey());

		juresprudenciaInternacionalImpl.setId(juresprudenciaInternacional.getId());
		juresprudenciaInternacionalImpl.setReferencias(juresprudenciaInternacional.getReferencias());
		juresprudenciaInternacionalImpl.setAnhio(juresprudenciaInternacional.getAnhio());
		juresprudenciaInternacionalImpl.setUrl(juresprudenciaInternacional.getUrl());

		return juresprudenciaInternacionalImpl;
	}

	/**
	 * Returns the juresprudencia internacional with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the juresprudencia internacional
	 * @return the juresprudencia internacional
	 * @throws com.liferay.portal.NoSuchModelException if a juresprudencia internacional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public juresprudenciaInternacional findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the juresprudencia internacional with the primary key or throws a {@link com.ability.genero.server.NoSuchjuresprudenciaInternacionalException} if it could not be found.
	 *
	 * @param id the primary key of the juresprudencia internacional
	 * @return the juresprudencia internacional
	 * @throws com.ability.genero.server.NoSuchjuresprudenciaInternacionalException if a juresprudencia internacional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public juresprudenciaInternacional findByPrimaryKey(int id)
		throws NoSuchjuresprudenciaInternacionalException, SystemException {
		juresprudenciaInternacional juresprudenciaInternacional = fetchByPrimaryKey(id);

		if (juresprudenciaInternacional == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchjuresprudenciaInternacionalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return juresprudenciaInternacional;
	}

	/**
	 * Returns the juresprudencia internacional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the juresprudencia internacional
	 * @return the juresprudencia internacional, or <code>null</code> if a juresprudencia internacional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public juresprudenciaInternacional fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the juresprudencia internacional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the juresprudencia internacional
	 * @return the juresprudencia internacional, or <code>null</code> if a juresprudencia internacional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public juresprudenciaInternacional fetchByPrimaryKey(int id)
		throws SystemException {
		juresprudenciaInternacional juresprudenciaInternacional = (juresprudenciaInternacional)EntityCacheUtil.getResult(juresprudenciaInternacionalModelImpl.ENTITY_CACHE_ENABLED,
				juresprudenciaInternacionalImpl.class, id);

		if (juresprudenciaInternacional == _nulljuresprudenciaInternacional) {
			return null;
		}

		if (juresprudenciaInternacional == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				juresprudenciaInternacional = (juresprudenciaInternacional)session.get(juresprudenciaInternacionalImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (juresprudenciaInternacional != null) {
					cacheResult(juresprudenciaInternacional);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(juresprudenciaInternacionalModelImpl.ENTITY_CACHE_ENABLED,
						juresprudenciaInternacionalImpl.class, id,
						_nulljuresprudenciaInternacional);
				}

				closeSession(session);
			}
		}

		return juresprudenciaInternacional;
	}

	/**
	 * Returns all the juresprudencia internacionals.
	 *
	 * @return the juresprudencia internacionals
	 * @throws SystemException if a system exception occurred
	 */
	public List<juresprudenciaInternacional> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the juresprudencia internacionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of juresprudencia internacionals
	 * @param end the upper bound of the range of juresprudencia internacionals (not inclusive)
	 * @return the range of juresprudencia internacionals
	 * @throws SystemException if a system exception occurred
	 */
	public List<juresprudenciaInternacional> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the juresprudencia internacionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of juresprudencia internacionals
	 * @param end the upper bound of the range of juresprudencia internacionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of juresprudencia internacionals
	 * @throws SystemException if a system exception occurred
	 */
	public List<juresprudenciaInternacional> findAll(int start, int end,
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

		List<juresprudenciaInternacional> list = (List<juresprudenciaInternacional>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_JURESPRUDENCIAINTERNACIONAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JURESPRUDENCIAINTERNACIONAL.concat(juresprudenciaInternacionalModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<juresprudenciaInternacional>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<juresprudenciaInternacional>)QueryUtil.list(q,
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
	 * Removes all the juresprudencia internacionals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (juresprudenciaInternacional juresprudenciaInternacional : findAll()) {
			remove(juresprudenciaInternacional);
		}
	}

	/**
	 * Returns the number of juresprudencia internacionals.
	 *
	 * @return the number of juresprudencia internacionals
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JURESPRUDENCIAINTERNACIONAL);

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
	 * Initializes the juresprudencia internacional persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.juresprudenciaInternacional")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<juresprudenciaInternacional>> listenersList = new ArrayList<ModelListener<juresprudenciaInternacional>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<juresprudenciaInternacional>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(juresprudenciaInternacionalImpl.class.getName());
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
	private static final String _SQL_SELECT_JURESPRUDENCIAINTERNACIONAL = "SELECT juresprudenciaInternacional FROM juresprudenciaInternacional juresprudenciaInternacional";
	private static final String _SQL_COUNT_JURESPRUDENCIAINTERNACIONAL = "SELECT COUNT(juresprudenciaInternacional) FROM juresprudenciaInternacional juresprudenciaInternacional";
	private static final String _ORDER_BY_ENTITY_ALIAS = "juresprudenciaInternacional.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No juresprudenciaInternacional exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(juresprudenciaInternacionalPersistenceImpl.class);
	private static juresprudenciaInternacional _nulljuresprudenciaInternacional = new juresprudenciaInternacionalImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<juresprudenciaInternacional> toCacheModel() {
				return _nulljuresprudenciaInternacionalCacheModel;
			}
		};

	private static CacheModel<juresprudenciaInternacional> _nulljuresprudenciaInternacionalCacheModel =
		new CacheModel<juresprudenciaInternacional>() {
			public juresprudenciaInternacional toEntityModel() {
				return _nulljuresprudenciaInternacional;
			}
		};
}