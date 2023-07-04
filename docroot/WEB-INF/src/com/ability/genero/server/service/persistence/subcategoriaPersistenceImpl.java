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

import com.ability.genero.server.NoSuchsubcategoriaException;
import com.ability.genero.server.model.impl.subcategoriaImpl;
import com.ability.genero.server.model.impl.subcategoriaModelImpl;
import com.ability.genero.server.model.subcategoria;

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
 * The persistence implementation for the subcategoria service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see subcategoriaPersistence
 * @see subcategoriaUtil
 * @generated
 */
public class subcategoriaPersistenceImpl extends BasePersistenceImpl<subcategoria>
	implements subcategoriaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link subcategoriaUtil} to access the subcategoria persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = subcategoriaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBCATXCAT =
		new FinderPath(subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
			subcategoriaModelImpl.FINDER_CACHE_ENABLED, subcategoriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBysubCatXCat",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCATXCAT =
		new FinderPath(subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
			subcategoriaModelImpl.FINDER_CACHE_ENABLED, subcategoriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBysubCatXCat",
			new String[] { Integer.class.getName() },
			subcategoriaModelImpl.IDCATEGORIA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SUBCATXCAT = new FinderPath(subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
			subcategoriaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBysubCatXCat",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
			subcategoriaModelImpl.FINDER_CACHE_ENABLED, subcategoriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
			subcategoriaModelImpl.FINDER_CACHE_ENABLED, subcategoriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
			subcategoriaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the subcategoria in the entity cache if it is enabled.
	 *
	 * @param subcategoria the subcategoria
	 */
	public void cacheResult(subcategoria subcategoria) {
		EntityCacheUtil.putResult(subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
			subcategoriaImpl.class, subcategoria.getPrimaryKey(), subcategoria);

		subcategoria.resetOriginalValues();
	}

	/**
	 * Caches the subcategorias in the entity cache if it is enabled.
	 *
	 * @param subcategorias the subcategorias
	 */
	public void cacheResult(List<subcategoria> subcategorias) {
		for (subcategoria subcategoria : subcategorias) {
			if (EntityCacheUtil.getResult(
						subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
						subcategoriaImpl.class, subcategoria.getPrimaryKey()) == null) {
				cacheResult(subcategoria);
			}
			else {
				subcategoria.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all subcategorias.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(subcategoriaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(subcategoriaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the subcategoria.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(subcategoria subcategoria) {
		EntityCacheUtil.removeResult(subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
			subcategoriaImpl.class, subcategoria.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<subcategoria> subcategorias) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (subcategoria subcategoria : subcategorias) {
			EntityCacheUtil.removeResult(subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
				subcategoriaImpl.class, subcategoria.getPrimaryKey());
		}
	}

	/**
	 * Creates a new subcategoria with the primary key. Does not add the subcategoria to the database.
	 *
	 * @param id the primary key for the new subcategoria
	 * @return the new subcategoria
	 */
	public subcategoria create(int id) {
		subcategoria subcategoria = new subcategoriaImpl();

		subcategoria.setNew(true);
		subcategoria.setPrimaryKey(id);

		return subcategoria;
	}

	/**
	 * Removes the subcategoria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the subcategoria
	 * @return the subcategoria that was removed
	 * @throws com.ability.genero.server.NoSuchsubcategoriaException if a subcategoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public subcategoria remove(int id)
		throws NoSuchsubcategoriaException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the subcategoria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the subcategoria
	 * @return the subcategoria that was removed
	 * @throws com.ability.genero.server.NoSuchsubcategoriaException if a subcategoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public subcategoria remove(Serializable primaryKey)
		throws NoSuchsubcategoriaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			subcategoria subcategoria = (subcategoria)session.get(subcategoriaImpl.class,
					primaryKey);

			if (subcategoria == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsubcategoriaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(subcategoria);
		}
		catch (NoSuchsubcategoriaException nsee) {
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
	protected subcategoria removeImpl(subcategoria subcategoria)
		throws SystemException {
		subcategoria = toUnwrappedModel(subcategoria);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, subcategoria);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(subcategoria);

		return subcategoria;
	}

	@Override
	public subcategoria updateImpl(
		com.ability.genero.server.model.subcategoria subcategoria, boolean merge)
		throws SystemException {
		subcategoria = toUnwrappedModel(subcategoria);

		boolean isNew = subcategoria.isNew();

		subcategoriaModelImpl subcategoriaModelImpl = (subcategoriaModelImpl)subcategoria;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, subcategoria, merge);

			subcategoria.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !subcategoriaModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((subcategoriaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCATXCAT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(subcategoriaModelImpl.getOriginalIdCategoria())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SUBCATXCAT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCATXCAT,
					args);

				args = new Object[] {
						Integer.valueOf(subcategoriaModelImpl.getIdCategoria())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SUBCATXCAT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCATXCAT,
					args);
			}
		}

		EntityCacheUtil.putResult(subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
			subcategoriaImpl.class, subcategoria.getPrimaryKey(), subcategoria);

		return subcategoria;
	}

	protected subcategoria toUnwrappedModel(subcategoria subcategoria) {
		if (subcategoria instanceof subcategoriaImpl) {
			return subcategoria;
		}

		subcategoriaImpl subcategoriaImpl = new subcategoriaImpl();

		subcategoriaImpl.setNew(subcategoria.isNew());
		subcategoriaImpl.setPrimaryKey(subcategoria.getPrimaryKey());

		subcategoriaImpl.setId(subcategoria.getId());
		subcategoriaImpl.setIdCategoria(subcategoria.getIdCategoria());
		subcategoriaImpl.setSubcategoria(subcategoria.getSubcategoria());
		subcategoriaImpl.setUrl(subcategoria.getUrl());

		return subcategoriaImpl;
	}

	/**
	 * Returns the subcategoria with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the subcategoria
	 * @return the subcategoria
	 * @throws com.liferay.portal.NoSuchModelException if a subcategoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public subcategoria findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the subcategoria with the primary key or throws a {@link com.ability.genero.server.NoSuchsubcategoriaException} if it could not be found.
	 *
	 * @param id the primary key of the subcategoria
	 * @return the subcategoria
	 * @throws com.ability.genero.server.NoSuchsubcategoriaException if a subcategoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public subcategoria findByPrimaryKey(int id)
		throws NoSuchsubcategoriaException, SystemException {
		subcategoria subcategoria = fetchByPrimaryKey(id);

		if (subcategoria == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchsubcategoriaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return subcategoria;
	}

	/**
	 * Returns the subcategoria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the subcategoria
	 * @return the subcategoria, or <code>null</code> if a subcategoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public subcategoria fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the subcategoria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the subcategoria
	 * @return the subcategoria, or <code>null</code> if a subcategoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public subcategoria fetchByPrimaryKey(int id) throws SystemException {
		subcategoria subcategoria = (subcategoria)EntityCacheUtil.getResult(subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
				subcategoriaImpl.class, id);

		if (subcategoria == _nullsubcategoria) {
			return null;
		}

		if (subcategoria == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				subcategoria = (subcategoria)session.get(subcategoriaImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (subcategoria != null) {
					cacheResult(subcategoria);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(subcategoriaModelImpl.ENTITY_CACHE_ENABLED,
						subcategoriaImpl.class, id, _nullsubcategoria);
				}

				closeSession(session);
			}
		}

		return subcategoria;
	}

	/**
	 * Returns all the subcategorias where idCategoria = &#63;.
	 *
	 * @param idCategoria the id categoria
	 * @return the matching subcategorias
	 * @throws SystemException if a system exception occurred
	 */
	public List<subcategoria> findBysubCatXCat(int idCategoria)
		throws SystemException {
		return findBysubCatXCat(idCategoria, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subcategorias where idCategoria = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param idCategoria the id categoria
	 * @param start the lower bound of the range of subcategorias
	 * @param end the upper bound of the range of subcategorias (not inclusive)
	 * @return the range of matching subcategorias
	 * @throws SystemException if a system exception occurred
	 */
	public List<subcategoria> findBysubCatXCat(int idCategoria, int start,
		int end) throws SystemException {
		return findBysubCatXCat(idCategoria, start, end, null);
	}

	/**
	 * Returns an ordered range of all the subcategorias where idCategoria = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param idCategoria the id categoria
	 * @param start the lower bound of the range of subcategorias
	 * @param end the upper bound of the range of subcategorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching subcategorias
	 * @throws SystemException if a system exception occurred
	 */
	public List<subcategoria> findBysubCatXCat(int idCategoria, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCATXCAT;
			finderArgs = new Object[] { idCategoria };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBCATXCAT;
			finderArgs = new Object[] { idCategoria, start, end, orderByComparator };
		}

		List<subcategoria> list = (List<subcategoria>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (subcategoria subcategoria : list) {
				if ((idCategoria != subcategoria.getIdCategoria())) {
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
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_SUBCATEGORIA_WHERE);

			query.append(_FINDER_COLUMN_SUBCATXCAT_IDCATEGORIA_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(subcategoriaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idCategoria);

				list = (List<subcategoria>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Returns the first subcategoria in the ordered set where idCategoria = &#63;.
	 *
	 * @param idCategoria the id categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subcategoria
	 * @throws com.ability.genero.server.NoSuchsubcategoriaException if a matching subcategoria could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public subcategoria findBysubCatXCat_First(int idCategoria,
		OrderByComparator orderByComparator)
		throws NoSuchsubcategoriaException, SystemException {
		subcategoria subcategoria = fetchBysubCatXCat_First(idCategoria,
				orderByComparator);

		if (subcategoria != null) {
			return subcategoria;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("idCategoria=");
		msg.append(idCategoria);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsubcategoriaException(msg.toString());
	}

	/**
	 * Returns the first subcategoria in the ordered set where idCategoria = &#63;.
	 *
	 * @param idCategoria the id categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subcategoria, or <code>null</code> if a matching subcategoria could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public subcategoria fetchBysubCatXCat_First(int idCategoria,
		OrderByComparator orderByComparator) throws SystemException {
		List<subcategoria> list = findBysubCatXCat(idCategoria, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subcategoria in the ordered set where idCategoria = &#63;.
	 *
	 * @param idCategoria the id categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subcategoria
	 * @throws com.ability.genero.server.NoSuchsubcategoriaException if a matching subcategoria could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public subcategoria findBysubCatXCat_Last(int idCategoria,
		OrderByComparator orderByComparator)
		throws NoSuchsubcategoriaException, SystemException {
		subcategoria subcategoria = fetchBysubCatXCat_Last(idCategoria,
				orderByComparator);

		if (subcategoria != null) {
			return subcategoria;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("idCategoria=");
		msg.append(idCategoria);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsubcategoriaException(msg.toString());
	}

	/**
	 * Returns the last subcategoria in the ordered set where idCategoria = &#63;.
	 *
	 * @param idCategoria the id categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subcategoria, or <code>null</code> if a matching subcategoria could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public subcategoria fetchBysubCatXCat_Last(int idCategoria,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBysubCatXCat(idCategoria);

		List<subcategoria> list = findBysubCatXCat(idCategoria, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the subcategorias before and after the current subcategoria in the ordered set where idCategoria = &#63;.
	 *
	 * @param id the primary key of the current subcategoria
	 * @param idCategoria the id categoria
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next subcategoria
	 * @throws com.ability.genero.server.NoSuchsubcategoriaException if a subcategoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public subcategoria[] findBysubCatXCat_PrevAndNext(int id, int idCategoria,
		OrderByComparator orderByComparator)
		throws NoSuchsubcategoriaException, SystemException {
		subcategoria subcategoria = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			subcategoria[] array = new subcategoriaImpl[3];

			array[0] = getBysubCatXCat_PrevAndNext(session, subcategoria,
					idCategoria, orderByComparator, true);

			array[1] = subcategoria;

			array[2] = getBysubCatXCat_PrevAndNext(session, subcategoria,
					idCategoria, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected subcategoria getBysubCatXCat_PrevAndNext(Session session,
		subcategoria subcategoria, int idCategoria,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SUBCATEGORIA_WHERE);

		query.append(_FINDER_COLUMN_SUBCATXCAT_IDCATEGORIA_2);

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

		else {
			query.append(subcategoriaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(idCategoria);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(subcategoria);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<subcategoria> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the subcategorias.
	 *
	 * @return the subcategorias
	 * @throws SystemException if a system exception occurred
	 */
	public List<subcategoria> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subcategorias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of subcategorias
	 * @param end the upper bound of the range of subcategorias (not inclusive)
	 * @return the range of subcategorias
	 * @throws SystemException if a system exception occurred
	 */
	public List<subcategoria> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the subcategorias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of subcategorias
	 * @param end the upper bound of the range of subcategorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of subcategorias
	 * @throws SystemException if a system exception occurred
	 */
	public List<subcategoria> findAll(int start, int end,
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

		List<subcategoria> list = (List<subcategoria>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SUBCATEGORIA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUBCATEGORIA.concat(subcategoriaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<subcategoria>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<subcategoria>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the subcategorias where idCategoria = &#63; from the database.
	 *
	 * @param idCategoria the id categoria
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBysubCatXCat(int idCategoria) throws SystemException {
		for (subcategoria subcategoria : findBysubCatXCat(idCategoria)) {
			remove(subcategoria);
		}
	}

	/**
	 * Removes all the subcategorias from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (subcategoria subcategoria : findAll()) {
			remove(subcategoria);
		}
	}

	/**
	 * Returns the number of subcategorias where idCategoria = &#63;.
	 *
	 * @param idCategoria the id categoria
	 * @return the number of matching subcategorias
	 * @throws SystemException if a system exception occurred
	 */
	public int countBysubCatXCat(int idCategoria) throws SystemException {
		Object[] finderArgs = new Object[] { idCategoria };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SUBCATXCAT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SUBCATEGORIA_WHERE);

			query.append(_FINDER_COLUMN_SUBCATXCAT_IDCATEGORIA_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idCategoria);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SUBCATXCAT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of subcategorias.
	 *
	 * @return the number of subcategorias
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SUBCATEGORIA);

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
	 * Initializes the subcategoria persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.subcategoria")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<subcategoria>> listenersList = new ArrayList<ModelListener<subcategoria>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<subcategoria>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(subcategoriaImpl.class.getName());
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
	private static final String _SQL_SELECT_SUBCATEGORIA = "SELECT subcategoria FROM subcategoria subcategoria";
	private static final String _SQL_SELECT_SUBCATEGORIA_WHERE = "SELECT subcategoria FROM subcategoria subcategoria WHERE ";
	private static final String _SQL_COUNT_SUBCATEGORIA = "SELECT COUNT(subcategoria) FROM subcategoria subcategoria";
	private static final String _SQL_COUNT_SUBCATEGORIA_WHERE = "SELECT COUNT(subcategoria) FROM subcategoria subcategoria WHERE ";
	private static final String _FINDER_COLUMN_SUBCATXCAT_IDCATEGORIA_2 = "subcategoria.idCategoria = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "subcategoria.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No subcategoria exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No subcategoria exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(subcategoriaPersistenceImpl.class);
	private static subcategoria _nullsubcategoria = new subcategoriaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<subcategoria> toCacheModel() {
				return _nullsubcategoriaCacheModel;
			}
		};

	private static CacheModel<subcategoria> _nullsubcategoriaCacheModel = new CacheModel<subcategoria>() {
			public subcategoria toEntityModel() {
				return _nullsubcategoria;
			}
		};
}