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

import com.ability.genero.server.service.categoriaLocalServiceUtil;

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
public class categoriaClp extends BaseModelImpl<categoria> implements categoria {
	public categoriaClp() {
	}

	public Class<?> getModelClass() {
		return categoria.class;
	}

	public String getModelClassName() {
		return categoria.class.getName();
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
		attributes.put("categoria", getCategoria());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String categoria = (String)attributes.get("categoria");

		if (categoria != null) {
			setCategoria(categoria);
		}
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getCategoria() {
		return _categoria;
	}

	public void setCategoria(String categoria) {
		_categoria = categoria;
	}

	public BaseModel<?> getcategoriaRemoteModel() {
		return _categoriaRemoteModel;
	}

	public void setcategoriaRemoteModel(BaseModel<?> categoriaRemoteModel) {
		_categoriaRemoteModel = categoriaRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			categoriaLocalServiceUtil.addcategoria(this);
		}
		else {
			categoriaLocalServiceUtil.updatecategoria(this);
		}
	}

	@Override
	public categoria toEscapedModel() {
		return (categoria)Proxy.newProxyInstance(categoria.class.getClassLoader(),
			new Class[] { categoria.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		categoriaClp clone = new categoriaClp();

		clone.setId(getId());
		clone.setCategoria(getCategoria());

		return clone;
	}

	public int compareTo(categoria categoria) {
		int value = 0;

		value = getCategoria().compareTo(categoria.getCategoria());

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

		categoriaClp categoria = null;

		try {
			categoria = (categoriaClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = categoria.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", categoria=");
		sb.append(getCategoria());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.categoria");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoria</column-name><column-value><![CDATA[");
		sb.append(getCategoria());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _categoria;
	private BaseModel<?> _categoriaRemoteModel;
}