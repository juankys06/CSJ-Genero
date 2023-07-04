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

import com.ability.genero.server.model.distritoG;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing distritoG in entity cache.
 *
 * @author DELL Villartech
 * @see distritoG
 * @generated
 */
public class distritoGCacheModel implements CacheModel<distritoG>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", nombre_mascara=");
		sb.append(nombre_mascara);
		sb.append("}");

		return sb.toString();
	}

	public distritoG toEntityModel() {
		distritoGImpl distritoGImpl = new distritoGImpl();

		distritoGImpl.setId(id);

		if (nombre == null) {
			distritoGImpl.setNombre(StringPool.BLANK);
		}
		else {
			distritoGImpl.setNombre(nombre);
		}

		if (nombre_mascara == null) {
			distritoGImpl.setNombre_mascara(StringPool.BLANK);
		}
		else {
			distritoGImpl.setNombre_mascara(nombre_mascara);
		}

		distritoGImpl.resetOriginalValues();

		return distritoGImpl;
	}

	public int id;
	public String nombre;
	public String nombre_mascara;
}