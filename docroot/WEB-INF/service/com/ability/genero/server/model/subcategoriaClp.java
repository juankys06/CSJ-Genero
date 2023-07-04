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

import com.ability.genero.server.service.subcategoriaLocalServiceUtil;

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
public class subcategoriaClp extends BaseModelImpl<subcategoria>
	implements subcategoria {
	public subcategoriaClp() {
	}

	public Class<?> getModelClass() {
		return subcategoria.class;
	}

	public String getModelClassName() {
		return subcategoria.class.getName();
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
		attributes.put("idCategoria", getIdCategoria());
		attributes.put("subcategoria", getSubcategoria());
		attributes.put("url", getUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer idCategoria = (Integer)attributes.get("idCategoria");

		if (idCategoria != null) {
			setIdCategoria(idCategoria);
		}

		String subcategoria = (String)attributes.get("subcategoria");

		if (subcategoria != null) {
			setSubcategoria(subcategoria);
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

	public int getIdCategoria() {
		return _idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		_idCategoria = idCategoria;
	}

	public String getSubcategoria() {
		return _subcategoria;
	}

	public void setSubcategoria(String subcategoria) {
		_subcategoria = subcategoria;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public BaseModel<?> getsubcategoriaRemoteModel() {
		return _subcategoriaRemoteModel;
	}

	public void setsubcategoriaRemoteModel(BaseModel<?> subcategoriaRemoteModel) {
		_subcategoriaRemoteModel = subcategoriaRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			subcategoriaLocalServiceUtil.addsubcategoria(this);
		}
		else {
			subcategoriaLocalServiceUtil.updatesubcategoria(this);
		}
	}

	@Override
	public subcategoria toEscapedModel() {
		return (subcategoria)Proxy.newProxyInstance(subcategoria.class.getClassLoader(),
			new Class[] { subcategoria.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		subcategoriaClp clone = new subcategoriaClp();

		clone.setId(getId());
		clone.setIdCategoria(getIdCategoria());
		clone.setSubcategoria(getSubcategoria());
		clone.setUrl(getUrl());

		return clone;
	}

	public int compareTo(subcategoria subcategoria) {
		int value = 0;

		value = getSubcategoria().compareTo(subcategoria.getSubcategoria());

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

		subcategoriaClp subcategoria = null;

		try {
			subcategoria = (subcategoriaClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = subcategoria.getPrimaryKey();

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
		sb.append(", idCategoria=");
		sb.append(getIdCategoria());
		sb.append(", subcategoria=");
		sb.append(getSubcategoria());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.subcategoria");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idCategoria</column-name><column-value><![CDATA[");
		sb.append(getIdCategoria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subcategoria</column-name><column-value><![CDATA[");
		sb.append(getSubcategoria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private int _idCategoria;
	private String _subcategoria;
	private String _url;
	private BaseModel<?> _subcategoriaRemoteModel;
}