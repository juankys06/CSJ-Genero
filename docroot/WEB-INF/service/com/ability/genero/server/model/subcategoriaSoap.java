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
public class subcategoriaSoap implements Serializable {
	public static subcategoriaSoap toSoapModel(subcategoria model) {
		subcategoriaSoap soapModel = new subcategoriaSoap();

		soapModel.setId(model.getId());
		soapModel.setIdCategoria(model.getIdCategoria());
		soapModel.setSubcategoria(model.getSubcategoria());
		soapModel.setUrl(model.getUrl());

		return soapModel;
	}

	public static subcategoriaSoap[] toSoapModels(subcategoria[] models) {
		subcategoriaSoap[] soapModels = new subcategoriaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static subcategoriaSoap[][] toSoapModels(subcategoria[][] models) {
		subcategoriaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new subcategoriaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new subcategoriaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static subcategoriaSoap[] toSoapModels(List<subcategoria> models) {
		List<subcategoriaSoap> soapModels = new ArrayList<subcategoriaSoap>(models.size());

		for (subcategoria model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new subcategoriaSoap[soapModels.size()]);
	}

	public subcategoriaSoap() {
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

	public int getIdCategoria() {
		return _idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		_idCategoria = idCategoria;
	}

	public String getSubcategoria() {
		return _subcategoria;
	}

	public void setSubcategoria(String subcategoria) {
		_subcategoria = subcategoria;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	private int _id;
	private int _idCategoria;
	private String _subcategoria;
	private String _url;
}