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

package com.ability.genero.server.model.impl;

import com.ability.genero.server.model.normasInteracionales;
import com.ability.genero.server.model.normasInteracionalesModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the normasInteracionales service. Represents a row in the &quot;GENERO_NORMAS_INTERNACIONALES&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ability.genero.server.model.normasInteracionalesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link normasInteracionalesImpl}.
 * </p>
 *
 * @author DELL Villartech
 * @see normasInteracionalesImpl
 * @see com.ability.genero.server.model.normasInteracionales
 * @see com.ability.genero.server.model.normasInteracionalesModel
 * @generated
 */
public class normasInteracionalesModelImpl extends BaseModelImpl<normasInteracionales>
	implements normasInteracionalesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a normas interacionales model instance should use the {@link com.ability.genero.server.model.normasInteracionales} interface instead.
	 */
	public static final String TABLE_NAME = "GENERO_NORMAS_INTERNACIONALES";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.INTEGER },
			{ "CONFERENCIAS", Types.VARCHAR },
			{ "ANHIO", Types.VARCHAR },
			{ "URL", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table GENERO_NORMAS_INTERNACIONALES (ID INTEGER not null primary key,CONFERENCIAS VARCHAR(75) null,ANHIO VARCHAR(75) null,URL VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table GENERO_NORMAS_INTERNACIONALES";
	public static final String ORDER_BY_JPQL = " ORDER BY normasInteracionales.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY GENERO_NORMAS_INTERNACIONALES.ID ASC";
	public static final String DATA_SOURCE = "base_datos_csjDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ability.genero.server.model.normasInteracionales"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ability.genero.server.model.normasInteracionales"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ability.genero.server.model.normasInteracionales"));

	public normasInteracionalesModelImpl() {
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

	public Class<?> getModelClass() {
		return normasInteracionales.class;
	}

	public String getModelClassName() {
		return normasInteracionales.class.getName();
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
		if (_conferencias == null) {
			return StringPool.BLANK;
		}
		else {
			return _conferencias;
		}
	}

	public void setConferencias(String conferencias) {
		_conferencias = conferencias;
	}

	public String getAnhio() {
		if (_anhio == null) {
			return StringPool.BLANK;
		}
		else {
			return _anhio;
		}
	}

	public void setAnhio(String anhio) {
		_anhio = anhio;
	}

	public String getUrl() {
		if (_url == null) {
			return StringPool.BLANK;
		}
		else {
			return _url;
		}
	}

	public void setUrl(String url) {
		_url = url;
	}

	@Override
	public normasInteracionales toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (normasInteracionales)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		normasInteracionalesImpl normasInteracionalesImpl = new normasInteracionalesImpl();

		normasInteracionalesImpl.setId(getId());
		normasInteracionalesImpl.setConferencias(getConferencias());
		normasInteracionalesImpl.setAnhio(getAnhio());
		normasInteracionalesImpl.setUrl(getUrl());

		normasInteracionalesImpl.resetOriginalValues();

		return normasInteracionalesImpl;
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

		normasInteracionales normasInteracionales = null;

		try {
			normasInteracionales = (normasInteracionales)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<normasInteracionales> toCacheModel() {
		normasInteracionalesCacheModel normasInteracionalesCacheModel = new normasInteracionalesCacheModel();

		normasInteracionalesCacheModel.id = getId();

		normasInteracionalesCacheModel.conferencias = getConferencias();

		String conferencias = normasInteracionalesCacheModel.conferencias;

		if ((conferencias != null) && (conferencias.length() == 0)) {
			normasInteracionalesCacheModel.conferencias = null;
		}

		normasInteracionalesCacheModel.anhio = getAnhio();

		String anhio = normasInteracionalesCacheModel.anhio;

		if ((anhio != null) && (anhio.length() == 0)) {
			normasInteracionalesCacheModel.anhio = null;
		}

		normasInteracionalesCacheModel.url = getUrl();

		String url = normasInteracionalesCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			normasInteracionalesCacheModel.url = null;
		}

		return normasInteracionalesCacheModel;
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

	private static ClassLoader _classLoader = normasInteracionales.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			normasInteracionales.class
		};
	private int _id;
	private String _conferencias;
	private String _anhio;
	private String _url;
	private normasInteracionales _escapedModelProxy;
}