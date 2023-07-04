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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link despacho}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       despacho
 * @generated
 */
public class despachoWrapper implements despacho, ModelWrapper<despacho> {
	public despachoWrapper(despacho despacho) {
		_despacho = despacho;
	}

	public Class<?> getModelClass() {
		return despacho.class;
	}

	public String getModelClassName() {
		return despacho.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("jurisdiccion", getJurisdiccion());
		attributes.put("distrito", getDistrito());
		attributes.put("circuito", getCircuito());
		attributes.put("municipio", getMunicipio());
		attributes.put("codigoDespacho", getCodigoDespacho());
		attributes.put("nombre", getNombre());
		attributes.put("juesDespacho", getJuesDespacho());
		attributes.put("Correo", getCorreo());
		attributes.put("direccion", getDireccion());
		attributes.put("telefono", getTelefono());
		attributes.put("horario", getHorario());
		attributes.put("area", getArea());
		attributes.put("departamento", getDepartamento());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String jurisdiccion = (String)attributes.get("jurisdiccion");

		if (jurisdiccion != null) {
			setJurisdiccion(jurisdiccion);
		}

		String distrito = (String)attributes.get("distrito");

		if (distrito != null) {
			setDistrito(distrito);
		}

		String circuito = (String)attributes.get("circuito");

		if (circuito != null) {
			setCircuito(circuito);
		}

		String municipio = (String)attributes.get("municipio");

		if (municipio != null) {
			setMunicipio(municipio);
		}

		String codigoDespacho = (String)attributes.get("codigoDespacho");

		if (codigoDespacho != null) {
			setCodigoDespacho(codigoDespacho);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String juesDespacho = (String)attributes.get("juesDespacho");

		if (juesDespacho != null) {
			setJuesDespacho(juesDespacho);
		}

		String Correo = (String)attributes.get("Correo");

		if (Correo != null) {
			setCorreo(Correo);
		}

		String direccion = (String)attributes.get("direccion");

		if (direccion != null) {
			setDireccion(direccion);
		}

		String telefono = (String)attributes.get("telefono");

		if (telefono != null) {
			setTelefono(telefono);
		}

		String horario = (String)attributes.get("horario");

		if (horario != null) {
			setHorario(horario);
		}

		String area = (String)attributes.get("area");

		if (area != null) {
			setArea(area);
		}

		String departamento = (String)attributes.get("departamento");

		if (departamento != null) {
			setDepartamento(departamento);
		}
	}

	/**
	* Returns the primary key of this despacho.
	*
	* @return the primary key of this despacho
	*/
	public int getPrimaryKey() {
		return _despacho.getPrimaryKey();
	}

	/**
	* Sets the primary key of this despacho.
	*
	* @param primaryKey the primary key of this despacho
	*/
	public void setPrimaryKey(int primaryKey) {
		_despacho.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this despacho.
	*
	* @return the ID of this despacho
	*/
	public int getId() {
		return _despacho.getId();
	}

	/**
	* Sets the ID of this despacho.
	*
	* @param id the ID of this despacho
	*/
	public void setId(int id) {
		_despacho.setId(id);
	}

	/**
	* Returns the jurisdiccion of this despacho.
	*
	* @return the jurisdiccion of this despacho
	*/
	public java.lang.String getJurisdiccion() {
		return _despacho.getJurisdiccion();
	}

	/**
	* Sets the jurisdiccion of this despacho.
	*
	* @param jurisdiccion the jurisdiccion of this despacho
	*/
	public void setJurisdiccion(java.lang.String jurisdiccion) {
		_despacho.setJurisdiccion(jurisdiccion);
	}

	/**
	* Returns the distrito of this despacho.
	*
	* @return the distrito of this despacho
	*/
	public java.lang.String getDistrito() {
		return _despacho.getDistrito();
	}

	/**
	* Sets the distrito of this despacho.
	*
	* @param distrito the distrito of this despacho
	*/
	public void setDistrito(java.lang.String distrito) {
		_despacho.setDistrito(distrito);
	}

	/**
	* Returns the circuito of this despacho.
	*
	* @return the circuito of this despacho
	*/
	public java.lang.String getCircuito() {
		return _despacho.getCircuito();
	}

	/**
	* Sets the circuito of this despacho.
	*
	* @param circuito the circuito of this despacho
	*/
	public void setCircuito(java.lang.String circuito) {
		_despacho.setCircuito(circuito);
	}

	/**
	* Returns the municipio of this despacho.
	*
	* @return the municipio of this despacho
	*/
	public java.lang.String getMunicipio() {
		return _despacho.getMunicipio();
	}

	/**
	* Sets the municipio of this despacho.
	*
	* @param municipio the municipio of this despacho
	*/
	public void setMunicipio(java.lang.String municipio) {
		_despacho.setMunicipio(municipio);
	}

	/**
	* Returns the codigo despacho of this despacho.
	*
	* @return the codigo despacho of this despacho
	*/
	public java.lang.String getCodigoDespacho() {
		return _despacho.getCodigoDespacho();
	}

	/**
	* Sets the codigo despacho of this despacho.
	*
	* @param codigoDespacho the codigo despacho of this despacho
	*/
	public void setCodigoDespacho(java.lang.String codigoDespacho) {
		_despacho.setCodigoDespacho(codigoDespacho);
	}

	/**
	* Returns the nombre of this despacho.
	*
	* @return the nombre of this despacho
	*/
	public java.lang.String getNombre() {
		return _despacho.getNombre();
	}

	/**
	* Sets the nombre of this despacho.
	*
	* @param nombre the nombre of this despacho
	*/
	public void setNombre(java.lang.String nombre) {
		_despacho.setNombre(nombre);
	}

	/**
	* Returns the jues despacho of this despacho.
	*
	* @return the jues despacho of this despacho
	*/
	public java.lang.String getJuesDespacho() {
		return _despacho.getJuesDespacho();
	}

	/**
	* Sets the jues despacho of this despacho.
	*
	* @param juesDespacho the jues despacho of this despacho
	*/
	public void setJuesDespacho(java.lang.String juesDespacho) {
		_despacho.setJuesDespacho(juesDespacho);
	}

	/**
	* Returns the correo of this despacho.
	*
	* @return the correo of this despacho
	*/
	public java.lang.String getCorreo() {
		return _despacho.getCorreo();
	}

	/**
	* Sets the correo of this despacho.
	*
	* @param Correo the correo of this despacho
	*/
	public void setCorreo(java.lang.String Correo) {
		_despacho.setCorreo(Correo);
	}

	/**
	* Returns the direccion of this despacho.
	*
	* @return the direccion of this despacho
	*/
	public java.lang.String getDireccion() {
		return _despacho.getDireccion();
	}

	/**
	* Sets the direccion of this despacho.
	*
	* @param direccion the direccion of this despacho
	*/
	public void setDireccion(java.lang.String direccion) {
		_despacho.setDireccion(direccion);
	}

	/**
	* Returns the telefono of this despacho.
	*
	* @return the telefono of this despacho
	*/
	public java.lang.String getTelefono() {
		return _despacho.getTelefono();
	}

	/**
	* Sets the telefono of this despacho.
	*
	* @param telefono the telefono of this despacho
	*/
	public void setTelefono(java.lang.String telefono) {
		_despacho.setTelefono(telefono);
	}

	/**
	* Returns the horario of this despacho.
	*
	* @return the horario of this despacho
	*/
	public java.lang.String getHorario() {
		return _despacho.getHorario();
	}

	/**
	* Sets the horario of this despacho.
	*
	* @param horario the horario of this despacho
	*/
	public void setHorario(java.lang.String horario) {
		_despacho.setHorario(horario);
	}

	/**
	* Returns the area of this despacho.
	*
	* @return the area of this despacho
	*/
	public java.lang.String getArea() {
		return _despacho.getArea();
	}

	/**
	* Sets the area of this despacho.
	*
	* @param area the area of this despacho
	*/
	public void setArea(java.lang.String area) {
		_despacho.setArea(area);
	}

	/**
	* Returns the departamento of this despacho.
	*
	* @return the departamento of this despacho
	*/
	public java.lang.String getDepartamento() {
		return _despacho.getDepartamento();
	}

	/**
	* Sets the departamento of this despacho.
	*
	* @param departamento the departamento of this despacho
	*/
	public void setDepartamento(java.lang.String departamento) {
		_despacho.setDepartamento(departamento);
	}

	public boolean isNew() {
		return _despacho.isNew();
	}

	public void setNew(boolean n) {
		_despacho.setNew(n);
	}

	public boolean isCachedModel() {
		return _despacho.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_despacho.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _despacho.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _despacho.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_despacho.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _despacho.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_despacho.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new despachoWrapper((despacho)_despacho.clone());
	}

	public int compareTo(com.ability.genero.server.model.despacho despacho) {
		return _despacho.compareTo(despacho);
	}

	@Override
	public int hashCode() {
		return _despacho.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.ability.genero.server.model.despacho> toCacheModel() {
		return _despacho.toCacheModel();
	}

	public com.ability.genero.server.model.despacho toEscapedModel() {
		return new despachoWrapper(_despacho.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _despacho.toString();
	}

	public java.lang.String toXmlString() {
		return _despacho.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_despacho.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public despacho getWrappeddespacho() {
		return _despacho;
	}

	public despacho getWrappedModel() {
		return _despacho;
	}

	public void resetOriginalValues() {
		_despacho.resetOriginalValues();
	}

	private despacho _despacho;
}