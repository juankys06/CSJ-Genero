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

package com.ability.genero.server.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link casoLV}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       casoLV
 * @generated
 */
public class casoLVWrapper implements casoLV, ModelWrapper<casoLV> {
	public casoLVWrapper(casoLV casoLV) {
		_casoLV = casoLV;
	}

	public Class<?> getModelClass() {
		return casoLV.class;
	}

	public String getModelClassName() {
		return casoLV.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("despacho", getDespacho());
		attributes.put("radicacion", getRadicacion());
		attributes.put("demandante", getDemandante());
		attributes.put("demandado", getDemandado());
		attributes.put("claseProceso", getClaseProceso());
		attributes.put("tipoDecision", getTipoDecision());
		attributes.put("ponente", getPonente());
		attributes.put("fecha", getFecha());
		attributes.put("categoria", getCategoria());
		attributes.put("subCategoria", getSubCategoria());
		attributes.put("respuestas1", getRespuestas1());
		attributes.put("respuestas2", getRespuestas2());
		attributes.put("anhio", getAnhio());
		attributes.put("generoDemandante", getGeneroDemandante());
		attributes.put("generoDemandado", getGeneroDemandado());
		attributes.put("archivo", getArchivo());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String despacho = (String)attributes.get("despacho");

		if (despacho != null) {
			setDespacho(despacho);
		}

		String radicacion = (String)attributes.get("radicacion");

		if (radicacion != null) {
			setRadicacion(radicacion);
		}

		String demandante = (String)attributes.get("demandante");

		if (demandante != null) {
			setDemandante(demandante);
		}

		String demandado = (String)attributes.get("demandado");

		if (demandado != null) {
			setDemandado(demandado);
		}

		String claseProceso = (String)attributes.get("claseProceso");

		if (claseProceso != null) {
			setClaseProceso(claseProceso);
		}

		String tipoDecision = (String)attributes.get("tipoDecision");

		if (tipoDecision != null) {
			setTipoDecision(tipoDecision);
		}

		String ponente = (String)attributes.get("ponente");

		if (ponente != null) {
			setPonente(ponente);
		}

		Date fecha = (Date)attributes.get("fecha");

		if (fecha != null) {
			setFecha(fecha);
		}

		String categoria = (String)attributes.get("categoria");

		if (categoria != null) {
			setCategoria(categoria);
		}

		String subCategoria = (String)attributes.get("subCategoria");

		if (subCategoria != null) {
			setSubCategoria(subCategoria);
		}

		String respuestas1 = (String)attributes.get("respuestas1");

		if (respuestas1 != null) {
			setRespuestas1(respuestas1);
		}

		String respuestas2 = (String)attributes.get("respuestas2");

		if (respuestas2 != null) {
			setRespuestas2(respuestas2);
		}

		String anhio = (String)attributes.get("anhio");

		if (anhio != null) {
			setAnhio(anhio);
		}

		String generoDemandante = (String)attributes.get("generoDemandante");

		if (generoDemandante != null) {
			setGeneroDemandante(generoDemandante);
		}

		String generoDemandado = (String)attributes.get("generoDemandado");

		if (generoDemandado != null) {
			setGeneroDemandado(generoDemandado);
		}

		String archivo = (String)attributes.get("archivo");

		if (archivo != null) {
			setArchivo(archivo);
		}
	}

	/**
	* Returns the primary key of this caso l v.
	*
	* @return the primary key of this caso l v
	*/
	public int getPrimaryKey() {
		return _casoLV.getPrimaryKey();
	}

