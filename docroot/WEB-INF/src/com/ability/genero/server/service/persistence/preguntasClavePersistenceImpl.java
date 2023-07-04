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

import com.ability.genero.server.NoSuchpreguntasClaveException;
import com.ability.genero.server.model.impl.preguntasClaveImpl;
import com.ability.genero.server.model.impl.preguntasClaveModelImpl;
import com.ability.genero.server.model.preguntasClave;

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
 * The persistence implementation for the preguntas clave service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see preguntasClavePersistence
 * @see preguntasClaveUtil
 * @generated
 */
public class preguntasClavePersistenceImpl extends BasePersistenceImpl<preguntasClave>
	implements preguntasClavePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link preguntasClaveUtil} to access the preguntas clave persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = preguntasClaveImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(preguntasClaveModelImpl.ENTITY_CACHE_ENABLED,
			preguntasClaveModelImpl.FINDER_CACHE_ENABLED,
			preguntasClaveImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(preguntasClaveModelImpl.ENTITY_CACHE_ENABLED,
			preguntasClaveModelImpl.FINDER_CACHE_ENABLED,
			preguntasClaveImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(preguntasClaveModelImpl.ENTITY_CACHE_ENABLED,
			preguntasClaveModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the preguntas clave in the entity cache if it is enabled.
	 *
	 * @param preguntasClave the preguntas clave
	 */
	public void cacheResult(preguntasClave preguntasClave) {
		EntityCacheUtil.putResult(preguntasClaveModelImpl.ENTITY_CACHE_ENABLED,
			preguntasClaveImpl.class, preguntasClave.getPrimaryKey(),
			preguntasClave);

		preguntasClave.resetOriginalValues();
	}

	/**
	 * Caches the preguntas claves in the entity cache if it is enabled.
	 *
	 * @param preguntasClaves the preguntas claves
	 */
	public void cacheResult(List<preguntasClave> preguntasClaves) {
		for (preguntasClave preguntasClave : preguntasClaves) {
			if (EntityCacheUtil.getResult(
						preguntasClaveModelImpl.ENTITY_CACHE_ENABLED,
						preguntasClaveImpl.class, preguntasClave.getPrimaryKey()) == null) {
				cacheResult(preguntasClave);
			}
			else {
				preguntasClave.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all preguntas claves.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(preguntasClaveImpl.class.getName());
		}

		EntityCacheUtil.clearCache(preguntasClaveImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the preguntas clave.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(preguntasClave preguntasClave) {
		EntityCacheUtil.removeResult(preguntasClaveModelImpl.ENTITY_CACHE_ENABLED,
			preguntasClaveImpl.class, preguntasClave.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<preguntasClave> preguntasClaves) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (preguntasClave preguntasClave : preguntasClaves) {
			EntityCacheUtil.removeResult(preguntasClaveModelImpl.ENTITY_CACHE_ENABLED,
				preguntasClaveImpl.class, preguntasClave.getPrimaryKey());
		}
	}

	/**
	 * Creates a new preguntas clave with the primary key. Does not add the preguntas clave to the database.
	 *
	 * @param id the primary key for the new preguntas clave
	 * @return the new preguntas clave
	 */
	public preguntasClave create(int id) {
		preguntasClave preguntasClave = new preguntasClaveImpl();

		preguntasClave.setNew(true);
		preguntasClave.setPrimaryKey(id);

		return preguntasClave;
	}

	/**
	 * Removes the preguntas clave with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the preguntas clave
	 * @return the preguntas clave that was removed
	 * @throws com.ability.genero.server.NoSuchpreguntasClaveException if a preguntas clave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public preguntasClave remove(int id)
		throws NoSuchpreguntasClaveException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the preguntas clave with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the preguntas clave
	 * @return the preguntas clave that was removed
	 * @throws com.ability.genero.server.NoSuchpreguntasClaveException if a preguntas clave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public preguntasClave remove(Serializable primaryKey)
		throws NoSuchpreguntasClaveException, SystemException {
		Session session = null;

		try {
			session = openSession();

			preguntasClave preguntasClave = (preguntasClave)session.get(preguntasClaveImpl.class,
					primaryKey);

			if (preguntasClave == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpreguntasClaveException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(preguntasClave);
		}
		catch (NoSuchpreguntasClaveException nsee) {
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
	protected preguntasClave removeImpl(preguntasClave preguntasClave)
		throws SystemException {
		preguntasClave = toUnwrappedModel(preguntasClave);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, preguntasClave);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(preguntasClave);

		return preguntasClave;
	}

	@Override
	public preguntasClave updateImpl(
		com.ability.genero.server.model.preguntasClave preguntasClave,
		boolean merge) throws SystemException {
		preguntasClave = toUnwrappedModel(preguntasClave);

		boolean isNew = preguntasClave.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, preguntasClave, merge);

			preguntasClave.setNew(false);
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

		EntityCacheUtil.putResult(preguntasClaveModelImpl.ENTITY_CACHE_ENABLED,
			preguntasClaveImpl.class, preguntasClave.getPrimaryKey(),
			preguntasClave);

		return preguntasClave;
	}

	protected preguntasClave toUnwrappedModel(preguntasClave preguntasClave) {
		if (preguntasClave instanceof preguntasClaveImpl) {
			return preguntasClave;
		}

		preguntasClaveImpl preguntasClaveImpl = new preguntasClaveImpl();

		preguntasClaveImpl.setNew(preguntasClave.isNew());
		preguntasClaveImpl.setPrimaryKey(preguntasClave.getPrimaryKey());

		preguntasClaveImpl.setId(preguntasClave.getId());
		preguntasClaveImpl.setPregunta(preguntasClave.getPregunta());
		preguntasClaveImpl.setRespuesta(preguntasClave.getRespuesta());

		return preguntasClaveImpl;
	}

	/**
	 * Returns the preguntas clave with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the preguntas clave
	 * @return the preguntas clave
	 * @throws com.liferay.portal.NoSuchModelException if a preguntas clave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public preguntasClave findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the preguntas clave with the primary key or throws a {@link com.ability.genero.server.NoSuchpreguntasClaveException} if it could not be found.
	 *
	 * @param id the primary key of the preguntas clave
	 * @return the preguntas clave
	 * @throws com.ability.genero.server.NoSuchpreguntasClaveException if a preguntas clave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public preguntasClave findByPrimaryKey(int id)
		throws NoSuchpreguntasClaveException, SystemException {
		preguntasClave preguntasClave = fetchByPrimaryKey(id);

		if (preguntasClave == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchpreguntasClaveException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return preguntasClave;
	}

	/**
	 * Returns the preguntas clave with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the preguntas clave
	 * @return the preguntas clave, or <code>null</code> if a preguntas clave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public preguntasClave fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the preguntas clave with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the preguntas clave
	 * @return the preguntas clave, or <code>null</code> if a preguntas clave with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public preguntasClave fetchByPrimaryKey(int id) throws SystemException {
		preguntasClave preguntasClave = (preguntasClave)EntityCacheUtil.getResult(preguntasClaveModelImpl.ENTITY_CACHE_ENABLED,
				preguntasClaveImpl.class, id);

		if (preguntasClave == _nullpreguntasClave) {
			return null;
		}

		if (preguntasClave == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				preguntasClave = (preguntasClave)session.get(preguntasClaveImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (preguntasClave != null) {
					cacheResult(preguntasClave);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(preguntasClaveModelImpl.ENTITY_CACHE_ENABLED,
						preguntasClaveImpl.class, id, _nullpreguntasClave);
				}

				closeSession(session);
			}
		}

		return preguntasClave;
	}

	/**
	 * Returns all the preguntas claves.
	 *
	 * @return the preguntas claves
	 * @throws SystemException if a system exception occurred
	 */
	public List<preguntasClave> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the preguntas claves.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of preguntas claves
	 * @param end the upper bound of the range of preguntas claves (not inclusive)
	 * @return the range of preguntas claves
	 * @throws SystemException if a system exception occurred
	 */
	public List<preguntasClave> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the preguntas claves.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of preguntas claves
	 * @param end the upper bound of the range of preguntas claves (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of preguntas claves
	 * @throws SystemException if a system exception occurred
	 */
	public List<preguntasClave> findAll(int start, int end,
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

		List<preguntasClave> list = (List<preguntasClave>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PREGUNTASCLAVE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PREGUNTASCLAVE.concat(preguntasClaveModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<preguntasClave>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<preguntasClave>)QueryUtil.list(q,
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
	 * Removes all the preguntas claves from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (preguntasClave preguntasClave : findAll()) {
			remove(preguntasClave);
		}
	}

	/**
	 * Returns the number of preguntas claves.
	 *
	 * @return the number of preguntas claves
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PREGUNTASCLAVE);

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
	 * Initializes the preguntas clave persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.preguntasClave")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<preguntasClave>> listenersList = new ArrayList<ModelListener<preguntasClave>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<preguntasClave>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(preguntasClaveImpl.class.getName());
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
	private static final String _SQL_SELECT_PREGUNTASCLAVE = "SELECT preguntasClave FROM preguntasClave preguntasClave";
	private static final String _SQL_COUNT_PREGUNTASCLAVE = "SELECT COUNT(preguntasClave) FROM preguntasClave preguntasClave";
	private static final String _ORDER_BY_ENTITY_ALIAS = "preguntasClave.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No preguntasClave exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(preguntasClavePersistenceImpl.class);
	private static preguntasClave _nullpreguntasClave = new preguntasClaveImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<preguntasClave> toCacheModel() {
				return _nullpreguntasClaveCacheModel;
			}
		};

	private static CacheModel<preguntasClave> _nullpreguntasClaveCacheModel = new CacheModel<preguntasClave>() {
			public preguntasClave toEntityModel() {
				return _nullpreguntasClave;
			}
		};
}