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
 * The base model interface for the juresprudenciaInternacional service. Represents a row in the &quot;GENERO_JURISPRUDENCIA_INTERNACIONAL&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ability.genero.server.model.impl.juresprudenciaInternacionalModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ability.genero.server.model.impl.juresprudenciaInternacionalImpl}.
 * </p>
 *
 * @author DELL Villartech
 * @see juresprudenciaInternacional
 * @see com.ability.genero.server.model.impl.juresprudenciaInternacionalImpl
 * @see com.ability.genero.server.model.impl.juresprudenciaInternacionalModelImpl
 * @generated
 */
public interface juresprudenciaInternacionalModel extends BaseModel<juresprudenciaInternacional> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a juresprudencia internacional model instance should use the {@link juresprudenciaInternacional} interface instead.
	 */

	/**
	 * Returns the primary key of this juresprudencia internacional.
	 *
	 * @return the primary key of this juresprudencia internacional
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this juresprudencia internacional.
	 *
	 * @param primaryKey the primary key of this juresprudencia internacional
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this juresprudencia internacional.
	 *
	 * @return the ID of this juresprudencia internacional
	 */
	public int getId();

	/**
	 * Sets the ID of this juresprudencia internacional.
	 *
	 * @param id the ID of this juresprudencia internacional
	 */
	public void setId(int id);

	/**
	 * Returns the referencias of this juresprudencia internacional.
	 *
	 * @return the referencias of this juresprudencia internacional
	 */
	@AutoEscape
	public String getReferencias();

	/**
	 * Sets the referencias of this juresprudencia internacional.
	 *
	 * @param referencias the referencias of this juresprudencia internacional
	 */
	public void setReferencias(String referencias);

	/**
	 * Returns the anhio of this juresprudencia internacional.
	 *
	 * @return the anhio of this juresprudencia internacional
	 */
	@AutoEscape
	public String getAnhio();

	/**
	 * Sets the anhio of this juresprudencia internacional.
	 *
	 * @param anhio the anhio of this juresprudencia internacional
	 */
	public void setAnhio(String anhio);

	/**
	 * Returns the url of this juresprudencia internacional.
	 *
	 * @return the url of this juresprudencia internacional
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this juresprudencia internacional.
	 *
	 * @param url the url of this juresprudencia internacional
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

	public int compareTo(
		juresprudenciaInternacional juresprudenciaInternacional);

	public int hashCode();

	public CacheModel<juresprudenciaInternacional> toCacheModel();

	public juresprudenciaInternacional toEscapedModel();

	public String toString();

	public String toXmlString();
}