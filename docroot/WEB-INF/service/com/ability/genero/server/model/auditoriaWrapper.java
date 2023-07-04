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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link auditoria}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       auditoria
 * @generated
 */
public class auditoriaWrapper implements auditoria, ModelWrapper<auditoria> {
	public auditoriaWrapper(auditoria auditoria) {
		_auditoria = auditoria;
	}

	public Class<?> getModelClass() {
		return auditoria.class;
	}

	public String getModelClassName() {
		return auditoria.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("fecha", getFecha());
		attributes.put("evento", getEvento());
		attributes.put("tabla", getTabla());
		attributes.put("logs", getLogs());
		attributes.put("idUser", getIdUser());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Date fecha = (Date)attributes.get("fecha");

		if (fecha != null) {
			setFecha(fecha);
		}

		String evento = (String)attributes.get("evento");

		if (evento != null) {
			setEvento(evento);
		}

		String tabla = (String)attributes.get("tabla");

		if (tabla != null) {
			setTabla(tabla);
		}

		String logs = (String)attributes.get("logs");

		if (logs != null) {
			setLogs(logs);
		}

		Long idUser = (Long)attributes.get("idUser");

		if (idUser != null) {
			setIdUser(idUser);
		}
	}

	/**
	* Returns the primary key of this auditoria.
	*
	* @return the primary key of this auditoria
	*/
	public long getPrimaryKey() {
		return _auditoria.getPrimaryKey();
	}

	/**
	* Sets the primary key of this auditoria.
	*
	* @param primaryKey the primary key of this auditoria
	*/
	public void setPrimaryKey(long primaryKey) {
		_auditoria.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this auditoria.
	*
	* @return the ID of this auditoria
	*/
	public long getId() {
		return _auditoria.getId();
	}

	/**
	* Sets the ID of this auditoria.
	*
	* @param id the ID of this auditoria
	*/
	public void setId(long id) {
		_auditoria.setId(id);
	}

	/**
	* Returns the fecha of this auditoria.
	*
	* @return the fecha of this auditoria
	*/
	public java.util.Date getFecha() {
		return _auditoria.getFecha();
	}

	/**
	* Sets the fecha of this auditoria.
	*
	* @param fecha the fecha of this auditoria
	*/
	public void setFecha(java.util.Date fecha) {
		_auditoria.setFecha(fecha);
	}

	/**
	* Returns the evento of this auditoria.
	*
	* @return the evento of this auditoria
	*/
	public java.lang.String getEvento() {
		return _auditoria.getEvento();
	}

	/**
	* Sets the evento of this auditoria.
	*
	* @param evento the evento of this auditoria
	*/
	public void setEvento(java.lang.String evento) {
		_auditoria.setEvento(evento);
	}

	/**
	* Returns the tabla of this auditoria.
	*
	* @return the tabla of this auditoria
	*/
	public java.lang.String getTabla() {
		return _auditoria.getTabla();
	}

	/**
	* Sets the tabla of this auditoria.
	*
	* @param tabla the tabla of this auditoria
	*/
	public void setTabla(java.lang.String tabla) {
		_auditoria.setTabla(tabla);
	}

	/**
	* Returns the logs of this auditoria.
	*
	* @return the logs of this auditoria
	*/
	public java.lang.String getLogs() {
		return _auditoria.getLogs();
	}

	/**
	* Sets the logs of this auditoria.
	*
	* @param logs the logs of this auditoria
	*/
	public void setLogs(java.lang.String logs) {
		_auditoria.setLogs(logs);
	}

	/**
	* Returns the id user of this auditoria.
	*
	* @return the id user of this auditoria
	*/
	public long getIdUser() {
		return _auditoria.getIdUser();
	}

	/**
	* Sets the id user of this auditoria.
	*
	* @param idUser the id user of this auditoria
	*/
	public void setIdUser(long idUser) {
		_auditoria.setIdUser(idUser);
	}

	public boolean isNew() {
		return _auditoria.isNew();
	}

	public void setNew(boolean n) {
		_auditoria.setNew(n);
	}

	public boolean isCachedModel() {
		return _auditoria.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_auditoria.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _auditoria.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _auditoria.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_auditoria.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _auditoria.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_auditoria.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new auditoriaWrapper((auditoria)_auditoria.clone());
	}

	public int compareTo(com.ability.genero.server.model.auditoria auditoria) {
		return _auditoria.compareTo(auditoria);
	}

	@Override
	public int hashCode() {
		return _auditoria.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.auditoria> toCacheModel() {
		return _auditoria.toCacheModel();
	}

	public com.ability.genero.server.model.auditoria toEscapedModel() {
		return new auditoriaWrapper(_auditoria.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _auditoria.toString();
	}

	public java.lang.String toXmlString() {
		return _auditoria.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_auditoria.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public auditoria getWrappedauditoria() {
		return _auditoria;
	}

	public auditoria getWrappedModel() {
		return _auditoria;
	}

	public void resetOriginalValues() {
		_auditoria.resetOriginalValues();
	}

	private auditoria _auditoria;
}