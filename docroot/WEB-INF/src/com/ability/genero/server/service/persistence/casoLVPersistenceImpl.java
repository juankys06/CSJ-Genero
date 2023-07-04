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

import com.ability.genero.server.NoSuchcasoLVException;
import com.ability.genero.server.model.casoLV;
import com.ability.genero.server.model.impl.casoLVImpl;
import com.ability.genero.server.model.impl.casoLVModelImpl;

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
 * The persistence implementation for the caso l v service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see casoLVPersistence
 * @see casoLVUtil
 * @generated
 */
public class casoLVPersistenceImpl extends BasePersistenceImpl<casoLV>
	implements casoLVPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link casoLVUtil} to access the caso l v persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = casoLVImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORDESPACHO =
		new FinderPath(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVModelImpl.FINDER_CACHE_ENABLED, casoLVImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByporDespacho",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORDESPACHO =
		new FinderPath(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVModelImpl.FINDER_CACHE_ENABLED, casoLVImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByporDespacho",
			new String[] { String.class.getName() },
			casoLVModelImpl.DESPACHO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORDESPACHO = new FinderPath(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByporDespacho",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORANHIO = new FinderPath(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVModelImpl.FINDER_CACHE_ENABLED, casoLVImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByporAnhio",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORANHIO =
		new FinderPath(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVModelImpl.FINDER_CACHE_ENABLED, casoLVImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByporAnhio",
			new String[] { String.class.getName(), String.class.getName() },
			casoLVModelImpl.DESPACHO_COLUMN_BITMASK |
			casoLVModelImpl.ANHIO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORANHIO = new FinderPath(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByporAnhio",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORANHIOADMIN =
		new FinderPath(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVModelImpl.FINDER_CACHE_ENABLED, casoLVImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByporAnhioAdmin",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORANHIOADMIN =
		new FinderPath(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVModelImpl.FINDER_CACHE_ENABLED, casoLVImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByporAnhioAdmin",
			new String[] { String.class.getName() },
			casoLVModelImpl.ANHIO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORANHIOADMIN = new FinderPath(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByporAnhioAdmin",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVModelImpl.FINDER_CACHE_ENABLED, casoLVImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVModelImpl.FINDER_CACHE_ENABLED, casoLVImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the caso l v in the entity cache if it is enabled.
	 *
	 * @param casoLV the caso l v
	 */
	public void cacheResult(casoLV casoLV) {
		EntityCacheUtil.putResult(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVImpl.class, casoLV.getPrimaryKey(), casoLV);

		casoLV.resetOriginalValues();
	}

	/**
	 * Caches the caso l vs in the entity cache if it is enabled.
	 *
	 * @param casoLVs the caso l vs
	 */
	public void cacheResult(List<casoLV> casoLVs) {
		for (casoLV casoLV : casoLVs) {
			if (EntityCacheUtil.getResult(
						casoLVModelImpl.ENTITY_CACHE_ENABLED, casoLVImpl.class,
						casoLV.getPrimaryKey()) == null) {
				cacheResult(casoLV);
			}
			else {
				casoLV.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all caso l vs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(casoLVImpl.class.getName());
		}

		EntityCacheUtil.clearCache(casoLVImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the caso l v.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(casoLV casoLV) {
		EntityCacheUtil.removeResult(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVImpl.class, casoLV.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<casoLV> casoLVs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (casoLV casoLV : casoLVs) {
			EntityCacheUtil.removeResult(casoLVModelImpl.ENTITY_CACHE_ENABLED,
				casoLVImpl.class, casoLV.getPrimaryKey());
		}
	}

	/**
	 * Creates a new caso l v with the primary key. Does not add the caso l v to the database.
	 *
	 * @param id the primary key for the new caso l v
	 * @return the new caso l v
	 */
	public casoLV create(int id) {
		casoLV casoLV = new casoLVImpl();

		casoLV.setNew(true);
		casoLV.setPrimaryKey(id);

		return casoLV;
	}

	/**
	 * Removes the caso l v with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the caso l v
	 * @return the caso l v that was removed
	 * @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV remove(int id) throws NoSuchcasoLVException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the caso l v with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the caso l v
	 * @return the caso l v that was removed
	 * @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public casoLV remove(Serializable primaryKey)
		throws NoSuchcasoLVException, SystemException {
		Session session = null;

		try {
			session = openSession();

			casoLV casoLV = (casoLV)session.get(casoLVImpl.class, primaryKey);

			if (casoLV == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcasoLVException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(casoLV);
		}
		catch (NoSuchcasoLVException nsee) {
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
	protected casoLV removeImpl(casoLV casoLV) throws SystemException {
		casoLV = toUnwrappedModel(casoLV);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, casoLV);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(casoLV);

		return casoLV;
	}

	@Override
	public casoLV updateImpl(com.ability.genero.server.model.casoLV casoLV,
		boolean merge) throws SystemException {
		casoLV = toUnwrappedModel(casoLV);

		boolean isNew = casoLV.isNew();

		casoLVModelImpl casoLVModelImpl = (casoLVModelImpl)casoLV;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, casoLV, merge);

			casoLV.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !casoLVModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((casoLVModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORDESPACHO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						casoLVModelImpl.getOriginalDespacho()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORDESPACHO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORDESPACHO,
					args);

				args = new Object[] { casoLVModelImpl.getDespacho() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORDESPACHO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORDESPACHO,
					args);
			}

			if ((casoLVModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORANHIO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						casoLVModelImpl.getOriginalDespacho(),
						
						casoLVModelImpl.getOriginalAnhio()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORANHIO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORANHIO,
					args);

				args = new Object[] {
						casoLVModelImpl.getDespacho(),
						
						casoLVModelImpl.getAnhio()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORANHIO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORANHIO,
					args);
			}

			if ((casoLVModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORANHIOADMIN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { casoLVModelImpl.getOriginalAnhio() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORANHIOADMIN,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORANHIOADMIN,
					args);

				args = new Object[] { casoLVModelImpl.getAnhio() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORANHIOADMIN,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORANHIOADMIN,
					args);
			}
		}

		EntityCacheUtil.putResult(casoLVModelImpl.ENTITY_CACHE_ENABLED,
			casoLVImpl.class, casoLV.getPrimaryKey(), casoLV);

		return casoLV;
	}

	protected casoLV toUnwrappedModel(casoLV casoLV) {
		if (casoLV instanceof casoLVImpl) {
			return casoLV;
		}

		casoLVImpl casoLVImpl = new casoLVImpl();

		casoLVImpl.setNew(casoLV.isNew());
		casoLVImpl.setPrimaryKey(casoLV.getPrimaryKey());

		casoLVImpl.setId(casoLV.getId());
		casoLVImpl.setDespacho(casoLV.getDespacho());
		casoLVImpl.setRadicacion(casoLV.getRadicacion());
		casoLVImpl.setDemandante(casoLV.getDemandante());
		casoLVImpl.setDemandado(casoLV.getDemandado());
		casoLVImpl.setClaseProceso(casoLV.getClaseProceso());
		casoLVImpl.setTipoDecision(casoLV.getTipoDecision());
		casoLVImpl.setPonente(casoLV.getPonente());
		casoLVImpl.setFecha(casoLV.getFecha());
		casoLVImpl.setCategoria(casoLV.getCategoria());
		casoLVImpl.setSubCategoria(casoLV.getSubCategoria());
		casoLVImpl.setRespuestas1(casoLV.getRespuestas1());
		casoLVImpl.setRespuestas2(casoLV.getRespuestas2());
		casoLVImpl.setAnhio(casoLV.getAnhio());
		casoLVImpl.setGeneroDemandante(casoLV.getGeneroDemandante());
		casoLVImpl.setGeneroDemandado(casoLV.getGeneroDemandado());
		casoLVImpl.setArchivo(casoLV.getArchivo());

		return casoLVImpl;
	}

	/**
	 * Returns the caso l v with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the caso l v
	 * @return the caso l v
	 * @throws com.liferay.portal.NoSuchModelException if a caso l v with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public casoLV findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the caso l v with the primary key or throws a {@link com.ability.genero.server.NoSuchcasoLVException} if it could not be found.
	 *
	 * @param id the primary key of the caso l v
	 * @return the caso l v
	 * @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV findByPrimaryKey(int id)
		throws NoSuchcasoLVException, SystemException {
		casoLV casoLV = fetchByPrimaryKey(id);

		if (casoLV == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchcasoLVException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return casoLV;
	}

	/**
	 * Returns the caso l v with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the caso l v
	 * @return the caso l v, or <code>null</code> if a caso l v with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public casoLV fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the caso l v with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the caso l v
	 * @return the caso l v, or <code>null</code> if a caso l v with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV fetchByPrimaryKey(int id) throws SystemException {
		casoLV casoLV = (casoLV)EntityCacheUtil.getResult(casoLVModelImpl.ENTITY_CACHE_ENABLED,
				casoLVImpl.class, id);

		if (casoLV == _nullcasoLV) {
			return null;
		}

		if (casoLV == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				casoLV = (casoLV)session.get(casoLVImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (casoLV != null) {
					cacheResult(casoLV);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(casoLVModelImpl.ENTITY_CACHE_ENABLED,
						casoLVImpl.class, id, _nullcasoLV);
				}

				closeSession(session);
			}
		}

		return casoLV;
	}

	/**
	 * Returns all the caso l vs where despacho = &#63;.
	 *
	 * @param despacho the despacho
	 * @return the matching caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public List<casoLV> findByporDespacho(String despacho)
		throws SystemException {
		return findByporDespacho(despacho, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the caso l vs where despacho = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param despacho the despacho
	 * @param start the lower bound of the range of caso l vs
	 * @param end the upper bound of the range of caso l vs (not inclusive)
	 * @return the range of matching caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public List<casoLV> findByporDespacho(String despacho, int start, int end)
		throws SystemException {
		return findByporDespacho(despacho, start, end, null);
	}

	/**
	 * Returns an ordered range of all the caso l vs where despacho = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param despacho the despacho
	 * @param start the lower bound of the range of caso l vs
	 * @param end the upper bound of the range of caso l vs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public List<casoLV> findByporDespacho(String despacho, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORDESPACHO;
			finderArgs = new Object[] { despacho };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORDESPACHO;
			finderArgs = new Object[] { despacho, start, end, orderByComparator };
		}

		List<casoLV> list = (List<casoLV>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (casoLV casoLV : list) {
				if (!Validator.equals(despacho, casoLV.getDespacho())) {
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

			query.append(_SQL_SELECT_CASOLV_WHERE);

			if (despacho == null) {
				query.append(_FINDER_COLUMN_PORDESPACHO_DESPACHO_1);
			}
			else {
				if (despacho.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORDESPACHO_DESPACHO_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORDESPACHO_DESPACHO_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(casoLVModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (despacho != null) {
					qPos.add(despacho);
				}

				list = (List<casoLV>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first caso l v in the ordered set where despacho = &#63;.
	 *
	 * @param despacho the despacho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching caso l v
	 * @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV findByporDespacho_First(String despacho,
		OrderByComparator orderByComparator)
		throws NoSuchcasoLVException, SystemException {
		casoLV casoLV = fetchByporDespacho_First(despacho, orderByComparator);

		if (casoLV != null) {
			return casoLV;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("despacho=");
		msg.append(despacho);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcasoLVException(msg.toString());
	}

	/**
	 * Returns the first caso l v in the ordered set where despacho = &#63;.
	 *
	 * @param despacho the despacho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching caso l v, or <code>null</code> if a matching caso l v could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV fetchByporDespacho_First(String despacho,
		OrderByComparator orderByComparator) throws SystemException {
		List<casoLV> list = findByporDespacho(despacho, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last caso l v in the ordered set where despacho = &#63;.
	 *
	 * @param despacho the despacho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching caso l v
	 * @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV findByporDespacho_Last(String despacho,
		OrderByComparator orderByComparator)
		throws NoSuchcasoLVException, SystemException {
		casoLV casoLV = fetchByporDespacho_Last(despacho, orderByComparator);

		if (casoLV != null) {
			return casoLV;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("despacho=");
		msg.append(despacho);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcasoLVException(msg.toString());
	}

	/**
	 * Returns the last caso l v in the ordered set where despacho = &#63;.
	 *
	 * @param despacho the despacho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching caso l v, or <code>null</code> if a matching caso l v could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV fetchByporDespacho_Last(String despacho,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByporDespacho(despacho);

		List<casoLV> list = findByporDespacho(despacho, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the caso l vs before and after the current caso l v in the ordered set where despacho = &#63;.
	 *
	 * @param id the primary key of the current caso l v
	 * @param despacho the despacho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next caso l v
	 * @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV[] findByporDespacho_PrevAndNext(int id, String despacho,
		OrderByComparator orderByComparator)
		throws NoSuchcasoLVException, SystemException {
		casoLV casoLV = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			casoLV[] array = new casoLVImpl[3];

			array[0] = getByporDespacho_PrevAndNext(session, casoLV, despacho,
					orderByComparator, true);

			array[1] = casoLV;

			array[2] = getByporDespacho_PrevAndNext(session, casoLV, despacho,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected casoLV getByporDespacho_PrevAndNext(Session session,
		casoLV casoLV, String despacho, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CASOLV_WHERE);

		if (despacho == null) {
			query.append(_FINDER_COLUMN_PORDESPACHO_DESPACHO_1);
		}
		else {
			if (despacho.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORDESPACHO_DESPACHO_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORDESPACHO_DESPACHO_2);
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

		else {
			query.append(casoLVModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (despacho != null) {
			qPos.add(despacho);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(casoLV);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<casoLV> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the caso l vs where despacho = &#63; and anhio = &#63;.
	 *
	 * @param despacho the despacho
	 * @param anhio the anhio
	 * @return the matching caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public List<casoLV> findByporAnhio(String despacho, String anhio)
		throws SystemException {
		return findByporAnhio(despacho, anhio, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the caso l vs where despacho = &#63; and anhio = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param despacho the despacho
	 * @param anhio the anhio
	 * @param start the lower bound of the range of caso l vs
	 * @param end the upper bound of the range of caso l vs (not inclusive)
	 * @return the range of matching caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public List<casoLV> findByporAnhio(String despacho, String anhio,
		int start, int end) throws SystemException {
		return findByporAnhio(despacho, anhio, start, end, null);
	}

	/**
	 * Returns an ordered range of all the caso l vs where despacho = &#63; and anhio = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param despacho the despacho
	 * @param anhio the anhio
	 * @param start the lower bound of the range of caso l vs
	 * @param end the upper bound of the range of caso l vs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public List<casoLV> findByporAnhio(String despacho, String anhio,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORANHIO;
			finderArgs = new Object[] { despacho, anhio };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORANHIO;
			finderArgs = new Object[] {
					despacho, anhio,
					
					start, end, orderByComparator
				};
		}

		List<casoLV> list = (List<casoLV>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (casoLV casoLV : list) {
				if (!Validator.equals(despacho, casoLV.getDespacho()) ||
						!Validator.equals(anhio, casoLV.getAnhio())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CASOLV_WHERE);

			if (despacho == null) {
				query.append(_FINDER_COLUMN_PORANHIO_DESPACHO_1);
			}
			else {
				if (despacho.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORANHIO_DESPACHO_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORANHIO_DESPACHO_2);
				}
			}

			if (anhio == null) {
				query.append(_FINDER_COLUMN_PORANHIO_ANHIO_1);
			}
			else {
				if (anhio.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORANHIO_ANHIO_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORANHIO_ANHIO_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(casoLVModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (despacho != null) {
					qPos.add(despacho);
				}

				if (anhio != null) {
					qPos.add(anhio);
				}

				list = (List<casoLV>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first caso l v in the ordered set where despacho = &#63; and anhio = &#63;.
	 *
	 * @param despacho the despacho
	 * @param anhio the anhio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching caso l v
	 * @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV findByporAnhio_First(String despacho, String anhio,
		OrderByComparator orderByComparator)
		throws NoSuchcasoLVException, SystemException {
		casoLV casoLV = fetchByporAnhio_First(despacho, anhio, orderByComparator);

		if (casoLV != null) {
			return casoLV;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("despacho=");
		msg.append(despacho);

		msg.append(", anhio=");
		msg.append(anhio);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcasoLVException(msg.toString());
	}

	/**
	 * Returns the first caso l v in the ordered set where despacho = &#63; and anhio = &#63;.
	 *
	 * @param despacho the despacho
	 * @param anhio the anhio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching caso l v, or <code>null</code> if a matching caso l v could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV fetchByporAnhio_First(String despacho, String anhio,
		OrderByComparator orderByComparator) throws SystemException {
		List<casoLV> list = findByporAnhio(despacho, anhio, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last caso l v in the ordered set where despacho = &#63; and anhio = &#63;.
	 *
	 * @param despacho the despacho
	 * @param anhio the anhio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching caso l v
	 * @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV findByporAnhio_Last(String despacho, String anhio,
		OrderByComparator orderByComparator)
		throws NoSuchcasoLVException, SystemException {
		casoLV casoLV = fetchByporAnhio_Last(despacho, anhio, orderByComparator);

		if (casoLV != null) {
			return casoLV;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("despacho=");
		msg.append(despacho);

		msg.append(", anhio=");
		msg.append(anhio);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcasoLVException(msg.toString());
	}

	/**
	 * Returns the last caso l v in the ordered set where despacho = &#63; and anhio = &#63;.
	 *
	 * @param despacho the despacho
	 * @param anhio the anhio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching caso l v, or <code>null</code> if a matching caso l v could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV fetchByporAnhio_Last(String despacho, String anhio,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByporAnhio(despacho, anhio);

		List<casoLV> list = findByporAnhio(despacho, anhio, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the caso l vs before and after the current caso l v in the ordered set where despacho = &#63; and anhio = &#63;.
	 *
	 * @param id the primary key of the current caso l v
	 * @param despacho the despacho
	 * @param anhio the anhio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next caso l v
	 * @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV[] findByporAnhio_PrevAndNext(int id, String despacho,
		String anhio, OrderByComparator orderByComparator)
		throws NoSuchcasoLVException, SystemException {
		casoLV casoLV = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			casoLV[] array = new casoLVImpl[3];

			array[0] = getByporAnhio_PrevAndNext(session, casoLV, despacho,
					anhio, orderByComparator, true);

			array[1] = casoLV;

			array[2] = getByporAnhio_PrevAndNext(session, casoLV, despacho,
					anhio, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected casoLV getByporAnhio_PrevAndNext(Session session, casoLV casoLV,
		String despacho, String anhio, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CASOLV_WHERE);

		if (despacho == null) {
			query.append(_FINDER_COLUMN_PORANHIO_DESPACHO_1);
		}
		else {
			if (despacho.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORANHIO_DESPACHO_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORANHIO_DESPACHO_2);
			}
		}

		if (anhio == null) {
			query.append(_FINDER_COLUMN_PORANHIO_ANHIO_1);
		}
		else {
			if (anhio.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORANHIO_ANHIO_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORANHIO_ANHIO_2);
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

		else {
			query.append(casoLVModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (despacho != null) {
			qPos.add(despacho);
		}

		if (anhio != null) {
			qPos.add(anhio);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(casoLV);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<casoLV> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the caso l vs where anhio = &#63;.
	 *
	 * @param anhio the anhio
	 * @return the matching caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public List<casoLV> findByporAnhioAdmin(String anhio)
		throws SystemException {
		return findByporAnhioAdmin(anhio, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the caso l vs where anhio = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param anhio the anhio
	 * @param start the lower bound of the range of caso l vs
	 * @param end the upper bound of the range of caso l vs (not inclusive)
	 * @return the range of matching caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public List<casoLV> findByporAnhioAdmin(String anhio, int start, int end)
		throws SystemException {
		return findByporAnhioAdmin(anhio, start, end, null);
	}

	/**
	 * Returns an ordered range of all the caso l vs where anhio = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param anhio the anhio
	 * @param start the lower bound of the range of caso l vs
	 * @param end the upper bound of the range of caso l vs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public List<casoLV> findByporAnhioAdmin(String anhio, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORANHIOADMIN;
			finderArgs = new Object[] { anhio };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORANHIOADMIN;
			finderArgs = new Object[] { anhio, start, end, orderByComparator };
		}

		List<casoLV> list = (List<casoLV>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (casoLV casoLV : list) {
				if (!Validator.equals(anhio, casoLV.getAnhio())) {
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

			query.append(_SQL_SELECT_CASOLV_WHERE);

			if (anhio == null) {
				query.append(_FINDER_COLUMN_PORANHIOADMIN_ANHIO_1);
			}
			else {
				if (anhio.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORANHIOADMIN_ANHIO_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORANHIOADMIN_ANHIO_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(casoLVModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (anhio != null) {
					qPos.add(anhio);
				}

				list = (List<casoLV>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first caso l v in the ordered set where anhio = &#63;.
	 *
	 * @param anhio the anhio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching caso l v
	 * @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV findByporAnhioAdmin_First(String anhio,
		OrderByComparator orderByComparator)
		throws NoSuchcasoLVException, SystemException {
		casoLV casoLV = fetchByporAnhioAdmin_First(anhio, orderByComparator);

		if (casoLV != null) {
			return casoLV;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("anhio=");
		msg.append(anhio);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcasoLVException(msg.toString());
	}

	/**
	 * Returns the first caso l v in the ordered set where anhio = &#63;.
	 *
	 * @param anhio the anhio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching caso l v, or <code>null</code> if a matching caso l v could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV fetchByporAnhioAdmin_First(String anhio,
		OrderByComparator orderByComparator) throws SystemException {
		List<casoLV> list = findByporAnhioAdmin(anhio, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last caso l v in the ordered set where anhio = &#63;.
	 *
	 * @param anhio the anhio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching caso l v
	 * @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV findByporAnhioAdmin_Last(String anhio,
		OrderByComparator orderByComparator)
		throws NoSuchcasoLVException, SystemException {
		casoLV casoLV = fetchByporAnhioAdmin_Last(anhio, orderByComparator);

		if (casoLV != null) {
			return casoLV;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("anhio=");
		msg.append(anhio);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcasoLVException(msg.toString());
	}

	/**
	 * Returns the last caso l v in the ordered set where anhio = &#63;.
	 *
	 * @param anhio the anhio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching caso l v, or <code>null</code> if a matching caso l v could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV fetchByporAnhioAdmin_Last(String anhio,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByporAnhioAdmin(anhio);

		List<casoLV> list = findByporAnhioAdmin(anhio, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the caso l vs before and after the current caso l v in the ordered set where anhio = &#63;.
	 *
	 * @param id the primary key of the current caso l v
	 * @param anhio the anhio
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next caso l v
	 * @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public casoLV[] findByporAnhioAdmin_PrevAndNext(int id, String anhio,
		OrderByComparator orderByComparator)
		throws NoSuchcasoLVException, SystemException {
		casoLV casoLV = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			casoLV[] array = new casoLVImpl[3];

			array[0] = getByporAnhioAdmin_PrevAndNext(session, casoLV, anhio,
					orderByComparator, true);

			array[1] = casoLV;

			array[2] = getByporAnhioAdmin_PrevAndNext(session, casoLV, anhio,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected casoLV getByporAnhioAdmin_PrevAndNext(Session session,
		casoLV casoLV, String anhio, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CASOLV_WHERE);

		if (anhio == null) {
			query.append(_FINDER_COLUMN_PORANHIOADMIN_ANHIO_1);
		}
		else {
			if (anhio.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORANHIOADMIN_ANHIO_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORANHIOADMIN_ANHIO_2);
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

		else {
			query.append(casoLVModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (anhio != null) {
			qPos.add(anhio);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(casoLV);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<casoLV> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the caso l vs.
	 *
	 * @return the caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public List<casoLV> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the caso l vs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of caso l vs
	 * @param end the upper bound of the range of caso l vs (not inclusive)
	 * @return the range of caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public List<casoLV> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the caso l vs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of caso l vs
	 * @param end the upper bound of the range of caso l vs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public List<casoLV> findAll(int start, int end,
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

		List<casoLV> list = (List<casoLV>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CASOLV);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CASOLV.concat(casoLVModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<casoLV>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<casoLV>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the caso l vs where despacho = &#63; from the database.
	 *
	 * @param despacho the despacho
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByporDespacho(String despacho) throws SystemException {
		for (casoLV casoLV : findByporDespacho(despacho)) {
			remove(casoLV);
		}
	}

	/**
	 * Removes all the caso l vs where despacho = &#63; and anhio = &#63; from the database.
	 *
	 * @param despacho the despacho
	 * @param anhio the anhio
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByporAnhio(String despacho, String anhio)
		throws SystemException {
		for (casoLV casoLV : findByporAnhio(despacho, anhio)) {
			remove(casoLV);
		}
	}

	/**
	 * Removes all the caso l vs where anhio = &#63; from the database.
	 *
	 * @param anhio the anhio
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByporAnhioAdmin(String anhio) throws SystemException {
		for (casoLV casoLV : findByporAnhioAdmin(anhio)) {
			remove(casoLV);
		}
	}

	/**
	 * Removes all the caso l vs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (casoLV casoLV : findAll()) {
			remove(casoLV);
		}
	}

	/**
	 * Returns the number of caso l vs where despacho = &#63;.
	 *
	 * @param despacho the despacho
	 * @return the number of matching caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByporDespacho(String despacho) throws SystemException {
		Object[] finderArgs = new Object[] { despacho };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORDESPACHO,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CASOLV_WHERE);

			if (despacho == null) {
				query.append(_FINDER_COLUMN_PORDESPACHO_DESPACHO_1);
			}
			else {
				if (despacho.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORDESPACHO_DESPACHO_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORDESPACHO_DESPACHO_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (despacho != null) {
					qPos.add(despacho);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORDESPACHO,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of caso l vs where despacho = &#63; and anhio = &#63;.
	 *
	 * @param despacho the despacho
	 * @param anhio the anhio
	 * @return the number of matching caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByporAnhio(String despacho, String anhio)
		throws SystemException {
		Object[] finderArgs = new Object[] { despacho, anhio };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORANHIO,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CASOLV_WHERE);

			if (despacho == null) {
				query.append(_FINDER_COLUMN_PORANHIO_DESPACHO_1);
			}
			else {
				if (despacho.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORANHIO_DESPACHO_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORANHIO_DESPACHO_2);
				}
			}

			if (anhio == null) {
				query.append(_FINDER_COLUMN_PORANHIO_ANHIO_1);
			}
			else {
				if (anhio.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORANHIO_ANHIO_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORANHIO_ANHIO_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (despacho != null) {
					qPos.add(despacho);
				}

				if (anhio != null) {
					qPos.add(anhio);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORANHIO,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of caso l vs where anhio = &#63;.
	 *
	 * @param anhio the anhio
	 * @return the number of matching caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByporAnhioAdmin(String anhio) throws SystemException {
		Object[] finderArgs = new Object[] { anhio };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORANHIOADMIN,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CASOLV_WHERE);

			if (anhio == null) {
				query.append(_FINDER_COLUMN_PORANHIOADMIN_ANHIO_1);
			}
			else {
				if (anhio.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORANHIOADMIN_ANHIO_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORANHIOADMIN_ANHIO_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (anhio != null) {
					qPos.add(anhio);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORANHIOADMIN,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of caso l vs.
	 *
	 * @return the number of caso l vs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CASOLV);

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
	 * Initializes the caso l v persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.casoLV")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<casoLV>> listenersList = new ArrayList<ModelListener<casoLV>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<casoLV>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(casoLVImpl.class.getName());
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
	private static final String _SQL_SELECT_CASOLV = "SELECT casoLV FROM casoLV casoLV";
	private static final String _SQL_SELECT_CASOLV_WHERE = "SELECT casoLV FROM casoLV casoLV WHERE ";
	private static final String _SQL_COUNT_CASOLV = "SELECT COUNT(casoLV) FROM casoLV casoLV";
	private static final String _SQL_COUNT_CASOLV_WHERE = "SELECT COUNT(casoLV) FROM casoLV casoLV WHERE ";
	private static final String _FINDER_COLUMN_PORDESPACHO_DESPACHO_1 = "casoLV.despacho IS NULL";
	private static final String _FINDER_COLUMN_PORDESPACHO_DESPACHO_2 = "casoLV.despacho = ?";
	private static final String _FINDER_COLUMN_PORDESPACHO_DESPACHO_3 = "(casoLV.despacho IS NULL OR casoLV.despacho = ?)";
	private static final String _FINDER_COLUMN_PORANHIO_DESPACHO_1 = "casoLV.despacho IS NULL AND ";
	private static final String _FINDER_COLUMN_PORANHIO_DESPACHO_2 = "casoLV.despacho = ? AND ";
	private static final String _FINDER_COLUMN_PORANHIO_DESPACHO_3 = "(casoLV.despacho IS NULL OR casoLV.despacho = ?) AND ";
	private static final String _FINDER_COLUMN_PORANHIO_ANHIO_1 = "casoLV.anhio IS NULL";
	private static final String _FINDER_COLUMN_PORANHIO_ANHIO_2 = "casoLV.anhio = ?";
	private static final String _FINDER_COLUMN_PORANHIO_ANHIO_3 = "(casoLV.anhio IS NULL OR casoLV.anhio = ?)";
	private static final String _FINDER_COLUMN_PORANHIOADMIN_ANHIO_1 = "casoLV.anhio IS NULL";
	private static final String _FINDER_COLUMN_PORANHIOADMIN_ANHIO_2 = "casoLV.anhio = ?";
	private static final String _FINDER_COLUMN_PORANHIOADMIN_ANHIO_3 = "(casoLV.anhio IS NULL OR casoLV.anhio = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "casoLV.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No casoLV exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No casoLV exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(casoLVPersistenceImpl.class);
	private static casoLV _nullcasoLV = new casoLVImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<casoLV> toCacheModel() {
				return _nullcasoLVCacheModel;
			}
		};

	private static CacheModel<casoLV> _nullcasoLVCacheModel = new CacheModel<casoLV>() {
			public casoLV toEntityModel() {
				return _nullcasoLV;
			}
		};
}