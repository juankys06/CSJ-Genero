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
public class juresprudenciaNacionalSoap implements Serializable {
	public static juresprudenciaNacionalSoap toSoapModel(
		juresprudenciaNacional model) {
		juresprudenciaNacionalSoap soapModel = new juresprudenciaNacionalSoap();

		soapModel.setId(model.getId());
		soapModel.setReferencias(model.getReferencias());
		soapModel.setCorporacion(model.getCorporacion());
		soapModel.setUrl(model.getUrl());
		soapModel.setAmbito(model.getAmbito());

		return soapModel;
	}

	public static juresprudenciaNacionalSoap[] toSoapModels(
		juresprudenciaNacional[] models) {
		juresprudenciaNacionalSoap[] soapModels = new juresprudenciaNacionalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static juresprudenciaNacionalSoap[][] toSoapModels(
		juresprudenciaNacional[][] models) {
		juresprudenciaNacionalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new juresprudenciaNacionalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new juresprudenciaNacionalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static juresprudenciaNacionalSoap[] toSoapModels(
		List<juresprudenciaNacional> models) {
		List<juresprudenciaNacionalSoap> soapModels = new ArrayList<juresprudenciaNacionalSoap>(models.size());

		for (juresprudenciaNacional model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new juresprudenciaNacionalSoap[soapModels.size()]);
	}

	public juresprudenciaNacionalSoap() {
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

	public String getReferencias() {
		return _referencias;
	}

	public void setReferencias(String referencias) {
		_referencias = referencias;
	}

	public String getCorporacion() {
		return _corporacion;
	}

	public void setCorporacion(String corporacion) {
		_corporacion = corporacion;
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
	private String _referencias;
	private String _corporacion;
	private String _url;
	private String _ambito;
}