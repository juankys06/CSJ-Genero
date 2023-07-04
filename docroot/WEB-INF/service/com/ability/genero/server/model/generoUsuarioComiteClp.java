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

import com.ability.genero.server.service.generoUsuarioComiteLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
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
public class generoUsuarioComiteClp extends BaseModelImpl<generoUsuarioComite>
	implements generoUsuarioComite {
	public generoUsuarioComiteClp() {
	}

	public Class<?> getModelClass() {
		return generoUsuarioComite.class;
	}

	public String getModelClassName() {
		return generoUsuarioComite.class.getName();
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
		attributes.put("Distrito", getDistrito());
		attributes.put("userId", getUserId());
		attributes.put("fecha_creacion", getFecha_creacion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String Distrito = (String)attributes.get("Distrito");

		if (Distrito != null) {
			setDistrito(Distrito);
		}

		String userId = (String)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date fecha_creacion = (Date)attributes.get("fecha_creacion");

		if (fecha_creacion != null) {
			setFecha_creacion(fecha_creacion);
		}
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getDistrito() {
		return _Distrito;
	}

	public void setDistrito(String Distrito) {
		_Distrito = Distrito;
	}

	public String getUserId() {
		return _userId;
	}

	public void setUserId(String userId) {
		_userId = userId;
	}

	public Date getFecha_creacion() {
		return _fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		_fecha_creacion = fecha_creacion;
	}

	public BaseModel<?> getgeneroUsuarioComiteRemoteModel() {
		return _generoUsuarioComiteRemoteModel;
	}

	public void setgeneroUsuarioComiteRemoteModel(
		BaseModel<?> generoUsuarioComiteRemoteModel) {
		_generoUsuarioComiteRemoteModel = generoUsuarioComiteRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			generoUsuarioComiteLocalServiceUtil.addgeneroUsuarioComite(this);
		}
		else {
			generoUsuarioComiteLocalServiceUtil.updategeneroUsuarioComite(this);
		}
	}

	@Override
	public generoUsuarioComite toEscapedModel() {
		return (generoUsuarioComite)Proxy.newProxyInstance(generoUsuarioComite.class.getClassLoader(),
			new Class[] { generoUsuarioComite.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		generoUsuarioComiteClp clone = new generoUsuarioComiteClp();

		clone.setId(getId());
		clone.setDistrito(getDistrito());
		clone.setUserId(getUserId());
		clone.setFecha_creacion(getFecha_creacion());

		return clone;
	}

	public int compareTo(generoUsuarioComite generoUsuarioComite) {
		int primaryKey = generoUsuarioComite.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		generoUsuarioComiteClp generoUsuarioComite = null;

		try {
			generoUsuarioComite = (generoUsuarioComiteClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = generoUsuarioComite.getPrimaryKey();

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
		sb.append(", Distrito=");
		sb.append(getDistrito());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", fecha_creacion=");
		sb.append(getFecha_creacion());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.generoUsuarioComite");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Distrito</column-name><column-value><![CDATA[");
		sb.append(getDistrito());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fecha_creacion</column-name><column-value><![CDATA[");
		sb.append(getFecha_creacion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _Distrito;
	private String _userId;
	private Date _fecha_creacion;
	private BaseModel<?> _generoUsuarioComiteRemoteModel;
}