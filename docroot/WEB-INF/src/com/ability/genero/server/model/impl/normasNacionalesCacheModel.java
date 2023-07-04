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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing normasNacionales in entity cache.
 *
 * @author DELL Villartech
 * @see normasNacionales
 * @generated
 */
public class normasNacionalesCacheModel implements CacheModel<normasNacionales>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", normativas=");
		sb.append(normativas);
		sb.append(", anhio=");
		sb.append(anhio);
		sb.append(", url=");
		sb.append(url);
		sb.append(", ambito=");
		sb.append(ambito);
		sb.append("}");

		return sb.toString();
	}

	public normasNacionales toEntityModel() {
		normasNacionalesImpl normasNacionalesImpl = new normasNacionalesImpl();

		normasNacionalesImpl.setId(id);

		if (normativas == null) {
			normasNacionalesImpl.setNormativas(StringPool.BLANK);
		}
		else {
			normasNacionalesImpl.setNormativas(normativas);
		}

		if (anhio == null) {
			normasNacionalesImpl.setAnhio(StringPool.BLANK);
		}
		else {
			normasNacionalesImpl.setAnhio(anhio);
		}

		if (url == null) {
			normasNacionalesImpl.setUrl(StringPool.BLANK);
		}
		else {
			normasNacionalesImpl.setUrl(url);
		}

		if (ambito == null) {
			normasNacionalesImpl.setAmbito(StringPool.BLANK);
		}
		else {
			normasNacionalesImpl.setAmbito(ambito);
		}

		normasNacionalesImpl.resetOriginalValues();

		return normasNacionalesImpl;
	}

	public int id;
	public String normativas;
	public String anhio;
	public String url;
	public String ambito;
}