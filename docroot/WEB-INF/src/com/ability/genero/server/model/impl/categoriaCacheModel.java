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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing categoria in entity cache.
 *
 * @author DELL Villartech
 * @see categoria
 * @generated
 */
public class categoriaCacheModel implements CacheModel<categoria>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{id=");
		sb.append(id);
		sb.append(", categoria=");
		sb.append(categoria);
		sb.append("}");

		return sb.toString();
	}

	public categoria toEntityModel() {
		categoriaImpl categoriaImpl = new categoriaImpl();

		categoriaImpl.setId(id);

		if (categoria == null) {
			categoriaImpl.setCategoria(StringPool.BLANK);
		}
		else {
			categoriaImpl.setCategoria(categoria);
		}

		categoriaImpl.resetOriginalValues();

		return categoriaImpl;
	}

	public int id;
	public String categoria;
}