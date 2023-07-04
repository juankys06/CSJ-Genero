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
 * This class is a wrapper for {@link encuestaEnfoDife}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       encuestaEnfoDife
 * @generated
 */
public class encuestaEnfoDifeWrapper implements encuestaEnfoDife,
	ModelWrapper<encuestaEnfoDife> {
	public encuestaEnfoDifeWrapper(encuestaEnfoDife encuestaEnfoDife) {
		_encuestaEnfoDife = encuestaEnfoDife;
	}

	public Class<?> getModelClass() {
		return encuestaEnfoDife.class;
	}

	public String getModelClassName() {
		return encuestaEnfoDife.class.getName();
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
	* Returns the primary key of this encuesta enfo dife.
	*
	* @return the primary key of this encuesta enfo dife
	*/
	public int getPrimaryKey() {
		return _encuestaEnfoDife.getPrimaryKey();
	}

	/**
	* Sets the primary key of this encuesta enfo dife.
	*
	* @param primaryKey the primary key of this encuesta enfo dife
	*/
	public void setPrimaryKey(int primaryKey) {
		_encuestaEnfoDife.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this encuesta enfo dife.
	*
	* @return the ID of this encuesta enfo dife
	*/
	public int getId() {
		return _encuestaEnfoDife.getId();
	}

	/**
	* Sets the ID of this encuesta enfo dife.
	*
	* @param id the ID of this encuesta enfo dife
	*/
	public void setId(int id) {
		_encuestaEnfoDife.setId(id);
	}

	/**
	* Returns the pregunta of this encuesta enfo dife.
	*
	* @return the pregunta of this encuesta enfo dife
	*/
	public java.lang.String getPregunta() {
		return _encuestaEnfoDife.getPregunta();
	}

	/**
	* Sets the pregunta of this encuesta enfo dife.
	*
	* @param pregunta the pregunta of this encuesta enfo dife
	*/
	public void setPregunta(java.lang.String pregunta) {
		_encuestaEnfoDife.setPregunta(pregunta);
	}

	public boolean isNew() {
		return _encuestaEnfoDife.isNew();
	}

	public void setNew(boolean n) {
		_encuestaEnfoDife.setNew(n);
	}

	public boolean isCachedModel() {
		return _encuestaEnfoDife.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_encuestaEnfoDife.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _encuestaEnfoDife.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _encuestaEnfoDife.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_encuestaEnfoDife.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _encuestaEnfoDife.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_encuestaEnfoDife.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new encuestaEnfoDifeWrapper((encuestaEnfoDife)_encuestaEnfoDife.clone());
	}

	public int compareTo(
		com.ability.genero.server.model.encuestaEnfoDife encuestaEnfoDife) {
		return _encuestaEnfoDife.compareTo(encuestaEnfoDife);
	}

	@Override
	public int hashCode() {
		return _encuestaEnfoDife.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.encuestaEnfoDife> toCacheModel() {
		return _encuestaEnfoDife.toCacheModel();
	}

	public com.ability.genero.server.model.encuestaEnfoDife toEscapedModel() {
		return new encuestaEnfoDifeWrapper(_encuestaEnfoDife.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _encuestaEnfoDife.toString();
	}

	public java.lang.String toXmlString() {
		return _encuestaEnfoDife.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_encuestaEnfoDife.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public encuestaEnfoDife getWrappedencuestaEnfoDife() {
		return _encuestaEnfoDife;
	}

	public encuestaEnfoDife getWrappedModel() {
		return _encuestaEnfoDife;
	}

	public void resetOriginalValues() {
		_encuestaEnfoDife.resetOriginalValues();
	}

	private encuestaEnfoDife _encuestaEnfoDife;
}