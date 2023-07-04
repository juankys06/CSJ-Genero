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
 * This class is a wrapper for {@link entidad}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       entidad
 * @generated
 */
public class entidadWrapper implements entidad, ModelWrapper<entidad> {
	public entidadWrapper(entidad entidad) {
		_entidad = entidad;
	}

	public Class<?> getModelClass() {
		return entidad.class;
	}

	public String getModelClassName() {
		return entidad.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("nombre", getNombre());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}
	}

	/**
	* Returns the primary key of this entidad.
	*
	* @return the primary key of this entidad
	*/
	public int getPrimaryKey() {
		return _entidad.getPrimaryKey();
	}

	/**
	* Sets the primary key of this entidad.
	*
	* @param primaryKey the primary key of this entidad
	*/
	public void setPrimaryKey(int primaryKey) {
		_entidad.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this entidad.
	*
	* @return the ID of this entidad
	*/
	public int getId() {
		return _entidad.getId();
	}

	/**
	* Sets the ID of this entidad.
	*
	* @param id the ID of this entidad
	*/
	public void setId(int id) {
		_entidad.setId(id);
	}

	/**
	* Returns the nombre of this entidad.
	*
	* @return the nombre of this entidad
	*/
	public java.lang.String getNombre() {
		return _entidad.getNombre();
	}

	/**
	* Sets the nombre of this entidad.
	*
	* @param nombre the nombre of this entidad
	*/
	public void setNombre(java.lang.String nombre) {
		_entidad.setNombre(nombre);
	}

	public boolean isNew() {
		return _entidad.isNew();
	}

	public void setNew(boolean n) {
		_entidad.setNew(n);
	}

	public boolean isCachedModel() {
		return _entidad.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_entidad.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _entidad.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _entidad.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_entidad.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _entidad.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_entidad.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new entidadWrapper((entidad)_entidad.clone());
	}

	public int compareTo(com.ability.genero.server.model.entidad entidad) {
		return _entidad.compareTo(entidad);
	}

	@Override
	public int hashCode() {
		return _entidad.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.entidad> toCacheModel() {
		return _entidad.toCacheModel();
	}

	public com.ability.genero.server.model.entidad toEscapedModel() {
		return new entidadWrapper(_entidad.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _entidad.toString();
	}

	public java.lang.String toXmlString() {
		return _entidad.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_entidad.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public entidad getWrappedentidad() {
		return _entidad;
	}

	public entidad getWrappedModel() {
		return _entidad;
	}

	public void resetOriginalValues() {
		_entidad.resetOriginalValues();
	}

	private entidad _entidad;
}