	/**
	* Sets the primary key of this caso l v.
	*
	* @param primaryKey the primary key of this caso l v
	*/
	public void setPrimaryKey(int primaryKey) {
		_casoLV.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this caso l v.
	*
	* @return the ID of this caso l v
	*/
	public int getId() {
		return _casoLV.getId();
	}

	/**
	* Sets the ID of this caso l v.
	*
	* @param id the ID of this caso l v
	*/
	public void setId(int id) {
		_casoLV.setId(id);
	}

	/**
	* Returns the despacho of this caso l v.
	*
	* @return the despacho of this caso l v
	*/
	public java.lang.String getDespacho() {
		return _casoLV.getDespacho();
	}

	/**
	* Sets the despacho of this caso l v.
	*
	* @param despacho the despacho of this caso l v
	*/
	public void setDespacho(java.lang.String despacho) {
		_casoLV.setDespacho(despacho);
	}

	/**
	* Returns the radicacion of this caso l v.
	*
	* @return the radicacion of this caso l v
	*/
	public java.lang.String getRadicacion() {
		return _casoLV.getRadicacion();
	}

	/**
	* Sets the radicacion of this caso l v.
	*
	* @param radicacion the radicacion of this caso l v
	*/
	public void setRadicacion(java.lang.String radicacion) {
		_casoLV.setRadicacion(radicacion);
	}

	/**
	* Returns the demandante of this caso l v.
	*
	* @return the demandante of this caso l v
	*/
	public java.lang.String getDemandante() {
		return _casoLV.getDemandante();
	}

	/**
	* Sets the demandante of this caso l v.
	*
	* @param demandante the demandante of this caso l v
	*/
	public void setDemandante(java.lang.String demandante) {
		_casoLV.setDemandante(demandante);
	}

	/**
	* Returns the demandado of this caso l v.
	*
	* @return the demandado of this caso l v
	*/
	public java.lang.String getDemandado() {
		return _casoLV.getDemandado();
	}

	/**
	* Sets the demandado of this caso l v.
	*
	* @param demandado the demandado of this caso l v
	*/
	public void setDemandado(java.lang.String demandado) {
		_casoLV.setDemandado(demandado);
	}

	/**
	* Returns the clase proceso of this caso l v.
	*
	* @return the clase proceso of this caso l v
	*/
	public java.lang.String getClaseProceso() {
		return _casoLV.getClaseProceso();
	}

	/**
	* Sets the clase proceso of this caso l v.
	*
	* @param claseProceso the clase proceso of this caso l v
	*/
	public void setClaseProceso(java.lang.String claseProceso) {
		_casoLV.setClaseProceso(claseProceso);
	}

	/**
	* Returns the tipo decision of this caso l v.
	*
	* @return the tipo decision of this caso l v
	*/
	public java.lang.String getTipoDecision() {
		return _casoLV.getTipoDecision();
	}

	/**
	* Sets the tipo decision of this caso l v.
	*
	* @param tipoDecision the tipo decision of this caso l v
	*/
	public void setTipoDecision(java.lang.String tipoDecision) {
		_casoLV.setTipoDecision(tipoDecision);
	}

	/**
	* Returns the ponente of this caso l v.
	*
	* @return the ponente of this caso l v
	*/
	public java.lang.String getPonente() {
		return _casoLV.getPonente();
	}

	/**
	* Sets the ponente of this caso l v.
	*
	* @param ponente the ponente of this caso l v
	*/
	public void setPonente(java.lang.String ponente) {
		_casoLV.setPonente(ponente);
	}

	/**
	* Returns the fecha of this caso l v.
	*
	* @return the fecha of this caso l v
	*/
	public java.util.Date getFecha() {
		return _casoLV.getFecha();
	}

	/**
	* Sets the fecha of this caso l v.
	*
	* @param fecha the fecha of this caso l v
	*/
	public void setFecha(java.util.Date fecha) {
		_casoLV.setFecha(fecha);
	}

	/**
	* Returns the categoria of this caso l v.
	*
	* @return the categoria of this caso l v
	*/
	public java.lang.String getCategoria() {
		return _casoLV.getCategoria();
	}

	/**
	* Sets the categoria of this caso l v.
	*
	* @param categoria the categoria of this caso l v
	*/
	public void setCategoria(java.lang.String categoria) {
		_casoLV.setCategoria(categoria);
	}

	/**
	* Returns the sub categoria of this caso l v.
	*
	* @return the sub categoria of this caso l v
	*/
	public java.lang.String getSubCategoria() {
		return _casoLV.getSubCategoria();
	}

	/**
	* Sets the sub categoria of this caso l v.
	*
	* @param subCategoria the sub categoria of this caso l v
	*/
	public void setSubCategoria(java.lang.String subCategoria) {
		_casoLV.setSubCategoria(subCategoria);
	}

	/**
	* Returns the respuestas1 of this caso l v.
	*
	* @return the respuestas1 of this caso l v
	*/
	public java.lang.String getRespuestas1() {
		return _casoLV.getRespuestas1();
	}

	/**
	* Sets the respuestas1 of this caso l v.
	*
	* @param respuestas1 the respuestas1 of this caso l v
	*/
	public void setRespuestas1(java.lang.String respuestas1) {
		_casoLV.setRespuestas1(respuestas1);
	}

	/**
	* Returns the respuestas2 of this caso l v.
	*
	* @return the respuestas2 of this caso l v
	*/
	public java.lang.String getRespuestas2() {
		return _casoLV.getRespuestas2();
	}

	/**
	* Sets the respuestas2 of this caso l v.
	*
	* @param respuestas2 the respuestas2 of this caso l v
	*/
	public void setRespuestas2(java.lang.String respuestas2) {
		_casoLV.setRespuestas2(respuestas2);
	}

	/**
	* Returns the anhio of this caso l v.
	*
	* @return the anhio of this caso l v
	*/
	public java.lang.String getAnhio() {
		return _casoLV.getAnhio();
	}

	/**
	* Sets the anhio of this caso l v.
	*
	* @param anhio the anhio of this caso l v
	*/
	public void setAnhio(java.lang.String anhio) {
		_casoLV.setAnhio(anhio);
	}

	/**
	* Returns the genero demandante of this caso l v.
	*
	* @return the genero demandante of this caso l v
	*/
	public java.lang.String getGeneroDemandante() {
		return _casoLV.getGeneroDemandante();
	}

	/**
	* Sets the genero demandante of this caso l v.
	*
	* @param generoDemandante the genero demandante of this caso l v
	*/
	public void setGeneroDemandante(java.lang.String generoDemandante) {
		_casoLV.setGeneroDemandante(generoDemandante);
	}

	/**
	* Returns the genero demandado of this caso l v.
	*
	* @return the genero demandado of this caso l v
	*/
	public java.lang.String getGeneroDemandado() {
		return _casoLV.getGeneroDemandado();
	}

	/**
	* Sets the genero demandado of this caso l v.
	*
	* @param generoDemandado the genero demandado of this caso l v
	*/
	public void setGeneroDemandado(java.lang.String generoDemandado) {
		_casoLV.setGeneroDemandado(generoDemandado);
	}

	/**
	* Returns the archivo of this caso l v.
	*
	* @return the archivo of this caso l v
	*/
	public java.lang.String getArchivo() {
		return _casoLV.getArchivo();
	}

	/**
	* Sets the archivo of this caso l v.
	*
	* @param archivo the archivo of this caso l v
	*/
	public void setArchivo(java.lang.String archivo) {
		_casoLV.setArchivo(archivo);
	}

	public boolean isNew() {
		return _casoLV.isNew();
	}

	public void setNew(boolean n) {
		_casoLV.setNew(n);
	}

	public boolean isCachedModel() {
		return _casoLV.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_casoLV.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _casoLV.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _casoLV.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_casoLV.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _casoLV.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_casoLV.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new casoLVWrapper((casoLV)_casoLV.clone());
	}

	public int compareTo(com.ability.genero.server.model.casoLV casoLV) {
		return _casoLV.compareTo(casoLV);
	}

	@Override
	public int hashCode() {
		return _casoLV.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.casoLV> toCacheModel() {
		return _casoLV.toCacheModel();
	}

	public com.ability.genero.server.model.casoLV toEscapedModel() {
		return new casoLVWrapper(_casoLV.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _casoLV.toString();
	}

	public java.lang.String toXmlString() {
		return _casoLV.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_casoLV.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public casoLV getWrappedcasoLV() {
		return _casoLV;
	}

	public casoLV getWrappedModel() {
		return _casoLV;
	}

	public void resetOriginalValues() {
		_casoLV.resetOriginalValues();
	}

	private casoLV _casoLV;
}