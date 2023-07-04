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

import com.ability.genero.server.model.encuestaCriterios;
import com.ability.genero.server.model.encuestaCriteriosModel;

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
 * The base model implementation for the encuestaCriterios service. Represents a row in the &quot;GENERO_ENCUESTA_CRITERIOS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ability.genero.server.model.encuestaCriteriosModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link encuestaCriteriosImpl}.
 * </p>
 *
 * @author DELL Villartech
 * @see encuestaCriteriosImpl
 * @see com.ability.genero.server.model.encuestaCriterios
 * @see com.ability.genero.server.model.encuestaCriteriosModel
 * @generated
 */
public class encuestaCriteriosModelImpl extends BaseModelImpl<encuestaCriterios>
	implements encuestaCriteriosModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a encuesta criterios model instance should use the {@link com.ability.genero.server.model.encuestaCriterios} interface instead.
	 */
	public static final String TABLE_NAME = "GENERO_ENCUESTA_CRITERIOS";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.INTEGER },
			{ "PREGUNTA", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table GENERO_ENCUESTA_CRITERIOS (ID INTEGER not null primary key,PREGUNTA VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table GENERO_ENCUESTA_CRITERIOS";
	public static final String ORDER_BY_JPQL = " ORDER BY encuestaCriterios.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY GENERO_ENCUESTA_CRITERIOS.ID ASC";
	public static final String DATA_SOURCE = "base_datos_csjDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ability.genero.server.model.encuestaCriterios"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ability.genero.server.model.encuestaCriterios"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ability.genero.server.model.encuestaCriterios"));

	public encuestaCriteriosModelImpl() {
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
		return encuestaCriterios.class;
	}

	public String getModelClassName() {
		return encuestaCriterios.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("pregunta", getPregunta());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String pregunta = (String)attributes.get("pregunta");

		if (pregunta != null) {
			setPregunta(pregunta);
		}
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getPregunta() {
		if (_pregunta == null) {
			return StringPool.BLANK;
		}
		else {
			return _pregunta;
		}
	}

	public void setPregunta(String pregunta) {
		_pregunta = pregunta;
	}

	@Override
	public encuestaCriterios toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (encuestaCriterios)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		encuestaCriteriosImpl encuestaCriteriosImpl = new encuestaCriteriosImpl();

		encuestaCriteriosImpl.setId(getId());
		encuestaCriteriosImpl.setPregunta(getPregunta());

		encuestaCriteriosImpl.resetOriginalValues();

		return encuestaCriteriosImpl;
	}

	public int compareTo(encuestaCriterios encuestaCriterios) {
		int value = 0;

		if (getId() < encuestaCriterios.getId()) {
			value = -1;
		}
		else if (getId() > encuestaCriterios.getId()) {
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

		encuestaCriterios encuestaCriterios = null;

		try {
			encuestaCriterios = (encuestaCriterios)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = encuestaCriterios.getPrimaryKey();

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
	public CacheModel<encuestaCriterios> toCacheModel() {
		encuestaCriteriosCacheModel encuestaCriteriosCacheModel = new encuestaCriteriosCacheModel();

		encuestaCriteriosCacheModel.id = getId();

		encuestaCriteriosCacheModel.pregunta = getPregunta();

		String pregunta = encuestaCriteriosCacheModel.pregunta;

		if ((pregunta != null) && (pregunta.length() == 0)) {
			encuestaCriteriosCacheModel.pregunta = null;
		}

		return encuestaCriteriosCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", pregunta=");
		sb.append(getPregunta());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.ability.genero.server.model.encuestaCriterios");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pregunta</column-name><column-value><![CDATA[");
		sb.append(getPregunta());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = encuestaCriterios.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			encuestaCriterios.class
		};
	private int _id;
	private String _pregunta;
	private encuestaCriterios _escapedModelProxy;
}