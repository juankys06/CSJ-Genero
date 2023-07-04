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
public class encuestaEnfoDifeSoap implements Serializable {
	public static encuestaEnfoDifeSoap toSoapModel(encuestaEnfoDife model) {
		encuestaEnfoDifeSoap soapModel = new encuestaEnfoDifeSoap();

		soapModel.setId(model.getId());
		soapModel.setPregunta(model.getPregunta());

		return soapModel;
	}

	public static encuestaEnfoDifeSoap[] toSoapModels(encuestaEnfoDife[] models) {
		encuestaEnfoDifeSoap[] soapModels = new encuestaEnfoDifeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static encuestaEnfoDifeSoap[][] toSoapModels(
		encuestaEnfoDife[][] models) {
		encuestaEnfoDifeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new encuestaEnfoDifeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new encuestaEnfoDifeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static encuestaEnfoDifeSoap[] toSoapModels(
		List<encuestaEnfoDife> models) {
		List<encuestaEnfoDifeSoap> soapModels = new ArrayList<encuestaEnfoDifeSoap>(models.size());

		for (encuestaEnfoDife model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new encuestaEnfoDifeSoap[soapModels.size()]);
	}

	public encuestaEnfoDifeSoap() {
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

	public String getPregunta() {
		return _pregunta;
	}

	public void setPregunta(String pregunta) {
		_pregunta = pregunta;
	}

	private int _id;
	private String _pregunta;
}