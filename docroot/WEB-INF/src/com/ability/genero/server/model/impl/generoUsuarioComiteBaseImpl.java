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
import com.ability.genero.server.service.generoUsuarioComiteLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the generoUsuarioComite service. Represents a row in the &quot;GENERO_USUARIOS_COMITE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link generoUsuarioComiteImpl}.
 * </p>
 *
 * @author DELL Villartech
 * @see generoUsuarioComiteImpl
 * @see com.ability.genero.server.model.generoUsuarioComite
 * @generated
 */
public abstract class generoUsuarioComiteBaseImpl
	extends generoUsuarioComiteModelImpl implements generoUsuarioComite {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a genero usuario comite model instance should use the {@link generoUsuarioComite} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			generoUsuarioComiteLocalServiceUtil.addgeneroUsuarioComite(this);
		}
		else {
			generoUsuarioComiteLocalServiceUtil.updategeneroUsuarioComite(this);
		}
	}
}