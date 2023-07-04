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

import com.ability.genero.server.model.categoria;
import com.ability.genero.server.model.categoriaModel;

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
 * The base model implementation for the categoria service. Represents a row in the &quot;GENERO_CATEGORIA&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ability.genero.server.model.categoriaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link categoriaImpl}.
 * </p>
 *
 * @author DELL Villartech
 * @see categoriaImpl
 * @see com.ability.genero.server.model.categoria
 * @see com.ability.genero.server.model.categoriaModel
 * @generated
 */
public class categoriaModelImpl extends BaseModelImpl<categoria>
	implements categoriaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a categoria model instance should use the {@link com.ability.genero.server.model.categoria} interface instead.
	 */
	public static final String TABLE_NAME = "GENERO_CATEGORIA";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.INTEGER },
			{ "CATEGORIA", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table GENERO_CATEGORIA (ID INTEGER not null primary key,CATEGORIA VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table GENERO_CATEGORIA";
	public static final String ORDER_BY_JPQL = " ORDER BY categoria.categoria ASC";
	public static final String ORDER_BY_SQL = " ORDER BY GENERO_CATEGORIA.CATEGORIA ASC";
	public static final String DATA_SOURCE = "base_datos_csjDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ability.genero.server.model.categoria"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ability.genero.server.model.categoria"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ability.genero.server.model.categoria"));

	public categoriaModelImpl() {
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
		return categoria.class;
	}

	public String getModelClassName() {
		return categoria.class.getName();
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
		if (_categoria == null) {
			return StringPool.BLANK;
		}
		else {
			return _categoria;
		}
	}

	public void setCategoria(String categoria) {
		_categoria = categoria;
	}

	@Override
	public categoria toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (categoria)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		categoriaImpl categoriaImpl = new categoriaImpl();

		categoriaImpl.setId(getId());
		categoriaImpl.setCategoria(getCategoria());

		categoriaImpl.resetOriginalValues();

		return categoriaImpl;
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

		categoria categoria = null;

		try {
			categoria = (categoria)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<categoria> toCacheModel() {
		categoriaCacheModel categoriaCacheModel = new categoriaCacheModel();

		categoriaCacheModel.id = getId();

		categoriaCacheModel.categoria = getCategoria();

		String categoria = categoriaCacheModel.categoria;

		if ((categoria != null) && (categoria.length() == 0)) {
			categoriaCacheModel.categoria = null;
		}

		return categoriaCacheModel;
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

	private static ClassLoader _classLoader = categoria.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			categoria.class
		};
	private int _id;
	private String _categoria;
	private categoria _escapedModelProxy;
}