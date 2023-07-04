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

import com.ability.genero.server.model.claseProceso;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing claseProceso in entity cache.
 *
 * @author DELL Villartech
 * @see claseProceso
 * @generated
 */
public class claseProcesoCacheModel implements CacheModel<claseProceso>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{id=");
		sb.append(id);
		sb.append(", claseProceso=");
		sb.append(claseProceso);
		sb.append("}");

		return sb.toString();
	}

	public claseProceso toEntityModel() {
		claseProcesoImpl claseProcesoImpl = new claseProcesoImpl();

		claseProcesoImpl.setId(id);

		if (claseProceso == null) {
			claseProcesoImpl.setClaseProceso(StringPool.BLANK);
		}
		else {
			claseProcesoImpl.setClaseProceso(claseProceso);
		}

		claseProcesoImpl.resetOriginalValues();

		return claseProcesoImpl;
	}

	public int id;
	public String claseProceso;
}