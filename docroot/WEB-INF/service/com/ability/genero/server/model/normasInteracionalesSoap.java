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
public class normasInteracionalesSoap implements Serializable {
	public static normasInteracionalesSoap toSoapModel(
		normasInteracionales model) {
		normasInteracionalesSoap soapModel = new normasInteracionalesSoap();

		soapModel.setId(model.getId());
		soapModel.setConferencias(model.getConferencias());
		soapModel.setAnhio(model.getAnhio());
		soapModel.setUrl(model.getUrl());

		return soapModel;
	}

	public static normasInteracionalesSoap[] toSoapModels(
		normasInteracionales[] models) {
		normasInteracionalesSoap[] soapModels = new normasInteracionalesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static normasInteracionalesSoap[][] toSoapModels(
		normasInteracionales[][] models) {
		normasInteracionalesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new normasInteracionalesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new normasInteracionalesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static normasInteracionalesSoap[] toSoapModels(
		List<normasInteracionales> models) {
		List<normasInteracionalesSoap> soapModels = new ArrayList<normasInteracionalesSoap>(models.size());

		for (normasInteracionales model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new normasInteracionalesSoap[soapModels.size()]);
	}

	public normasInteracionalesSoap() {
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

	public String getConferencias() {
		return _conferencias;
	}

	public void setConferencias(String conferencias) {
		_conferencias = conferencias;
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

	private int _id;
	private String _conferencias;
	private String _anhio;
	private String _url;
}