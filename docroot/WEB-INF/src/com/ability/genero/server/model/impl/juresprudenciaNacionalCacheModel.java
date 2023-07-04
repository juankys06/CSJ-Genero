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

import com.ability.genero.server.model.juresprudenciaNacional;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing juresprudenciaNacional in entity cache.
 *
 * @author DELL Villartech
 * @see juresprudenciaNacional
 * @generated
 */
public class juresprudenciaNacionalCacheModel implements CacheModel<juresprudenciaNacional>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", referencias=");
		sb.append(referencias);
		sb.append(", corporacion=");
		sb.append(corporacion);
		sb.append(", url=");
		sb.append(url);
		sb.append(", ambito=");
		sb.append(ambito);
		sb.append("}");

		return sb.toString();
	}

	public juresprudenciaNacional toEntityModel() {
		juresprudenciaNacionalImpl juresprudenciaNacionalImpl = new juresprudenciaNacionalImpl();

		juresprudenciaNacionalImpl.setId(id);

		if (referencias == null) {
			juresprudenciaNacionalImpl.setReferencias(StringPool.BLANK);
		}
		else {
			juresprudenciaNacionalImpl.setReferencias(referencias);
		}

		if (corporacion == null) {
			juresprudenciaNacionalImpl.setCorporacion(StringPool.BLANK);
		}
		else {
			juresprudenciaNacionalImpl.setCorporacion(corporacion);
		}

		if (url == null) {
			juresprudenciaNacionalImpl.setUrl(StringPool.BLANK);
		}
		else {
			juresprudenciaNacionalImpl.setUrl(url);
		}

		if (ambito == null) {
			juresprudenciaNacionalImpl.setAmbito(StringPool.BLANK);
		}
		else {
			juresprudenciaNacionalImpl.setAmbito(ambito);
		}

		juresprudenciaNacionalImpl.resetOriginalValues();

		return juresprudenciaNacionalImpl;
	}

	public int id;
	public String referencias;
	public String corporacion;
	public String url;
	public String ambito;
}