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
 * This class is a wrapper for {@link normasInteracionales}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       normasInteracionales
 * @generated
 */
public class normasInteracionalesWrapper implements normasInteracionales,
	ModelWrapper<normasInteracionales> {
	public normasInteracionalesWrapper(
		normasInteracionales normasInteracionales) {
		_normasInteracionales = normasInteracionales;
	}

	public Class<?> getModelClass() {
		return normasInteracionales.class;
	}

	public String getModelClassName() {
		return normasInteracionales.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("conferencias", getConferencias());
		attributes.put("anhio", getAnhio());
		attributes.put("url", getUrl());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String conferencias = (String)attributes.get("conferencias");

		if (conferencias != null) {
			setConferencias(conferencias);
		}

		String anhio = (String)attributes.get("anhio");

		if (anhio != null) {
			setAnhio(anhio);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}
	}

	/**
	* Returns the primary key of this normas interacionales.
	*
	* @return the primary key of this normas interacionales
	*/
	public int getPrimaryKey() {
		return _normasInteracionales.getPrimaryKey();
	}

	/**
	* Sets the primary key of this normas interacionales.
	*
	* @param primaryKey the primary key of this normas interacionales
	*/
	public void setPrimaryKey(int primaryKey) {
		_normasInteracionales.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this normas interacionales.
	*
	* @return the ID of this normas interacionales
	*/
	public int getId() {
		return _normasInteracionales.getId();
	}

	/**
	* Sets the ID of this normas interacionales.
	*
	* @param id the ID of this normas interacionales
	*/
	public void setId(int id) {
		_normasInteracionales.setId(id);
	}

	/**
	* Returns the conferencias of this normas interacionales.
	*
	* @return the conferencias of this normas interacionales
	*/
	public java.lang.String getConferencias() {
		return _normasInteracionales.getConferencias();
	}

	/**
	* Sets the conferencias of this normas interacionales.
	*
	* @param conferencias the conferencias of this normas interacionales
	*/
	public void setConferencias(java.lang.String conferencias) {
		_normasInteracionales.setConferencias(conferencias);
	}

	/**
	* Returns the anhio of this normas interacionales.
	*
	* @return the anhio of this normas interacionales
	*/
	public java.lang.String getAnhio() {
		return _normasInteracionales.getAnhio();
	}

	/**
	* Sets the anhio of this normas interacionales.
	*
	* @param anhio the anhio of this normas interacionales
	*/
	public void setAnhio(java.lang.String anhio) {
		_normasInteracionales.setAnhio(anhio);
	}

	/**
	* Returns the url of this normas interacionales.
	*
	* @return the url of this normas interacionales
	*/
	public java.lang.String getUrl() {
		return _normasInteracionales.getUrl();
	}

	/**
	* Sets the url of this normas interacionales.
	*
	* @param url the url of this normas interacionales
	*/
	public void setUrl(java.lang.String url) {
		_normasInteracionales.setUrl(url);
	}

	public boolean isNew() {
		return _normasInteracionales.isNew();
	}

	public void setNew(boolean n) {
		_normasInteracionales.setNew(n);
	}

	public boolean isCachedModel() {
		return _normasInteracionales.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_normasInteracionales.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _normasInteracionales.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _normasInteracionales.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_normasInteracionales.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _normasInteracionales.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_normasInteracionales.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new normasInteracionalesWrapper((normasInteracionales)_normasInteracionales.clone());
	}

	public int compareTo(
		com.ability.genero.server.model.normasInteracionales normasInteracionales) {
		return _normasInteracionales.compareTo(normasInteracionales);
	}

	@Override
	public int hashCode() {
		return _normasInteracionales.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.normasInteracionales> toCacheModel() {
		return _normasInteracionales.toCacheModel();
	}

	public com.ability.genero.server.model.normasInteracionales toEscapedModel() {
		return new normasInteracionalesWrapper(_normasInteracionales.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _normasInteracionales.toString();
	}

	public java.lang.String toXmlString() {
		return _normasInteracionales.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_normasInteracionales.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public normasInteracionales getWrappednormasInteracionales() {
		return _normasInteracionales;
	}

	public normasInteracionales getWrappedModel() {
		return _normasInteracionales;
	}

	public void resetOriginalValues() {
		_normasInteracionales.resetOriginalValues();
	}

	private normasInteracionales _normasInteracionales;
}