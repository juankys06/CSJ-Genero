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

package com.ability.genero.server.service.messaging;

import com.ability.genero.server.service.ClpSerializer;
import com.ability.genero.server.service.auditoriaLocalServiceUtil;
import com.ability.genero.server.service.casoLVLocalServiceUtil;
import com.ability.genero.server.service.categoriaLocalServiceUtil;
import com.ability.genero.server.service.claseProcesoLocalServiceUtil;
import com.ability.genero.server.service.distritoGLocalServiceUtil;
import com.ability.genero.server.service.encuestaCriteriosLocalServiceUtil;
import com.ability.genero.server.service.encuestaEnfoDifeLocalServiceUtil;
import com.ability.genero.server.service.generoUsuarioComiteLocalServiceUtil;
import com.ability.genero.server.service.generoUsuarioLocalServiceUtil;
import com.ability.genero.server.service.juresprudenciaInternacionalLocalServiceUtil;
import com.ability.genero.server.service.juresprudenciaNacionalLocalServiceUtil;
import com.ability.genero.server.service.normasInteracionalesLocalServiceUtil;
import com.ability.genero.server.service.normasNacionalesLocalServiceUtil;
import com.ability.genero.server.service.preguntasClaveLocalServiceUtil;
import com.ability.genero.server.service.subcategoriaLocalServiceUtil;
import com.ability.genero.server.service.tipoDecisionLocalServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			auditoriaLocalServiceUtil.clearService();

			casoLVLocalServiceUtil.clearService();

			categoriaLocalServiceUtil.clearService();

			claseProcesoLocalServiceUtil.clearService();

			distritoGLocalServiceUtil.clearService();

			encuestaCriteriosLocalServiceUtil.clearService();

			encuestaEnfoDifeLocalServiceUtil.clearService();

			generoUsuarioLocalServiceUtil.clearService();

			generoUsuarioComiteLocalServiceUtil.clearService();

			juresprudenciaInternacionalLocalServiceUtil.clearService();

			juresprudenciaNacionalLocalServiceUtil.clearService();

			normasInteracionalesLocalServiceUtil.clearService();

			normasNacionalesLocalServiceUtil.clearService();

			preguntasClaveLocalServiceUtil.clearService();

			subcategoriaLocalServiceUtil.clearService();

			tipoDecisionLocalServiceUtil.clearService();
		}
	}
}