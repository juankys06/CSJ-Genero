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

import com.ability.genero.server.service.tipoDecisionLocalServiceUtil;

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
public class tipoDecisionClp extends BaseModelImpl<tipoDecision>
	implements tipoDecision {
	public tipoDecisionClp() {
	}

	public Class<?> getModelClass() {
		return tipoDecision.class;
	}

	public String getModelClassName() {
		return tipoDecision.class.getName();
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
		attributes.put("tipoDecision", getTipoDecision());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String tipoDecision = (String)attributes.get("tipoDecision");

		if (tipoDecision != null) {
			setTipoDecision(tipoDecision);
		}
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getTipoDecision() {
		return _tipoDecision;
	}

	public void setTipoDecision(String tipoDecision) {
		_tipoDecision = tipoDecision;
	}

	public BaseModel<?> gettipoDecisionRemoteModel() {
		return _tipoDecisionRemoteModel;
	}

	public void settipoDecisionRemoteModel(BaseModel<?> tipoDecisionRemoteModel) {
		_tipoDecisionRemoteModel = tipoDecisionRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			tipoDecisionLocalServiceUtil.addtipoDecision(this);
		}
		else {
			tipoDecisionLocalServiceUtil.updatetipoDecision(this);
		}
	}

	@Override
	public tipoDecision toEscapedModel() {
		return (tipoDecision)Proxy.newProxyInstance(tipoDecision.class.getClassLoader(),
			new Class[] { tipoDecision.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		tipoDecisionClp clone = new tipoDecisionClp();

		clone.setId(getId());
		clone.setTipoDecision(getTipoDecision());

		return clone;
	}

	public int compareTo(tipoDecision tipoDecision) {
		int value = 0;

		value = getTipoDecision().compareTo(tipoDecision.getTipoDecision());

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

		tipoDecisionClp tipoDecision = null;

		try {
			tipoDecision = (tipoDecisionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = tipoDecision.getPrimaryKey();

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
		sb.append(", tipoDecision=");
		sb.append(getTipoDecision());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.tipoDecision");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipoDecision</column-name><column-value><![CDATA[");
		sb.append(getTipoDecision());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _tipoDecision;
	private BaseModel<?> _tipoDecisionRemoteModel;
}