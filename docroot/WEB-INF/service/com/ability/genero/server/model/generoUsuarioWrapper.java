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
 * This class is a wrapper for {@link generoUsuario}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       generoUsuario
 * @generated
 */
public class generoUsuarioWrapper implements generoUsuario,
	ModelWrapper<generoUsuario> {
	public generoUsuarioWrapper(generoUsuario generoUsuario) {
		_generoUsuario = generoUsuario;
	}

	public Class<?> getModelClass() {
		return generoUsuario.class;
	}

	public String getModelClassName() {
		return generoUsuario.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("despacho", getDespacho());
		attributes.put("userId", getUserId());
		attributes.put("fecha_creacion", getFecha_creacion());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String despacho = (String)attributes.get("despacho");

		if (despacho != null) {
			setDespacho(despacho);
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
	* Returns the primary key of this genero usuario.
	*
	* @return the primary key of this genero usuario
	*/
	public int getPrimaryKey() {
		return _generoUsuario.getPrimaryKey();
	}

	/**
	* Sets the primary key of this genero usuario.
	*
	* @param primaryKey the primary key of this genero usuario
	*/
	public void setPrimaryKey(int primaryKey) {
		_generoUsuario.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this genero usuario.
	*
	* @return the ID of this genero usuario
	*/
	public int getId() {
		return _generoUsuario.getId();
	}

	/**
	* Sets the ID of this genero usuario.
	*
	* @param id the ID of this genero usuario
	*/
	public void setId(int id) {
		_generoUsuario.setId(id);
	}

	/**
	* Returns the despacho of this genero usuario.
	*
	* @return the despacho of this genero usuario
	*/
	public java.lang.String getDespacho() {
		return _generoUsuario.getDespacho();
	}

	/**
	* Sets the despacho of this genero usuario.
	*
	* @param despacho the despacho of this genero usuario
	*/
	public void setDespacho(java.lang.String despacho) {
		_generoUsuario.setDespacho(despacho);
	}

	/**
	* Returns the user ID of this genero usuario.
	*
	* @return the user ID of this genero usuario
	*/
	public java.lang.String getUserId() {
		return _generoUsuario.getUserId();
	}

	/**
	* Sets the user ID of this genero usuario.
	*
	* @param userId the user ID of this genero usuario
	*/
	public void setUserId(java.lang.String userId) {
		_generoUsuario.setUserId(userId);
	}

	/**
	* Returns the fecha_creacion of this genero usuario.
	*
	* @return the fecha_creacion of this genero usuario
	*/
	public java.util.Date getFecha_creacion() {
		return _generoUsuario.getFecha_creacion();
	}

	/**
	* Sets the fecha_creacion of this genero usuario.
	*
	* @param fecha_creacion the fecha_creacion of this genero usuario
	*/
	public void setFecha_creacion(java.util.Date fecha_creacion) {
		_generoUsuario.setFecha_creacion(fecha_creacion);
	}

	public boolean isNew() {
		return _generoUsuario.isNew();
	}

	public void setNew(boolean n) {
		_generoUsuario.setNew(n);
	}

	public boolean isCachedModel() {
		return _generoUsuario.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_generoUsuario.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _generoUsuario.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _generoUsuario.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_generoUsuario.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _generoUsuario.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_generoUsuario.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new generoUsuarioWrapper((generoUsuario)_generoUsuario.clone());
	}

	public int compareTo(
		com.ability.genero.server.model.generoUsuario generoUsuario) {
		return _generoUsuario.compareTo(generoUsuario);
	}

	@Override
	public int hashCode() {
		return _generoUsuario.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.generoUsuario> toCacheModel() {
		return _generoUsuario.toCacheModel();
	}

	public com.ability.genero.server.model.generoUsuario toEscapedModel() {
		return new generoUsuarioWrapper(_generoUsuario.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _generoUsuario.toString();
	}

	public java.lang.String toXmlString() {
		return _generoUsuario.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_generoUsuario.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public generoUsuario getWrappedgeneroUsuario() {
		return _generoUsuario;
	}

	public generoUsuario getWrappedModel() {
		return _generoUsuario;
	}

	public void resetOriginalValues() {
		_generoUsuario.resetOriginalValues();
	}

	private generoUsuario _generoUsuario;
}