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

import com.ability.genero.server.service.despachoLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL Villartech
 */
public class despachoClp extends BaseModelImpl<despacho> implements despacho {
	public despachoClp() {
	}

	public Class<?> getModelClass() {
		return despacho.class;
	}

	public String getModelClassName() {
		return despacho.class.getName();
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
		attributes.put("jurisdiccion", getJurisdiccion());
		attributes.put("distrito", getDistrito());
		attributes.put("circuito", getCircuito());
		attributes.put("municipio", getMunicipio());
		attributes.put("codigoDespacho", getCodigoDespacho());
		attributes.put("nombre", getNombre());
		attributes.put("juesDespacho", getJuesDespacho());
		attributes.put("Correo", getCorreo());
		attributes.put("direccion", getDireccion());
		attributes.put("telefono", getTelefono());
		attributes.put("horario", getHorario());
		attributes.put("area", getArea());
		attributes.put("departamento", getDepartamento());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String jurisdiccion = (String)attributes.get("jurisdiccion");

		if (jurisdiccion != null) {
			setJurisdiccion(jurisdiccion);
		}

		String distrito = (String)attributes.get("distrito");

		if (distrito != null) {
			setDistrito(distrito);
		}

		String circuito = (String)attributes.get("circuito");

		if (circuito != null) {
			setCircuito(circuito);
		}

		String municipio = (String)attributes.get("municipio");

		if (municipio != null) {
			setMunicipio(municipio);
		}

		String codigoDespacho = (String)attributes.get("codigoDespacho");

		if (codigoDespacho != null) {
			setCodigoDespacho(codigoDespacho);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String juesDespacho = (String)attributes.get("juesDespacho");

		if (juesDespacho != null) {
			setJuesDespacho(juesDespacho);
		}

		String Correo = (String)attributes.get("Correo");

		if (Correo != null) {
			setCorreo(Correo);
		}

		String direccion = (String)attributes.get("direccion");

		if (direccion != null) {
			setDireccion(direccion);
		}

		String telefono = (String)attributes.get("telefono");

		if (telefono != null) {
			setTelefono(telefono);
		}

		String horario = (String)attributes.get("horario");

		if (horario != null) {
			setHorario(horario);
		}

		String area = (String)attributes.get("area");

		if (area != null) {
			setArea(area);
		}

		String departamento = (String)attributes.get("departamento");

		if (departamento != null) {
			setDepartamento(departamento);
		}
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

	public BaseModel<?> getdespachoRemoteModel() {
		return _despachoRemoteModel;
	}

	public void setdespachoRemoteModel(BaseModel<?> despachoRemoteModel) {
		_despachoRemoteModel = despachoRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			despachoLocalServiceUtil.adddespacho(this);
		}
		else {
			despachoLocalServiceUtil.updatedespacho(this);
		}
	}

	@Override
	public despacho toEscapedModel() {
		return (despacho)Proxy.newProxyInstance(despacho.class.getClassLoader(),
			new Class[] { despacho.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		despachoClp clone = new despachoClp();

		clone.setId(getId());
		clone.setJurisdiccion(getJurisdiccion());
		clone.setDistrito(getDistrito());
		clone.setCircuito(getCircuito());
		clone.setMunicipio(getMunicipio());
		clone.setCodigoDespacho(getCodigoDespacho());
		clone.setNombre(getNombre());
		clone.setJuesDespacho(getJuesDespacho());
		clone.setCorreo(getCorreo());
		clone.setDireccion(getDireccion());
		clone.setTelefono(getTelefono());
		clone.setHorario(getHorario());
		clone.setArea(getArea());
		clone.setDepartamento(getDepartamento());

		return clone;
	}

	public int compareTo(despacho despacho) {
		int value = 0;

		value = getNombre().compareTo(despacho.getNombre());

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

		despachoClp despacho = null;

		try {
			despacho = (despachoClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = despacho.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", jurisdiccion=");
		sb.append(getJurisdiccion());
		sb.append(", distrito=");
		sb.append(getDistrito());
		sb.append(", circuito=");
		sb.append(getCircuito());
		sb.append(", municipio=");
		sb.append(getMunicipio());
		sb.append(", codigoDespacho=");
		sb.append(getCodigoDespacho());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", juesDespacho=");
		sb.append(getJuesDespacho());
		sb.append(", Correo=");
		sb.append(getCorreo());
		sb.append(", direccion=");
		sb.append(getDireccion());
		sb.append(", telefono=");
		sb.append(getTelefono());
		sb.append(", horario=");
		sb.append(getHorario());
		sb.append(", area=");
		sb.append(getArea());
		sb.append(", departamento=");
		sb.append(getDepartamento());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.despacho");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jurisdiccion</column-name><column-value><![CDATA[");
		sb.append(getJurisdiccion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>distrito</column-name><column-value><![CDATA[");
		sb.append(getDistrito());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>circuito</column-name><column-value><![CDATA[");
		sb.append(getCircuito());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>municipio</column-name><column-value><![CDATA[");
		sb.append(getMunicipio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codigoDespacho</column-name><column-value><![CDATA[");
		sb.append(getCodigoDespacho());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>juesDespacho</column-name><column-value><![CDATA[");
		sb.append(getJuesDespacho());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Correo</column-name><column-value><![CDATA[");
		sb.append(getCorreo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>direccion</column-name><column-value><![CDATA[");
		sb.append(getDireccion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telefono</column-name><column-value><![CDATA[");
		sb.append(getTelefono());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>horario</column-name><column-value><![CDATA[");
		sb.append(getHorario());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>area</column-name><column-value><![CDATA[");
		sb.append(getArea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>departamento</column-name><column-value><![CDATA[");
		sb.append(getDepartamento());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _despachoRemoteModel;
}