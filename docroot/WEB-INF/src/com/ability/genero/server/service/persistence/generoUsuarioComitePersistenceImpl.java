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

import com.ability.genero.server.NoSuchUsuarioComiteException;
import com.ability.genero.server.model.generoUsuarioComite;
import com.ability.genero.server.model.impl.generoUsuarioComiteImpl;
import com.ability.genero.server.model.impl.generoUsuarioComiteModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
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
 * The persistence implementation for the genero usuario comite service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see generoUsuarioComitePersistence
 * @see generoUsuarioComiteUtil
 * @generated
 */
public class generoUsuarioComitePersistenceImpl extends BasePersistenceImpl<generoUsuarioComite>
	implements generoUsuarioComitePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link generoUsuarioComiteUtil} to access the genero usuario comite persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = generoUsuarioComiteImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORUSUARIO =
		new FinderPath(generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioComiteModelImpl.FINDER_CACHE_ENABLED,
			generoUsuarioComiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByporUsuario",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORUSUARIO =
		new FinderPath(generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioComiteModelImpl.FINDER_CACHE_ENABLED,
			generoUsuarioComiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByporUsuario",
			new String[] { String.class.getName() },
			generoUsuarioComiteModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORUSUARIO = new FinderPath(generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioComiteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByporUsuario",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioComiteModelImpl.FINDER_CACHE_ENABLED,
			generoUsuarioComiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioComiteModelImpl.FINDER_CACHE_ENABLED,
			generoUsuarioComiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioComiteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the genero usuario comite in the entity cache if it is enabled.
	 *
	 * @param generoUsuarioComite the genero usuario comite
	 */
	public void cacheResult(generoUsuarioComite generoUsuarioComite) {
		EntityCacheUtil.putResult(generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioComiteImpl.class, generoUsuarioComite.getPrimaryKey(),
			generoUsuarioComite);

		generoUsuarioComite.resetOriginalValues();
	}

	/**
	 * Caches the genero usuario comites in the entity cache if it is enabled.
	 *
	 * @param generoUsuarioComites the genero usuario comites
	 */
	public void cacheResult(List<generoUsuarioComite> generoUsuarioComites) {
		for (generoUsuarioComite generoUsuarioComite : generoUsuarioComites) {
			if (EntityCacheUtil.getResult(
						generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
						generoUsuarioComiteImpl.class,
						generoUsuarioComite.getPrimaryKey()) == null) {
				cacheResult(generoUsuarioComite);
			}
			else {
				generoUsuarioComite.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all genero usuario comites.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(generoUsuarioComiteImpl.class.getName());
		}

		EntityCacheUtil.clearCache(generoUsuarioComiteImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the genero usuario comite.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(generoUsuarioComite generoUsuarioComite) {
		EntityCacheUtil.removeResult(generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioComiteImpl.class, generoUsuarioComite.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<generoUsuarioComite> generoUsuarioComites) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (generoUsuarioComite generoUsuarioComite : generoUsuarioComites) {
			EntityCacheUtil.removeResult(generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
				generoUsuarioComiteImpl.class,
				generoUsuarioComite.getPrimaryKey());
		}
	}

	/**
	 * Creates a new genero usuario comite with the primary key. Does not add the genero usuario comite to the database.
	 *
	 * @param id the primary key for the new genero usuario comite
	 * @return the new genero usuario comite
	 */
	public generoUsuarioComite create(int id) {
		generoUsuarioComite generoUsuarioComite = new generoUsuarioComiteImpl();

		generoUsuarioComite.setNew(true);
		generoUsuarioComite.setPrimaryKey(id);

		return generoUsuarioComite;
	}

	/**
	 * Removes the genero usuario comite with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the genero usuario comite
	 * @return the genero usuario comite that was removed
	 * @throws com.ability.genero.server.NoSuchUsuarioComiteException if a genero usuario comite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuarioComite remove(int id)
		throws NoSuchUsuarioComiteException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the genero usuario comite with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the genero usuario comite
	 * @return the genero usuario comite that was removed
	 * @throws com.ability.genero.server.NoSuchUsuarioComiteException if a genero usuario comite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public generoUsuarioComite remove(Serializable primaryKey)
		throws NoSuchUsuarioComiteException, SystemException {
		Session session = null;

		try {
			session = openSession();

			generoUsuarioComite generoUsuarioComite = (generoUsuarioComite)session.get(generoUsuarioComiteImpl.class,
					primaryKey);

			if (generoUsuarioComite == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUsuarioComiteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(generoUsuarioComite);
		}
		catch (NoSuchUsuarioComiteException nsee) {
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
	protected generoUsuarioComite removeImpl(
		generoUsuarioComite generoUsuarioComite) throws SystemException {
		generoUsuarioComite = toUnwrappedModel(generoUsuarioComite);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, generoUsuarioComite);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(generoUsuarioComite);

		return generoUsuarioComite;
	}

	@Override
	public generoUsuarioComite updateImpl(
		com.ability.genero.server.model.generoUsuarioComite generoUsuarioComite,
		boolean merge) throws SystemException {
		generoUsuarioComite = toUnwrappedModel(generoUsuarioComite);

		boolean isNew = generoUsuarioComite.isNew();

		generoUsuarioComiteModelImpl generoUsuarioComiteModelImpl = (generoUsuarioComiteModelImpl)generoUsuarioComite;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, generoUsuarioComite, merge);

			generoUsuarioComite.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !generoUsuarioComiteModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((generoUsuarioComiteModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORUSUARIO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						generoUsuarioComiteModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORUSUARIO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORUSUARIO,
					args);

				args = new Object[] { generoUsuarioComiteModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORUSUARIO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORUSUARIO,
					args);
			}
		}

		EntityCacheUtil.putResult(generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioComiteImpl.class, generoUsuarioComite.getPrimaryKey(),
			generoUsuarioComite);

		return generoUsuarioComite;
	}

	protected generoUsuarioComite toUnwrappedModel(
		generoUsuarioComite generoUsuarioComite) {
		if (generoUsuarioComite instanceof generoUsuarioComiteImpl) {
			return generoUsuarioComite;
		}

		generoUsuarioComiteImpl generoUsuarioComiteImpl = new generoUsuarioComiteImpl();

		generoUsuarioComiteImpl.setNew(generoUsuarioComite.isNew());
		generoUsuarioComiteImpl.setPrimaryKey(generoUsuarioComite.getPrimaryKey());

		generoUsuarioComiteImpl.setId(generoUsuarioComite.getId());
		generoUsuarioComiteImpl.setDistrito(generoUsuarioComite.getDistrito());
		generoUsuarioComiteImpl.setUserId(generoUsuarioComite.getUserId());
		generoUsuarioComiteImpl.setFecha_creacion(generoUsuarioComite.getFecha_creacion());

		return generoUsuarioComiteImpl;
	}

	/**
	 * Returns the genero usuario comite with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the genero usuario comite
	 * @return the genero usuario comite
	 * @throws com.liferay.portal.NoSuchModelException if a genero usuario comite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public generoUsuarioComite findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the genero usuario comite with the primary key or throws a {@link com.ability.genero.server.NoSuchUsuarioComiteException} if it could not be found.
	 *
	 * @param id the primary key of the genero usuario comite
	 * @return the genero usuario comite
	 * @throws com.ability.genero.server.NoSuchUsuarioComiteException if a genero usuario comite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuarioComite findByPrimaryKey(int id)
		throws NoSuchUsuarioComiteException, SystemException {
		generoUsuarioComite generoUsuarioComite = fetchByPrimaryKey(id);

		if (generoUsuarioComite == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchUsuarioComiteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return generoUsuarioComite;
	}

	/**
	 * Returns the genero usuario comite with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the genero usuario comite
	 * @return the genero usuario comite, or <code>null</code> if a genero usuario comite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public generoUsuarioComite fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the genero usuario comite with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the genero usuario comite
	 * @return the genero usuario comite, or <code>null</code> if a genero usuario comite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuarioComite fetchByPrimaryKey(int id)
		throws SystemException {
		generoUsuarioComite generoUsuarioComite = (generoUsuarioComite)EntityCacheUtil.getResult(generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
				generoUsuarioComiteImpl.class, id);

		if (generoUsuarioComite == _nullgeneroUsuarioComite) {
			return null;
		}

		if (generoUsuarioComite == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				generoUsuarioComite = (generoUsuarioComite)session.get(generoUsuarioComiteImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (generoUsuarioComite != null) {
					cacheResult(generoUsuarioComite);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(generoUsuarioComiteModelImpl.ENTITY_CACHE_ENABLED,
						generoUsuarioComiteImpl.class, id,
						_nullgeneroUsuarioComite);
				}

				closeSession(session);
			}
		}

		return generoUsuarioComite;
	}

	/**
	 * Returns all the genero usuario comites where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching genero usuario comites
	 * @throws SystemException if a system exception occurred
	 */
	public List<generoUsuarioComite> findByporUsuario(String userId)
		throws SystemException {
		return findByporUsuario(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the genero usuario comites where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of genero usuario comites
	 * @param end the upper bound of the range of genero usuario comites (not inclusive)
	 * @return the range of matching genero usuario comites
	 * @throws SystemException if a system exception occurred
	 */
	public List<generoUsuarioComite> findByporUsuario(String userId, int start,
		int end) throws SystemException {
		return findByporUsuario(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the genero usuario comites where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of genero usuario comites
	 * @param end the upper bound of the range of genero usuario comites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching genero usuario comites
	 * @throws SystemException if a system exception occurred
	 */
	public List<generoUsuarioComite> findByporUsuario(String userId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORUSUARIO;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORUSUARIO;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<generoUsuarioComite> list = (List<generoUsuarioComite>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (generoUsuarioComite generoUsuarioComite : list) {
				if (!Validator.equals(userId, generoUsuarioComite.getUserId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_GENEROUSUARIOCOMITE_WHERE);

			if (userId == null) {
				query.append(_FINDER_COLUMN_PORUSUARIO_USERID_1);
			}
			else {
				if (userId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORUSUARIO_USERID_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORUSUARIO_USERID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (userId != null) {
					qPos.add(userId);
				}

				list = (List<generoUsuarioComite>)QueryUtil.list(q,
						getDialect(), start, end);
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
	 * Returns the first genero usuario comite in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching genero usuario comite
	 * @throws com.ability.genero.server.NoSuchUsuarioComiteException if a matching genero usuario comite could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuarioComite findByporUsuario_First(String userId,
		OrderByComparator orderByComparator)
		throws NoSuchUsuarioComiteException, SystemException {
		generoUsuarioComite generoUsuarioComite = fetchByporUsuario_First(userId,
				orderByComparator);

		if (generoUsuarioComite != null) {
			return generoUsuarioComite;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUsuarioComiteException(msg.toString());
	}

	/**
	 * Returns the first genero usuario comite in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching genero usuario comite, or <code>null</code> if a matching genero usuario comite could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuarioComite fetchByporUsuario_First(String userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<generoUsuarioComite> list = findByporUsuario(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last genero usuario comite in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching genero usuario comite
	 * @throws com.ability.genero.server.NoSuchUsuarioComiteException if a matching genero usuario comite could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuarioComite findByporUsuario_Last(String userId,
		OrderByComparator orderByComparator)
		throws NoSuchUsuarioComiteException, SystemException {
		generoUsuarioComite generoUsuarioComite = fetchByporUsuario_Last(userId,
				orderByComparator);

		if (generoUsuarioComite != null) {
			return generoUsuarioComite;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUsuarioComiteException(msg.toString());
	}

	/**
	 * Returns the last genero usuario comite in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching genero usuario comite, or <code>null</code> if a matching genero usuario comite could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuarioComite fetchByporUsuario_Last(String userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByporUsuario(userId);

		List<generoUsuarioComite> list = findByporUsuario(userId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the genero usuario comites before and after the current genero usuario comite in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current genero usuario comite
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next genero usuario comite
	 * @throws com.ability.genero.server.NoSuchUsuarioComiteException if a genero usuario comite with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuarioComite[] findByporUsuario_PrevAndNext(int id,
		String userId, OrderByComparator orderByComparator)
		throws NoSuchUsuarioComiteException, SystemException {
		generoUsuarioComite generoUsuarioComite = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			generoUsuarioComite[] array = new generoUsuarioComiteImpl[3];

			array[0] = getByporUsuario_PrevAndNext(session,
					generoUsuarioComite, userId, orderByComparator, true);

			array[1] = generoUsuarioComite;

			array[2] = getByporUsuario_PrevAndNext(session,
					generoUsuarioComite, userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected generoUsuarioComite getByporUsuario_PrevAndNext(Session session,
		generoUsuarioComite generoUsuarioComite, String userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_GENEROUSUARIOCOMITE_WHERE);

		if (userId == null) {
			query.append(_FINDER_COLUMN_PORUSUARIO_USERID_1);
		}
		else {
			if (userId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORUSUARIO_USERID_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORUSUARIO_USERID_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (userId != null) {
			qPos.add(userId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(generoUsuarioComite);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<generoUsuarioComite> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the genero usuario comites.
	 *
	 * @return the genero usuario comites
	 * @throws SystemException if a system exception occurred
	 */
	public List<generoUsuarioComite> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the genero usuario comites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of genero usuario comites
	 * @param end the upper bound of the range of genero usuario comites (not inclusive)
	 * @return the range of genero usuario comites
	 * @throws SystemException if a system exception occurred
	 */
	public List<generoUsuarioComite> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the genero usuario comites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of genero usuario comites
	 * @param end the upper bound of the range of genero usuario comites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of genero usuario comites
	 * @throws SystemException if a system exception occurred
	 */
	public List<generoUsuarioComite> findAll(int start, int end,
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

		List<generoUsuarioComite> list = (List<generoUsuarioComite>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_GENEROUSUARIOCOMITE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GENEROUSUARIOCOMITE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<generoUsuarioComite>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<generoUsuarioComite>)QueryUtil.list(q,
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
	 * Removes all the genero usuario comites where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByporUsuario(String userId) throws SystemException {
		for (generoUsuarioComite generoUsuarioComite : findByporUsuario(userId)) {
			remove(generoUsuarioComite);
		}
	}

	/**
	 * Removes all the genero usuario comites from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (generoUsuarioComite generoUsuarioComite : findAll()) {
			remove(generoUsuarioComite);
		}
	}

	/**
	 * Returns the number of genero usuario comites where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching genero usuario comites
	 * @throws SystemException if a system exception occurred
	 */
	public int countByporUsuario(String userId) throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORUSUARIO,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_GENEROUSUARIOCOMITE_WHERE);

			if (userId == null) {
				query.append(_FINDER_COLUMN_PORUSUARIO_USERID_1);
			}
			else {
				if (userId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORUSUARIO_USERID_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORUSUARIO_USERID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (userId != null) {
					qPos.add(userId);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORUSUARIO,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of genero usuario comites.
	 *
	 * @return the number of genero usuario comites
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_GENEROUSUARIOCOMITE);

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
	 * Initializes the genero usuario comite persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.generoUsuarioComite")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<generoUsuarioComite>> listenersList = new ArrayList<ModelListener<generoUsuarioComite>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<generoUsuarioComite>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(generoUsuarioComiteImpl.class.getName());
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
	private static final String _SQL_SELECT_GENEROUSUARIOCOMITE = "SELECT generoUsuarioComite FROM generoUsuarioComite generoUsuarioComite";
	private static final String _SQL_SELECT_GENEROUSUARIOCOMITE_WHERE = "SELECT generoUsuarioComite FROM generoUsuarioComite generoUsuarioComite WHERE ";
	private static final String _SQL_COUNT_GENEROUSUARIOCOMITE = "SELECT COUNT(generoUsuarioComite) FROM generoUsuarioComite generoUsuarioComite";
	private static final String _SQL_COUNT_GENEROUSUARIOCOMITE_WHERE = "SELECT COUNT(generoUsuarioComite) FROM generoUsuarioComite generoUsuarioComite WHERE ";
	private static final String _FINDER_COLUMN_PORUSUARIO_USERID_1 = "generoUsuarioComite.userId IS NULL";
	private static final String _FINDER_COLUMN_PORUSUARIO_USERID_2 = "generoUsuarioComite.userId = ?";
	private static final String _FINDER_COLUMN_PORUSUARIO_USERID_3 = "(generoUsuarioComite.userId IS NULL OR generoUsuarioComite.userId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "generoUsuarioComite.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No generoUsuarioComite exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No generoUsuarioComite exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(generoUsuarioComitePersistenceImpl.class);
	private static generoUsuarioComite _nullgeneroUsuarioComite = new generoUsuarioComiteImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<generoUsuarioComite> toCacheModel() {
				return _nullgeneroUsuarioComiteCacheModel;
			}
		};

	private static CacheModel<generoUsuarioComite> _nullgeneroUsuarioComiteCacheModel =
		new CacheModel<generoUsuarioComite>() {
			public generoUsuarioComite toEntityModel() {
				return _nullgeneroUsuarioComite;
			}
		};
}