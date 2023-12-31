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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the categoria service. Represents a row in the &quot;GENERO_CATEGORIA&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ability.genero.server.model.impl.categoriaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ability.genero.server.model.impl.categoriaImpl}.
 * </p>
 *
 * @author DELL Villartech
 * @see categoria
 * @see com.ability.genero.server.model.impl.categoriaImpl
 * @see com.ability.genero.server.model.impl.categoriaModelImpl
 * @generated
 */
public interface categoriaModel extends BaseModel<categoria> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a categoria model instance should use the {@link categoria} interface instead.
	 */

	/**
	 * Returns the primary key of this categoria.
	 *
	 * @return the primary key of this categoria
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this categoria.
	 *
	 * @param primaryKey the primary key of this categoria
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this categoria.
	 *
	 * @return the ID of this categoria
	 */
	public int getId();

	/**
	 * Sets the ID of this categoria.
	 *
	 * @param id the ID of this categoria
	 */
	public void setId(int id);

	/**
	 * Returns the categoria of this categoria.
	 *
	 * @return the categoria of this categoria
	 */
	@AutoEscape
	public String getCategoria();

	/**
	 * Sets the categoria of this categoria.
	 *
	 * @param categoria the categoria of this categoria
	 */
	public void setCategoria(String categoria);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(categoria categoria);

	public int hashCode();

	public CacheModel<categoria> toCacheModel();

	public categoria toEscapedModel();

	public String toString();

	public String toXmlString();
}