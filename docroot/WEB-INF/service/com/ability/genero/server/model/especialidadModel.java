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
 * The base model interface for the especialidad service. Represents a row in the &quot;VC_ESPECIALIDAD&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ability.genero.server.model.impl.especialidadModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ability.genero.server.model.impl.especialidadImpl}.
 * </p>
 *
 * @author DELL Villartech
 * @see especialidad
 * @see com.ability.genero.server.model.impl.especialidadImpl
 * @see com.ability.genero.server.model.impl.especialidadModelImpl
 * @generated
 */
public interface especialidadModel extends BaseModel<especialidad> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a especialidad model instance should use the {@link especialidad} interface instead.
	 */

	/**
	 * Returns the primary key of this especialidad.
	 *
	 * @return the primary key of this especialidad
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this especialidad.
	 *
	 * @param primaryKey the primary key of this especialidad
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this especialidad.
	 *
	 * @return the ID of this especialidad
	 */
	public int getId();

	/**
	 * Sets the ID of this especialidad.
	 *
	 * @param id the ID of this especialidad
	 */
	public void setId(int id);

	/**
	 * Returns the nombre of this especialidad.
	 *
	 * @return the nombre of this especialidad
	 */
	@AutoEscape
	public String getNombre();

	/**
	 * Sets the nombre of this especialidad.
	 *
	 * @param nombre the nombre of this especialidad
	 */
	public void setNombre(String nombre);

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

	public int compareTo(especialidad especialidad);

	public int hashCode();

	public CacheModel<especialidad> toCacheModel();

	public especialidad toEscapedModel();

	public String toString();

	public String toXmlString();
}