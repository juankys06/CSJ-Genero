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
public class generoUsuarioSoap implements Serializable {
	public static generoUsuarioSoap toSoapModel(generoUsuario model) {
		generoUsuarioSoap soapModel = new generoUsuarioSoap();

		soapModel.setId(model.getId());
		soapModel.setDespacho(model.getDespacho());
		soapModel.setUserId(model.getUserId());
		soapModel.setFecha_creacion(model.getFecha_creacion());

		return soapModel;
	}

	public static generoUsuarioSoap[] toSoapModels(generoUsuario[] models) {
		generoUsuarioSoap[] soapModels = new generoUsuarioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static generoUsuarioSoap[][] toSoapModels(generoUsuario[][] models) {
		generoUsuarioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new generoUsuarioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new generoUsuarioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static generoUsuarioSoap[] toSoapModels(List<generoUsuario> models) {
		List<generoUsuarioSoap> soapModels = new ArrayList<generoUsuarioSoap>(models.size());

		for (generoUsuario model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new generoUsuarioSoap[soapModels.size()]);
	}

	public generoUsuarioSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getDespacho() {
		return _despacho;
	}

	public void setDespacho(String despacho) {
		_despacho = despacho;
	}

	public String getUserId() {
		return _userId;
	}

	public void setUserId(String userId) {
		_userId = userId;
	}

	public Date getFecha_creacion() {
		return _fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		_fecha_creacion = fecha_creacion;
	}

	private int _id;
	private String _despacho;
	private String _userId;
	private Date _fecha_creacion;
}