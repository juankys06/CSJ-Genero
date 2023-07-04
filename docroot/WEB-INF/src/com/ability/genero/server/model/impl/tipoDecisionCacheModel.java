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

import com.ability.genero.server.model.tipoDecision;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing tipoDecision in entity cache.
 *
 * @author DELL Villartech
 * @see tipoDecision
 * @generated
 */
public class tipoDecisionCacheModel implements CacheModel<tipoDecision>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tipoDecision=");
		sb.append(tipoDecision);
		sb.append("}");

		return sb.toString();
	}

	public tipoDecision toEntityModel() {
		tipoDecisionImpl tipoDecisionImpl = new tipoDecisionImpl();

		tipoDecisionImpl.setId(id);

		if (tipoDecision == null) {
			tipoDecisionImpl.setTipoDecision(StringPool.BLANK);
		}
		else {
			tipoDecisionImpl.setTipoDecision(tipoDecision);
		}

		tipoDecisionImpl.resetOriginalValues();

		return tipoDecisionImpl;
	}

	public int id;
	public String tipoDecision;
}