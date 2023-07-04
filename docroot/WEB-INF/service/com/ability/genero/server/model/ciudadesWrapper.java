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
 * This class is a wrapper for {@link ciudades}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       ciudades
 * @generated
 */
public class ciudadesWrapper implements ciudades, ModelWrapper<ciudades> {
	public ciudadesWrapper(ciudades ciudades) {
		_ciudades = ciudades;
	}

	public Class<?> getModelClass() {
		return ciudades.class;
	}

	public String getModelClassName() {
		return ciudades.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("codigo", getCodigo());
		attributes.put("nombre", getNombre());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		String codigo = (String)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}
	}

	/**
	* Returns the primary key of this ciudades.
	*
	* @return the primary key of this ciudades
	*/
	public java.lang.String getPrimaryKey() {
		return _ciudades.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ciudades.
	*
	* @param primaryKey the primary key of this ciudades
	*/
	public void setPrimaryKey(java.lang.String primaryKey) {
		_ciudades.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the codigo of this ciudades.
	*
	* @return the codigo of this ciudades
	*/
	public java.lang.String getCodigo() {
		return _ciudades.getCodigo();
	}

	/**
	* Sets the codigo of this ciudades.
	*
	* @param codigo the codigo of this ciudades
	*/
	public void setCodigo(java.lang.String codigo) {
		_ciudades.setCodigo(codigo);
	}

	/**
	* Returns the nombre of this ciudades.
	*
	* @return the nombre of this ciudades
	*/
	public java.lang.String getNombre() {
		return _ciudades.getNombre();
	}

	/**
	* Sets the nombre of this ciudades.
	*
	* @param nombre the nombre of this ciudades
	*/
	public void setNombre(java.lang.String nombre) {
		_ciudades.setNombre(nombre);
	}

	public boolean isNew() {
		return _ciudades.isNew();
	}

	public void setNew(boolean n) {
		_ciudades.setNew(n);
	}

	public boolean isCachedModel() {
		return _ciudades.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_ciudades.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _ciudades.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _ciudades.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_ciudades.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _ciudades.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_ciudades.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ciudadesWrapper((ciudades)_ciudades.clone());
	}

	public int compareTo(com.ability.genero.server.model.ciudades ciudades) {
		return _ciudades.compareTo(ciudades);
	}

	@Override
	public int hashCode() {
		return _ciudades.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.ciudades> toCacheModel() {
		return _ciudades.toCacheModel();
	}

	public com.ability.genero.server.model.ciudades toEscapedModel() {
		return new ciudadesWrapper(_ciudades.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _ciudades.toString();
	}

	public java.lang.String toXmlString() {
		return _ciudades.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_ciudades.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public ciudades getWrappedciudades() {
		return _ciudades;
	}

	public ciudades getWrappedModel() {
		return _ciudades;
	}

	public void resetOriginalValues() {
		_ciudades.resetOriginalValues();
	}

	private ciudades _ciudades;
}