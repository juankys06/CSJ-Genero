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
 * This class is a wrapper for {@link categoria}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       categoria
 * @generated
 */
public class categoriaWrapper implements categoria, ModelWrapper<categoria> {
	public categoriaWrapper(categoria categoria) {
		_categoria = categoria;
	}

	public Class<?> getModelClass() {
		return categoria.class;
	}

	public String getModelClassName() {
		return categoria.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("categoria", getCategoria());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String categoria = (String)attributes.get("categoria");

		if (categoria != null) {
			setCategoria(categoria);
		}
	}

	/**
	* Returns the primary key of this categoria.
	*
	* @return the primary key of this categoria
	*/
	public int getPrimaryKey() {
		return _categoria.getPrimaryKey();
	}

	/**
	* Sets the primary key of this categoria.
	*
	* @param primaryKey the primary key of this categoria
	*/
	public void setPrimaryKey(int primaryKey) {
		_categoria.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this categoria.
	*
	* @return the ID of this categoria
	*/
	public int getId() {
		return _categoria.getId();
	}

	/**
	* Sets the ID of this categoria.
	*
	* @param id the ID of this categoria
	*/
	public void setId(int id) {
		_categoria.setId(id);
	}

	/**
	* Returns the categoria of this categoria.
	*
	* @return the categoria of this categoria
	*/
	public java.lang.String getCategoria() {
		return _categoria.getCategoria();
	}

	/**
	* Sets the categoria of this categoria.
	*
	* @param categoria the categoria of this categoria
	*/
	public void setCategoria(java.lang.String categoria) {
		_categoria.setCategoria(categoria);
	}

	public boolean isNew() {
		return _categoria.isNew();
	}

	public void setNew(boolean n) {
		_categoria.setNew(n);
	}

	public boolean isCachedModel() {
		return _categoria.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_categoria.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _categoria.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _categoria.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_categoria.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _categoria.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_categoria.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new categoriaWrapper((categoria)_categoria.clone());
	}

	public int compareTo(com.ability.genero.server.model.categoria categoria) {
		return _categoria.compareTo(categoria);
	}

	@Override
	public int hashCode() {
		return _categoria.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.categoria> toCacheModel() {
		return _categoria.toCacheModel();
	}

	public com.ability.genero.server.model.categoria toEscapedModel() {
		return new categoriaWrapper(_categoria.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _categoria.toString();
	}

	public java.lang.String toXmlString() {
		return _categoria.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_categoria.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public categoria getWrappedcategoria() {
		return _categoria;
	}

	public categoria getWrappedModel() {
		return _categoria;
	}

	public void resetOriginalValues() {
		_categoria.resetOriginalValues();
	}

	private categoria _categoria;
}