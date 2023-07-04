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

import com.ability.genero.server.model.juresprudenciaInternacional;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing juresprudenciaInternacional in entity cache.
 *
 * @author DELL Villartech
 * @see juresprudenciaInternacional
 * @generated
 */
public class juresprudenciaInternacionalCacheModel implements CacheModel<juresprudenciaInternacional>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", referencias=");
		sb.append(referencias);
		sb.append(", anhio=");
		sb.append(anhio);
		sb.append(", url=");
		sb.append(url);
		sb.append("}");

		return sb.toString();
	}

	public juresprudenciaInternacional toEntityModel() {
		juresprudenciaInternacionalImpl juresprudenciaInternacionalImpl = new juresprudenciaInternacionalImpl();

		juresprudenciaInternacionalImpl.setId(id);

		if (referencias == null) {
			juresprudenciaInternacionalImpl.setReferencias(StringPool.BLANK);
		}
		else {
			juresprudenciaInternacionalImpl.setReferencias(referencias);
		}

		if (anhio == null) {
			juresprudenciaInternacionalImpl.setAnhio(StringPool.BLANK);
		}
		else {
			juresprudenciaInternacionalImpl.setAnhio(anhio);
		}

		if (url == null) {
			juresprudenciaInternacionalImpl.setUrl(StringPool.BLANK);
		}
		else {
			juresprudenciaInternacionalImpl.setUrl(url);
		}

		juresprudenciaInternacionalImpl.resetOriginalValues();

		return juresprudenciaInternacionalImpl;
	}

	public int id;
	public String referencias;
	public String anhio;
	public String url;
}