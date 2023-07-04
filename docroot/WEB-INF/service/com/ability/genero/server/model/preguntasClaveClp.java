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

import com.ability.genero.server.service.preguntasClaveLocalServiceUtil;

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
public class preguntasClaveClp extends BaseModelImpl<preguntasClave>
	implements preguntasClave {
	public preguntasClaveClp() {
	}

	public Class<?> getModelClass() {
		return preguntasClave.class;
	}

	public String getModelClassName() {
		return preguntasClave.class.getName();
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
		attributes.put("pregunta", getPregunta());
		attributes.put("respuesta", getRespuesta());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String pregunta = (String)attributes.get("pregunta");

		if (pregunta != null) {
			setPregunta(pregunta);
		}

		String respuesta = (String)attributes.get("respuesta");

		if (respuesta != null) {
			setRespuesta(respuesta);
		}
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

	public String getRespuesta() {
		return _respuesta;
	}

	public void setRespuesta(String respuesta) {
		_respuesta = respuesta;
	}

	public BaseModel<?> getpreguntasClaveRemoteModel() {
		return _preguntasClaveRemoteModel;
	}

	public void setpreguntasClaveRemoteModel(
		BaseModel<?> preguntasClaveRemoteModel) {
		_preguntasClaveRemoteModel = preguntasClaveRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			preguntasClaveLocalServiceUtil.addpreguntasClave(this);
		}
		else {
			preguntasClaveLocalServiceUtil.updatepreguntasClave(this);
		}
	}

	@Override
	public preguntasClave toEscapedModel() {
		return (preguntasClave)Proxy.newProxyInstance(preguntasClave.class.getClassLoader(),
			new Class[] { preguntasClave.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		preguntasClaveClp clone = new preguntasClaveClp();

		clone.setId(getId());
		clone.setPregunta(getPregunta());
		clone.setRespuesta(getRespuesta());

		return clone;
	}

	public int compareTo(preguntasClave preguntasClave) {
		int value = 0;

		if (getId() < preguntasClave.getId()) {
			value = -1;
		}
		else if (getId() > preguntasClave.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		preguntasClaveClp preguntasClave = null;

		try {
			preguntasClave = (preguntasClaveClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = preguntasClave.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", pregunta=");
		sb.append(getPregunta());
		sb.append(", respuesta=");
		sb.append(getRespuesta());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.preguntasClave");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pregunta</column-name><column-value><![CDATA[");
		sb.append(getPregunta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>respuesta</column-name><column-value><![CDATA[");
		sb.append(getRespuesta());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _pregunta;
	private String _respuesta;
	private BaseModel<?> _preguntasClaveRemoteModel;
}