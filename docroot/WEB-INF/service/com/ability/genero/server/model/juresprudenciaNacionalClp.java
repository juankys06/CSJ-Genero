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

import com.ability.genero.server.service.juresprudenciaNacionalLocalServiceUtil;

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
public class juresprudenciaNacionalClp extends BaseModelImpl<juresprudenciaNacional>
	implements juresprudenciaNacional {
	public juresprudenciaNacionalClp() {
	}

	public Class<?> getModelClass() {
		return juresprudenciaNacional.class;
	}

	public String getModelClassName() {
		return juresprudenciaNacional.class.getName();
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
		attributes.put("referencias", getReferencias());
		attributes.put("corporacion", getCorporacion());
		attributes.put("url", getUrl());
		attributes.put("ambito", getAmbito());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String referencias = (String)attributes.get("referencias");

		if (referencias != null) {
			setReferencias(referencias);
		}

		String corporacion = (String)attributes.get("corporacion");

		if (corporacion != null) {
			setCorporacion(corporacion);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String ambito = (String)attributes.get("ambito");

		if (ambito != null) {
			setAmbito(ambito);
		}
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

	public BaseModel<?> getjuresprudenciaNacionalRemoteModel() {
		return _juresprudenciaNacionalRemoteModel;
	}

	public void setjuresprudenciaNacionalRemoteModel(
		BaseModel<?> juresprudenciaNacionalRemoteModel) {
		_juresprudenciaNacionalRemoteModel = juresprudenciaNacionalRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			juresprudenciaNacionalLocalServiceUtil.addjuresprudenciaNacional(this);
		}
		else {
			juresprudenciaNacionalLocalServiceUtil.updatejuresprudenciaNacional(this);
		}
	}

	@Override
	public juresprudenciaNacional toEscapedModel() {
		return (juresprudenciaNacional)Proxy.newProxyInstance(juresprudenciaNacional.class.getClassLoader(),
			new Class[] { juresprudenciaNacional.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		juresprudenciaNacionalClp clone = new juresprudenciaNacionalClp();

		clone.setId(getId());
		clone.setReferencias(getReferencias());
		clone.setCorporacion(getCorporacion());
		clone.setUrl(getUrl());
		clone.setAmbito(getAmbito());

		return clone;
	}

	public int compareTo(juresprudenciaNacional juresprudenciaNacional) {
		int value = 0;

		if (getId() < juresprudenciaNacional.getId()) {
			value = -1;
		}
		else if (getId() > juresprudenciaNacional.getId()) {
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

		juresprudenciaNacionalClp juresprudenciaNacional = null;

		try {
			juresprudenciaNacional = (juresprudenciaNacionalClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = juresprudenciaNacional.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", referencias=");
		sb.append(getReferencias());
		sb.append(", corporacion=");
		sb.append(getCorporacion());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", ambito=");
		sb.append(getAmbito());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.juresprudenciaNacional");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>referencias</column-name><column-value><![CDATA[");
		sb.append(getReferencias());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporacion</column-name><column-value><![CDATA[");
		sb.append(getCorporacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ambito</column-name><column-value><![CDATA[");
		sb.append(getAmbito());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _referencias;
	private String _corporacion;
	private String _url;
	private String _ambito;
	private BaseModel<?> _juresprudenciaNacionalRemoteModel;
}