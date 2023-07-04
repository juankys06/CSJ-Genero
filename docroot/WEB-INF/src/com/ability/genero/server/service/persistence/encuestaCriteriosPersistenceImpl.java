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

import com.ability.genero.server.NoSuchencuestaCriteriosException;
import com.ability.genero.server.model.encuestaCriterios;
import com.ability.genero.server.model.impl.encuestaCriteriosImpl;
import com.ability.genero.server.model.impl.encuestaCriteriosModelImpl;

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
 * The persistence implementation for the encuesta criterios service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see encuestaCriteriosPersistence
 * @see encuestaCriteriosUtil
 * @generated
 */
public class encuestaCriteriosPersistenceImpl extends BasePersistenceImpl<encuestaCriterios>
	implements encuestaCriteriosPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link encuestaCriteriosUtil} to access the encuesta criterios persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = encuestaCriteriosImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(encuestaCriteriosModelImpl.ENTITY_CACHE_ENABLED,
			encuestaCriteriosModelImpl.FINDER_CACHE_ENABLED,
			encuestaCriteriosImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(encuestaCriteriosModelImpl.ENTITY_CACHE_ENABLED,
			encuestaCriteriosModelImpl.FINDER_CACHE_ENABLED,
			encuestaCriteriosImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(encuestaCriteriosModelImpl.ENTITY_CACHE_ENABLED,
			encuestaCriteriosModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the encuesta criterios in the entity cache if it is enabled.
	 *
	 * @param encuestaCriterios the encuesta criterios
	 */
	public void cacheResult(encuestaCriterios encuestaCriterios) {
		EntityCacheUtil.putResult(encuestaCriteriosModelImpl.ENTITY_CACHE_ENABLED,
			encuestaCriteriosImpl.class, encuestaCriterios.getPrimaryKey(),
			encuestaCriterios);

		encuestaCriterios.resetOriginalValues();
	}

	/**
	 * Caches the encuesta criterioses in the entity cache if it is enabled.
	 *
	 * @param encuestaCriterioses the encuesta criterioses
	 */
	public void cacheResult(List<encuestaCriterios> encuestaCriterioses) {
		for (encuestaCriterios encuestaCriterios : encuestaCriterioses) {
			if (EntityCacheUtil.getResult(
						encuestaCriteriosModelImpl.ENTITY_CACHE_ENABLED,
						encuestaCriteriosImpl.class,
						encuestaCriterios.getPrimaryKey()) == null) {
				cacheResult(encuestaCriterios);
			}
			else {
				encuestaCriterios.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all encuesta criterioses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(encuestaCriteriosImpl.class.getName());
		}

		EntityCacheUtil.clearCache(encuestaCriteriosImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the encuesta criterios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(encuestaCriterios encuestaCriterios) {
		EntityCacheUtil.removeResult(encuestaCriteriosModelImpl.ENTITY_CACHE_ENABLED,
			encuestaCriteriosImpl.class, encuestaCriterios.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<encuestaCriterios> encuestaCriterioses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (encuestaCriterios encuestaCriterios : encuestaCriterioses) {
			EntityCacheUtil.removeResult(encuestaCriteriosModelImpl.ENTITY_CACHE_ENABLED,
				encuestaCriteriosImpl.class, encuestaCriterios.getPrimaryKey());
		}
	}

	/**
	 * Creates a new encuesta criterios with the primary key. Does not add the encuesta criterios to the database.
	 *
	 * @param id the primary key for the new encuesta criterios
	 * @return the new encuesta criterios
	 */
	public encuestaCriterios create(int id) {
		encuestaCriterios encuestaCriterios = new encuestaCriteriosImpl();

		encuestaCriterios.setNew(true);
		encuestaCriterios.setPrimaryKey(id);

		return encuestaCriterios;
	}

	/**
	 * Removes the encuesta criterios with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the encuesta criterios
	 * @return the encuesta criterios that was removed
	 * @throws com.ability.genero.server.NoSuchencuestaCriteriosException if a encuesta criterios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public encuestaCriterios remove(int id)
		throws NoSuchencuestaCriteriosException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the encuesta criterios with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the encuesta criterios
	 * @return the encuesta criterios that was removed
	 * @throws com.ability.genero.server.NoSuchencuestaCriteriosException if a encuesta criterios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public encuestaCriterios remove(Serializable primaryKey)
		throws NoSuchencuestaCriteriosException, SystemException {
		Session session = null;

		try {
			session = openSession();

			encuestaCriterios encuestaCriterios = (encuestaCriterios)session.get(encuestaCriteriosImpl.class,
					primaryKey);

			if (encuestaCriterios == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchencuestaCriteriosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(encuestaCriterios);
		}
		catch (NoSuchencuestaCriteriosException nsee) {
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
	protected encuestaCriterios removeImpl(encuestaCriterios encuestaCriterios)
		throws SystemException {
		encuestaCriterios = toUnwrappedModel(encuestaCriterios);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, encuestaCriterios);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(encuestaCriterios);

		return encuestaCriterios;
	}

	@Override
	public encuestaCriterios updateImpl(
		com.ability.genero.server.model.encuestaCriterios encuestaCriterios,
		boolean merge) throws SystemException {
		encuestaCriterios = toUnwrappedModel(encuestaCriterios);

		boolean isNew = encuestaCriterios.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, encuestaCriterios, merge);

			encuestaCriterios.setNew(false);
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

		EntityCacheUtil.putResult(encuestaCriteriosModelImpl.ENTITY_CACHE_ENABLED,
			encuestaCriteriosImpl.class, encuestaCriterios.getPrimaryKey(),
			encuestaCriterios);

		return encuestaCriterios;
	}

	protected encuestaCriterios toUnwrappedModel(
		encuestaCriterios encuestaCriterios) {
		if (encuestaCriterios instanceof encuestaCriteriosImpl) {
			return encuestaCriterios;
		}

		encuestaCriteriosImpl encuestaCriteriosImpl = new encuestaCriteriosImpl();

		encuestaCriteriosImpl.setNew(encuestaCriterios.isNew());
		encuestaCriteriosImpl.setPrimaryKey(encuestaCriterios.getPrimaryKey());

		encuestaCriteriosImpl.setId(encuestaCriterios.getId());
		encuestaCriteriosImpl.setPregunta(encuestaCriterios.getPregunta());

		return encuestaCriteriosImpl;
	}

	/**
	 * Returns the encuesta criterios with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the encuesta criterios
	 * @return the encuesta criterios
	 * @throws com.liferay.portal.NoSuchModelException if a encuesta criterios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public encuestaCriterios findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the encuesta criterios with the primary key or throws a {@link com.ability.genero.server.NoSuchencuestaCriteriosException} if it could not be found.
	 *
	 * @param id the primary key of the encuesta criterios
	 * @return the encuesta criterios
	 * @throws com.ability.genero.server.NoSuchencuestaCriteriosException if a encuesta criterios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public encuestaCriterios findByPrimaryKey(int id)
		throws NoSuchencuestaCriteriosException, SystemException {
		encuestaCriterios encuestaCriterios = fetchByPrimaryKey(id);

		if (encuestaCriterios == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchencuestaCriteriosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return encuestaCriterios;
	}

	/**
	 * Returns the encuesta criterios with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the encuesta criterios
	 * @return the encuesta criterios, or <code>null</code> if a encuesta criterios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public encuestaCriterios fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the encuesta criterios with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the encuesta criterios
	 * @return the encuesta criterios, or <code>null</code> if a encuesta criterios with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public encuestaCriterios fetchByPrimaryKey(int id)
		throws SystemException {
		encuestaCriterios encuestaCriterios = (encuestaCriterios)EntityCacheUtil.getResult(encuestaCriteriosModelImpl.ENTITY_CACHE_ENABLED,
				encuestaCriteriosImpl.class, id);

		if (encuestaCriterios == _nullencuestaCriterios) {
			return null;
		}

		if (encuestaCriterios == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				encuestaCriterios = (encuestaCriterios)session.get(encuestaCriteriosImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (encuestaCriterios != null) {
					cacheResult(encuestaCriterios);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(encuestaCriteriosModelImpl.ENTITY_CACHE_ENABLED,
						encuestaCriteriosImpl.class, id, _nullencuestaCriterios);
				}

				closeSession(session);
			}
		}

		return encuestaCriterios;
	}

	/**
	 * Returns all the encuesta criterioses.
	 *
	 * @return the encuesta criterioses
	 * @throws SystemException if a system exception occurred
	 */
	public List<encuestaCriterios> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the encuesta criterioses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of encuesta criterioses
	 * @param end the upper bound of the range of encuesta criterioses (not inclusive)
	 * @return the range of encuesta criterioses
	 * @throws SystemException if a system exception occurred
	 */
	public List<encuestaCriterios> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the encuesta criterioses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of encuesta criterioses
	 * @param end the upper bound of the range of encuesta criterioses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of encuesta criterioses
	 * @throws SystemException if a system exception occurred
	 */
	public List<encuestaCriterios> findAll(int start, int end,
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

		List<encuestaCriterios> list = (List<encuestaCriterios>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ENCUESTACRITERIOS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ENCUESTACRITERIOS.concat(encuestaCriteriosModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<encuestaCriterios>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<encuestaCriterios>)QueryUtil.list(q,
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
	 * Removes all the encuesta criterioses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (encuestaCriterios encuestaCriterios : findAll()) {
			remove(encuestaCriterios);
		}
	}

	/**
	 * Returns the number of encuesta criterioses.
	 *
	 * @return the number of encuesta criterioses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ENCUESTACRITERIOS);

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
	 * Initializes the encuesta criterios persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.encuestaCriterios")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<encuestaCriterios>> listenersList = new ArrayList<ModelListener<encuestaCriterios>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<encuestaCriterios>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(encuestaCriteriosImpl.class.getName());
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
	private static final String _SQL_SELECT_ENCUESTACRITERIOS = "SELECT encuestaCriterios FROM encuestaCriterios encuestaCriterios";
	private static final String _SQL_COUNT_ENCUESTACRITERIOS = "SELECT COUNT(encuestaCriterios) FROM encuestaCriterios encuestaCriterios";
	private static final String _ORDER_BY_ENTITY_ALIAS = "encuestaCriterios.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No encuestaCriterios exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(encuestaCriteriosPersistenceImpl.class);
	private static encuestaCriterios _nullencuestaCriterios = new encuestaCriteriosImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<encuestaCriterios> toCacheModel() {
				return _nullencuestaCriteriosCacheModel;
			}
		};

	private static CacheModel<encuestaCriterios> _nullencuestaCriteriosCacheModel =
		new CacheModel<encuestaCriterios>() {
			public encuestaCriterios toEntityModel() {
				return _nullencuestaCriterios;
			}
		};
}