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
 * This class is a wrapper for {@link subcategoria}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       subcategoria
 * @generated
 */
public class subcategoriaWrapper implements subcategoria,
	ModelWrapper<subcategoria> {
	public subcategoriaWrapper(subcategoria subcategoria) {
		_subcategoria = subcategoria;
	}

	public Class<?> getModelClass() {
		return subcategoria.class;
	}

	public String getModelClassName() {
		return subcategoria.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("idCategoria", getIdCategoria());
		attributes.put("subcategoria", getSubcategoria());
		attributes.put("url", getUrl());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer idCategoria = (Integer)attributes.get("idCategoria");

		if (idCategoria != null) {
			setIdCategoria(idCategoria);
		}

		String subcategoria = (String)attributes.get("subcategoria");

		if (subcategoria != null) {
			setSubcategoria(subcategoria);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}
	}

	/**
	* Returns the primary key of this subcategoria.
	*
	* @return the primary key of this subcategoria
	*/
	public int getPrimaryKey() {
		return _subcategoria.getPrimaryKey();
	}

	/**
	* Sets the primary key of this subcategoria.
	*
	* @param primaryKey the primary key of this subcategoria
	*/
	public void setPrimaryKey(int primaryKey) {
		_subcategoria.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this subcategoria.
	*
	* @return the ID of this subcategoria
	*/
	public int getId() {
		return _subcategoria.getId();
	}

	/**
	* Sets the ID of this subcategoria.
	*
	* @param id the ID of this subcategoria
	*/
	public void setId(int id) {
		_subcategoria.setId(id);
	}

	/**
	* Returns the id categoria of this subcategoria.
	*
	* @return the id categoria of this subcategoria
	*/
	public int getIdCategoria() {
		return _subcategoria.getIdCategoria();
	}

	/**
	* Sets the id categoria of this subcategoria.
	*
	* @param idCategoria the id categoria of this subcategoria
	*/
	public void setIdCategoria(int idCategoria) {
		_subcategoria.setIdCategoria(idCategoria);
	}

	/**
	* Returns the subcategoria of this subcategoria.
	*
	* @return the subcategoria of this subcategoria
	*/
	public java.lang.String getSubcategoria() {
		return _subcategoria.getSubcategoria();
	}

	/**
	* Sets the subcategoria of this subcategoria.
	*
	* @param subcategoria the subcategoria of this subcategoria
	*/
	public void setSubcategoria(java.lang.String subcategoria) {
		_subcategoria.setSubcategoria(subcategoria);
	}

	/**
	* Returns the url of this subcategoria.
	*
	* @return the url of this subcategoria
	*/
	public java.lang.String getUrl() {
		return _subcategoria.getUrl();
	}

	/**
	* Sets the url of this subcategoria.
	*
	* @param url the url of this subcategoria
	*/
	public void setUrl(java.lang.String url) {
		_subcategoria.setUrl(url);
	}

	public boolean isNew() {
		return _subcategoria.isNew();
	}

	public void setNew(boolean n) {
		_subcategoria.setNew(n);
	}

	public boolean isCachedModel() {
		return _subcategoria.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_subcategoria.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _subcategoria.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _subcategoria.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_subcategoria.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _subcategoria.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_subcategoria.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new subcategoriaWrapper((subcategoria)_subcategoria.clone());
	}

	public int compareTo(
		com.ability.genero.server.model.subcategoria subcategoria) {
		return _subcategoria.compareTo(subcategoria);
	}

	@Override
	public int hashCode() {
		return _subcategoria.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.subcategoria> toCacheModel() {
		return _subcategoria.toCacheModel();
	}

	public com.ability.genero.server.model.subcategoria toEscapedModel() {
		return new subcategoriaWrapper(_subcategoria.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _subcategoria.toString();
	}

	public java.lang.String toXmlString() {
		return _subcategoria.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_subcategoria.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public subcategoria getWrappedsubcategoria() {
		return _subcategoria;
	}

	public subcategoria getWrappedModel() {
		return _subcategoria;
	}

	public void resetOriginalValues() {
		_subcategoria.resetOriginalValues();
	}

	private subcategoria _subcategoria;
}