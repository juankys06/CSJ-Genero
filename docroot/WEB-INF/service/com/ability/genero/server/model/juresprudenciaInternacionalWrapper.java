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
 * This class is a wrapper for {@link juresprudenciaInternacional}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       juresprudenciaInternacional
 * @generated
 */
public class juresprudenciaInternacionalWrapper
	implements juresprudenciaInternacional,
		ModelWrapper<juresprudenciaInternacional> {
	public juresprudenciaInternacionalWrapper(
		juresprudenciaInternacional juresprudenciaInternacional) {
		_juresprudenciaInternacional = juresprudenciaInternacional;
	}

	public Class<?> getModelClass() {
		return juresprudenciaInternacional.class;
	}

	public String getModelClassName() {
		return juresprudenciaInternacional.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("referencias", getReferencias());
		attributes.put("anhio", getAnhio());
		attributes.put("url", getUrl());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String referencias = (String)attributes.get("referencias");

		if (referencias != null) {
			setReferencias(referencias);
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
	* Returns the primary key of this juresprudencia internacional.
	*
	* @return the primary key of this juresprudencia internacional
	*/
	public int getPrimaryKey() {
		return _juresprudenciaInternacional.getPrimaryKey();
	}

	/**
	* Sets the primary key of this juresprudencia internacional.
	*
	* @param primaryKey the primary key of this juresprudencia internacional
	*/
	public void setPrimaryKey(int primaryKey) {
		_juresprudenciaInternacional.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this juresprudencia internacional.
	*
	* @return the ID of this juresprudencia internacional
	*/
	public int getId() {
		return _juresprudenciaInternacional.getId();
	}

	/**
	* Sets the ID of this juresprudencia internacional.
	*
	* @param id the ID of this juresprudencia internacional
	*/
	public void setId(int id) {
		_juresprudenciaInternacional.setId(id);
	}

	/**
	* Returns the referencias of this juresprudencia internacional.
	*
	* @return the referencias of this juresprudencia internacional
	*/
	public java.lang.String getReferencias() {
		return _juresprudenciaInternacional.getReferencias();
	}

	/**
	* Sets the referencias of this juresprudencia internacional.
	*
	* @param referencias the referencias of this juresprudencia internacional
	*/
	public void setReferencias(java.lang.String referencias) {
		_juresprudenciaInternacional.setReferencias(referencias);
	}

	/**
	* Returns the anhio of this juresprudencia internacional.
	*
	* @return the anhio of this juresprudencia internacional
	*/
	public java.lang.String getAnhio() {
		return _juresprudenciaInternacional.getAnhio();
	}

	/**
	* Sets the anhio of this juresprudencia internacional.
	*
	* @param anhio the anhio of this juresprudencia internacional
	*/
	public void setAnhio(java.lang.String anhio) {
		_juresprudenciaInternacional.setAnhio(anhio);
	}

	/**
	* Returns the url of this juresprudencia internacional.
	*
	* @return the url of this juresprudencia internacional
	*/
	public java.lang.String getUrl() {
		return _juresprudenciaInternacional.getUrl();
	}

	/**
	* Sets the url of this juresprudencia internacional.
	*
	* @param url the url of this juresprudencia internacional
	*/
	public void setUrl(java.lang.String url) {
		_juresprudenciaInternacional.setUrl(url);
	}

	public boolean isNew() {
		return _juresprudenciaInternacional.isNew();
	}

	public void setNew(boolean n) {
		_juresprudenciaInternacional.setNew(n);
	}

	public boolean isCachedModel() {
		return _juresprudenciaInternacional.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_juresprudenciaInternacional.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _juresprudenciaInternacional.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _juresprudenciaInternacional.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_juresprudenciaInternacional.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _juresprudenciaInternacional.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_juresprudenciaInternacional.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new juresprudenciaInternacionalWrapper((juresprudenciaInternacional)_juresprudenciaInternacional.clone());
	}

	public int compareTo(
		com.ability.genero.server.model.juresprudenciaInternacional juresprudenciaInternacional) {
		return _juresprudenciaInternacional.compareTo(juresprudenciaInternacional);
	}

	@Override
	public int hashCode() {
		return _juresprudenciaInternacional.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.juresprudenciaInternacional> toCacheModel() {
		return _juresprudenciaInternacional.toCacheModel();
	}

	public com.ability.genero.server.model.juresprudenciaInternacional toEscapedModel() {
		return new juresprudenciaInternacionalWrapper(_juresprudenciaInternacional.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _juresprudenciaInternacional.toString();
	}

	public java.lang.String toXmlString() {
		return _juresprudenciaInternacional.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_juresprudenciaInternacional.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public juresprudenciaInternacional getWrappedjuresprudenciaInternacional() {
		return _juresprudenciaInternacional;
	}

	public juresprudenciaInternacional getWrappedModel() {
		return _juresprudenciaInternacional;
	}

	public void resetOriginalValues() {
		_juresprudenciaInternacional.resetOriginalValues();
	}

	private juresprudenciaInternacional _juresprudenciaInternacional;
}