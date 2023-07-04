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

import com.ability.genero.server.model.normasNacionales;
import com.ability.genero.server.model.normasNacionalesModel;

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
 * The base model implementation for the normasNacionales service. Represents a row in the &quot;GENERO_NORMAS_NACIONALES&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ability.genero.server.model.normasNacionalesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link normasNacionalesImpl}.
 * </p>
 *
 * @author DELL Villartech
 * @see normasNacionalesImpl
 * @see com.ability.genero.server.model.normasNacionales
 * @see com.ability.genero.server.model.normasNacionalesModel
 * @generated
 */
public class normasNacionalesModelImpl extends BaseModelImpl<normasNacionales>
	implements normasNacionalesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a normas nacionales model instance should use the {@link com.ability.genero.server.model.normasNacionales} interface instead.
	 */
	public static final String TABLE_NAME = "GENERO_NORMAS_NACIONALES";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.INTEGER },
			{ "NORMATIVAS", Types.VARCHAR },
			{ "ANHIO", Types.VARCHAR },
			{ "URL", Types.VARCHAR },
			{ "AMBITO", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table GENERO_NORMAS_NACIONALES (ID INTEGER not null primary key,NORMATIVAS VARCHAR(75) null,ANHIO VARCHAR(75) null,URL VARCHAR(75) null,AMBITO VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table GENERO_NORMAS_NACIONALES";
	public static final String ORDER_BY_JPQL = " ORDER BY normasNacionales.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY GENERO_NORMAS_NACIONALES.ID ASC";
	public static final String DATA_SOURCE = "base_datos_csjDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ability.genero.server.model.normasNacionales"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ability.genero.server.model.normasNacionales"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ability.genero.server.model.normasNacionales"));

	public normasNacionalesModelImpl() {
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
		return normasNacionales.class;
	}

	public String getModelClassName() {
		return normasNacionales.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("normativas", getNormativas());
		attributes.put("anhio", getAnhio());
		attributes.put("url", getUrl());
		attributes.put("ambito", getAmbito());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String normativas = (String)attributes.get("normativas");

		if (normativas != null) {
			setNormativas(normativas);
		}

		String anhio = (String)attributes.get("anhio");

		if (anhio != null) {
			setAnhio(anhio);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String ambito = (String)attributes.get("ambito");

		if (ambito != null) {
			setAmbito(ambito);
		}
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getNormativas() {
		if (_normativas == null) {
			return StringPool.BLANK;
		}
		else {
			return _normativas;
		}
	}

	public void setNormativas(String normativas) {
		_normativas = normativas;
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

	public String getAmbito() {
		if (_ambito == null) {
			return StringPool.BLANK;
		}
		else {
			return _ambito;
		}
	}

	public void setAmbito(String ambito) {
		_ambito = ambito;
	}

	@Override
	public normasNacionales toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (normasNacionales)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		normasNacionalesImpl normasNacionalesImpl = new normasNacionalesImpl();

		normasNacionalesImpl.setId(getId());
		normasNacionalesImpl.setNormativas(getNormativas());
		normasNacionalesImpl.setAnhio(getAnhio());
		normasNacionalesImpl.setUrl(getUrl());
		normasNacionalesImpl.setAmbito(getAmbito());

		normasNacionalesImpl.resetOriginalValues();

		return normasNacionalesImpl;
	}

	public int compareTo(normasNacionales normasNacionales) {
		int value = 0;

		if (getId() < normasNacionales.getId()) {
			value = -1;
		}
		else if (getId() > normasNacionales.getId()) {
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

		normasNacionales normasNacionales = null;

		try {
			normasNacionales = (normasNacionales)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = normasNacionales.getPrimaryKey();

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
	public CacheModel<normasNacionales> toCacheModel() {
		normasNacionalesCacheModel normasNacionalesCacheModel = new normasNacionalesCacheModel();

		normasNacionalesCacheModel.id = getId();

		normasNacionalesCacheModel.normativas = getNormativas();

		String normativas = normasNacionalesCacheModel.normativas;

		if ((normativas != null) && (normativas.length() == 0)) {
			normasNacionalesCacheModel.normativas = null;
		}

		normasNacionalesCacheModel.anhio = getAnhio();

		String anhio = normasNacionalesCacheModel.anhio;

		if ((anhio != null) && (anhio.length() == 0)) {
			normasNacionalesCacheModel.anhio = null;
		}

		normasNacionalesCacheModel.url = getUrl();

		String url = normasNacionalesCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			normasNacionalesCacheModel.url = null;
		}

		normasNacionalesCacheModel.ambito = getAmbito();

		String ambito = normasNacionalesCacheModel.ambito;

		if ((ambito != null) && (ambito.length() == 0)) {
			normasNacionalesCacheModel.ambito = null;
		}

		return normasNacionalesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", normativas=");
		sb.append(getNormativas());
		sb.append(", anhio=");
		sb.append(getAnhio());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", ambito=");
		sb.append(getAmbito());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.normasNacionales");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>normativas</column-name><column-value><![CDATA[");
		sb.append(getNormativas());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anhio</column-name><column-value><![CDATA[");
		sb.append(getAnhio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ambito</column-name><column-value><![CDATA[");
		sb.append(getAmbito());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = normasNacionales.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			normasNacionales.class
		};
	private int _id;
	private String _normativas;
	private String _anhio;
	private String _url;
	private String _ambito;
	private normasNacionales _escapedModelProxy;
}