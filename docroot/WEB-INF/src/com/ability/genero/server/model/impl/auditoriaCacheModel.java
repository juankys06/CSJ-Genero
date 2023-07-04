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

import com.ability.genero.server.model.auditoria;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing auditoria in entity cache.
 *
 * @author DELL Villartech
 * @see auditoria
 * @generated
 */
public class auditoriaCacheModel implements CacheModel<auditoria>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", fecha=");
		sb.append(fecha);
		sb.append(", evento=");
		sb.append(evento);
		sb.append(", tabla=");
		sb.append(tabla);
		sb.append(", logs=");
		sb.append(logs);
		sb.append(", idUser=");
		sb.append(idUser);
		sb.append("}");

		return sb.toString();
	}

	public auditoria toEntityModel() {
		auditoriaImpl auditoriaImpl = new auditoriaImpl();

		auditoriaImpl.setId(id);

		if (fecha == Long.MIN_VALUE) {
			auditoriaImpl.setFecha(null);
		}
		else {
			auditoriaImpl.setFecha(new Date(fecha));
		}

		if (evento == null) {
			auditoriaImpl.setEvento(StringPool.BLANK);
		}
		else {
			auditoriaImpl.setEvento(evento);
		}

		if (tabla == null) {
			auditoriaImpl.setTabla(StringPool.BLANK);
		}
		else {
			auditoriaImpl.setTabla(tabla);
		}

		if (logs == null) {
			auditoriaImpl.setLogs(StringPool.BLANK);
		}
		else {
			auditoriaImpl.setLogs(logs);
		}

		auditoriaImpl.setIdUser(idUser);

		auditoriaImpl.resetOriginalValues();

		return auditoriaImpl;
	}

	public long id;
	public long fecha;
	public String evento;
	public String tabla;
	public String logs;
	public long idUser;
}