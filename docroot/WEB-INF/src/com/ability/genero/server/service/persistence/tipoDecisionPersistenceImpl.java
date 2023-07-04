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

import com.ability.genero.server.NoSuchtipoDecisionException;
import com.ability.genero.server.model.impl.tipoDecisionImpl;
import com.ability.genero.server.model.impl.tipoDecisionModelImpl;
import com.ability.genero.server.model.tipoDecision;

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
 * The persistence implementation for the tipo decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see tipoDecisionPersistence
 * @see tipoDecisionUtil
 * @generated
 */
public class tipoDecisionPersistenceImpl extends BasePersistenceImpl<tipoDecision>
	implements tipoDecisionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link tipoDecisionUtil} to access the tipo decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = tipoDecisionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(tipoDecisionModelImpl.ENTITY_CACHE_ENABLED,
			tipoDecisionModelImpl.FINDER_CACHE_ENABLED, tipoDecisionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(tipoDecisionModelImpl.ENTITY_CACHE_ENABLED,
			tipoDecisionModelImpl.FINDER_CACHE_ENABLED, tipoDecisionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(tipoDecisionModelImpl.ENTITY_CACHE_ENABLED,
			tipoDecisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the tipo decision in the entity cache if it is enabled.
	 *
	 * @param tipoDecision the tipo decision
	 */
	public void cacheResult(tipoDecision tipoDecision) {
		EntityCacheUtil.putResult(tipoDecisionModelImpl.ENTITY_CACHE_ENABLED,
			tipoDecisionImpl.class, tipoDecision.getPrimaryKey(), tipoDecision);

		tipoDecision.resetOriginalValues();
	}

	/**
	 * Caches the tipo decisions in the entity cache if it is enabled.
	 *
	 * @param tipoDecisions the tipo decisions
	 */
	public void cacheResult(List<tipoDecision> tipoDecisions) {
		for (tipoDecision tipoDecision : tipoDecisions) {
			if (EntityCacheUtil.getResult(
						tipoDecisionModelImpl.ENTITY_CACHE_ENABLED,
						tipoDecisionImpl.class, tipoDecision.getPrimaryKey()) == null) {
				cacheResult(tipoDecision);
			}
			else {
				tipoDecision.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tipo decisions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(tipoDecisionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(tipoDecisionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tipo decision.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(tipoDecision tipoDecision) {
		EntityCacheUtil.removeResult(tipoDecisionModelImpl.ENTITY_CACHE_ENABLED,
			tipoDecisionImpl.class, tipoDecision.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<tipoDecision> tipoDecisions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (tipoDecision tipoDecision : tipoDecisions) {
			EntityCacheUtil.removeResult(tipoDecisionModelImpl.ENTITY_CACHE_ENABLED,
				tipoDecisionImpl.class, tipoDecision.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tipo decision with the primary key. Does not add the tipo decision to the database.
	 *
	 * @param id the primary key for the new tipo decision
	 * @return the new tipo decision
	 */
	public tipoDecision create(int id) {
		tipoDecision tipoDecision = new tipoDecisionImpl();

		tipoDecision.setNew(true);
		tipoDecision.setPrimaryKey(id);

		return tipoDecision;
	}

	/**
	 * Removes the tipo decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tipo decision
	 * @return the tipo decision that was removed
	 * @throws com.ability.genero.server.NoSuchtipoDecisionException if a tipo decision with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public tipoDecision remove(int id)
		throws NoSuchtipoDecisionException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the tipo decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tipo decision
	 * @return the tipo decision that was removed
	 * @throws com.ability.genero.server.NoSuchtipoDecisionException if a tipo decision with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public tipoDecision remove(Serializable primaryKey)
		throws NoSuchtipoDecisionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			tipoDecision tipoDecision = (tipoDecision)session.get(tipoDecisionImpl.class,
					primaryKey);

			if (tipoDecision == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtipoDecisionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tipoDecision);
		}
		catch (NoSuchtipoDecisionException nsee) {
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
	protected tipoDecision removeImpl(tipoDecision tipoDecision)
		throws SystemException {
		tipoDecision = toUnwrappedModel(tipoDecision);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tipoDecision);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(tipoDecision);

		return tipoDecision;
	}

	@Override
	public tipoDecision updateImpl(
		com.ability.genero.server.model.tipoDecision tipoDecision, boolean merge)
		throws SystemException {
		tipoDecision = toUnwrappedModel(tipoDecision);

		boolean isNew = tipoDecision.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tipoDecision, merge);

			tipoDecision.setNew(false);
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

		EntityCacheUtil.putResult(tipoDecisionModelImpl.ENTITY_CACHE_ENABLED,
			tipoDecisionImpl.class, tipoDecision.getPrimaryKey(), tipoDecision);

		return tipoDecision;
	}

	protected tipoDecision toUnwrappedModel(tipoDecision tipoDecision) {
		if (tipoDecision instanceof tipoDecisionImpl) {
			return tipoDecision;
		}

		tipoDecisionImpl tipoDecisionImpl = new tipoDecisionImpl();

		tipoDecisionImpl.setNew(tipoDecision.isNew());
		tipoDecisionImpl.setPrimaryKey(tipoDecision.getPrimaryKey());

		tipoDecisionImpl.setId(tipoDecision.getId());
		tipoDecisionImpl.setTipoDecision(tipoDecision.getTipoDecision());

		return tipoDecisionImpl;
	}

	/**
	 * Returns the tipo decision with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipo decision
	 * @return the tipo decision
	 * @throws com.liferay.portal.NoSuchModelException if a tipo decision with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public tipoDecision findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the tipo decision with the primary key or throws a {@link com.ability.genero.server.NoSuchtipoDecisionException} if it could not be found.
	 *
	 * @param id the primary key of the tipo decision
	 * @return the tipo decision
	 * @throws com.ability.genero.server.NoSuchtipoDecisionException if a tipo decision with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public tipoDecision findByPrimaryKey(int id)
		throws NoSuchtipoDecisionException, SystemException {
		tipoDecision tipoDecision = fetchByPrimaryKey(id);

		if (tipoDecision == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchtipoDecisionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return tipoDecision;
	}

	/**
	 * Returns the tipo decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipo decision
	 * @return the tipo decision, or <code>null</code> if a tipo decision with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public tipoDecision fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the tipo decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tipo decision
	 * @return the tipo decision, or <code>null</code> if a tipo decision with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public tipoDecision fetchByPrimaryKey(int id) throws SystemException {
		tipoDecision tipoDecision = (tipoDecision)EntityCacheUtil.getResult(tipoDecisionModelImpl.ENTITY_CACHE_ENABLED,
				tipoDecisionImpl.class, id);

		if (tipoDecision == _nulltipoDecision) {
			return null;
		}

		if (tipoDecision == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				tipoDecision = (tipoDecision)session.get(tipoDecisionImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (tipoDecision != null) {
					cacheResult(tipoDecision);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(tipoDecisionModelImpl.ENTITY_CACHE_ENABLED,
						tipoDecisionImpl.class, id, _nulltipoDecision);
				}

				closeSession(session);
			}
		}

		return tipoDecision;
	}

	/**
	 * Returns all the tipo decisions.
	 *
	 * @return the tipo decisions
	 * @throws SystemException if a system exception occurred
	 */
	public List<tipoDecision> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tipo decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipo decisions
	 * @param end the upper bound of the range of tipo decisions (not inclusive)
	 * @return the range of tipo decisions
	 * @throws SystemException if a system exception occurred
	 */
	public List<tipoDecision> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tipo decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipo decisions
	 * @param end the upper bound of the range of tipo decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tipo decisions
	 * @throws SystemException if a system exception occurred
	 */
	public List<tipoDecision> findAll(int start, int end,
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

		List<tipoDecision> list = (List<tipoDecision>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TIPODECISION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TIPODECISION.concat(tipoDecisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<tipoDecision>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<tipoDecision>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the tipo decisions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (tipoDecision tipoDecision : findAll()) {
			remove(tipoDecision);
		}
	}

	/**
	 * Returns the number of tipo decisions.
	 *
	 * @return the number of tipo decisions
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TIPODECISION);

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
	 * Initializes the tipo decision persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.tipoDecision")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<tipoDecision>> listenersList = new ArrayList<ModelListener<tipoDecision>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<tipoDecision>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(tipoDecisionImpl.class.getName());
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
	private static final String _SQL_SELECT_TIPODECISION = "SELECT tipoDecision FROM tipoDecision tipoDecision";
	private static final String _SQL_COUNT_TIPODECISION = "SELECT COUNT(tipoDecision) FROM tipoDecision tipoDecision";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tipoDecision.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No tipoDecision exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(tipoDecisionPersistenceImpl.class);
	private static tipoDecision _nulltipoDecision = new tipoDecisionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<tipoDecision> toCacheModel() {
				return _nulltipoDecisionCacheModel;
			}
		};

	private static CacheModel<tipoDecision> _nulltipoDecisionCacheModel = new CacheModel<tipoDecision>() {
			public tipoDecision toEntityModel() {
				return _nulltipoDecision;
			}
		};
}