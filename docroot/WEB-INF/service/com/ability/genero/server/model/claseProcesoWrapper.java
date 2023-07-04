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
 * This class is a wrapper for {@link claseProceso}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       claseProceso
 * @generated
 */
public class claseProcesoWrapper implements claseProceso,
	ModelWrapper<claseProceso> {
	public claseProcesoWrapper(claseProceso claseProceso) {
		_claseProceso = claseProceso;
	}

	public Class<?> getModelClass() {
		return claseProceso.class;
	}

	public String getModelClassName() {
		return claseProceso.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("claseProceso", getClaseProceso());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String claseProceso = (String)attributes.get("claseProceso");

		if (claseProceso != null) {
			setClaseProceso(claseProceso);
		}
	}

	/**
	* Returns the primary key of this clase proceso.
	*
	* @return the primary key of this clase proceso
	*/
	public int getPrimaryKey() {
		return _claseProceso.getPrimaryKey();
	}

	/**
	* Sets the primary key of this clase proceso.
	*
	* @param primaryKey the primary key of this clase proceso
	*/
	public void setPrimaryKey(int primaryKey) {
		_claseProceso.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this clase proceso.
	*
	* @return the ID of this clase proceso
	*/
	public int getId() {
		return _claseProceso.getId();
	}

	/**
	* Sets the ID of this clase proceso.
	*
	* @param id the ID of this clase proceso
	*/
	public void setId(int id) {
		_claseProceso.setId(id);
	}

	/**
	* Returns the clase proceso of this clase proceso.
	*
	* @return the clase proceso of this clase proceso
	*/
	public java.lang.String getClaseProceso() {
		return _claseProceso.getClaseProceso();
	}

	/**
	* Sets the clase proceso of this clase proceso.
	*
	* @param claseProceso the clase proceso of this clase proceso
	*/
	public void setClaseProceso(java.lang.String claseProceso) {
		_claseProceso.setClaseProceso(claseProceso);
	}

	public boolean isNew() {
		return _claseProceso.isNew();
	}

	public void setNew(boolean n) {
		_claseProceso.setNew(n);
	}

	public boolean isCachedModel() {
		return _claseProceso.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_claseProceso.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _claseProceso.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _claseProceso.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_claseProceso.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _claseProceso.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_claseProceso.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new claseProcesoWrapper((claseProceso)_claseProceso.clone());
	}

	public int compareTo(
		com.ability.genero.server.model.claseProceso claseProceso) {
		return _claseProceso.compareTo(claseProceso);
	}

	@Override
	public int hashCode() {
		return _claseProceso.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.claseProceso> toCacheModel() {
		return _claseProceso.toCacheModel();
	}

	public com.ability.genero.server.model.claseProceso toEscapedModel() {
		return new claseProcesoWrapper(_claseProceso.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _claseProceso.toString();
	}

	public java.lang.String toXmlString() {
		return _claseProceso.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_claseProceso.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public claseProceso getWrappedclaseProceso() {
		return _claseProceso;
	}

	public claseProceso getWrappedModel() {
		return _claseProceso;
	}

	public void resetOriginalValues() {
		_claseProceso.resetOriginalValues();
	}

	private claseProceso _claseProceso;
}