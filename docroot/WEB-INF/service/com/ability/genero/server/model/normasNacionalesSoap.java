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
public class normasNacionalesSoap implements Serializable {
	public static normasNacionalesSoap toSoapModel(normasNacionales model) {
		normasNacionalesSoap soapModel = new normasNacionalesSoap();

		soapModel.setId(model.getId());
		soapModel.setNormativas(model.getNormativas());
		soapModel.setAnhio(model.getAnhio());
		soapModel.setUrl(model.getUrl());
		soapModel.setAmbito(model.getAmbito());

		return soapModel;
	}

	public static normasNacionalesSoap[] toSoapModels(normasNacionales[] models) {
		normasNacionalesSoap[] soapModels = new normasNacionalesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static normasNacionalesSoap[][] toSoapModels(
		normasNacionales[][] models) {
		normasNacionalesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new normasNacionalesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new normasNacionalesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static normasNacionalesSoap[] toSoapModels(
		List<normasNacionales> models) {
		List<normasNacionalesSoap> soapModels = new ArrayList<normasNacionalesSoap>(models.size());

		for (normasNacionales model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new normasNacionalesSoap[soapModels.size()]);
	}

	public normasNacionalesSoap() {
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

	public String getNormativas() {
		return _normativas;
	}

	public void setNormativas(String normativas) {
		_normativas = normativas;
	}

	public String getAnhio() {
		return _anhio;
	}

	public void setAnhio(String anhio) {
		_anhio = anhio;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public String getAmbito() {
		return _ambito;
	}

	public void setAmbito(String ambito) {
		_ambito = ambito;
	}

	private int _id;
	private String _normativas;
	private String _anhio;
	private String _url;
	private String _ambito;
}