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

import com.ability.genero.server.service.especialidadLocalServiceUtil;

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
public class especialidadClp extends BaseModelImpl<especialidad>
	implements especialidad {
	public especialidadClp() {
	}

	public Class<?> getModelClass() {
		return especialidad.class;
	}

	public String getModelClassName() {
		return especialidad.class.getName();
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
		attributes.put("nombre", getNombre());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public BaseModel<?> getespecialidadRemoteModel() {
		return _especialidadRemoteModel;
	}

	public void setespecialidadRemoteModel(BaseModel<?> especialidadRemoteModel) {
		_especialidadRemoteModel = especialidadRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			especialidadLocalServiceUtil.addespecialidad(this);
		}
		else {
			especialidadLocalServiceUtil.updateespecialidad(this);
		}
	}

	@Override
	public especialidad toEscapedModel() {
		return (especialidad)Proxy.newProxyInstance(especialidad.class.getClassLoader(),
			new Class[] { especialidad.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		especialidadClp clone = new especialidadClp();

		clone.setId(getId());
		clone.setNombre(getNombre());

		return clone;
	}

	public int compareTo(especialidad especialidad) {
		int value = 0;

		value = getNombre().compareTo(especialidad.getNombre());

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

		especialidadClp especialidad = null;

		try {
			especialidad = (especialidadClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = especialidad.getPrimaryKey();

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
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.especialidad");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _nombre;
	private BaseModel<?> _especialidadRemoteModel;
}