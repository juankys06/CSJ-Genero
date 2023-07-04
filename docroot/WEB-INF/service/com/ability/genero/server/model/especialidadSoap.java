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
 * This class is used by SOAP remote services, specifically {@link com.ability.genero.server.service.http.especialidadServiceSoap}.
 *
 * @author    DELL Villartech
 * @see       com.ability.genero.server.service.http.especialidadServiceSoap
 * @generated
 */
public class especialidadSoap implements Serializable {
	public static especialidadSoap toSoapModel(especialidad model) {
		especialidadSoap soapModel = new especialidadSoap();

		soapModel.setId(model.getId());
		soapModel.setNombre(model.getNombre());

		return soapModel;
	}

	public static especialidadSoap[] toSoapModels(especialidad[] models) {
		especialidadSoap[] soapModels = new especialidadSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static especialidadSoap[][] toSoapModels(especialidad[][] models) {
		especialidadSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new especialidadSoap[models.length][models[0].length];
		}
		else {
			soapModels = new especialidadSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static especialidadSoap[] toSoapModels(List<especialidad> models) {
		List<especialidadSoap> soapModels = new ArrayList<especialidadSoap>(models.size());

		for (especialidad model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new especialidadSoap[soapModels.size()]);
	}

	public especialidadSoap() {
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

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	private int _id;
	private String _nombre;
}