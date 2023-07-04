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

import com.ability.genero.server.service.normasInteracionalesLocalServiceUtil;

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
public class normasInteracionalesClp extends BaseModelImpl<normasInteracionales>
	implements normasInteracionales {
	public normasInteracionalesClp() {
	}

	public Class<?> getModelClass() {
		return normasInteracionales.class;
	}

	public String getModelClassName() {
		return normasInteracionales.class.getName();
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
		attributes.put("conferencias", getConferencias());
		attributes.put("anhio", getAnhio());
		attributes.put("url", getUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String conferencias = (String)attributes.get("conferencias");

		if (conferencias != null) {
			setConferencias(conferencias);
		}

		String anhio = (String)attributes.get("anhio");

		if (anhio != null) {
			setAnhio(anhio);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getConferencias() {
		return _conferencias;
	}

	public void setConferencias(String conferencias) {
		_conferencias = conferencias;
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

	public BaseModel<?> getnormasInteracionalesRemoteModel() {
		return _normasInteracionalesRemoteModel;
	}

	public void setnormasInteracionalesRemoteModel(
		BaseModel<?> normasInteracionalesRemoteModel) {
		_normasInteracionalesRemoteModel = normasInteracionalesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			normasInteracionalesLocalServiceUtil.addnormasInteracionales(this);
		}
		else {
			normasInteracionalesLocalServiceUtil.updatenormasInteracionales(this);
		}
	}

	@Override
	public normasInteracionales toEscapedModel() {
		return (normasInteracionales)Proxy.newProxyInstance(normasInteracionales.class.getClassLoader(),
			new Class[] { normasInteracionales.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		normasInteracionalesClp clone = new normasInteracionalesClp();

		clone.setId(getId());
		clone.setConferencias(getConferencias());
		clone.setAnhio(getAnhio());
		clone.setUrl(getUrl());

		return clone;
	}

	public int compareTo(normasInteracionales normasInteracionales) {
		int value = 0;

		if (getId() < normasInteracionales.getId()) {
			value = -1;
		}
		else if (getId() > normasInteracionales.getId()) {
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

		normasInteracionalesClp normasInteracionales = null;

		try {
			normasInteracionales = (normasInteracionalesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = normasInteracionales.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", conferencias=");
		sb.append(getConferencias());
		sb.append(", anhio=");
		sb.append(getAnhio());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.normasInteracionales");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>conferencias</column-name><column-value><![CDATA[");
		sb.append(getConferencias());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anhio</column-name><column-value><![CDATA[");
		sb.append(getAnhio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _conferencias;
	private String _anhio;
	private String _url;
	private BaseModel<?> _normasInteracionalesRemoteModel;
}