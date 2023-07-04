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

import com.ability.genero.server.model.normasInteracionales;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing normasInteracionales in entity cache.
 *
 * @author DELL Villartech
 * @see normasInteracionales
 * @generated
 */
public class normasInteracionalesCacheModel implements CacheModel<normasInteracionales>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", conferencias=");
		sb.append(conferencias);
		sb.append(", anhio=");
		sb.append(anhio);
		sb.append(", url=");
		sb.append(url);
		sb.append("}");

		return sb.toString();
	}

	public normasInteracionales toEntityModel() {
		normasInteracionalesImpl normasInteracionalesImpl = new normasInteracionalesImpl();

		normasInteracionalesImpl.setId(id);

		if (conferencias == null) {
			normasInteracionalesImpl.setConferencias(StringPool.BLANK);
		}
		else {
			normasInteracionalesImpl.setConferencias(conferencias);
		}

		if (anhio == null) {
			normasInteracionalesImpl.setAnhio(StringPool.BLANK);
		}
		else {
			normasInteracionalesImpl.setAnhio(anhio);
		}

		if (url == null) {
			normasInteracionalesImpl.setUrl(StringPool.BLANK);
		}
		else {
			normasInteracionalesImpl.setUrl(url);
		}

		normasInteracionalesImpl.resetOriginalValues();

		return normasInteracionalesImpl;
	}

	public int id;
	public String conferencias;
	public String anhio;
	public String url;
}