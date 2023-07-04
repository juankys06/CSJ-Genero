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
 * This class is used by SOAP remote services, specifically {@link com.ability.genero.server.service.http.despachoServiceSoap}.
 *
 * @author    DELL Villartech
 * @see       com.ability.genero.server.service.http.despachoServiceSoap
 * @generated
 */
public class despachoSoap implements Serializable {
	public static despachoSoap toSoapModel(despacho model) {
		despachoSoap soapModel = new despachoSoap();

		soapModel.setId(model.getId());
		soapModel.setJurisdiccion(model.getJurisdiccion());
		soapModel.setDistrito(model.getDistrito());
		soapModel.setCircuito(model.getCircuito());
		soapModel.setMunicipio(model.getMunicipio());
		soapModel.setCodigoDespacho(model.getCodigoDespacho());
		soapModel.setNombre(model.getNombre());
		soapModel.setJuesDespacho(model.getJuesDespacho());
		soapModel.setCorreo(model.getCorreo());
		soapModel.setDireccion(model.getDireccion());
		soapModel.setTelefono(model.getTelefono());
		soapModel.setHorario(model.getHorario());
		soapModel.setArea(model.getArea());
		soapModel.setDepartamento(model.getDepartamento());

		return soapModel;
	}

	public static despachoSoap[] toSoapModels(despacho[] models) {
		despachoSoap[] soapModels = new despachoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static despachoSoap[][] toSoapModels(despacho[][] models) {
		despachoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new despachoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new despachoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static despachoSoap[] toSoapModels(List<despacho> models) {
		List<despachoSoap> soapModels = new ArrayList<despachoSoap>(models.size());

		for (despacho model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new despachoSoap[soapModels.size()]);
	}

	public despachoSoap() {
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

	public String getJurisdiccion() {
		return _jurisdiccion;
	}

	public void setJurisdiccion(String jurisdiccion) {
		_jurisdiccion = jurisdiccion;
	}

	public String getDistrito() {
		return _distrito;
	}

	public void setDistrito(String distrito) {
		_distrito = distrito;
	}

	public String getCircuito() {
		return _circuito;
	}

	public void setCircuito(String circuito) {
		_circuito = circuito;
	}

	public String getMunicipio() {
		return _municipio;
	}

	public void setMunicipio(String municipio) {
		_municipio = municipio;
	}

	public String getCodigoDespacho() {
		return _codigoDespacho;
	}

	public void setCodigoDespacho(String codigoDespacho) {
		_codigoDespacho = codigoDespacho;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getJuesDespacho() {
		return _juesDespacho;
	}

	public void setJuesDespacho(String juesDespacho) {
		_juesDespacho = juesDespacho;
	}

	public String getCorreo() {
		return _Correo;
	}

	public void setCorreo(String Correo) {
		_Correo = Correo;
	}

	public String getDireccion() {
		return _direccion;
	}

	public void setDireccion(String direccion) {
		_direccion = direccion;
	}

	public String getTelefono() {
		return _telefono;
	}

	public void setTelefono(String telefono) {
		_telefono = telefono;
	}

	public String getHorario() {
		return _horario;
	}

	public void setHorario(String horario) {
		_horario = horario;
	}

	public String getArea() {
		return _area;
	}

	public void setArea(String area) {
		_area = area;
	}

	public String getDepartamento() {
		return _departamento;
	}

	public void setDepartamento(String departamento) {
		_departamento = departamento;
	}

	private int _id;
	private String _jurisdiccion;
	private String _distrito;
	private String _circuito;
	private String _municipio;
	private String _codigoDespacho;
	private String _nombre;
	private String _juesDespacho;
	private String _Correo;
	private String _direccion;
	private String _telefono;
	private String _horario;
	private String _area;
	private String _departamento;
}