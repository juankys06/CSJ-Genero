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

package com.ability.genero.server.service.base;

import com.ability.genero.server.model.normasNacionales;
import com.ability.genero.server.service.auditoriaLocalService;
import com.ability.genero.server.service.casoLVLocalService;
import com.ability.genero.server.service.categoriaLocalService;
import com.ability.genero.server.service.claseProcesoLocalService;
import com.ability.genero.server.service.distritoGLocalService;
import com.ability.genero.server.service.encuestaCriteriosLocalService;
import com.ability.genero.server.service.encuestaEnfoDifeLocalService;
import com.ability.genero.server.service.generoUsuarioComiteLocalService;
import com.ability.genero.server.service.generoUsuarioLocalService;
import com.ability.genero.server.service.juresprudenciaInternacionalLocalService;
import com.ability.genero.server.service.juresprudenciaNacionalLocalService;
import com.ability.genero.server.service.normasInteracionalesLocalService;
import com.ability.genero.server.service.normasNacionalesLocalService;
import com.ability.genero.server.service.persistence.auditoriaPersistence;
import com.ability.genero.server.service.persistence.casoLVPersistence;
import com.ability.genero.server.service.persistence.categoriaPersistence;
import com.ability.genero.server.service.persistence.claseProcesoPersistence;
import com.ability.genero.server.service.persistence.distritoGPersistence;
import com.ability.genero.server.service.persistence.encuestaCriteriosPersistence;
import com.ability.genero.server.service.persistence.encuestaEnfoDifePersistence;
import com.ability.genero.server.service.persistence.generoUsuarioComitePersistence;
import com.ability.genero.server.service.persistence.generoUsuarioPersistence;
import com.ability.genero.server.service.persistence.juresprudenciaInternacionalPersistence;
import com.ability.genero.server.service.persistence.juresprudenciaNacionalPersistence;
import com.ability.genero.server.service.persistence.normasInteracionalesPersistence;
import com.ability.genero.server.service.persistence.normasNacionalesPersistence;
import com.ability.genero.server.service.persistence.preguntasClavePersistence;
import com.ability.genero.server.service.persistence.subcategoriaPersistence;
import com.ability.genero.server.service.persistence.tipoDecisionPersistence;
import com.ability.genero.server.service.preguntasClaveLocalService;
import com.ability.genero.server.service.subcategoriaLocalService;
import com.ability.genero.server.service.tipoDecisionLocalService;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the normas nacionales local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.ability.genero.server.service.impl.normasNacionalesLocalServiceImpl}.
 * </p>
 *
 * @author DELL Villartech
 * @see com.ability.genero.server.service.impl.normasNacionalesLocalServiceImpl
 * @see com.ability.genero.server.service.normasNacionalesLocalServiceUtil
 * @generated
 */
