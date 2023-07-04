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

import com.ability.genero.server.NoSuchencuestaEnfoDifeException;
import com.ability.genero.server.model.encuestaEnfoDife;
import com.ability.genero.server.model.impl.encuestaEnfoDifeImpl;
import com.ability.genero.server.model.impl.encuestaEnfoDifeModelImpl;

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
 * The persistence implementation for the encuesta enfo dife service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see encuestaEnfoDifePersistence
 * @see encuestaEnfoDifeUtil
 * @generated
 */
public class encuestaEnfoDifePersistenceImpl extends BasePersistenceImpl<encuestaEnfoDife>
	implements encuestaEnfoDifePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link encuestaEnfoDifeUtil} to access the encuesta enfo dife persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = encuestaEnfoDifeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(encuestaEnfoDifeModelImpl.ENTITY_CACHE_ENABLED,
			encuestaEnfoDifeModelImpl.FINDER_CACHE_ENABLED,
			encuestaEnfoDifeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(encuestaEnfoDifeModelImpl.ENTITY_CACHE_ENABLED,
			encuestaEnfoDifeModelImpl.FINDER_CACHE_ENABLED,
			encuestaEnfoDifeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(encuestaEnfoDifeModelImpl.ENTITY_CACHE_ENABLED,
			encuestaEnfoDifeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the encuesta enfo dife in the entity cache if it is enabled.
	 *
	 * @param encuestaEnfoDife the encuesta enfo dife
	 */
	public void cacheResult(encuestaEnfoDife encuestaEnfoDife) {
		EntityCacheUtil.putResult(encuestaEnfoDifeModelImpl.ENTITY_CACHE_ENABLED,
			encuestaEnfoDifeImpl.class, encuestaEnfoDife.getPrimaryKey(),
			encuestaEnfoDife);

		encuestaEnfoDife.resetOriginalValues();
	}

	/**
	 * Caches the encuesta enfo difes in the entity cache if it is enabled.
	 *
	 * @param encuestaEnfoDifes the encuesta enfo difes
	 */
	public void cacheResult(List<encuestaEnfoDife> encuestaEnfoDifes) {
		for (encuestaEnfoDife encuestaEnfoDife : encuestaEnfoDifes) {
			if (EntityCacheUtil.getResult(
						encuestaEnfoDifeModelImpl.ENTITY_CACHE_ENABLED,
						encuestaEnfoDifeImpl.class,
						encuestaEnfoDife.getPrimaryKey()) == null) {
				cacheResult(encuestaEnfoDife);
			}
			else {
				encuestaEnfoDife.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all encuesta enfo difes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(encuestaEnfoDifeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(encuestaEnfoDifeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the encuesta enfo dife.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(encuestaEnfoDife encuestaEnfoDife) {
		EntityCacheUtil.removeResult(encuestaEnfoDifeModelImpl.ENTITY_CACHE_ENABLED,
			encuestaEnfoDifeImpl.class, encuestaEnfoDife.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<encuestaEnfoDife> encuestaEnfoDifes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (encuestaEnfoDife encuestaEnfoDife : encuestaEnfoDifes) {
			EntityCacheUtil.removeResult(encuestaEnfoDifeModelImpl.ENTITY_CACHE_ENABLED,
				encuestaEnfoDifeImpl.class, encuestaEnfoDife.getPrimaryKey());
		}
	}

	/**
	 * Creates a new encuesta enfo dife with the primary key. Does not add the encuesta enfo dife to the database.
	 *
	 * @param id the primary key for the new encuesta enfo dife
	 * @return the new encuesta enfo dife
	 */
	public encuestaEnfoDife create(int id) {
		encuestaEnfoDife encuestaEnfoDife = new encuestaEnfoDifeImpl();

		encuestaEnfoDife.setNew(true);
		encuestaEnfoDife.setPrimaryKey(id);

		return encuestaEnfoDife;
	}

	/**
	 * Removes the encuesta enfo dife with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the encuesta enfo dife
	 * @return the encuesta enfo dife that was removed
	 * @throws com.ability.genero.server.NoSuchencuestaEnfoDifeException if a encuesta enfo dife with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public encuestaEnfoDife remove(int id)
		throws NoSuchencuestaEnfoDifeException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the encuesta enfo dife with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the encuesta enfo dife
	 * @return the encuesta enfo dife that was removed
	 * @throws com.ability.genero.server.NoSuchencuestaEnfoDifeException if a encuesta enfo dife with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public encuestaEnfoDife remove(Serializable primaryKey)
		throws NoSuchencuestaEnfoDifeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			encuestaEnfoDife encuestaEnfoDife = (encuestaEnfoDife)session.get(encuestaEnfoDifeImpl.class,
					primaryKey);

			if (encuestaEnfoDife == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchencuestaEnfoDifeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(encuestaEnfoDife);
		}
		catch (NoSuchencuestaEnfoDifeException nsee) {
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
	protected encuestaEnfoDife removeImpl(encuestaEnfoDife encuestaEnfoDife)
		throws SystemException {
		encuestaEnfoDife = toUnwrappedModel(encuestaEnfoDife);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, encuestaEnfoDife);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(encuestaEnfoDife);

		return encuestaEnfoDife;
	}

	@Override
	public encuestaEnfoDife updateImpl(
		com.ability.genero.server.model.encuestaEnfoDife encuestaEnfoDife,
		boolean merge) throws SystemException {
		encuestaEnfoDife = toUnwrappedModel(encuestaEnfoDife);

		boolean isNew = encuestaEnfoDife.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, encuestaEnfoDife, merge);

			encuestaEnfoDife.setNew(false);
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

		EntityCacheUtil.putResult(encuestaEnfoDifeModelImpl.ENTITY_CACHE_ENABLED,
			encuestaEnfoDifeImpl.class, encuestaEnfoDife.getPrimaryKey(),
			encuestaEnfoDife);

		return encuestaEnfoDife;
	}

	protected encuestaEnfoDife toUnwrappedModel(
		encuestaEnfoDife encuestaEnfoDife) {
		if (encuestaEnfoDife instanceof encuestaEnfoDifeImpl) {
			return encuestaEnfoDife;
		}

		encuestaEnfoDifeImpl encuestaEnfoDifeImpl = new encuestaEnfoDifeImpl();

		encuestaEnfoDifeImpl.setNew(encuestaEnfoDife.isNew());
		encuestaEnfoDifeImpl.setPrimaryKey(encuestaEnfoDife.getPrimaryKey());

		encuestaEnfoDifeImpl.setId(encuestaEnfoDife.getId());
		encuestaEnfoDifeImpl.setPregunta(encuestaEnfoDife.getPregunta());

		return encuestaEnfoDifeImpl;
	}

	/**
	 * Returns the encuesta enfo dife with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the encuesta enfo dife
	 * @return the encuesta enfo dife
	 * @throws com.liferay.portal.NoSuchModelException if a encuesta enfo dife with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public encuestaEnfoDife findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the encuesta enfo dife with the primary key or throws a {@link com.ability.genero.server.NoSuchencuestaEnfoDifeException} if it could not be found.
	 *
	 * @param id the primary key of the encuesta enfo dife
	 * @return the encuesta enfo dife
	 * @throws com.ability.genero.server.NoSuchencuestaEnfoDifeException if a encuesta enfo dife with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public encuestaEnfoDife findByPrimaryKey(int id)
		throws NoSuchencuestaEnfoDifeException, SystemException {
		encuestaEnfoDife encuestaEnfoDife = fetchByPrimaryKey(id);

		if (encuestaEnfoDife == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchencuestaEnfoDifeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return encuestaEnfoDife;
	}

	/**
	 * Returns the encuesta enfo dife with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the encuesta enfo dife
	 * @return the encuesta enfo dife, or <code>null</code> if a encuesta enfo dife with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public encuestaEnfoDife fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the encuesta enfo dife with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the encuesta enfo dife
	 * @return the encuesta enfo dife, or <code>null</code> if a encuesta enfo dife with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public encuestaEnfoDife fetchByPrimaryKey(int id) throws SystemException {
		encuestaEnfoDife encuestaEnfoDife = (encuestaEnfoDife)EntityCacheUtil.getResult(encuestaEnfoDifeModelImpl.ENTITY_CACHE_ENABLED,
				encuestaEnfoDifeImpl.class, id);

		if (encuestaEnfoDife == _nullencuestaEnfoDife) {
			return null;
		}

		if (encuestaEnfoDife == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				encuestaEnfoDife = (encuestaEnfoDife)session.get(encuestaEnfoDifeImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (encuestaEnfoDife != null) {
					cacheResult(encuestaEnfoDife);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(encuestaEnfoDifeModelImpl.ENTITY_CACHE_ENABLED,
						encuestaEnfoDifeImpl.class, id, _nullencuestaEnfoDife);
				}

				closeSession(session);
			}
		}

		return encuestaEnfoDife;
	}

	/**
	 * Returns all the encuesta enfo difes.
	 *
	 * @return the encuesta enfo difes
	 * @throws SystemException if a system exception occurred
	 */
	public List<encuestaEnfoDife> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the encuesta enfo difes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of encuesta enfo difes
	 * @param end the upper bound of the range of encuesta enfo difes (not inclusive)
	 * @return the range of encuesta enfo difes
	 * @throws SystemException if a system exception occurred
	 */
	public List<encuestaEnfoDife> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the encuesta enfo difes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of encuesta enfo difes
	 * @param end the upper bound of the range of encuesta enfo difes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of encuesta enfo difes
	 * @throws SystemException if a system exception occurred
	 */
	public List<encuestaEnfoDife> findAll(int start, int end,
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

		List<encuestaEnfoDife> list = (List<encuestaEnfoDife>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ENCUESTAENFODIFE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ENCUESTAENFODIFE.concat(encuestaEnfoDifeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<encuestaEnfoDife>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<encuestaEnfoDife>)QueryUtil.list(q,
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
	 * Removes all the encuesta enfo difes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (encuestaEnfoDife encuestaEnfoDife : findAll()) {
			remove(encuestaEnfoDife);
		}
	}

	/**
	 * Returns the number of encuesta enfo difes.
	 *
	 * @return the number of encuesta enfo difes
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ENCUESTAENFODIFE);

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
	 * Initializes the encuesta enfo dife persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.encuestaEnfoDife")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<encuestaEnfoDife>> listenersList = new ArrayList<ModelListener<encuestaEnfoDife>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<encuestaEnfoDife>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(encuestaEnfoDifeImpl.class.getName());
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
	private static final String _SQL_SELECT_ENCUESTAENFODIFE = "SELECT encuestaEnfoDife FROM encuestaEnfoDife encuestaEnfoDife";
	private static final String _SQL_COUNT_ENCUESTAENFODIFE = "SELECT COUNT(encuestaEnfoDife) FROM encuestaEnfoDife encuestaEnfoDife";
	private static final String _ORDER_BY_ENTITY_ALIAS = "encuestaEnfoDife.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No encuestaEnfoDife exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(encuestaEnfoDifePersistenceImpl.class);
	private static encuestaEnfoDife _nullencuestaEnfoDife = new encuestaEnfoDifeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<encuestaEnfoDife> toCacheModel() {
				return _nullencuestaEnfoDifeCacheModel;
			}
		};

	private static CacheModel<encuestaEnfoDife> _nullencuestaEnfoDifeCacheModel = new CacheModel<encuestaEnfoDife>() {
			public encuestaEnfoDife toEntityModel() {
				return _nullencuestaEnfoDife;
			}
		};
}