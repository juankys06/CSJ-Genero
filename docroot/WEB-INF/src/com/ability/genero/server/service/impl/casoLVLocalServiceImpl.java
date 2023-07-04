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

import com.ability.genero.server.model.casoLV;
import com.ability.genero.server.service.base.casoLVLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the caso l v local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ability.genero.server.service.casoLVLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author DELL Villartech
 * @see com.ability.genero.server.service.base.casoLVLocalServiceBaseImpl
 * @see com.ability.genero.server.service.casoLVLocalServiceUtil
 */
public class casoLVLocalServiceImpl extends casoLVLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ability.genero.server.service.casoLVLocalServiceUtil} to access the caso l v local service.
	 */
	public List<casoLV> findByDespacho(String despacho) throws SystemException{
		return casoLVPersistence.findByporDespacho(despacho);
	}
	
	public List<casoLV> findByDespachoAnhio(String despacho,String anhio) throws SystemException{
		return casoLVPersistence.findByporAnhio(despacho,anhio);
	}
	
	
	public List<casoLV> findByDespachoAnhioAdmin(String anhio) throws SystemException{
		return casoLVPersistence.findByporAnhioAdmin(anhio);
	}
}