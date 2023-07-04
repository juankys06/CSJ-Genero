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

import com.ability.genero.server.model.generoUsuarioComite;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing generoUsuarioComite in entity cache.
 *
 * @author DELL Villartech
 * @see generoUsuarioComite
 * @generated
 */
public class generoUsuarioComiteCacheModel implements CacheModel<generoUsuarioComite>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", Distrito=");
		sb.append(Distrito);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", fecha_creacion=");
		sb.append(fecha_creacion);
		sb.append("}");

		return sb.toString();
	}

	public generoUsuarioComite toEntityModel() {
		generoUsuarioComiteImpl generoUsuarioComiteImpl = new generoUsuarioComiteImpl();

		generoUsuarioComiteImpl.setId(id);

		if (Distrito == null) {
			generoUsuarioComiteImpl.setDistrito(StringPool.BLANK);
		}
		else {
			generoUsuarioComiteImpl.setDistrito(Distrito);
		}

		if (userId == null) {
			generoUsuarioComiteImpl.setUserId(StringPool.BLANK);
		}
		else {
			generoUsuarioComiteImpl.setUserId(userId);
		}

		if (fecha_creacion == Long.MIN_VALUE) {
			generoUsuarioComiteImpl.setFecha_creacion(null);
		}
		else {
			generoUsuarioComiteImpl.setFecha_creacion(new Date(fecha_creacion));
		}

		generoUsuarioComiteImpl.resetOriginalValues();

		return generoUsuarioComiteImpl;
	}

	public int id;
	public String Distrito;
	public String userId;
	public long fecha_creacion;
}