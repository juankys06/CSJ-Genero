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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the casoLV service. Represents a row in the &quot;GENERO_LV_CASO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ability.genero.server.model.impl.casoLVModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ability.genero.server.model.impl.casoLVImpl}.
 * </p>
 *
 * @author DELL Villartech
 * @see casoLV
 * @see com.ability.genero.server.model.impl.casoLVImpl
 * @see com.ability.genero.server.model.impl.casoLVModelImpl
 * @generated
 */
public interface casoLVModel extends BaseModel<casoLV> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a caso l v model instance should use the {@link casoLV} interface instead.
	 */

	/**
	 * Returns the primary key of this caso l v.
	 *
	 * @return the primary key of this caso l v
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this caso l v.
	 *
	 * @param primaryKey the primary key of this caso l v
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this caso l v.
	 *
	 * @return the ID of this caso l v
	 */
	public int getId();

	/**
	 * Sets the ID of this caso l v.
	 *
	 * @param id the ID of this caso l v
	 */
	public void setId(int id);

	/**
	 * Returns the despacho of this caso l v.
	 *
	 * @return the despacho of this caso l v
	 */
	@AutoEscape
	public String getDespacho();

	/**
	 * Sets the despacho of this caso l v.
	 *
	 * @param despacho the despacho of this caso l v
	 */
	public void setDespacho(String despacho);

	/**
	 * Returns the radicacion of this caso l v.
	 *
	 * @return the radicacion of this caso l v
	 */
	@AutoEscape
	public String getRadicacion();

	/**
	 * Sets the radicacion of this caso l v.
	 *
	 * @param radicacion the radicacion of this caso l v
	 */
	public void setRadicacion(String radicacion);

	/**
	 * Returns the demandante of this caso l v.
	 *
	 * @return the demandante of this caso l v
	 */
	@AutoEscape
	public String getDemandante();

	/**
	 * Sets the demandante of this caso l v.
	 *
	 * @param demandante the demandante of this caso l v
	 */
	public void setDemandante(String demandante);

	/**
	 * Returns the demandado of this caso l v.
	 *
	 * @return the demandado of this caso l v
	 */
	@AutoEscape
	public String getDemandado();

	/**
	 * Sets the demandado of this caso l v.
	 *
	 * @param demandado the demandado of this caso l v
	 */
	public void setDemandado(String demandado);

	/**
	 * Returns the clase proceso of this caso l v.
	 *
	 * @return the clase proceso of this caso l v
	 */
	@AutoEscape
	public String getClaseProceso();

	/**
	 * Sets the clase proceso of this caso l v.
	 *
	 * @param claseProceso the clase proceso of this caso l v
	 */
	public void setClaseProceso(String claseProceso);

	/**
	 * Returns the tipo decision of this caso l v.
	 *
	 * @return the tipo decision of this caso l v
	 */
	@AutoEscape
	public String getTipoDecision();

	/**
	 * Sets the tipo decision of this caso l v.
	 *
	 * @param tipoDecision the tipo decision of this caso l v
	 */
	public void setTipoDecision(String tipoDecision);

	/**
	 * Returns the ponente of this caso l v.
	 *
	 * @return the ponente of this caso l v
	 */
	@AutoEscape
	public String getPonente();

	/**
	 * Sets the ponente of this caso l v.
	 *
	 * @param ponente the ponente of this caso l v
	 */
	public void setPonente(String ponente);

	/**
	 * Returns the fecha of this caso l v.
	 *
	 * @return the fecha of this caso l v
	 */
	public Date getFecha();

	/**
	 * Sets the fecha of this caso l v.
	 *
	 * @param fecha the fecha of this caso l v
	 */
	public void setFecha(Date fecha);

	/**
	 * Returns the categoria of this caso l v.
	 *
	 * @return the categoria of this caso l v
	 */
	@AutoEscape
	public String getCategoria();

	/**
	 * Sets the categoria of this caso l v.
	 *
	 * @param categoria the categoria of this caso l v
	 */
	public void setCategoria(String categoria);

	/**
	 * Returns the sub categoria of this caso l v.
	 *
	 * @return the sub categoria of this caso l v
	 */
	@AutoEscape
	public String getSubCategoria();

	/**
	 * Sets the sub categoria of this caso l v.
	 *
	 * @param subCategoria the sub categoria of this caso l v
	 */
	public void setSubCategoria(String subCategoria);

	/**
	 * Returns the respuestas1 of this caso l v.
	 *
	 * @return the respuestas1 of this caso l v
	 */
	@AutoEscape
	public String getRespuestas1();

	/**
	 * Sets the respuestas1 of this caso l v.
	 *
	 * @param respuestas1 the respuestas1 of this caso l v
	 */
	public void setRespuestas1(String respuestas1);

	/**
	 * Returns the respuestas2 of this caso l v.
	 *
	 * @return the respuestas2 of this caso l v
	 */
	@AutoEscape
	public String getRespuestas2();

	/**
	 * Sets the respuestas2 of this caso l v.
	 *
	 * @param respuestas2 the respuestas2 of this caso l v
	 */
	public void setRespuestas2(String respuestas2);

	/**
	 * Returns the anhio of this caso l v.
	 *
	 * @return the anhio of this caso l v
	 */
	@AutoEscape
	public String getAnhio();

	/**
	 * Sets the anhio of this caso l v.
	 *
	 * @param anhio the anhio of this caso l v
	 */
	public void setAnhio(String anhio);

	/**
	 * Returns the genero demandante of this caso l v.
	 *
	 * @return the genero demandante of this caso l v
	 */
	@AutoEscape
	public String getGeneroDemandante();

	/**
	 * Sets the genero demandante of this caso l v.
	 *
	 * @param generoDemandante the genero demandante of this caso l v
	 */
	public void setGeneroDemandante(String generoDemandante);

	/**
	 * Returns the genero demandado of this caso l v.
	 *
	 * @return the genero demandado of this caso l v
	 */
	@AutoEscape
	public String getGeneroDemandado();

	/**
	 * Sets the genero demandado of this caso l v.
	 *
	 * @param generoDemandado the genero demandado of this caso l v
	 */
	public void setGeneroDemandado(String generoDemandado);

	/**
	 * Returns the archivo of this caso l v.
	 *
	 * @return the archivo of this caso l v
	 */
	@AutoEscape
	public String getArchivo();

	/**
	 * Sets the archivo of this caso l v.
	 *
	 * @param archivo the archivo of this caso l v
	 */
	public void setArchivo(String archivo);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(casoLV casoLV);

	public int hashCode();

	public CacheModel<casoLV> toCacheModel();

	public casoLV toEscapedModel();

	public String toString();

	public String toXmlString();
}