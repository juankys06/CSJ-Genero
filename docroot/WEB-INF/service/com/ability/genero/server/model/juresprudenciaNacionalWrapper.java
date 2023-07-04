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
 * This class is a wrapper for {@link juresprudenciaNacional}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       juresprudenciaNacional
 * @generated
 */
public class juresprudenciaNacionalWrapper implements juresprudenciaNacional,
	ModelWrapper<juresprudenciaNacional> {
	public juresprudenciaNacionalWrapper(
		juresprudenciaNacional juresprudenciaNacional) {
		_juresprudenciaNacional = juresprudenciaNacional;
	}

	public Class<?> getModelClass() {
		return juresprudenciaNacional.class;
	}

	public String getModelClassName() {
		return juresprudenciaNacional.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("referencias", getReferencias());
		attributes.put("corporacion", getCorporacion());
		attributes.put("url", getUrl());
		attributes.put("ambito", getAmbito());

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

		String corporacion = (String)attributes.get("corporacion");

		if (corporacion != null) {
			setCorporacion(corporacion);
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
	* Returns the primary key of this juresprudencia nacional.
	*
	* @return the primary key of this juresprudencia nacional
	*/
	public int getPrimaryKey() {
		return _juresprudenciaNacional.getPrimaryKey();
	}

	/**
	* Sets the primary key of this juresprudencia nacional.
	*
	* @param primaryKey the primary key of this juresprudencia nacional
	*/
	public void setPrimaryKey(int primaryKey) {
		_juresprudenciaNacional.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this juresprudencia nacional.
	*
	* @return the ID of this juresprudencia nacional
	*/
	public int getId() {
		return _juresprudenciaNacional.getId();
	}

	/**
	* Sets the ID of this juresprudencia nacional.
	*
	* @param id the ID of this juresprudencia nacional
	*/
	public void setId(int id) {
		_juresprudenciaNacional.setId(id);
	}

	/**
	* Returns the referencias of this juresprudencia nacional.
	*
	* @return the referencias of this juresprudencia nacional
	*/
	public java.lang.String getReferencias() {
		return _juresprudenciaNacional.getReferencias();
	}

	/**
	* Sets the referencias of this juresprudencia nacional.
	*
	* @param referencias the referencias of this juresprudencia nacional
	*/
	public void setReferencias(java.lang.String referencias) {
		_juresprudenciaNacional.setReferencias(referencias);
	}

	/**
	* Returns the corporacion of this juresprudencia nacional.
	*
	* @return the corporacion of this juresprudencia nacional
	*/
	public java.lang.String getCorporacion() {
		return _juresprudenciaNacional.getCorporacion();
	}

	/**
	* Sets the corporacion of this juresprudencia nacional.
	*
	* @param corporacion the corporacion of this juresprudencia nacional
	*/
	public void setCorporacion(java.lang.String corporacion) {
		_juresprudenciaNacional.setCorporacion(corporacion);
	}

	/**
	* Returns the url of this juresprudencia nacional.
	*
	* @return the url of this juresprudencia nacional
	*/
	public java.lang.String getUrl() {
		return _juresprudenciaNacional.getUrl();
	}

	/**
	* Sets the url of this juresprudencia nacional.
	*
	* @param url the url of this juresprudencia nacional
	*/
	public void setUrl(java.lang.String url) {
		_juresprudenciaNacional.setUrl(url);
	}

	/**
	* Returns the ambito of this juresprudencia nacional.
	*
	* @return the ambito of this juresprudencia nacional
	*/
	public java.lang.String getAmbito() {
		return _juresprudenciaNacional.getAmbito();
	}

	/**
	* Sets the ambito of this juresprudencia nacional.
	*
	* @param ambito the ambito of this juresprudencia nacional
	*/
	public void setAmbito(java.lang.String ambito) {
		_juresprudenciaNacional.setAmbito(ambito);
	}

	public boolean isNew() {
		return _juresprudenciaNacional.isNew();
	}

	public void setNew(boolean n) {
		_juresprudenciaNacional.setNew(n);
	}

	public boolean isCachedModel() {
		return _juresprudenciaNacional.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_juresprudenciaNacional.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _juresprudenciaNacional.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _juresprudenciaNacional.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_juresprudenciaNacional.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _juresprudenciaNacional.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_juresprudenciaNacional.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new juresprudenciaNacionalWrapper((juresprudenciaNacional)_juresprudenciaNacional.clone());
	}

	public int compareTo(
		com.ability.genero.server.model.juresprudenciaNacional juresprudenciaNacional) {
		return _juresprudenciaNacional.compareTo(juresprudenciaNacional);
	}

	@Override
	public int hashCode() {
		return _juresprudenciaNacional.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.juresprudenciaNacional> toCacheModel() {
		return _juresprudenciaNacional.toCacheModel();
	}

	public com.ability.genero.server.model.juresprudenciaNacional toEscapedModel() {
		return new juresprudenciaNacionalWrapper(_juresprudenciaNacional.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _juresprudenciaNacional.toString();
	}

	public java.lang.String toXmlString() {
		return _juresprudenciaNacional.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_juresprudenciaNacional.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public juresprudenciaNacional getWrappedjuresprudenciaNacional() {
		return _juresprudenciaNacional;
	}

	public juresprudenciaNacional getWrappedModel() {
		return _juresprudenciaNacional;
	}

	public void resetOriginalValues() {
		_juresprudenciaNacional.resetOriginalValues();
	}

	private juresprudenciaNacional _juresprudenciaNacional;
}