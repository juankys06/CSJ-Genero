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

import com.ability.genero.server.model.casoLV;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing casoLV in entity cache.
 *
 * @author DELL Villartech
 * @see casoLV
 * @generated
 */
public class casoLVCacheModel implements CacheModel<casoLV>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(id);
		sb.append(", despacho=");
		sb.append(despacho);
		sb.append(", radicacion=");
		sb.append(radicacion);
		sb.append(", demandante=");
		sb.append(demandante);
		sb.append(", demandado=");
		sb.append(demandado);
		sb.append(", claseProceso=");
		sb.append(claseProceso);
		sb.append(", tipoDecision=");
		sb.append(tipoDecision);
		sb.append(", ponente=");
		sb.append(ponente);
		sb.append(", fecha=");
		sb.append(fecha);
		sb.append(", categoria=");
		sb.append(categoria);
		sb.append(", subCategoria=");
		sb.append(subCategoria);
		sb.append(", respuestas1=");
		sb.append(respuestas1);
		sb.append(", respuestas2=");
		sb.append(respuestas2);
		sb.append(", anhio=");
		sb.append(anhio);
		sb.append(", generoDemandante=");
		sb.append(generoDemandante);
		sb.append(", generoDemandado=");
		sb.append(generoDemandado);
		sb.append(", archivo=");
		sb.append(archivo);
		sb.append("}");

		return sb.toString();
	}

	public casoLV toEntityModel() {
		casoLVImpl casoLVImpl = new casoLVImpl();

		casoLVImpl.setId(id);

		if (despacho == null) {
			casoLVImpl.setDespacho(StringPool.BLANK);
		}
		else {
			casoLVImpl.setDespacho(despacho);
		}

		if (radicacion == null) {
			casoLVImpl.setRadicacion(StringPool.BLANK);
		}
		else {
			casoLVImpl.setRadicacion(radicacion);
		}

		if (demandante == null) {
			casoLVImpl.setDemandante(StringPool.BLANK);
		}
		else {
			casoLVImpl.setDemandante(demandante);
		}

		if (demandado == null) {
			casoLVImpl.setDemandado(StringPool.BLANK);
		}
		else {
			casoLVImpl.setDemandado(demandado);
		}

		if (claseProceso == null) {
			casoLVImpl.setClaseProceso(StringPool.BLANK);
		}
		else {
			casoLVImpl.setClaseProceso(claseProceso);
		}

		if (tipoDecision == null) {
			casoLVImpl.setTipoDecision(StringPool.BLANK);
		}
		else {
			casoLVImpl.setTipoDecision(tipoDecision);
		}

		if (ponente == null) {
			casoLVImpl.setPonente(StringPool.BLANK);
		}
		else {
			casoLVImpl.setPonente(ponente);
		}

		if (fecha == Long.MIN_VALUE) {
			casoLVImpl.setFecha(null);
		}
		else {
			casoLVImpl.setFecha(new Date(fecha));
		}

		if (categoria == null) {
			casoLVImpl.setCategoria(StringPool.BLANK);
		}
		else {
			casoLVImpl.setCategoria(categoria);
		}

		if (subCategoria == null) {
			casoLVImpl.setSubCategoria(StringPool.BLANK);
		}
		else {
			casoLVImpl.setSubCategoria(subCategoria);
		}

		if (respuestas1 == null) {
			casoLVImpl.setRespuestas1(StringPool.BLANK);
		}
		else {
			casoLVImpl.setRespuestas1(respuestas1);
		}

		if (respuestas2 == null) {
			casoLVImpl.setRespuestas2(StringPool.BLANK);
		}
		else {
			casoLVImpl.setRespuestas2(respuestas2);
		}

		if (anhio == null) {
			casoLVImpl.setAnhio(StringPool.BLANK);
		}
		else {
			casoLVImpl.setAnhio(anhio);
		}

		if (generoDemandante == null) {
			casoLVImpl.setGeneroDemandante(StringPool.BLANK);
		}
		else {
			casoLVImpl.setGeneroDemandante(generoDemandante);
		}

		if (generoDemandado == null) {
			casoLVImpl.setGeneroDemandado(StringPool.BLANK);
		}
		else {
			casoLVImpl.setGeneroDemandado(generoDemandado);
		}

		if (archivo == null) {
			casoLVImpl.setArchivo(StringPool.BLANK);
		}
		else {
			casoLVImpl.setArchivo(archivo);
		}

		casoLVImpl.resetOriginalValues();

		return casoLVImpl;
	}

	public int id;
	public String despacho;
	public String radicacion;
	public String demandante;
	public String demandado;
	public String claseProceso;
	public String tipoDecision;
	public String ponente;
	public long fecha;
	public String categoria;
	public String subCategoria;
	public String respuestas1;
	public String respuestas2;
	public String anhio;
	public String generoDemandante;
	public String generoDemandado;
	public String archivo;
}