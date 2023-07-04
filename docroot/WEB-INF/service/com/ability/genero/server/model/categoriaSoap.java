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
public class categoriaSoap implements Serializable {
	public static categoriaSoap toSoapModel(categoria model) {
		categoriaSoap soapModel = new categoriaSoap();

		soapModel.setId(model.getId());
		soapModel.setCategoria(model.getCategoria());

		return soapModel;
	}

	public static categoriaSoap[] toSoapModels(categoria[] models) {
		categoriaSoap[] soapModels = new categoriaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static categoriaSoap[][] toSoapModels(categoria[][] models) {
		categoriaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new categoriaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new categoriaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static categoriaSoap[] toSoapModels(List<categoria> models) {
		List<categoriaSoap> soapModels = new ArrayList<categoriaSoap>(models.size());

		for (categoria model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new categoriaSoap[soapModels.size()]);
	}

	public categoriaSoap() {
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

	public String getCategoria() {
		return _categoria;
	}

	public void setCategoria(String categoria) {
		_categoria = categoria;
	}

	private int _id;
	private String _categoria;
}