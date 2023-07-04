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

import com.ability.genero.server.service.auditoriaLocalServiceUtil;

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
public class auditoriaClp extends BaseModelImpl<auditoria> implements auditoria {
	public auditoriaClp() {
	}

	public Class<?> getModelClass() {
		return auditoria.class;
	}

	public String getModelClassName() {
		return auditoria.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("fecha", getFecha());
		attributes.put("evento", getEvento());
		attributes.put("tabla", getTabla());
		attributes.put("logs", getLogs());
		attributes.put("idUser", getIdUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Date fecha = (Date)attributes.get("fecha");

		if (fecha != null) {
			setFecha(fecha);
		}

		String evento = (String)attributes.get("evento");

		if (evento != null) {
			setEvento(evento);
		}

		String tabla = (String)attributes.get("tabla");

		if (tabla != null) {
			setTabla(tabla);
		}

		String logs = (String)attributes.get("logs");

		if (logs != null) {
			setLogs(logs);
		}

		Long idUser = (Long)attributes.get("idUser");

		if (idUser != null) {
			setIdUser(idUser);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public Date getFecha() {
		return _fecha;
	}

	public void setFecha(Date fecha) {
		_fecha = fecha;
	}

	public String getEvento() {
		return _evento;
	}

	public void setEvento(String evento) {
		_evento = evento;
	}

	public String getTabla() {
		return _tabla;
	}

	public void setTabla(String tabla) {
		_tabla = tabla;
	}

	public String getLogs() {
		return _logs;
	}

	public void setLogs(String logs) {
		_logs = logs;
	}

	public long getIdUser() {
		return _idUser;
	}

	public void setIdUser(long idUser) {
		_idUser = idUser;
	}

	public BaseModel<?> getauditoriaRemoteModel() {
		return _auditoriaRemoteModel;
	}

	public void setauditoriaRemoteModel(BaseModel<?> auditoriaRemoteModel) {
		_auditoriaRemoteModel = auditoriaRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			auditoriaLocalServiceUtil.addauditoria(this);
		}
		else {
			auditoriaLocalServiceUtil.updateauditoria(this);
		}
	}

	@Override
	public auditoria toEscapedModel() {
		return (auditoria)Proxy.newProxyInstance(auditoria.class.getClassLoader(),
			new Class[] { auditoria.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		auditoriaClp clone = new auditoriaClp();

		clone.setId(getId());
		clone.setFecha(getFecha());
		clone.setEvento(getEvento());
		clone.setTabla(getTabla());
		clone.setLogs(getLogs());
		clone.setIdUser(getIdUser());

		return clone;
	}

	public int compareTo(auditoria auditoria) {
		int value = 0;

		value = DateUtil.compareTo(getFecha(), auditoria.getFecha());

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

		auditoriaClp auditoria = null;

		try {
			auditoria = (auditoriaClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = auditoria.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", fecha=");
		sb.append(getFecha());
		sb.append(", evento=");
		sb.append(getEvento());
		sb.append(", tabla=");
		sb.append(getTabla());
		sb.append(", logs=");
		sb.append(getLogs());
		sb.append(", idUser=");
		sb.append(getIdUser());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.auditoria");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fecha</column-name><column-value><![CDATA[");
		sb.append(getFecha());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evento</column-name><column-value><![CDATA[");
		sb.append(getEvento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tabla</column-name><column-value><![CDATA[");
		sb.append(getTabla());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logs</column-name><column-value><![CDATA[");
		sb.append(getLogs());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idUser</column-name><column-value><![CDATA[");
		sb.append(getIdUser());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private Date _fecha;
	private String _evento;
	private String _tabla;
	private String _logs;
	private long _idUser;
	private BaseModel<?> _auditoriaRemoteModel;
}