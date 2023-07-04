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

import com.ability.genero.server.NoSuchdistritoGException;
import com.ability.genero.server.model.distritoG;
import com.ability.genero.server.model.impl.distritoGImpl;
import com.ability.genero.server.model.impl.distritoGModelImpl;

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
 * The persistence implementation for the distrito g service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see distritoGPersistence
 * @see distritoGUtil
 * @generated
 */
public class distritoGPersistenceImpl extends BasePersistenceImpl<distritoG>
	implements distritoGPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link distritoGUtil} to access the distrito g persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = distritoGImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(distritoGModelImpl.ENTITY_CACHE_ENABLED,
			distritoGModelImpl.FINDER_CACHE_ENABLED, distritoGImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(distritoGModelImpl.ENTITY_CACHE_ENABLED,
			distritoGModelImpl.FINDER_CACHE_ENABLED, distritoGImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(distritoGModelImpl.ENTITY_CACHE_ENABLED,
			distritoGModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the distrito g in the entity cache if it is enabled.
	 *
	 * @param distritoG the distrito g
	 */
	public void cacheResult(distritoG distritoG) {
		EntityCacheUtil.putResult(distritoGModelImpl.ENTITY_CACHE_ENABLED,
			distritoGImpl.class, distritoG.getPrimaryKey(), distritoG);

		distritoG.resetOriginalValues();
	}

	/**
	 * Caches the distrito gs in the entity cache if it is enabled.
	 *
	 * @param distritoGs the distrito gs
	 */
	public void cacheResult(List<distritoG> distritoGs) {
		for (distritoG distritoG : distritoGs) {
			if (EntityCacheUtil.getResult(
						distritoGModelImpl.ENTITY_CACHE_ENABLED,
						distritoGImpl.class, distritoG.getPrimaryKey()) == null) {
				cacheResult(distritoG);
			}
			else {
				distritoG.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all distrito gs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(distritoGImpl.class.getName());
		}

		EntityCacheUtil.clearCache(distritoGImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the distrito g.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(distritoG distritoG) {
		EntityCacheUtil.removeResult(distritoGModelImpl.ENTITY_CACHE_ENABLED,
			distritoGImpl.class, distritoG.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<distritoG> distritoGs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (distritoG distritoG : distritoGs) {
			EntityCacheUtil.removeResult(distritoGModelImpl.ENTITY_CACHE_ENABLED,
				distritoGImpl.class, distritoG.getPrimaryKey());
		}
	}

	/**
	 * Creates a new distrito g with the primary key. Does not add the distrito g to the database.
	 *
	 * @param id the primary key for the new distrito g
	 * @return the new distrito g
	 */
	public distritoG create(int id) {
		distritoG distritoG = new distritoGImpl();

		distritoG.setNew(true);
		distritoG.setPrimaryKey(id);

		return distritoG;
	}

	/**
	 * Removes the distrito g with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the distrito g
	 * @return the distrito g that was removed
	 * @throws com.ability.genero.server.NoSuchdistritoGException if a distrito g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public distritoG remove(int id)
		throws NoSuchdistritoGException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the distrito g with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the distrito g
	 * @return the distrito g that was removed
	 * @throws com.ability.genero.server.NoSuchdistritoGException if a distrito g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public distritoG remove(Serializable primaryKey)
		throws NoSuchdistritoGException, SystemException {
		Session session = null;

		try {
			session = openSession();

			distritoG distritoG = (distritoG)session.get(distritoGImpl.class,
					primaryKey);

			if (distritoG == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchdistritoGException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(distritoG);
		}
		catch (NoSuchdistritoGException nsee) {
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
	protected distritoG removeImpl(distritoG distritoG)
		throws SystemException {
		distritoG = toUnwrappedModel(distritoG);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, distritoG);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(distritoG);

		return distritoG;
	}

	@Override
	public distritoG updateImpl(
		com.ability.genero.server.model.distritoG distritoG, boolean merge)
		throws SystemException {
		distritoG = toUnwrappedModel(distritoG);

		boolean isNew = distritoG.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, distritoG, merge);

			distritoG.setNew(false);
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

		EntityCacheUtil.putResult(distritoGModelImpl.ENTITY_CACHE_ENABLED,
			distritoGImpl.class, distritoG.getPrimaryKey(), distritoG);

		return distritoG;
	}

	protected distritoG toUnwrappedModel(distritoG distritoG) {
		if (distritoG instanceof distritoGImpl) {
			return distritoG;
		}

		distritoGImpl distritoGImpl = new distritoGImpl();

		distritoGImpl.setNew(distritoG.isNew());
		distritoGImpl.setPrimaryKey(distritoG.getPrimaryKey());

		distritoGImpl.setId(distritoG.getId());
		distritoGImpl.setNombre(distritoG.getNombre());
		distritoGImpl.setNombre_mascara(distritoG.getNombre_mascara());

		return distritoGImpl;
	}

	/**
	 * Returns the distrito g with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the distrito g
	 * @return the distrito g
	 * @throws com.liferay.portal.NoSuchModelException if a distrito g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public distritoG findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the distrito g with the primary key or throws a {@link com.ability.genero.server.NoSuchdistritoGException} if it could not be found.
	 *
	 * @param id the primary key of the distrito g
	 * @return the distrito g
	 * @throws com.ability.genero.server.NoSuchdistritoGException if a distrito g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public distritoG findByPrimaryKey(int id)
		throws NoSuchdistritoGException, SystemException {
		distritoG distritoG = fetchByPrimaryKey(id);

		if (distritoG == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchdistritoGException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return distritoG;
	}

	/**
	 * Returns the distrito g with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the distrito g
	 * @return the distrito g, or <code>null</code> if a distrito g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public distritoG fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the distrito g with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the distrito g
	 * @return the distrito g, or <code>null</code> if a distrito g with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public distritoG fetchByPrimaryKey(int id) throws SystemException {
		distritoG distritoG = (distritoG)EntityCacheUtil.getResult(distritoGModelImpl.ENTITY_CACHE_ENABLED,
				distritoGImpl.class, id);

		if (distritoG == _nulldistritoG) {
			return null;
		}

		if (distritoG == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				distritoG = (distritoG)session.get(distritoGImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (distritoG != null) {
					cacheResult(distritoG);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(distritoGModelImpl.ENTITY_CACHE_ENABLED,
						distritoGImpl.class, id, _nulldistritoG);
				}

				closeSession(session);
			}
		}

		return distritoG;
	}

	/**
	 * Returns all the distrito gs.
	 *
	 * @return the distrito gs
	 * @throws SystemException if a system exception occurred
	 */
	public List<distritoG> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the distrito gs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of distrito gs
	 * @param end the upper bound of the range of distrito gs (not inclusive)
	 * @return the range of distrito gs
	 * @throws SystemException if a system exception occurred
	 */
	public List<distritoG> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the distrito gs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of distrito gs
	 * @param end the upper bound of the range of distrito gs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of distrito gs
	 * @throws SystemException if a system exception occurred
	 */
	public List<distritoG> findAll(int start, int end,
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

		List<distritoG> list = (List<distritoG>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DISTRITOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DISTRITOG;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<distritoG>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<distritoG>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the distrito gs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (distritoG distritoG : findAll()) {
			remove(distritoG);
		}
	}

	/**
	 * Returns the number of distrito gs.
	 *
	 * @return the number of distrito gs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DISTRITOG);

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
	 * Initializes the distrito g persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.distritoG")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<distritoG>> listenersList = new ArrayList<ModelListener<distritoG>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<distritoG>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(distritoGImpl.class.getName());
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
	private static final String _SQL_SELECT_DISTRITOG = "SELECT distritoG FROM distritoG distritoG";
	private static final String _SQL_COUNT_DISTRITOG = "SELECT COUNT(distritoG) FROM distritoG distritoG";
	private static final String _ORDER_BY_ENTITY_ALIAS = "distritoG.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No distritoG exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(distritoGPersistenceImpl.class);
	private static distritoG _nulldistritoG = new distritoGImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<distritoG> toCacheModel() {
				return _nulldistritoGCacheModel;
			}
		};

	private static CacheModel<distritoG> _nulldistritoGCacheModel = new CacheModel<distritoG>() {
			public distritoG toEntityModel() {
				return _nulldistritoG;
			}
		};
}