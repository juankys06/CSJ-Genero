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

import com.ability.genero.server.service.juresprudenciaInternacionalLocalServiceUtil;

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
public class juresprudenciaInternacionalClp extends BaseModelImpl<juresprudenciaInternacional>
	implements juresprudenciaInternacional {
	public juresprudenciaInternacionalClp() {
	}

	public Class<?> getModelClass() {
		return juresprudenciaInternacional.class;
	}

	public String getModelClassName() {
		return juresprudenciaInternacional.class.getName();
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

		String referencias = (String)attributes.get("referencias");

		if (referencias != null) {
			setReferencias(referencias);
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

	public String getReferencias() {
		return _referencias;
	}

	public void setReferencias(String referencias) {
		_referencias = referencias;
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

	public BaseModel<?> getjuresprudenciaInternacionalRemoteModel() {
		return _juresprudenciaInternacionalRemoteModel;
	}

	public void setjuresprudenciaInternacionalRemoteModel(
		BaseModel<?> juresprudenciaInternacionalRemoteModel) {
		_juresprudenciaInternacionalRemoteModel = juresprudenciaInternacionalRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			juresprudenciaInternacionalLocalServiceUtil.addjuresprudenciaInternacional(this);
		}
		else {
			juresprudenciaInternacionalLocalServiceUtil.updatejuresprudenciaInternacional(this);
		}
	}

	@Override
	public juresprudenciaInternacional toEscapedModel() {
		return (juresprudenciaInternacional)Proxy.newProxyInstance(juresprudenciaInternacional.class.getClassLoader(),
			new Class[] { juresprudenciaInternacional.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		juresprudenciaInternacionalClp clone = new juresprudenciaInternacionalClp();

		clone.setId(getId());
		clone.setReferencias(getReferencias());
		clone.setAnhio(getAnhio());
		clone.setUrl(getUrl());

		return clone;
	}

	public int compareTo(
		juresprudenciaInternacional juresprudenciaInternacional) {
		int value = 0;

		if (getId() < juresprudenciaInternacional.getId()) {
			value = -1;
		}
		else if (getId() > juresprudenciaInternacional.getId()) {
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

		juresprudenciaInternacionalClp juresprudenciaInternacional = null;

		try {
			juresprudenciaInternacional = (juresprudenciaInternacionalClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = juresprudenciaInternacional.getPrimaryKey();

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
		sb.append(", referencias=");
		sb.append(getReferencias());
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
		sb.append("com.ability.genero.server.model.juresprudenciaInternacional");
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
	private String _referencias;
	private String _anhio;
	private String _url;
	private BaseModel<?> _juresprudenciaInternacionalRemoteModel;
}