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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    DELL Villartech
 * @generated
 */
public class auditoriaSoap implements Serializable {
	public static auditoriaSoap toSoapModel(auditoria model) {
		auditoriaSoap soapModel = new auditoriaSoap();

		soapModel.setId(model.getId());
		soapModel.setFecha(model.getFecha());
		soapModel.setEvento(model.getEvento());
		soapModel.setTabla(model.getTabla());
		soapModel.setLogs(model.getLogs());
		soapModel.setIdUser(model.getIdUser());

		return soapModel;
	}

	public static auditoriaSoap[] toSoapModels(auditoria[] models) {
		auditoriaSoap[] soapModels = new auditoriaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static auditoriaSoap[][] toSoapModels(auditoria[][] models) {
		auditoriaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new auditoriaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new auditoriaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static auditoriaSoap[] toSoapModels(List<auditoria> models) {
		List<auditoriaSoap> soapModels = new ArrayList<auditoriaSoap>(models.size());

		for (auditoria model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new auditoriaSoap[soapModels.size()]);
	}

	public auditoriaSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public Date getFecha() {
		return _fecha;
	}

	public void setFecha(Date fecha) {
		_fecha = fecha;
	}

	public String getEvento() {
		return _evento;
	}

	public void setEvento(String evento) {
		_evento = evento;
	}

	public String getTabla() {
		return _tabla;
	}

	public void setTabla(String tabla) {
		_tabla = tabla;
	}

	public String getLogs() {
		return _logs;
	}

	public void setLogs(String logs) {
		_logs = logs;
	}

	public long getIdUser() {
		return _idUser;
	}

	public void setIdUser(long idUser) {
		_idUser = idUser;
	}

	private long _id;
	private Date _fecha;
	private String _evento;
	private String _tabla;
	private String _logs;
	private long _idUser;
}