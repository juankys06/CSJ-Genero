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
 * The base model interface for the subcategoria service. Represents a row in the &quot;GENERO_SUBCATEGORIA&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ability.genero.server.model.impl.subcategoriaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ability.genero.server.model.impl.subcategoriaImpl}.
 * </p>
 *
 * @author DELL Villartech
 * @see subcategoria
 * @see com.ability.genero.server.model.impl.subcategoriaImpl
 * @see com.ability.genero.server.model.impl.subcategoriaModelImpl
 * @generated
 */
public interface subcategoriaModel extends BaseModel<subcategoria> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a subcategoria model instance should use the {@link subcategoria} interface instead.
	 */

	/**
	 * Returns the primary key of this subcategoria.
	 *
	 * @return the primary key of this subcategoria
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this subcategoria.
	 *
	 * @param primaryKey the primary key of this subcategoria
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this subcategoria.
	 *
	 * @return the ID of this subcategoria
	 */
	public int getId();

	/**
	 * Sets the ID of this subcategoria.
	 *
	 * @param id the ID of this subcategoria
	 */
	public void setId(int id);

	/**
	 * Returns the id categoria of this subcategoria.
	 *
	 * @return the id categoria of this subcategoria
	 */
	public int getIdCategoria();

	/**
	 * Sets the id categoria of this subcategoria.
	 *
	 * @param idCategoria the id categoria of this subcategoria
	 */
	public void setIdCategoria(int idCategoria);

	/**
	 * Returns the subcategoria of this subcategoria.
	 *
	 * @return the subcategoria of this subcategoria
	 */
	@AutoEscape
	public String getSubcategoria();

	/**
	 * Sets the subcategoria of this subcategoria.
	 *
	 * @param subcategoria the subcategoria of this subcategoria
	 */
	public void setSubcategoria(String subcategoria);

	/**
	 * Returns the url of this subcategoria.
	 *
	 * @return the url of this subcategoria
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this subcategoria.
	 *
	 * @param url the url of this subcategoria
	 */
	public void setUrl(String url);

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

	public int compareTo(subcategoria subcategoria);

	public int hashCode();

	public CacheModel<subcategoria> toCacheModel();

	public subcategoria toEscapedModel();

	public String toString();

	public String toXmlString();
}