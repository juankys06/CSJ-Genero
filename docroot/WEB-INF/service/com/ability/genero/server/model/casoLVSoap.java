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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    DELL Villartech
 * @generated
 */
public class casoLVSoap implements Serializable {
	public static casoLVSoap toSoapModel(casoLV model) {
		casoLVSoap soapModel = new casoLVSoap();

		soapModel.setId(model.getId());
		soapModel.setDespacho(model.getDespacho());
		soapModel.setRadicacion(model.getRadicacion());
		soapModel.setDemandante(model.getDemandante());
		soapModel.setDemandado(model.getDemandado());
		soapModel.setClaseProceso(model.getClaseProceso());
		soapModel.setTipoDecision(model.getTipoDecision());
		soapModel.setPonente(model.getPonente());
		soapModel.setFecha(model.getFecha());
		soapModel.setCategoria(model.getCategoria());
		soapModel.setSubCategoria(model.getSubCategoria());
		soapModel.setRespuestas1(model.getRespuestas1());
		soapModel.setRespuestas2(model.getRespuestas2());
		soapModel.setAnhio(model.getAnhio());
		soapModel.setGeneroDemandante(model.getGeneroDemandante());
		soapModel.setGeneroDemandado(model.getGeneroDemandado());
		soapModel.setArchivo(model.getArchivo());

		return soapModel;
	}

	public static casoLVSoap[] toSoapModels(casoLV[] models) {
		casoLVSoap[] soapModels = new casoLVSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static casoLVSoap[][] toSoapModels(casoLV[][] models) {
		casoLVSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new casoLVSoap[models.length][models[0].length];
		}
		else {
			soapModels = new casoLVSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static casoLVSoap[] toSoapModels(List<casoLV> models) {
		List<casoLVSoap> soapModels = new ArrayList<casoLVSoap>(models.size());

		for (casoLV model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new casoLVSoap[soapModels.size()]);
	}

	public casoLVSoap() {
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

	public String getDespacho() {
		return _despacho;
	}

	public void setDespacho(String despacho) {
		_despacho = despacho;
	}

	public String getRadicacion() {
		return _radicacion;
	}

	public void setRadicacion(String radicacion) {
		_radicacion = radicacion;
	}

	public String getDemandante() {
		return _demandante;
	}

	public void setDemandante(String demandante) {
		_demandante = demandante;
	}

	public String getDemandado() {
		return _demandado;
	}

	public void setDemandado(String demandado) {
		_demandado = demandado;
	}

	public String getClaseProceso() {
		return _claseProceso;
	}

	public void setClaseProceso(String claseProceso) {
		_claseProceso = claseProceso;
	}

	public String getTipoDecision() {
		return _tipoDecision;
	}

	public void setTipoDecision(String tipoDecision) {
		_tipoDecision = tipoDecision;
	}

	public String getPonente() {
		return _ponente;
	}

	public void setPonente(String ponente) {
		_ponente = ponente;
	}

	public Date getFecha() {
		return _fecha;
	}

	public void setFecha(Date fecha) {
		_fecha = fecha;
	}

	public String getCategoria() {
		return _categoria;
	}

	public void setCategoria(String categoria) {
		_categoria = categoria;
	}

	public String getSubCategoria() {
		return _subCategoria;
	}

	public void setSubCategoria(String subCategoria) {
		_subCategoria = subCategoria;
	}

	public String getRespuestas1() {
		return _respuestas1;
	}

	public void setRespuestas1(String respuestas1) {
		_respuestas1 = respuestas1;
	}

	public String getRespuestas2() {
		return _respuestas2;
	}

	public void setRespuestas2(String respuestas2) {
		_respuestas2 = respuestas2;
	}

	public String getAnhio() {
		return _anhio;
	}

	public void setAnhio(String anhio) {
		_anhio = anhio;
	}

	public String getGeneroDemandante() {
		return _generoDemandante;
	}

	public void setGeneroDemandante(String generoDemandante) {
		_generoDemandante = generoDemandante;
	}

	public String getGeneroDemandado() {
		return _generoDemandado;
	}

	public void setGeneroDemandado(String generoDemandado) {
		_generoDemandado = generoDemandado;
	}

	public String getArchivo() {
		return _archivo;
	}

	public void setArchivo(String archivo) {
		_archivo = archivo;
	}

	private int _id;
	private String _despacho;
	private String _radicacion;
	private String _demandante;
	private String _demandado;
	private String _claseProceso;
	private String _tipoDecision;
	private String _ponente;
	private Date _fecha;
	private String _categoria;
	private String _subCategoria;
	private String _respuestas1;
	private String _respuestas2;
	private String _anhio;
	private String _generoDemandante;
	private String _generoDemandado;
	private String _archivo;
}