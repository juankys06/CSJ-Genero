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

package com.ability.genero.server.service.impl;

import java.util.List;

import com.ability.genero.server.model.generoUsuarioComite;
import com.ability.genero.server.service.base.generoUsuarioComiteLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the genero usuario comite local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ability.genero.server.service.generoUsuarioComiteLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author DELL Villartech
 * @see com.ability.genero.server.service.base.generoUsuarioComiteLocalServiceBaseImpl
 * @see com.ability.genero.server.service.generoUsuarioComiteLocalServiceUtil
 */
public class generoUsuarioComiteLocalServiceImpl
	extends generoUsuarioComiteLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ability.genero.server.service.generoUsuarioComiteLocalServiceUtil} to access the genero usuario comite local service.
	 */
	public List<generoUsuarioComite> findByPorUsuario(String id) throws SystemException{
		return generoUsuarioComitePersistence.findByporUsuario(id);
	}
}