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
 * This class is used by SOAP remote services.
 *
 * @author    DELL Villartech
 * @generated
 */
public class distritoGSoap implements Serializable {
	public static distritoGSoap toSoapModel(distritoG model) {
		distritoGSoap soapModel = new distritoGSoap();

		soapModel.setId(model.getId());
		soapModel.setNombre(model.getNombre());
		soapModel.setNombre_mascara(model.getNombre_mascara());

		return soapModel;
	}

	public static distritoGSoap[] toSoapModels(distritoG[] models) {
		distritoGSoap[] soapModels = new distritoGSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static distritoGSoap[][] toSoapModels(distritoG[][] models) {
		distritoGSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new distritoGSoap[models.length][models[0].length];
		}
		else {
			soapModels = new distritoGSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static distritoGSoap[] toSoapModels(List<distritoG> models) {
		List<distritoGSoap> soapModels = new ArrayList<distritoGSoap>(models.size());

		for (distritoG model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new distritoGSoap[soapModels.size()]);
	}

	public distritoGSoap() {
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

	public String getNombre_mascara() {
		return _nombre_mascara;
	}

	public void setNombre_mascara(String nombre_mascara) {
		_nombre_mascara = nombre_mascara;
	}

	private int _id;
	private String _nombre;
	private String _nombre_mascara;
}