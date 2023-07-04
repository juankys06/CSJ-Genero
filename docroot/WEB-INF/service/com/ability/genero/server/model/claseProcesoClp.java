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

import com.ability.genero.server.service.claseProcesoLocalServiceUtil;

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
public class claseProcesoClp extends BaseModelImpl<claseProceso>
	implements claseProceso {
	public claseProcesoClp() {
	}

	public Class<?> getModelClass() {
		return claseProceso.class;
	}

	public String getModelClassName() {
		return claseProceso.class.getName();
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
		attributes.put("claseProceso", getClaseProceso());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String claseProceso = (String)attributes.get("claseProceso");

		if (claseProceso != null) {
			setClaseProceso(claseProceso);
		}
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getClaseProceso() {
		return _claseProceso;
	}

	public void setClaseProceso(String claseProceso) {
		_claseProceso = claseProceso;
	}

	public BaseModel<?> getclaseProcesoRemoteModel() {
		return _claseProcesoRemoteModel;
	}

	public void setclaseProcesoRemoteModel(BaseModel<?> claseProcesoRemoteModel) {
		_claseProcesoRemoteModel = claseProcesoRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			claseProcesoLocalServiceUtil.addclaseProceso(this);
		}
		else {
			claseProcesoLocalServiceUtil.updateclaseProceso(this);
		}
	}

	@Override
	public claseProceso toEscapedModel() {
		return (claseProceso)Proxy.newProxyInstance(claseProceso.class.getClassLoader(),
			new Class[] { claseProceso.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		claseProcesoClp clone = new claseProcesoClp();

		clone.setId(getId());
		clone.setClaseProceso(getClaseProceso());

		return clone;
	}

	public int compareTo(claseProceso claseProceso) {
		int primaryKey = claseProceso.getPrimaryKey();

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

		claseProcesoClp claseProceso = null;

		try {
			claseProceso = (claseProcesoClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = claseProceso.getPrimaryKey();

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
		sb.append(", claseProceso=");
		sb.append(getClaseProceso());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.claseProceso");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>claseProceso</column-name><column-value><![CDATA[");
		sb.append(getClaseProceso());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _claseProceso;
	private BaseModel<?> _claseProcesoRemoteModel;
}