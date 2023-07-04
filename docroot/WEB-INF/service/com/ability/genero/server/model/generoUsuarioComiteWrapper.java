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

package com.ability.genero.server.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link generoUsuarioComite}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       generoUsuarioComite
 * @generated
 */
public class generoUsuarioComiteWrapper implements generoUsuarioComite,
	ModelWrapper<generoUsuarioComite> {
	public generoUsuarioComiteWrapper(generoUsuarioComite generoUsuarioComite) {
		_generoUsuarioComite = generoUsuarioComite;
	}

	public Class<?> getModelClass() {
		return generoUsuarioComite.class;
	}

	public String getModelClassName() {
		return generoUsuarioComite.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("Distrito", getDistrito());
		attributes.put("userId", getUserId());
		attributes.put("fecha_creacion", getFecha_creacion());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String Distrito = (String)attributes.get("Distrito");

		if (Distrito != null) {
			setDistrito(Distrito);
		}

		String userId = (String)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date fecha_creacion = (Date)attributes.get("fecha_creacion");

		if (fecha_creacion != null) {
			setFecha_creacion(fecha_creacion);
		}
	}

	/**
	* Returns the primary key of this genero usuario comite.
	*
	* @return the primary key of this genero usuario comite
	*/
	public int getPrimaryKey() {
		return _generoUsuarioComite.getPrimaryKey();
	}

	/**
	* Sets the primary key of this genero usuario comite.
	*
	* @param primaryKey the primary key of this genero usuario comite
	*/
	public void setPrimaryKey(int primaryKey) {
		_generoUsuarioComite.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this genero usuario comite.
	*
	* @return the ID of this genero usuario comite
	*/
	public int getId() {
		return _generoUsuarioComite.getId();
	}

	/**
	* Sets the ID of this genero usuario comite.
	*
	* @param id the ID of this genero usuario comite
	*/
	public void setId(int id) {
		_generoUsuarioComite.setId(id);
	}

	/**
	* Returns the distrito of this genero usuario comite.
	*
	* @return the distrito of this genero usuario comite
	*/
	public java.lang.String getDistrito() {
		return _generoUsuarioComite.getDistrito();
	}

	/**
	* Sets the distrito of this genero usuario comite.
	*
	* @param Distrito the distrito of this genero usuario comite
	*/
	public void setDistrito(java.lang.String Distrito) {
		_generoUsuarioComite.setDistrito(Distrito);
	}

	/**
	* Returns the user ID of this genero usuario comite.
	*
	* @return the user ID of this genero usuario comite
	*/
	public java.lang.String getUserId() {
		return _generoUsuarioComite.getUserId();
	}

	/**
	* Sets the user ID of this genero usuario comite.
	*
	* @param userId the user ID of this genero usuario comite
	*/
	public void setUserId(java.lang.String userId) {
		_generoUsuarioComite.setUserId(userId);
	}

	/**
	* Returns the fecha_creacion of this genero usuario comite.
	*
	* @return the fecha_creacion of this genero usuario comite
	*/
	public java.util.Date getFecha_creacion() {
		return _generoUsuarioComite.getFecha_creacion();
	}

	/**
	* Sets the fecha_creacion of this genero usuario comite.
	*
	* @param fecha_creacion the fecha_creacion of this genero usuario comite
	*/
	public void setFecha_creacion(java.util.Date fecha_creacion) {
		_generoUsuarioComite.setFecha_creacion(fecha_creacion);
	}

	public boolean isNew() {
		return _generoUsuarioComite.isNew();
	}

	public void setNew(boolean n) {
		_generoUsuarioComite.setNew(n);
	}

	public boolean isCachedModel() {
		return _generoUsuarioComite.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_generoUsuarioComite.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _generoUsuarioComite.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _generoUsuarioComite.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_generoUsuarioComite.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _generoUsuarioComite.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_generoUsuarioComite.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new generoUsuarioComiteWrapper((generoUsuarioComite)_generoUsuarioComite.clone());
	}

	public int compareTo(
		com.ability.genero.server.model.generoUsuarioComite generoUsuarioComite) {
		return _generoUsuarioComite.compareTo(generoUsuarioComite);
	}

	@Override
	public int hashCode() {
		return _generoUsuarioComite.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.generoUsuarioComite> toCacheModel() {
		return _generoUsuarioComite.toCacheModel();
	}

	public com.ability.genero.server.model.generoUsuarioComite toEscapedModel() {
		return new generoUsuarioComiteWrapper(_generoUsuarioComite.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _generoUsuarioComite.toString();
	}

	public java.lang.String toXmlString() {
		return _generoUsuarioComite.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_generoUsuarioComite.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public generoUsuarioComite getWrappedgeneroUsuarioComite() {
		return _generoUsuarioComite;
	}

	public generoUsuarioComite getWrappedModel() {
		return _generoUsuarioComite;
	}

	public void resetOriginalValues() {
		_generoUsuarioComite.resetOriginalValues();
	}

	private generoUsuarioComite _generoUsuarioComite;
}