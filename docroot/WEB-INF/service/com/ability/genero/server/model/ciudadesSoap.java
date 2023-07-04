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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ability.genero.server.service.http.ciudadesServiceSoap}.
 *
 * @author    DELL Villartech
 * @see       com.ability.genero.server.service.http.ciudadesServiceSoap
 * @generated
 */
public class ciudadesSoap implements Serializable {
	public static ciudadesSoap toSoapModel(ciudades model) {
		ciudadesSoap soapModel = new ciudadesSoap();

		soapModel.setCodigo(model.getCodigo());
		soapModel.setNombre(model.getNombre());

		return soapModel;
	}

	public static ciudadesSoap[] toSoapModels(ciudades[] models) {
		ciudadesSoap[] soapModels = new ciudadesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ciudadesSoap[][] toSoapModels(ciudades[][] models) {
		ciudadesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ciudadesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ciudadesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ciudadesSoap[] toSoapModels(List<ciudades> models) {
		List<ciudadesSoap> soapModels = new ArrayList<ciudadesSoap>(models.size());

		for (ciudades model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ciudadesSoap[soapModels.size()]);
	}

	public ciudadesSoap() {
	}

	public String getPrimaryKey() {
		return _codigo;
	}

	public void setPrimaryKey(String pk) {
		setCodigo(pk);
	}

	public String getCodigo() {
		return _codigo;
	}

	public void setCodigo(String codigo) {
		_codigo = codigo;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	private String _codigo;
	private String _nombre;
}