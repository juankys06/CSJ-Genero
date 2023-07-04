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
 * This class is a wrapper for {@link normasNacionales}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       normasNacionales
 * @generated
 */
public class normasNacionalesWrapper implements normasNacionales,
	ModelWrapper<normasNacionales> {
	public normasNacionalesWrapper(normasNacionales normasNacionales) {
		_normasNacionales = normasNacionales;
	}

	public Class<?> getModelClass() {
		return normasNacionales.class;
	}

	public String getModelClassName() {
		return normasNacionales.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("normativas", getNormativas());
		attributes.put("anhio", getAnhio());
		attributes.put("url", getUrl());
		attributes.put("ambito", getAmbito());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String normativas = (String)attributes.get("normativas");

		if (normativas != null) {
			setNormativas(normativas);
		}

		String anhio = (String)attributes.get("anhio");

		if (anhio != null) {
			setAnhio(anhio);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String ambito = (String)attributes.get("ambito");

		if (ambito != null) {
			setAmbito(ambito);
		}
	}

	/**
	* Returns the primary key of this normas nacionales.
	*
	* @return the primary key of this normas nacionales
	*/
	public int getPrimaryKey() {
		return _normasNacionales.getPrimaryKey();
	}

	/**
	* Sets the primary key of this normas nacionales.
	*
	* @param primaryKey the primary key of this normas nacionales
	*/
	public void setPrimaryKey(int primaryKey) {
		_normasNacionales.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this normas nacionales.
	*
	* @return the ID of this normas nacionales
	*/
	public int getId() {
		return _normasNacionales.getId();
	}

	/**
	* Sets the ID of this normas nacionales.
	*
	* @param id the ID of this normas nacionales
	*/
	public void setId(int id) {
		_normasNacionales.setId(id);
	}

	/**
	* Returns the normativas of this normas nacionales.
	*
	* @return the normativas of this normas nacionales
	*/
	public java.lang.String getNormativas() {
		return _normasNacionales.getNormativas();
	}

	/**
	* Sets the normativas of this normas nacionales.
	*
	* @param normativas the normativas of this normas nacionales
	*/
	public void setNormativas(java.lang.String normativas) {
		_normasNacionales.setNormativas(normativas);
	}

	/**
	* Returns the anhio of this normas nacionales.
	*
	* @return the anhio of this normas nacionales
	*/
	public java.lang.String getAnhio() {
		return _normasNacionales.getAnhio();
	}

	/**
	* Sets the anhio of this normas nacionales.
	*
	* @param anhio the anhio of this normas nacionales
	*/
	public void setAnhio(java.lang.String anhio) {
		_normasNacionales.setAnhio(anhio);
	}

	/**
	* Returns the url of this normas nacionales.
	*
	* @return the url of this normas nacionales
	*/
	public java.lang.String getUrl() {
		return _normasNacionales.getUrl();
	}

	/**
	* Sets the url of this normas nacionales.
	*
	* @param url the url of this normas nacionales
	*/
	public void setUrl(java.lang.String url) {
		_normasNacionales.setUrl(url);
	}

	/**
	* Returns the ambito of this normas nacionales.
	*
	* @return the ambito of this normas nacionales
	*/
	public java.lang.String getAmbito() {
		return _normasNacionales.getAmbito();
	}

	/**
	* Sets the ambito of this normas nacionales.
	*
	* @param ambito the ambito of this normas nacionales
	*/
	public void setAmbito(java.lang.String ambito) {
		_normasNacionales.setAmbito(ambito);
	}

	public boolean isNew() {
		return _normasNacionales.isNew();
	}

	public void setNew(boolean n) {
		_normasNacionales.setNew(n);
	}

	public boolean isCachedModel() {
		return _normasNacionales.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_normasNacionales.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _normasNacionales.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _normasNacionales.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_normasNacionales.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _normasNacionales.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_normasNacionales.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new normasNacionalesWrapper((normasNacionales)_normasNacionales.clone());
	}

	public int compareTo(
		com.ability.genero.server.model.normasNacionales normasNacionales) {
		return _normasNacionales.compareTo(normasNacionales);
	}

	@Override
	public int hashCode() {
		return _normasNacionales.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.normasNacionales> toCacheModel() {
		return _normasNacionales.toCacheModel();
	}

	public com.ability.genero.server.model.normasNacionales toEscapedModel() {
		return new normasNacionalesWrapper(_normasNacionales.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _normasNacionales.toString();
	}

	public java.lang.String toXmlString() {
		return _normasNacionales.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_normasNacionales.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public normasNacionales getWrappednormasNacionales() {
		return _normasNacionales;
	}

	public normasNacionales getWrappedModel() {
		return _normasNacionales;
	}

	public void resetOriginalValues() {
		_normasNacionales.resetOriginalValues();
	}

	private normasNacionales _normasNacionales;
}