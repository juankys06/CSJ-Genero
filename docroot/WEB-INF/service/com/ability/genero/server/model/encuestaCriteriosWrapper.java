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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link encuestaCriterios}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       encuestaCriterios
 * @generated
 */
public class encuestaCriteriosWrapper implements encuestaCriterios,
	ModelWrapper<encuestaCriterios> {
	public encuestaCriteriosWrapper(encuestaCriterios encuestaCriterios) {
		_encuestaCriterios = encuestaCriterios;
	}

	public Class<?> getModelClass() {
		return encuestaCriterios.class;
	}

	public String getModelClassName() {
		return encuestaCriterios.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("pregunta", getPregunta());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String pregunta = (String)attributes.get("pregunta");

		if (pregunta != null) {
			setPregunta(pregunta);
		}
	}

	/**
	* Returns the primary key of this encuesta criterios.
	*
	* @return the primary key of this encuesta criterios
	*/
	public int getPrimaryKey() {
		return _encuestaCriterios.getPrimaryKey();
	}

	/**
	* Sets the primary key of this encuesta criterios.
	*
	* @param primaryKey the primary key of this encuesta criterios
	*/
	public void setPrimaryKey(int primaryKey) {
		_encuestaCriterios.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this encuesta criterios.
	*
	* @return the ID of this encuesta criterios
	*/
	public int getId() {
		return _encuestaCriterios.getId();
	}

	/**
	* Sets the ID of this encuesta criterios.
	*
	* @param id the ID of this encuesta criterios
	*/
	public void setId(int id) {
		_encuestaCriterios.setId(id);
	}

	/**
	* Returns the pregunta of this encuesta criterios.
	*
	* @return the pregunta of this encuesta criterios
	*/
	public java.lang.String getPregunta() {
		return _encuestaCriterios.getPregunta();
	}

	/**
	* Sets the pregunta of this encuesta criterios.
	*
	* @param pregunta the pregunta of this encuesta criterios
	*/
	public void setPregunta(java.lang.String pregunta) {
		_encuestaCriterios.setPregunta(pregunta);
	}

	public boolean isNew() {
		return _encuestaCriterios.isNew();
	}

	public void setNew(boolean n) {
		_encuestaCriterios.setNew(n);
	}

	public boolean isCachedModel() {
		return _encuestaCriterios.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_encuestaCriterios.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _encuestaCriterios.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _encuestaCriterios.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_encuestaCriterios.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _encuestaCriterios.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_encuestaCriterios.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new encuestaCriteriosWrapper((encuestaCriterios)_encuestaCriterios.clone());
	}

	public int compareTo(
		com.ability.genero.server.model.encuestaCriterios encuestaCriterios) {
		return _encuestaCriterios.compareTo(encuestaCriterios);
	}

	@Override
	public int hashCode() {
		return _encuestaCriterios.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.encuestaCriterios> toCacheModel() {
		return _encuestaCriterios.toCacheModel();
	}

	public com.ability.genero.server.model.encuestaCriterios toEscapedModel() {
		return new encuestaCriteriosWrapper(_encuestaCriterios.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _encuestaCriterios.toString();
	}

	public java.lang.String toXmlString() {
		return _encuestaCriterios.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_encuestaCriterios.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public encuestaCriterios getWrappedencuestaCriterios() {
		return _encuestaCriterios;
	}

	public encuestaCriterios getWrappedModel() {
		return _encuestaCriterios;
	}

	public void resetOriginalValues() {
		_encuestaCriterios.resetOriginalValues();
	}

	private encuestaCriterios _encuestaCriterios;
}