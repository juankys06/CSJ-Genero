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

import com.ability.genero.server.model.subcategoria;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing subcategoria in entity cache.
 *
 * @author DELL Villartech
 * @see subcategoria
 * @generated
 */
public class subcategoriaCacheModel implements CacheModel<subcategoria>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", idCategoria=");
		sb.append(idCategoria);
		sb.append(", subcategoria=");
		sb.append(subcategoria);
		sb.append(", url=");
		sb.append(url);
		sb.append("}");

		return sb.toString();
	}

	public subcategoria toEntityModel() {
		subcategoriaImpl subcategoriaImpl = new subcategoriaImpl();

		subcategoriaImpl.setId(id);
		subcategoriaImpl.setIdCategoria(idCategoria);

		if (subcategoria == null) {
			subcategoriaImpl.setSubcategoria(StringPool.BLANK);
		}
		else {
			subcategoriaImpl.setSubcategoria(subcategoria);
		}

		if (url == null) {
			subcategoriaImpl.setUrl(StringPool.BLANK);
		}
		else {
			subcategoriaImpl.setUrl(url);
		}

		subcategoriaImpl.resetOriginalValues();

		return subcategoriaImpl;
	}

	public int id;
	public int idCategoria;
	public String subcategoria;
	public String url;
}