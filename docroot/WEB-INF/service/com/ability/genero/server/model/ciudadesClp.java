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

import com.ability.genero.server.service.ciudadesLocalServiceUtil;

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
public class ciudadesClp extends BaseModelImpl<ciudades> implements ciudades {
	public ciudadesClp() {
	}

	public Class<?> getModelClass() {
		return ciudades.class;
	}

	public String getModelClassName() {
		return ciudades.class.getName();
	}

	public String getPrimaryKey() {
		return _codigo;
	}

	public void setPrimaryKey(String primaryKey) {
		setCodigo(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _codigo;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("codigo", getCodigo());
		attributes.put("nombre", getNombre());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String codigo = (String)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}
	}

	public String getCodigo() {
		return _codigo;
	}

	public void setCodigo(String codigo) {
		_codigo = codigo;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public BaseModel<?> getciudadesRemoteModel() {
		return _ciudadesRemoteModel;
	}

	public void setciudadesRemoteModel(BaseModel<?> ciudadesRemoteModel) {
		_ciudadesRemoteModel = ciudadesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			ciudadesLocalServiceUtil.addciudades(this);
		}
		else {
			ciudadesLocalServiceUtil.updateciudades(this);
		}
	}

	@Override
	public ciudades toEscapedModel() {
		return (ciudades)Proxy.newProxyInstance(ciudades.class.getClassLoader(),
			new Class[] { ciudades.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ciudadesClp clone = new ciudadesClp();

		clone.setCodigo(getCodigo());
		clone.setNombre(getNombre());

		return clone;
	}

	public int compareTo(ciudades ciudades) {
		int value = 0;

		value = getNombre().compareTo(ciudades.getNombre());

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

		ciudadesClp ciudades = null;

		try {
			ciudades = (ciudadesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String primaryKey = ciudades.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{codigo=");
		sb.append(getCodigo());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.ciudades");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>codigo</column-name><column-value><![CDATA[");
		sb.append(getCodigo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _codigo;
	private String _nombre;
	private BaseModel<?> _ciudadesRemoteModel;
}