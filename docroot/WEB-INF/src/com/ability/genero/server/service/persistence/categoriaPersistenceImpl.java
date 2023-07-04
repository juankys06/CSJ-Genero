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

import com.ability.genero.server.NoSuchcategoriaException;
import com.ability.genero.server.model.categoria;
import com.ability.genero.server.model.impl.categoriaImpl;
import com.ability.genero.server.model.impl.categoriaModelImpl;

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
 * The persistence implementation for the categoria service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see categoriaPersistence
 * @see categoriaUtil
 * @generated
 */
public class categoriaPersistenceImpl extends BasePersistenceImpl<categoria>
	implements categoriaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link categoriaUtil} to access the categoria persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = categoriaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(categoriaModelImpl.ENTITY_CACHE_ENABLED,
			categoriaModelImpl.FINDER_CACHE_ENABLED, categoriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(categoriaModelImpl.ENTITY_CACHE_ENABLED,
			categoriaModelImpl.FINDER_CACHE_ENABLED, categoriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(categoriaModelImpl.ENTITY_CACHE_ENABLED,
			categoriaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the categoria in the entity cache if it is enabled.
	 *
	 * @param categoria the categoria
	 */
	public void cacheResult(categoria categoria) {
		EntityCacheUtil.putResult(categoriaModelImpl.ENTITY_CACHE_ENABLED,
			categoriaImpl.class, categoria.getPrimaryKey(), categoria);

		categoria.resetOriginalValues();
	}

	/**
	 * Caches the categorias in the entity cache if it is enabled.
	 *
	 * @param categorias the categorias
	 */
	public void cacheResult(List<categoria> categorias) {
		for (categoria categoria : categorias) {
			if (EntityCacheUtil.getResult(
						categoriaModelImpl.ENTITY_CACHE_ENABLED,
						categoriaImpl.class, categoria.getPrimaryKey()) == null) {
				cacheResult(categoria);
			}
			else {
				categoria.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all categorias.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(categoriaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(categoriaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the categoria.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(categoria categoria) {
		EntityCacheUtil.removeResult(categoriaModelImpl.ENTITY_CACHE_ENABLED,
			categoriaImpl.class, categoria.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<categoria> categorias) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (categoria categoria : categorias) {
			EntityCacheUtil.removeResult(categoriaModelImpl.ENTITY_CACHE_ENABLED,
				categoriaImpl.class, categoria.getPrimaryKey());
		}
	}

	/**
	 * Creates a new categoria with the primary key. Does not add the categoria to the database.
	 *
	 * @param id the primary key for the new categoria
	 * @return the new categoria
	 */
	public categoria create(int id) {
		categoria categoria = new categoriaImpl();

		categoria.setNew(true);
		categoria.setPrimaryKey(id);

		return categoria;
	}

	/**
	 * Removes the categoria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the categoria
	 * @return the categoria that was removed
	 * @throws com.ability.genero.server.NoSuchcategoriaException if a categoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public categoria remove(int id)
		throws NoSuchcategoriaException, SystemException {
		return remove(Integer.valueOf(id));
	}

	/**
	 * Removes the categoria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the categoria
	 * @return the categoria that was removed
	 * @throws com.ability.genero.server.NoSuchcategoriaException if a categoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public categoria remove(Serializable primaryKey)
		throws NoSuchcategoriaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			categoria categoria = (categoria)session.get(categoriaImpl.class,
					primaryKey);

			if (categoria == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcategoriaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(categoria);
		}
		catch (NoSuchcategoriaException nsee) {
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
	protected categoria removeImpl(categoria categoria)
		throws SystemException {
		categoria = toUnwrappedModel(categoria);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, categoria);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(categoria);

		return categoria;
	}

	@Override
	public categoria updateImpl(
		com.ability.genero.server.model.categoria categoria, boolean merge)
		throws SystemException {
		categoria = toUnwrappedModel(categoria);

		boolean isNew = categoria.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, categoria, merge);

			categoria.setNew(false);
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

		EntityCacheUtil.putResult(categoriaModelImpl.ENTITY_CACHE_ENABLED,
			categoriaImpl.class, categoria.getPrimaryKey(), categoria);

		return categoria;
	}

	protected categoria toUnwrappedModel(categoria categoria) {
		if (categoria instanceof categoriaImpl) {
			return categoria;
		}

		categoriaImpl categoriaImpl = new categoriaImpl();

		categoriaImpl.setNew(categoria.isNew());
		categoriaImpl.setPrimaryKey(categoria.getPrimaryKey());

		categoriaImpl.setId(categoria.getId());
		categoriaImpl.setCategoria(categoria.getCategoria());

		return categoriaImpl;
	}

	/**
	 * Returns the categoria with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the categoria
	 * @return the categoria
	 * @throws com.liferay.portal.NoSuchModelException if a categoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public categoria findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the categoria with the primary key or throws a {@link com.ability.genero.server.NoSuchcategoriaException} if it could not be found.
	 *
	 * @param id the primary key of the categoria
	 * @return the categoria
	 * @throws com.ability.genero.server.NoSuchcategoriaException if a categoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public categoria findByPrimaryKey(int id)
		throws NoSuchcategoriaException, SystemException {
		categoria categoria = fetchByPrimaryKey(id);

		if (categoria == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchcategoriaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return categoria;
	}

	/**
	 * Returns the categoria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the categoria
	 * @return the categoria, or <code>null</code> if a categoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public categoria fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the categoria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the categoria
	 * @return the categoria, or <code>null</code> if a categoria with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public categoria fetchByPrimaryKey(int id) throws SystemException {
		categoria categoria = (categoria)EntityCacheUtil.getResult(categoriaModelImpl.ENTITY_CACHE_ENABLED,
				categoriaImpl.class, id);

		if (categoria == _nullcategoria) {
			return null;
		}

		if (categoria == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				categoria = (categoria)session.get(categoriaImpl.class,
						Integer.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (categoria != null) {
					cacheResult(categoria);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(categoriaModelImpl.ENTITY_CACHE_ENABLED,
						categoriaImpl.class, id, _nullcategoria);
				}

				closeSession(session);
			}
		}

		return categoria;
	}

	/**
	 * Returns all the categorias.
	 *
	 * @return the categorias
	 * @throws SystemException if a system exception occurred
	 */
	public List<categoria> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the categorias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @return the range of categorias
	 * @throws SystemException if a system exception occurred
	 */
	public List<categoria> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the categorias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of categorias
	 * @param end the upper bound of the range of categorias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of categorias
	 * @throws SystemException if a system exception occurred
	 */
	public List<categoria> findAll(int start, int end,
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

		List<categoria> list = (List<categoria>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CATEGORIA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CATEGORIA.concat(categoriaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<categoria>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<categoria>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the categorias from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (categoria categoria : findAll()) {
			remove(categoria);
		}
	}

	/**
	 * Returns the number of categorias.
	 *
	 * @return the number of categorias
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CATEGORIA);

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
	 * Initializes the categoria persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ability.genero.server.model.categoria")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<categoria>> listenersList = new ArrayList<ModelListener<categoria>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<categoria>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(categoriaImpl.class.getName());
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
	private static final String _SQL_SELECT_CATEGORIA = "SELECT categoria FROM categoria categoria";
	private static final String _SQL_COUNT_CATEGORIA = "SELECT COUNT(categoria) FROM categoria categoria";
	private static final String _ORDER_BY_ENTITY_ALIAS = "categoria.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No categoria exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(categoriaPersistenceImpl.class);
	private static categoria _nullcategoria = new categoriaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<categoria> toCacheModel() {
				return _nullcategoriaCacheModel;
			}
		};

	private static CacheModel<categoria> _nullcategoriaCacheModel = new CacheModel<categoria>() {
			public categoria toEntityModel() {
				return _nullcategoria;
			}
		};
}