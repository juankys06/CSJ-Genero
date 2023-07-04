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

import com.ability.genero.server.service.casoLVLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL Villartech
 */
public class casoLVClp extends BaseModelImpl<casoLV> implements casoLV {
	public casoLVClp() {
	}

	public Class<?> getModelClass() {
		return casoLV.class;
	}

	public String getModelClassName() {
		return casoLV.class.getName();
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("despacho", getDespacho());
		attributes.put("radicacion", getRadicacion());
		attributes.put("demandante", getDemandante());
		attributes.put("demandado", getDemandado());
		attributes.put("claseProceso", getClaseProceso());
		attributes.put("tipoDecision", getTipoDecision());
		attributes.put("ponente", getPonente());
		attributes.put("fecha", getFecha());
		attributes.put("categoria", getCategoria());
		attributes.put("subCategoria", getSubCategoria());
		attributes.put("respuestas1", getRespuestas1());
		attributes.put("respuestas2", getRespuestas2());
		attributes.put("anhio", getAnhio());
		attributes.put("generoDemandante", getGeneroDemandante());
		attributes.put("generoDemandado", getGeneroDemandado());
		attributes.put("archivo", getArchivo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String despacho = (String)attributes.get("despacho");

		if (despacho != null) {
			setDespacho(despacho);
		}

		String radicacion = (String)attributes.get("radicacion");

		if (radicacion != null) {
			setRadicacion(radicacion);
		}

		String demandante = (String)attributes.get("demandante");

		if (demandante != null) {
			setDemandante(demandante);
		}

		String demandado = (String)attributes.get("demandado");

		if (demandado != null) {
			setDemandado(demandado);
		}

		String claseProceso = (String)attributes.get("claseProceso");

		if (claseProceso != null) {
			setClaseProceso(claseProceso);
		}

		String tipoDecision = (String)attributes.get("tipoDecision");

		if (tipoDecision != null) {
			setTipoDecision(tipoDecision);
		}

		String ponente = (String)attributes.get("ponente");

		if (ponente != null) {
			setPonente(ponente);
		}

		Date fecha = (Date)attributes.get("fecha");

		if (fecha != null) {
			setFecha(fecha);
		}

		String categoria = (String)attributes.get("categoria");

		if (categoria != null) {
			setCategoria(categoria);
		}

		String subCategoria = (String)attributes.get("subCategoria");

		if (subCategoria != null) {
			setSubCategoria(subCategoria);
		}

		String respuestas1 = (String)attributes.get("respuestas1");

		if (respuestas1 != null) {
			setRespuestas1(respuestas1);
		}

		String respuestas2 = (String)attributes.get("respuestas2");

		if (respuestas2 != null) {
			setRespuestas2(respuestas2);
		}

		String anhio = (String)attributes.get("anhio");

		if (anhio != null) {
			setAnhio(anhio);
		}

		String generoDemandante = (String)attributes.get("generoDemandante");

		if (generoDemandante != null) {
			setGeneroDemandante(generoDemandante);
		}

		String generoDemandado = (String)attributes.get("generoDemandado");

		if (generoDemandado != null) {
			setGeneroDemandado(generoDemandado);
		}

		String archivo = (String)attributes.get("archivo");

		if (archivo != null) {
			setArchivo(archivo);
		}
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

	public BaseModel<?> getcasoLVRemoteModel() {
		return _casoLVRemoteModel;
	}

	public void setcasoLVRemoteModel(BaseModel<?> casoLVRemoteModel) {
		_casoLVRemoteModel = casoLVRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			casoLVLocalServiceUtil.addcasoLV(this);
		}
		else {
			casoLVLocalServiceUtil.updatecasoLV(this);
		}
	}

	@Override
	public casoLV toEscapedModel() {
		return (casoLV)Proxy.newProxyInstance(casoLV.class.getClassLoader(),
			new Class[] { casoLV.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		casoLVClp clone = new casoLVClp();

		clone.setId(getId());
		clone.setDespacho(getDespacho());
		clone.setRadicacion(getRadicacion());
		clone.setDemandante(getDemandante());
		clone.setDemandado(getDemandado());
		clone.setClaseProceso(getClaseProceso());
		clone.setTipoDecision(getTipoDecision());
		clone.setPonente(getPonente());
		clone.setFecha(getFecha());
		clone.setCategoria(getCategoria());
		clone.setSubCategoria(getSubCategoria());
		clone.setRespuestas1(getRespuestas1());
		clone.setRespuestas2(getRespuestas2());
		clone.setAnhio(getAnhio());
		clone.setGeneroDemandante(getGeneroDemandante());
		clone.setGeneroDemandado(getGeneroDemandado());
		clone.setArchivo(getArchivo());

		return clone;
	}

	public int compareTo(casoLV casoLV) {
		int value = 0;

		value = DateUtil.compareTo(getFecha(), casoLV.getFecha());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		casoLVClp casoLV = null;

		try {
			casoLV = (casoLVClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = casoLV.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", despacho=");
		sb.append(getDespacho());
		sb.append(", radicacion=");
		sb.append(getRadicacion());
		sb.append(", demandante=");
		sb.append(getDemandante());
		sb.append(", demandado=");
		sb.append(getDemandado());
		sb.append(", claseProceso=");
		sb.append(getClaseProceso());
		sb.append(", tipoDecision=");
		sb.append(getTipoDecision());
		sb.append(", ponente=");
		sb.append(getPonente());
		sb.append(", fecha=");
		sb.append(getFecha());
		sb.append(", categoria=");
		sb.append(getCategoria());
		sb.append(", subCategoria=");
		sb.append(getSubCategoria());
		sb.append(", respuestas1=");
		sb.append(getRespuestas1());
		sb.append(", respuestas2=");
		sb.append(getRespuestas2());
		sb.append(", anhio=");
		sb.append(getAnhio());
		sb.append(", generoDemandante=");
		sb.append(getGeneroDemandante());
		sb.append(", generoDemandado=");
		sb.append(getGeneroDemandado());
		sb.append(", archivo=");
		sb.append(getArchivo());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.casoLV");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>despacho</column-name><column-value><![CDATA[");
		sb.append(getDespacho());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>radicacion</column-name><column-value><![CDATA[");
		sb.append(getRadicacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>demandante</column-name><column-value><![CDATA[");
		sb.append(getDemandante());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>demandado</column-name><column-value><![CDATA[");
		sb.append(getDemandado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>claseProceso</column-name><column-value><![CDATA[");
		sb.append(getClaseProceso());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoDecision</column-name><column-value><![CDATA[");
		sb.append(getTipoDecision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ponente</column-name><column-value><![CDATA[");
		sb.append(getPonente());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fecha</column-name><column-value><![CDATA[");
		sb.append(getFecha());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoria</column-name><column-value><![CDATA[");
		sb.append(getCategoria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subCategoria</column-name><column-value><![CDATA[");
		sb.append(getSubCategoria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>respuestas1</column-name><column-value><![CDATA[");
		sb.append(getRespuestas1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>respuestas2</column-name><column-value><![CDATA[");
		sb.append(getRespuestas2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anhio</column-name><column-value><![CDATA[");
		sb.append(getAnhio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>generoDemandante</column-name><column-value><![CDATA[");
		sb.append(getGeneroDemandante());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>generoDemandado</column-name><column-value><![CDATA[");
		sb.append(getGeneroDemandado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>archivo</column-name><column-value><![CDATA[");
		sb.append(getArchivo());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _casoLVRemoteModel;
}