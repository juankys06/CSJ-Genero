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
 * This class is a wrapper for {@link tipoDecision}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       tipoDecision
 * @generated
 */
public class tipoDecisionWrapper implements tipoDecision,
	ModelWrapper<tipoDecision> {
	public tipoDecisionWrapper(tipoDecision tipoDecision) {
		_tipoDecision = tipoDecision;
	}

	public Class<?> getModelClass() {
		return tipoDecision.class;
	}

	public String getModelClassName() {
		return tipoDecision.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tipoDecision", getTipoDecision());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String tipoDecision = (String)attributes.get("tipoDecision");

		if (tipoDecision != null) {
			setTipoDecision(tipoDecision);
		}
	}

	/**
	* Returns the primary key of this tipo decision.
	*
	* @return the primary key of this tipo decision
	*/
	public int getPrimaryKey() {
		return _tipoDecision.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tipo decision.
	*
	* @param primaryKey the primary key of this tipo decision
	*/
	public void setPrimaryKey(int primaryKey) {
		_tipoDecision.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this tipo decision.
	*
	* @return the ID of this tipo decision
	*/
	public int getId() {
		return _tipoDecision.getId();
	}

	/**
	* Sets the ID of this tipo decision.
	*
	* @param id the ID of this tipo decision
	*/
	public void setId(int id) {
		_tipoDecision.setId(id);
	}

	/**
	* Returns the tipo decision of this tipo decision.
	*
	* @return the tipo decision of this tipo decision
	*/
	public java.lang.String getTipoDecision() {
		return _tipoDecision.getTipoDecision();
	}

	/**
	* Sets the tipo decision of this tipo decision.
	*
	* @param tipoDecision the tipo decision of this tipo decision
	*/
	public void setTipoDecision(java.lang.String tipoDecision) {
		_tipoDecision.setTipoDecision(tipoDecision);
	}

	public boolean isNew() {
		return _tipoDecision.isNew();
	}

	public void setNew(boolean n) {
		_tipoDecision.setNew(n);
	}

	public boolean isCachedModel() {
		return _tipoDecision.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tipoDecision.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tipoDecision.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tipoDecision.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tipoDecision.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tipoDecision.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tipoDecision.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new tipoDecisionWrapper((tipoDecision)_tipoDecision.clone());
	}

	public int compareTo(
		com.ability.genero.server.model.tipoDecision tipoDecision) {
		return _tipoDecision.compareTo(tipoDecision);
	}

	@Override
	public int hashCode() {
		return _tipoDecision.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.tipoDecision> toCacheModel() {
		return _tipoDecision.toCacheModel();
	}

	public com.ability.genero.server.model.tipoDecision toEscapedModel() {
		return new tipoDecisionWrapper(_tipoDecision.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tipoDecision.toString();
	}

	public java.lang.String toXmlString() {
		return _tipoDecision.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tipoDecision.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public tipoDecision getWrappedtipoDecision() {
		return _tipoDecision;
	}

	public tipoDecision getWrappedModel() {
		return _tipoDecision;
	}

	public void resetOriginalValues() {
		_tipoDecision.resetOriginalValues();
	}

	private tipoDecision _tipoDecision;
}