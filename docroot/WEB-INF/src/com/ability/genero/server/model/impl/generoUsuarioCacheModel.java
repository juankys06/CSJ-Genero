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

import com.ability.genero.server.model.generoUsuario;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing generoUsuario in entity cache.
 *
 * @author DELL Villartech
 * @see generoUsuario
 * @generated
 */
public class generoUsuarioCacheModel implements CacheModel<generoUsuario>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", despacho=");
		sb.append(despacho);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", fecha_creacion=");
		sb.append(fecha_creacion);
		sb.append("}");

		return sb.toString();
	}

	public generoUsuario toEntityModel() {
		generoUsuarioImpl generoUsuarioImpl = new generoUsuarioImpl();

		generoUsuarioImpl.setId(id);

		if (despacho == null) {
			generoUsuarioImpl.setDespacho(StringPool.BLANK);
		}
		else {
			generoUsuarioImpl.setDespacho(despacho);
		}

		if (userId == null) {
			generoUsuarioImpl.setUserId(StringPool.BLANK);
		}
		else {
			generoUsuarioImpl.setUserId(userId);
		}

		if (fecha_creacion == Long.MIN_VALUE) {
			generoUsuarioImpl.setFecha_creacion(null);
		}
		else {
			generoUsuarioImpl.setFecha_creacion(new Date(fecha_creacion));
		}

		generoUsuarioImpl.resetOriginalValues();

		return generoUsuarioImpl;
	}

	public int id;
	public String despacho;
	public String userId;
	public long fecha_creacion;
}