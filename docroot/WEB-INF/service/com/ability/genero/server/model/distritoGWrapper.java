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
 * This class is a wrapper for {@link distritoG}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       distritoG
 * @generated
 */
public class distritoGWrapper implements distritoG, ModelWrapper<distritoG> {
	public distritoGWrapper(distritoG distritoG) {
		_distritoG = distritoG;
	}

	public Class<?> getModelClass() {
		return distritoG.class;
	}

	public String getModelClassName() {
		return distritoG.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("nombre", getNombre());
		attributes.put("nombre_mascara", getNombre_mascara());

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

		String nombre_mascara = (String)attributes.get("nombre_mascara");

		if (nombre_mascara != null) {
			setNombre_mascara(nombre_mascara);
		}
	}

	/**
	* Returns the primary key of this distrito g.
	*
	* @return the primary key of this distrito g
	*/
	public int getPrimaryKey() {
		return _distritoG.getPrimaryKey();
	}

	/**
	* Sets the primary key of this distrito g.
	*
	* @param primaryKey the primary key of this distrito g
	*/
	public void setPrimaryKey(int primaryKey) {
		_distritoG.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this distrito g.
	*
	* @return the ID of this distrito g
	*/
	public int getId() {
		return _distritoG.getId();
	}

	/**
	* Sets the ID of this distrito g.
	*
	* @param id the ID of this distrito g
	*/
	public void setId(int id) {
		_distritoG.setId(id);
	}

	/**
	* Returns the nombre of this distrito g.
	*
	* @return the nombre of this distrito g
	*/
	public java.lang.String getNombre() {
		return _distritoG.getNombre();
	}

	/**
	* Sets the nombre of this distrito g.
	*
	* @param nombre the nombre of this distrito g
	*/
	public void setNombre(java.lang.String nombre) {
		_distritoG.setNombre(nombre);
	}

	/**
	* Returns the nombre_mascara of this distrito g.
	*
	* @return the nombre_mascara of this distrito g
	*/
	public java.lang.String getNombre_mascara() {
		return _distritoG.getNombre_mascara();
	}

	/**
	* Sets the nombre_mascara of this distrito g.
	*
	* @param nombre_mascara the nombre_mascara of this distrito g
	*/
	public void setNombre_mascara(java.lang.String nombre_mascara) {
		_distritoG.setNombre_mascara(nombre_mascara);
	}

	public boolean isNew() {
		return _distritoG.isNew();
	}

	public void setNew(boolean n) {
		_distritoG.setNew(n);
	}

	public boolean isCachedModel() {
		return _distritoG.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_distritoG.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _distritoG.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _distritoG.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_distritoG.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _distritoG.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_distritoG.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new distritoGWrapper((distritoG)_distritoG.clone());
	}

	public int compareTo(distritoG distritoG) {
		return _distritoG.compareTo(distritoG);
	}

	@Override
	public int hashCode() {
		return _distritoG.hashCode();
	}

	public com.liferay.portal.model.CacheModel<distritoG> toCacheModel() {
		return _distritoG.toCacheModel();
	}

	public distritoG toEscapedModel() {
		return new distritoGWrapper(_distritoG.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _distritoG.toString();
	}

	public java.lang.String toXmlString() {
		return _distritoG.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_distritoG.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public distritoG getWrappeddistritoG() {
		return _distritoG;
	}

	public distritoG getWrappedModel() {
		return _distritoG;
	}

	public void resetOriginalValues() {
		_distritoG.resetOriginalValues();
	}

	private distritoG _distritoG;
}