public abstract class normasNacionalesLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements normasNacionalesLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.ability.genero.server.service.normasNacionalesLocalServiceUtil} to access the normas nacionales local service.
	 */

	/**
	 * Adds the normas nacionales to the database. Also notifies the appropriate model listeners.
	 *
	 * @param normasNacionales the normas nacionales
	 * @return the normas nacionales that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public normasNacionales addnormasNacionales(
		normasNacionales normasNacionales) throws SystemException {
		normasNacionales.setNew(true);

		return normasNacionalesPersistence.update(normasNacionales, false);
	}

	/**
	 * Creates a new normas nacionales with the primary key. Does not add the normas nacionales to the database.
	 *
	 * @param id the primary key for the new normas nacionales
	 * @return the new normas nacionales
	 */
	public normasNacionales createnormasNacionales(int id) {
		return normasNacionalesPersistence.create(id);
	}

	/**
	 * Deletes the normas nacionales with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the normas nacionales
	 * @return the normas nacionales that was removed
	 * @throws PortalException if a normas nacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public normasNacionales deletenormasNacionales(int id)
		throws PortalException, SystemException {
		return normasNacionalesPersistence.remove(id);
	}

	/**
	 * Deletes the normas nacionales from the database. Also notifies the appropriate model listeners.
	 *
	 * @param normasNacionales the normas nacionales
	 * @return the normas nacionales that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public normasNacionales deletenormasNacionales(
		normasNacionales normasNacionales) throws SystemException {
		return normasNacionalesPersistence.remove(normasNacionales);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(normasNacionales.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return normasNacionalesPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return normasNacionalesPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return normasNacionalesPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return normasNacionalesPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public normasNacionales fetchnormasNacionales(int id)
		throws SystemException {
		return normasNacionalesPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the normas nacionales with the primary key.
	 *
	 * @param id the primary key of the normas nacionales
	 * @return the normas nacionales
	 * @throws PortalException if a normas nacionales with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public normasNacionales getnormasNacionales(int id)
		throws PortalException, SystemException {
		return normasNacionalesPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return normasNacionalesPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the normas nacionaleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of normas nacionaleses
	 * @param end the upper bound of the range of normas nacionaleses (not inclusive)
	 * @return the range of normas nacionaleses
	 * @throws SystemException if a system exception occurred
	 */
	public List<normasNacionales> getnormasNacionaleses(int start, int end)
		throws SystemException {
		return normasNacionalesPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of normas nacionaleses.
	 *
	 * @return the number of normas nacionaleses
	 * @throws SystemException if a system exception occurred
	 */
	public int getnormasNacionalesesCount() throws SystemException {
		return normasNacionalesPersistence.countAll();
	}

	/**
	 * Updates the normas nacionales in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param normasNacionales the normas nacionales
	 * @return the normas nacionales that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public normasNacionales updatenormasNacionales(
		normasNacionales normasNacionales) throws SystemException {
		return updatenormasNacionales(normasNacionales, true);
	}

	/**
	 * Updates the normas nacionales in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param normasNacionales the normas nacionales
	 * @param merge whether to merge the normas nacionales with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the normas nacionales that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public normasNacionales updatenormasNacionales(
		normasNacionales normasNacionales, boolean merge)
		throws SystemException {
		normasNacionales.setNew(false);

		return normasNacionalesPersistence.update(normasNacionales, merge);
	}

	/**
	 * Returns the auditoria local service.
	 *
	 * @return the auditoria local service
	 */
	public auditoriaLocalService getauditoriaLocalService() {
		return auditoriaLocalService;
	}

	/**
	 * Sets the auditoria local service.
	 *
	 * @param auditoriaLocalService the auditoria local service
	 */
	public void setauditoriaLocalService(
		auditoriaLocalService auditoriaLocalService) {
		this.auditoriaLocalService = auditoriaLocalService;
	}

	/**
	 * Returns the auditoria persistence.
	 *
	 * @return the auditoria persistence
	 */
	public auditoriaPersistence getauditoriaPersistence() {
		return auditoriaPersistence;
	}

	/**
	 * Sets the auditoria persistence.
	 *
	 * @param auditoriaPersistence the auditoria persistence
	 */
	public void setauditoriaPersistence(
		auditoriaPersistence auditoriaPersistence) {
		this.auditoriaPersistence = auditoriaPersistence;
	}

	/**
	 * Returns the caso l v local service.
	 *
	 * @return the caso l v local service
	 */
	public casoLVLocalService getcasoLVLocalService() {
		return casoLVLocalService;
	}

	/**
	 * Sets the caso l v local service.
	 *
	 * @param casoLVLocalService the caso l v local service
	 */
	public void setcasoLVLocalService(casoLVLocalService casoLVLocalService) {
		this.casoLVLocalService = casoLVLocalService;
	}

	/**
	 * Returns the caso l v persistence.
	 *
	 * @return the caso l v persistence
	 */
	public casoLVPersistence getcasoLVPersistence() {
		return casoLVPersistence;
	}

	/**
	 * Sets the caso l v persistence.
	 *
	 * @param casoLVPersistence the caso l v persistence
	 */
	public void setcasoLVPersistence(casoLVPersistence casoLVPersistence) {
		this.casoLVPersistence = casoLVPersistence;
	}

	/**
	 * Returns the categoria local service.
	 *
	 * @return the categoria local service
	 */
	public categoriaLocalService getcategoriaLocalService() {
		return categoriaLocalService;
	}

	/**
	 * Sets the categoria local service.
	 *
	 * @param categoriaLocalService the categoria local service
	 */
	public void setcategoriaLocalService(
		categoriaLocalService categoriaLocalService) {
		this.categoriaLocalService = categoriaLocalService;
	}

	/**
	 * Returns the categoria persistence.
	 *
	 * @return the categoria persistence
	 */
	public categoriaPersistence getcategoriaPersistence() {
		return categoriaPersistence;
	}

	/**
	 * Sets the categoria persistence.
	 *
	 * @param categoriaPersistence the categoria persistence
	 */
	public void setcategoriaPersistence(
		categoriaPersistence categoriaPersistence) {
		this.categoriaPersistence = categoriaPersistence;
	}

	/**
	 * Returns the clase proceso local service.
	 *
	 * @return the clase proceso local service
	 */
	public claseProcesoLocalService getclaseProcesoLocalService() {
		return claseProcesoLocalService;
	}

	/**
	 * Sets the clase proceso local service.
	 *
	 * @param claseProcesoLocalService the clase proceso local service
	 */
	public void setclaseProcesoLocalService(
		claseProcesoLocalService claseProcesoLocalService) {
		this.claseProcesoLocalService = claseProcesoLocalService;
	}

	/**
	 * Returns the clase proceso persistence.
	 *
	 * @return the clase proceso persistence
	 */
	public claseProcesoPersistence getclaseProcesoPersistence() {
		return claseProcesoPersistence;
	}

	/**
	 * Sets the clase proceso persistence.
	 *
	 * @param claseProcesoPersistence the clase proceso persistence
	 */
	public void setclaseProcesoPersistence(
		claseProcesoPersistence claseProcesoPersistence) {
		this.claseProcesoPersistence = claseProcesoPersistence;
	}

	/**
	 * Returns the distrito g local service.
	 *
	 * @return the distrito g local service
	 */
	public distritoGLocalService getdistritoGLocalService() {
		return distritoGLocalService;
	}

	/**
	 * Sets the distrito g local service.
	 *
	 * @param distritoGLocalService the distrito g local service
	 */
	public void setdistritoGLocalService(
		distritoGLocalService distritoGLocalService) {
		this.distritoGLocalService = distritoGLocalService;
	}

	/**
	 * Returns the distrito g persistence.
	 *
	 * @return the distrito g persistence
	 */
	public distritoGPersistence getdistritoGPersistence() {
		return distritoGPersistence;
	}

	/**
	 * Sets the distrito g persistence.
	 *
	 * @param distritoGPersistence the distrito g persistence
	 */
	public void setdistritoGPersistence(
		distritoGPersistence distritoGPersistence) {
		this.distritoGPersistence = distritoGPersistence;
	}

	/**
	 * Returns the encuesta criterios local service.
	 *
	 * @return the encuesta criterios local service
	 */
	public encuestaCriteriosLocalService getencuestaCriteriosLocalService() {
		return encuestaCriteriosLocalService;
	}

	/**
	 * Sets the encuesta criterios local service.
	 *
	 * @param encuestaCriteriosLocalService the encuesta criterios local service
	 */
	public void setencuestaCriteriosLocalService(
		encuestaCriteriosLocalService encuestaCriteriosLocalService) {
		this.encuestaCriteriosLocalService = encuestaCriteriosLocalService;
	}

	/**
	 * Returns the encuesta criterios persistence.
	 *
	 * @return the encuesta criterios persistence
	 */
	public encuestaCriteriosPersistence getencuestaCriteriosPersistence() {
		return encuestaCriteriosPersistence;
	}

	/**
	 * Sets the encuesta criterios persistence.
	 *
	 * @param encuestaCriteriosPersistence the encuesta criterios persistence
	 */
	public void setencuestaCriteriosPersistence(
		encuestaCriteriosPersistence encuestaCriteriosPersistence) {
		this.encuestaCriteriosPersistence = encuestaCriteriosPersistence;
	}

	/**
	 * Returns the encuesta enfo dife local service.
	 *
	 * @return the encuesta enfo dife local service
	 */
	public encuestaEnfoDifeLocalService getencuestaEnfoDifeLocalService() {
		return encuestaEnfoDifeLocalService;
	}

	/**
	 * Sets the encuesta enfo dife local service.
	 *
	 * @param encuestaEnfoDifeLocalService the encuesta enfo dife local service
	 */
	public void setencuestaEnfoDifeLocalService(
		encuestaEnfoDifeLocalService encuestaEnfoDifeLocalService) {
		this.encuestaEnfoDifeLocalService = encuestaEnfoDifeLocalService;
	}

	/**
	 * Returns the encuesta enfo dife persistence.
	 *
	 * @return the encuesta enfo dife persistence
	 */
	public encuestaEnfoDifePersistence getencuestaEnfoDifePersistence() {
		return encuestaEnfoDifePersistence;
	}

	/**
	 * Sets the encuesta enfo dife persistence.
	 *
	 * @param encuestaEnfoDifePersistence the encuesta enfo dife persistence
	 */
	public void setencuestaEnfoDifePersistence(
		encuestaEnfoDifePersistence encuestaEnfoDifePersistence) {
		this.encuestaEnfoDifePersistence = encuestaEnfoDifePersistence;
	}

	/**
	 * Returns the genero usuario local service.
	 *
	 * @return the genero usuario local service
	 */
	public generoUsuarioLocalService getgeneroUsuarioLocalService() {
		return generoUsuarioLocalService;
	}

	/**
	 * Sets the genero usuario local service.
	 *
	 * @param generoUsuarioLocalService the genero usuario local service
	 */
	public void setgeneroUsuarioLocalService(
		generoUsuarioLocalService generoUsuarioLocalService) {
		this.generoUsuarioLocalService = generoUsuarioLocalService;
	}

	/**
	 * Returns the genero usuario persistence.
	 *
	 * @return the genero usuario persistence
	 */
	public generoUsuarioPersistence getgeneroUsuarioPersistence() {
		return generoUsuarioPersistence;
	}

	/**
	 * Sets the genero usuario persistence.
	 *
	 * @param generoUsuarioPersistence the genero usuario persistence
	 */
	public void setgeneroUsuarioPersistence(
		generoUsuarioPersistence generoUsuarioPersistence) {
		this.generoUsuarioPersistence = generoUsuarioPersistence;
	}

	/**
	 * Returns the genero usuario comite local service.
	 *
	 * @return the genero usuario comite local service
	 */
	public generoUsuarioComiteLocalService getgeneroUsuarioComiteLocalService() {
		return generoUsuarioComiteLocalService;
	}

	/**
	 * Sets the genero usuario comite local service.
	 *
	 * @param generoUsuarioComiteLocalService the genero usuario comite local service
	 */
	public void setgeneroUsuarioComiteLocalService(
		generoUsuarioComiteLocalService generoUsuarioComiteLocalService) {
		this.generoUsuarioComiteLocalService = generoUsuarioComiteLocalService;
	}

	/**
	 * Returns the genero usuario comite persistence.
	 *
	 * @return the genero usuario comite persistence
	 */
	public generoUsuarioComitePersistence getgeneroUsuarioComitePersistence() {
		return generoUsuarioComitePersistence;
	}

	/**
	 * Sets the genero usuario comite persistence.
	 *
	 * @param generoUsuarioComitePersistence the genero usuario comite persistence
	 */
	public void setgeneroUsuarioComitePersistence(
		generoUsuarioComitePersistence generoUsuarioComitePersistence) {
		this.generoUsuarioComitePersistence = generoUsuarioComitePersistence;
	}

	/**
	 * Returns the juresprudencia internacional local service.
	 *
	 * @return the juresprudencia internacional local service
	 */
	public juresprudenciaInternacionalLocalService getjuresprudenciaInternacionalLocalService() {
		return juresprudenciaInternacionalLocalService;
	}

	/**
	 * Sets the juresprudencia internacional local service.
	 *
	 * @param juresprudenciaInternacionalLocalService the juresprudencia internacional local service
	 */
	public void setjuresprudenciaInternacionalLocalService(
		juresprudenciaInternacionalLocalService juresprudenciaInternacionalLocalService) {
		this.juresprudenciaInternacionalLocalService = juresprudenciaInternacionalLocalService;
	}

	/**
	 * Returns the juresprudencia internacional persistence.
	 *
	 * @return the juresprudencia internacional persistence
	 */
	public juresprudenciaInternacionalPersistence getjuresprudenciaInternacionalPersistence() {
		return juresprudenciaInternacionalPersistence;
	}

	/**
	 * Sets the juresprudencia internacional persistence.
	 *
	 * @param juresprudenciaInternacionalPersistence the juresprudencia internacional persistence
	 */
	public void setjuresprudenciaInternacionalPersistence(
		juresprudenciaInternacionalPersistence juresprudenciaInternacionalPersistence) {
		this.juresprudenciaInternacionalPersistence = juresprudenciaInternacionalPersistence;
	}

	/**
	 * Returns the juresprudencia nacional local service.
	 *
	 * @return the juresprudencia nacional local service
	 */
	public juresprudenciaNacionalLocalService getjuresprudenciaNacionalLocalService() {
		return juresprudenciaNacionalLocalService;
	}

	/**
	 * Sets the juresprudencia nacional local service.
	 *
	 * @param juresprudenciaNacionalLocalService the juresprudencia nacional local service
	 */
	public void setjuresprudenciaNacionalLocalService(
		juresprudenciaNacionalLocalService juresprudenciaNacionalLocalService) {
		this.juresprudenciaNacionalLocalService = juresprudenciaNacionalLocalService;
	}

	/**
	 * Returns the juresprudencia nacional persistence.
	 *
	 * @return the juresprudencia nacional persistence
	 */
	public juresprudenciaNacionalPersistence getjuresprudenciaNacionalPersistence() {
		return juresprudenciaNacionalPersistence;
	}

	/**
	 * Sets the juresprudencia nacional persistence.
	 *
	 * @param juresprudenciaNacionalPersistence the juresprudencia nacional persistence
	 */
	public void setjuresprudenciaNacionalPersistence(
		juresprudenciaNacionalPersistence juresprudenciaNacionalPersistence) {
		this.juresprudenciaNacionalPersistence = juresprudenciaNacionalPersistence;
	}

	/**
	 * Returns the normas interacionales local service.
	 *
	 * @return the normas interacionales local service
	 */
	public normasInteracionalesLocalService getnormasInteracionalesLocalService() {
		return normasInteracionalesLocalService;
	}

	/**
	 * Sets the normas interacionales local service.
	 *
	 * @param normasInteracionalesLocalService the normas interacionales local service
	 */
	public void setnormasInteracionalesLocalService(
		normasInteracionalesLocalService normasInteracionalesLocalService) {
		this.normasInteracionalesLocalService = normasInteracionalesLocalService;
	}

	/**
	 * Returns the normas interacionales persistence.
	 *
	 * @return the normas interacionales persistence
	 */
	public normasInteracionalesPersistence getnormasInteracionalesPersistence() {
		return normasInteracionalesPersistence;
	}

	/**
	 * Sets the normas interacionales persistence.
	 *
	 * @param normasInteracionalesPersistence the normas interacionales persistence
	 */
	public void setnormasInteracionalesPersistence(
		normasInteracionalesPersistence normasInteracionalesPersistence) {
		this.normasInteracionalesPersistence = normasInteracionalesPersistence;
	}

	/**
	 * Returns the normas nacionales local service.
	 *
	 * @return the normas nacionales local service
	 */
	public normasNacionalesLocalService getnormasNacionalesLocalService() {
		return normasNacionalesLocalService;
	}

	/**
	 * Sets the normas nacionales local service.
	 *
	 * @param normasNacionalesLocalService the normas nacionales local service
	 */
	public void setnormasNacionalesLocalService(
		normasNacionalesLocalService normasNacionalesLocalService) {
		this.normasNacionalesLocalService = normasNacionalesLocalService;
	}

	/**
	 * Returns the normas nacionales persistence.
	 *
	 * @return the normas nacionales persistence
	 */
	public normasNacionalesPersistence getnormasNacionalesPersistence() {
		return normasNacionalesPersistence;
	}

	/**
	 * Sets the normas nacionales persistence.
	 *
	 * @param normasNacionalesPersistence the normas nacionales persistence
	 */
	public void setnormasNacionalesPersistence(
		normasNacionalesPersistence normasNacionalesPersistence) {
		this.normasNacionalesPersistence = normasNacionalesPersistence;
	}

	/**
	 * Returns the preguntas clave local service.
	 *
	 * @return the preguntas clave local service
	 */
	public preguntasClaveLocalService getpreguntasClaveLocalService() {
		return preguntasClaveLocalService;
	}

	/**
	 * Sets the preguntas clave local service.
	 *
	 * @param preguntasClaveLocalService the preguntas clave local service
	 */
	public void setpreguntasClaveLocalService(
		preguntasClaveLocalService preguntasClaveLocalService) {
		this.preguntasClaveLocalService = preguntasClaveLocalService;
	}

	/**
	 * Returns the preguntas clave persistence.
	 *
	 * @return the preguntas clave persistence
	 */
	public preguntasClavePersistence getpreguntasClavePersistence() {
		return preguntasClavePersistence;
	}

	/**
	 * Sets the preguntas clave persistence.
	 *
	 * @param preguntasClavePersistence the preguntas clave persistence
	 */
	public void setpreguntasClavePersistence(
		preguntasClavePersistence preguntasClavePersistence) {
		this.preguntasClavePersistence = preguntasClavePersistence;
	}

	/**
	 * Returns the subcategoria local service.
	 *
	 * @return the subcategoria local service
	 */
	public subcategoriaLocalService getsubcategoriaLocalService() {
		return subcategoriaLocalService;
	}

	/**
	 * Sets the subcategoria local service.
	 *
	 * @param subcategoriaLocalService the subcategoria local service
	 */
	public void setsubcategoriaLocalService(
		subcategoriaLocalService subcategoriaLocalService) {
		this.subcategoriaLocalService = subcategoriaLocalService;
	}

	/**
	 * Returns the subcategoria persistence.
	 *
	 * @return the subcategoria persistence
	 */
	public subcategoriaPersistence getsubcategoriaPersistence() {
		return subcategoriaPersistence;
	}

	/**
	 * Sets the subcategoria persistence.
	 *
	 * @param subcategoriaPersistence the subcategoria persistence
	 */
	public void setsubcategoriaPersistence(
		subcategoriaPersistence subcategoriaPersistence) {
		this.subcategoriaPersistence = subcategoriaPersistence;
	}

	/**
	 * Returns the tipo decision local service.
	 *
	 * @return the tipo decision local service
	 */
	public tipoDecisionLocalService gettipoDecisionLocalService() {
		return tipoDecisionLocalService;
	}

	/**
	 * Sets the tipo decision local service.
	 *
	 * @param tipoDecisionLocalService the tipo decision local service
	 */
	public void settipoDecisionLocalService(
		tipoDecisionLocalService tipoDecisionLocalService) {
		this.tipoDecisionLocalService = tipoDecisionLocalService;
	}

	/**
	 * Returns the tipo decision persistence.
	 *
	 * @return the tipo decision persistence
	 */
	public tipoDecisionPersistence gettipoDecisionPersistence() {
		return tipoDecisionPersistence;
	}

	/**
	 * Sets the tipo decision persistence.
	 *
	 * @param tipoDecisionPersistence the tipo decision persistence
	 */
	public void settipoDecisionPersistence(
		tipoDecisionPersistence tipoDecisionPersistence) {
		this.tipoDecisionPersistence = tipoDecisionPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		PersistedModelLocalServiceRegistryUtil.register("com.ability.genero.server.model.normasNacionales",
			normasNacionalesLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.ability.genero.server.model.normasNacionales");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return normasNacionales.class;
	}

	protected String getModelClassName() {
		return normasNacionales.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = normasNacionalesPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = auditoriaLocalService.class)
	protected auditoriaLocalService auditoriaLocalService;
	@BeanReference(type = auditoriaPersistence.class)
	protected auditoriaPersistence auditoriaPersistence;
	@BeanReference(type = casoLVLocalService.class)
	protected casoLVLocalService casoLVLocalService;
	@BeanReference(type = casoLVPersistence.class)
	protected casoLVPersistence casoLVPersistence;
	@BeanReference(type = categoriaLocalService.class)
	protected categoriaLocalService categoriaLocalService;
	@BeanReference(type = categoriaPersistence.class)
	protected categoriaPersistence categoriaPersistence;
	@BeanReference(type = claseProcesoLocalService.class)
	protected claseProcesoLocalService claseProcesoLocalService;
	@BeanReference(type = claseProcesoPersistence.class)
	protected claseProcesoPersistence claseProcesoPersistence;
	@BeanReference(type = distritoGLocalService.class)
	protected distritoGLocalService distritoGLocalService;
	@BeanReference(type = distritoGPersistence.class)
	protected distritoGPersistence distritoGPersistence;
	@BeanReference(type = encuestaCriteriosLocalService.class)
	protected encuestaCriteriosLocalService encuestaCriteriosLocalService;
	@BeanReference(type = encuestaCriteriosPersistence.class)
	protected encuestaCriteriosPersistence encuestaCriteriosPersistence;
	@BeanReference(type = encuestaEnfoDifeLocalService.class)
	protected encuestaEnfoDifeLocalService encuestaEnfoDifeLocalService;
	@BeanReference(type = encuestaEnfoDifePersistence.class)
	protected encuestaEnfoDifePersistence encuestaEnfoDifePersistence;
	@BeanReference(type = generoUsuarioLocalService.class)
	protected generoUsuarioLocalService generoUsuarioLocalService;
	@BeanReference(type = generoUsuarioPersistence.class)
	protected generoUsuarioPersistence generoUsuarioPersistence;
	@BeanReference(type = generoUsuarioComiteLocalService.class)
	protected generoUsuarioComiteLocalService generoUsuarioComiteLocalService;
	@BeanReference(type = generoUsuarioComitePersistence.class)
	protected generoUsuarioComitePersistence generoUsuarioComitePersistence;
	@BeanReference(type = juresprudenciaInternacionalLocalService.class)
	protected juresprudenciaInternacionalLocalService juresprudenciaInternacionalLocalService;
	@BeanReference(type = juresprudenciaInternacionalPersistence.class)
	protected juresprudenciaInternacionalPersistence juresprudenciaInternacionalPersistence;
	@BeanReference(type = juresprudenciaNacionalLocalService.class)
	protected juresprudenciaNacionalLocalService juresprudenciaNacionalLocalService;
	@BeanReference(type = juresprudenciaNacionalPersistence.class)
	protected juresprudenciaNacionalPersistence juresprudenciaNacionalPersistence;
	@BeanReference(type = normasInteracionalesLocalService.class)
	protected normasInteracionalesLocalService normasInteracionalesLocalService;
	@BeanReference(type = normasInteracionalesPersistence.class)
	protected normasInteracionalesPersistence normasInteracionalesPersistence;
	@BeanReference(type = normasNacionalesLocalService.class)
	protected normasNacionalesLocalService normasNacionalesLocalService;
	@BeanReference(type = normasNacionalesPersistence.class)
	protected normasNacionalesPersistence normasNacionalesPersistence;
	@BeanReference(type = preguntasClaveLocalService.class)
	protected preguntasClaveLocalService preguntasClaveLocalService;
	@BeanReference(type = preguntasClavePersistence.class)
	protected preguntasClavePersistence preguntasClavePersistence;
	@BeanReference(type = subcategoriaLocalService.class)
	protected subcategoriaLocalService subcategoriaLocalService;
	@BeanReference(type = subcategoriaPersistence.class)
	protected subcategoriaPersistence subcategoriaPersistence;
	@BeanReference(type = tipoDecisionLocalService.class)
	protected tipoDecisionLocalService tipoDecisionLocalService;
	@BeanReference(type = tipoDecisionPersistence.class)
	protected tipoDecisionPersistence tipoDecisionPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private normasNacionalesLocalServiceClpInvoker _clpInvoker = new normasNacionalesLocalServiceClpInvoker();
}