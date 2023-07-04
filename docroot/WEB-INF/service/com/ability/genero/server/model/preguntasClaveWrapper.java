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
 * This class is a wrapper for {@link preguntasClave}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       preguntasClave
 * @generated
 */
public class preguntasClaveWrapper implements preguntasClave,
	ModelWrapper<preguntasClave> {
	public preguntasClaveWrapper(preguntasClave preguntasClave) {
		_preguntasClave = preguntasClave;
	}

	public Class<?> getModelClass() {
		return preguntasClave.class;
	}

	public String getModelClassName() {
		return preguntasClave.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("pregunta", getPregunta());
		attributes.put("respuesta", getRespuesta());

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

		String respuesta = (String)attributes.get("respuesta");

		if (respuesta != null) {
			setRespuesta(respuesta);
		}
	}

	/**
	* Returns the primary key of this preguntas clave.
	*
	* @return the primary key of this preguntas clave
	*/
	public int getPrimaryKey() {
		return _preguntasClave.getPrimaryKey();
	}

	/**
	* Sets the primary key of this preguntas clave.
	*
	* @param primaryKey the primary key of this preguntas clave
	*/
	public void setPrimaryKey(int primaryKey) {
		_preguntasClave.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this preguntas clave.
	*
	* @return the ID of this preguntas clave
	*/
	public int getId() {
		return _preguntasClave.getId();
	}

	/**
	* Sets the ID of this preguntas clave.
	*
	* @param id the ID of this preguntas clave
	*/
	public void setId(int id) {
		_preguntasClave.setId(id);
	}

	/**
	* Returns the pregunta of this preguntas clave.
	*
	* @return the pregunta of this preguntas clave
	*/
	public java.lang.String getPregunta() {
		return _preguntasClave.getPregunta();
	}

	/**
	* Sets the pregunta of this preguntas clave.
	*
	* @param pregunta the pregunta of this preguntas clave
	*/
	public void setPregunta(java.lang.String pregunta) {
		_preguntasClave.setPregunta(pregunta);
	}

	/**
	* Returns the respuesta of this preguntas clave.
	*
	* @return the respuesta of this preguntas clave
	*/
	public java.lang.String getRespuesta() {
		return _preguntasClave.getRespuesta();
	}

	/**
	* Sets the respuesta of this preguntas clave.
	*
	* @param respuesta the respuesta of this preguntas clave
	*/
	public void setRespuesta(java.lang.String respuesta) {
		_preguntasClave.setRespuesta(respuesta);
	}

	public boolean isNew() {
		return _preguntasClave.isNew();
	}

	public void setNew(boolean n) {
		_preguntasClave.setNew(n);
	}

	public boolean isCachedModel() {
		return _preguntasClave.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_preguntasClave.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _preguntasClave.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _preguntasClave.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_preguntasClave.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _preguntasClave.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_preguntasClave.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new preguntasClaveWrapper((preguntasClave)_preguntasClave.clone());
	}

	public int compareTo(
		com.ability.genero.server.model.preguntasClave preguntasClave) {
		return _preguntasClave.compareTo(preguntasClave);
	}

	@Override
	public int hashCode() {
		return _preguntasClave.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.preguntasClave> toCacheModel() {
		return _preguntasClave.toCacheModel();
	}

	public com.ability.genero.server.model.preguntasClave toEscapedModel() {
		return new preguntasClaveWrapper(_preguntasClave.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _preguntasClave.toString();
	}

	public java.lang.String toXmlString() {
		return _preguntasClave.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_preguntasClave.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public preguntasClave getWrappedpreguntasClave() {
		return _preguntasClave;
	}

	public preguntasClave getWrappedModel() {
		return _preguntasClave;
	}

	public void resetOriginalValues() {
		_preguntasClave.resetOriginalValues();
	}

	private preguntasClave _preguntasClave;
}