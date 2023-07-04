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

import com.ability.genero.server.service.normasNacionalesLocalServiceUtil;

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
public class normasNacionalesClp extends BaseModelImpl<normasNacionales>
	implements normasNacionales {
	public normasNacionalesClp() {
	}

	public Class<?> getModelClass() {
		return normasNacionales.class;
	}

	public String getModelClassName() {
		return normasNacionales.class.getName();
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
		attributes.put("normativas", getNormativas());
		attributes.put("anhio", getAnhio());
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

		String normativas = (String)attributes.get("normativas");

		if (normativas != null) {
			setNormativas(normativas);
		}

		String anhio = (String)attributes.get("anhio");

		if (anhio != null) {
			setAnhio(anhio);
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

	public String getNormativas() {
		return _normativas;
	}

	public void setNormativas(String normativas) {
		_normativas = normativas;
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

	public String getAmbito() {
		return _ambito;
	}

	public void setAmbito(String ambito) {
		_ambito = ambito;
	}

	public BaseModel<?> getnormasNacionalesRemoteModel() {
		return _normasNacionalesRemoteModel;
	}

	public void setnormasNacionalesRemoteModel(
		BaseModel<?> normasNacionalesRemoteModel) {
		_normasNacionalesRemoteModel = normasNacionalesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			normasNacionalesLocalServiceUtil.addnormasNacionales(this);
		}
		else {
			normasNacionalesLocalServiceUtil.updatenormasNacionales(this);
		}
	}

	@Override
	public normasNacionales toEscapedModel() {
		return (normasNacionales)Proxy.newProxyInstance(normasNacionales.class.getClassLoader(),
			new Class[] { normasNacionales.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		normasNacionalesClp clone = new normasNacionalesClp();

		clone.setId(getId());
		clone.setNormativas(getNormativas());
		clone.setAnhio(getAnhio());
		clone.setUrl(getUrl());
		clone.setAmbito(getAmbito());

		return clone;
	}

	public int compareTo(normasNacionales normasNacionales) {
		int value = 0;

		if (getId() < normasNacionales.getId()) {
			value = -1;
		}
		else if (getId() > normasNacionales.getId()) {
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

		normasNacionalesClp normasNacionales = null;

		try {
			normasNacionales = (normasNacionalesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = normasNacionales.getPrimaryKey();

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
		sb.append(", normativas=");
		sb.append(getNormativas());
		sb.append(", anhio=");
		sb.append(getAnhio());
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
		sb.append("com.ability.genero.server.model.normasNacionales");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>normativas</column-name><column-value><![CDATA[");
		sb.append(getNormativas());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anhio</column-name><column-value><![CDATA[");
		sb.append(getAnhio());
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
	private String _normativas;
	private String _anhio;
	private String _url;
	private String _ambito;
	private BaseModel<?> _normasNacionalesRemoteModel;
}