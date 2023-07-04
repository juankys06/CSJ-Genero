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

import com.ability.genero.server.NoSuchUsuarioException;
import com.ability.genero.server.model.generoUsuario;
import com.ability.genero.server.model.impl.generoUsuarioImpl;
import com.ability.genero.server.model.impl.generoUsuarioModelImpl;

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
 * The persistence implementation for the genero usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see generoUsuarioPersistence
 * @see generoUsuarioUtil
 * @generated
 */
public class generoUsuarioPersistenceImpl extends BasePersistenceImpl<generoUsuario>
	implements generoUsuarioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link generoUsuarioUtil} to access the genero usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = generoUsuarioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_FETCH_BY_PORUSUARIO = new FinderPath(generoUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioModelImpl.FINDER_CACHE_ENABLED,
			generoUsuarioImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByporUsuario", new String[] { String.class.getName() },
			generoUsuarioModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORUSUARIO = new FinderPath(generoUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByporUsuario",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(generoUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioModelImpl.FINDER_CACHE_ENABLED,
			generoUsuarioImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(generoUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioModelImpl.FINDER_CACHE_ENABLED,
			generoUsuarioImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(generoUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the genero usuario in the entity cache if it is enabled.
	 *
	 * @param generoUsuario the genero usuario
	 */
	public void cacheResult(generoUsuario generoUsuario) {
		EntityCacheUtil.putResult(generoUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioImpl.class, generoUsuario.getPrimaryKey(),
			generoUsuario);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORUSUARIO,
			new Object[] { generoUsuario.getUserId() }, generoUsuario);

		generoUsuario.resetOriginalValues();
	}

	/**
	 * Caches the genero usuarios in the entity cache if it is enabled.
	 *
	 * @param generoUsuarios the genero usuarios
	 */
	public void cacheResult(List<generoUsuario> generoUsuarios) {
		for (generoUsuario generoUsuario : generoUsuarios) {
			if (EntityCacheUtil.getResult(
						generoUsuarioModelImpl.ENTITY_CACHE_ENABLED,
						generoUsuarioImpl.class, generoUsuario.getPrimaryKey()) == null) {
				cacheResult(generoUsuario);
			}
			else {
				generoUsuario.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all genero usuarios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(generoUsuarioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(generoUsuarioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the genero usuario.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(generoUsuario generoUsuario) {
		EntityCacheUtil.removeResult(generoUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioImpl.class, generoUsuario.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(generoUsuario);
	}

	@Override
	public void clearCache(List<generoUsuario> generoUsuarios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (generoUsuario generoUsuario : generoUsuarios) {
			EntityCacheUtil.removeResult(generoUsuarioModelImpl.ENTITY_CACHE_ENABLED,
				generoUsuarioImpl.class, generoUsuario.getPrimaryKey());

			clearUniqueFindersCache(generoUsuario);
		}
	}

	protected void clearUniqueFindersCache(generoUsuario generoUsuario) {
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORUSUARIO,
			new Object[] { generoUsuario.getUserId() });
	}

	/**
	 * Creates a new genero usuario with the primary key. Does not add the genero usuario to the database.
	 *
	 * @param id the primary key for the new genero usuario
	 * @return the new genero usuario
	 */
	public generoUsuario create(int id) {
		generoUsuario generoUsuario = new generoUsuarioImpl();

		generoUsuario.setNew(true);
		generoUsuario.setPrimaryKey(id);

		return generoUsuario;
	}

	/**
	 * Removes the genero usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the genero usuario
	 * @return the genero usuario that was removed
	 * @throws com.ability.genero.server.NoSuchUsuarioException if a genero usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuario remove(int id)
		throws NoSuchUsuarioException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the genero usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the genero usuario
	 * @return the genero usuario that was removed
	 * @throws com.ability.genero.server.NoSuchUsuarioException if a genero usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public generoUsuario remove(Serializable primaryKey)
		throws NoSuchUsuarioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			generoUsuario generoUsuario = (generoUsuario)session.get(generoUsuarioImpl.class,
					primaryKey);

			if (generoUsuario == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(generoUsuario);
		}
		catch (NoSuchUsuarioException nsee) {
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
	protected generoUsuario removeImpl(generoUsuario generoUsuario)
		throws SystemException {
		generoUsuario = toUnwrappedModel(generoUsuario);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, generoUsuario);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(generoUsuario);

		return generoUsuario;
	}

	@Override
	public generoUsuario updateImpl(
		com.ability.genero.server.model.generoUsuario generoUsuario,
		boolean merge) throws SystemException {
		generoUsuario = toUnwrappedModel(generoUsuario);

		boolean isNew = generoUsuario.isNew();

		generoUsuarioModelImpl generoUsuarioModelImpl = (generoUsuarioModelImpl)generoUsuario;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, generoUsuario, merge);

			generoUsuario.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !generoUsuarioModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(generoUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			generoUsuarioImpl.class, generoUsuario.getPrimaryKey(),
			generoUsuario);

		if (isNew) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORUSUARIO,
				new Object[] { generoUsuario.getUserId() }, generoUsuario);
		}
		else {
			if ((generoUsuarioModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PORUSUARIO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						generoUsuarioModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORUSUARIO,
					args);

				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORUSUARIO,
					args);

				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORUSUARIO,
					new Object[] { generoUsuario.getUserId() }, generoUsuario);
			}
		}

		return generoUsuario;
	}

	protected generoUsuario toUnwrappedModel(generoUsuario generoUsuario) {
		if (generoUsuario instanceof generoUsuarioImpl) {
			return generoUsuario;
		}

		generoUsuarioImpl generoUsuarioImpl = new generoUsuarioImpl();

		generoUsuarioImpl.setNew(generoUsuario.isNew());
		generoUsuarioImpl.setPrimaryKey(generoUsuario.getPrimaryKey());

		generoUsuarioImpl.setId(generoUsuario.getId());
		generoUsuarioImpl.setDespacho(generoUsuario.getDespacho());
		generoUsuarioImpl.setUserId(generoUsuario.getUserId());
		generoUsuarioImpl.setFecha_creacion(generoUsuario.getFecha_creacion());

		return generoUsuarioImpl;
	}

	/**
	 * Returns the genero usuario with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the genero usuario
	 * @return the genero usuario
	 * @throws com.liferay.portal.NoSuchModelException if a genero usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public generoUsuario findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the genero usuario with the primary key or throws a {@link com.ability.genero.server.NoSuchUsuarioException} if it could not be found.
	 *
	 * @param id the primary key of the genero usuario
	 * @return the genero usuario
	 * @throws com.ability.genero.server.NoSuchUsuarioException if a genero usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuario findByPrimaryKey(int id)
		throws NoSuchUsuarioException, SystemException {
		generoUsuario generoUsuario = fetchByPrimaryKey(id);

		if (generoUsuario == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return generoUsuario;
	}

	/**
	 * Returns the genero usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the genero usuario
	 * @return the genero usuario, or <code>null</code> if a genero usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public generoUsuario fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the genero usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the genero usuario
	 * @return the genero usuario, or <code>null</code> if a genero usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuario fetchByPrimaryKey(int id) throws SystemException {
		generoUsuario generoUsuario = (generoUsuario)EntityCacheUtil.getResult(generoUsuarioModelImpl.ENTITY_CACHE_ENABLED,
				generoUsuarioImpl.class, id);

		if (generoUsuario == _nullgeneroUsuario) {
			return null;
		}

		if (generoUsuario == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				generoUsuario = (generoUsuario)session.get(generoUsuarioImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (generoUsuario != null) {
					cacheResult(generoUsuario);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(generoUsuarioModelImpl.ENTITY_CACHE_ENABLED,
						generoUsuarioImpl.class, id, _nullgeneroUsuario);
				}

				closeSession(session);
			}
		}

		return generoUsuario;
	}

	/**
	 * Returns the genero usuario where userId = &#63; or throws a {@link com.ability.genero.server.NoSuchUsuarioException} if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching genero usuario
	 * @throws com.ability.genero.server.NoSuchUsuarioException if a matching genero usuario could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuario findByporUsuario(String userId)
		throws NoSuchUsuarioException, SystemException {
		generoUsuario generoUsuario = fetchByporUsuario(userId);

		if (generoUsuario == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchUsuarioException(msg.toString());
		}

		return generoUsuario;
	}

	/**
	 * Returns the genero usuario where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching genero usuario, or <code>null</code> if a matching genero usuario could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuario fetchByporUsuario(String userId)
		throws SystemException {
		return fetchByporUsuario(userId, true);
	}

	/**
	 * Returns the genero usuario where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching genero usuario, or <code>null</code> if a matching genero usuario could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuario fetchByporUsuario(String userId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PORUSUARIO,
					finderArgs, this);
		}

		if (result instanceof generoUsuario) {
			generoUsuario generoUsuario = (generoUsuario)result;

			if (!Validator.equals(userId, generoUsuario.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_SELECT_GENEROUSUARIO_WHERE);

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

				List<generoUsuario> list = q.list();

				result = list;

				generoUsuario generoUsuario = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORUSUARIO,
						finderArgs, list);
				}
				else {
					generoUsuario = list.get(0);

					cacheResult(generoUsuario);

					if ((generoUsuario.getUserId() == null) ||
							!generoUsuario.getUserId().equals(userId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORUSUARIO,
							finderArgs, generoUsuario);
					}
				}

				return generoUsuario;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORUSUARIO,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (generoUsuario)result;
			}
		}
	}

	/**
	 * Returns all the genero usuarios.
	 *
	 * @return the genero usuarios
	 * @throws SystemException if a system exception occurred
	 */
	public List<generoUsuario> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the genero usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of genero usuarios
	 * @param end the upper bound of the range of genero usuarios (not inclusive)
	 * @return the range of genero usuarios
	 * @throws SystemException if a system exception occurred
	 */
	public List<generoUsuario> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the genero usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of genero usuarios
	 * @param end the upper bound of the range of genero usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of genero usuarios
	 * @throws SystemException if a system exception occurred
	 */
	public List<generoUsuario> findAll(int start, int end,
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

		List<generoUsuario> list = (List<generoUsuario>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_GENEROUSUARIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GENEROUSUARIO;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<generoUsuario>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<generoUsuario>)QueryUtil.list(q, getDialect(),
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
	 * Removes the genero usuario where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the genero usuario that was removed
	 * @throws SystemException if a system exception occurred
	 */
	public generoUsuario removeByporUsuario(String userId)
		throws NoSuchUsuarioException, SystemException {
		generoUsuario generoUsuario = findByporUsuario(userId);

		return remove(generoUsuario);
	}

	/**
	 * Removes all the genero usuarios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (generoUsuario generoUsuario : findAll()) {
			remove(generoUsuario);
		}
	}

	/**
	 * Returns the number of genero usuarios where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching genero usuarios
	 * @throws SystemException if a system exception occurred
	 */
	public int countByporUsuario(String userId) throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORUSUARIO,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_GENEROUSUARIO_WHERE);

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
	 * Returns the number of genero usuarios.
	 *
	 * @return the number of genero usuarios
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_GENEROUSUARIO);

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
	 * Initializes the genero usuario persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.generoUsuario")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<generoUsuario>> listenersList = new ArrayList<ModelListener<generoUsuario>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<generoUsuario>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(generoUsuarioImpl.class.getName());
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
	private static final String _SQL_SELECT_GENEROUSUARIO = "SELECT generoUsuario FROM generoUsuario generoUsuario";
	private static final String _SQL_SELECT_GENEROUSUARIO_WHERE = "SELECT generoUsuario FROM generoUsuario generoUsuario WHERE ";
	private static final String _SQL_COUNT_GENEROUSUARIO = "SELECT COUNT(generoUsuario) FROM generoUsuario generoUsuario";
	private static final String _SQL_COUNT_GENEROUSUARIO_WHERE = "SELECT COUNT(generoUsuario) FROM generoUsuario generoUsuario WHERE ";
	private static final String _FINDER_COLUMN_PORUSUARIO_USERID_1 = "generoUsuario.userId IS NULL";
	private static final String _FINDER_COLUMN_PORUSUARIO_USERID_2 = "generoUsuario.userId = ?";
	private static final String _FINDER_COLUMN_PORUSUARIO_USERID_3 = "(generoUsuario.userId IS NULL OR generoUsuario.userId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "generoUsuario.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No generoUsuario exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No generoUsuario exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(generoUsuarioPersistenceImpl.class);
	private static generoUsuario _nullgeneroUsuario = new generoUsuarioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<generoUsuario> toCacheModel() {
				return _nullgeneroUsuarioCacheModel;
			}
		};

	private static CacheModel<generoUsuario> _nullgeneroUsuarioCacheModel = new CacheModel<generoUsuario>() {
			public generoUsuario toEntityModel() {
				return _nullgeneroUsuario;
			}
		};
}