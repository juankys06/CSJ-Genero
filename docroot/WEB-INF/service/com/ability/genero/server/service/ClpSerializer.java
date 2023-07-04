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

package com.ability.genero.server.service;

import com.ability.genero.server.model.auditoriaClp;
import com.ability.genero.server.model.casoLVClp;
import com.ability.genero.server.model.categoriaClp;
import com.ability.genero.server.model.claseProcesoClp;
import com.ability.genero.server.model.distritoGClp;
import com.ability.genero.server.model.encuestaCriteriosClp;
import com.ability.genero.server.model.encuestaEnfoDifeClp;
import com.ability.genero.server.model.generoUsuarioClp;
import com.ability.genero.server.model.generoUsuarioComiteClp;
import com.ability.genero.server.model.juresprudenciaInternacionalClp;
import com.ability.genero.server.model.juresprudenciaNacionalClp;
import com.ability.genero.server.model.normasInteracionalesClp;
import com.ability.genero.server.model.normasNacionalesClp;
import com.ability.genero.server.model.preguntasClaveClp;
import com.ability.genero.server.model.subcategoriaClp;
import com.ability.genero.server.model.tipoDecisionClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"PerspectivaGenero-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"PerspectivaGenero-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "PerspectivaGenero-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(auditoriaClp.class.getName())) {
			return translateInputauditoria(oldModel);
		}

		if (oldModelClassName.equals(casoLVClp.class.getName())) {
			return translateInputcasoLV(oldModel);
		}

		if (oldModelClassName.equals(categoriaClp.class.getName())) {
			return translateInputcategoria(oldModel);
		}

		if (oldModelClassName.equals(claseProcesoClp.class.getName())) {
			return translateInputclaseProceso(oldModel);
		}

		if (oldModelClassName.equals(distritoGClp.class.getName())) {
			return translateInputdistritoG(oldModel);
		}

		if (oldModelClassName.equals(encuestaCriteriosClp.class.getName())) {
			return translateInputencuestaCriterios(oldModel);
		}

		if (oldModelClassName.equals(encuestaEnfoDifeClp.class.getName())) {
			return translateInputencuestaEnfoDife(oldModel);
		}

		if (oldModelClassName.equals(generoUsuarioClp.class.getName())) {
			return translateInputgeneroUsuario(oldModel);
		}

		if (oldModelClassName.equals(generoUsuarioComiteClp.class.getName())) {
			return translateInputgeneroUsuarioComite(oldModel);
		}

		if (oldModelClassName.equals(
					juresprudenciaInternacionalClp.class.getName())) {
			return translateInputjuresprudenciaInternacional(oldModel);
		}

		if (oldModelClassName.equals(juresprudenciaNacionalClp.class.getName())) {
			return translateInputjuresprudenciaNacional(oldModel);
		}

		if (oldModelClassName.equals(normasInteracionalesClp.class.getName())) {
			return translateInputnormasInteracionales(oldModel);
		}

		if (oldModelClassName.equals(normasNacionalesClp.class.getName())) {
			return translateInputnormasNacionales(oldModel);
		}

		if (oldModelClassName.equals(preguntasClaveClp.class.getName())) {
			return translateInputpreguntasClave(oldModel);
		}

		if (oldModelClassName.equals(subcategoriaClp.class.getName())) {
			return translateInputsubcategoria(oldModel);
		}

		if (oldModelClassName.equals(tipoDecisionClp.class.getName())) {
			return translateInputtipoDecision(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputauditoria(BaseModel<?> oldModel) {
		auditoriaClp oldClpModel = (auditoriaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getauditoriaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcasoLV(BaseModel<?> oldModel) {
		casoLVClp oldClpModel = (casoLVClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcasoLVRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputcategoria(BaseModel<?> oldModel) {
		categoriaClp oldClpModel = (categoriaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getcategoriaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputclaseProceso(BaseModel<?> oldModel) {
		claseProcesoClp oldClpModel = (claseProcesoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getclaseProcesoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputdistritoG(BaseModel<?> oldModel) {
		distritoGClp oldClpModel = (distritoGClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getdistritoGRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputencuestaCriterios(BaseModel<?> oldModel) {
		encuestaCriteriosClp oldClpModel = (encuestaCriteriosClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getencuestaCriteriosRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputencuestaEnfoDife(BaseModel<?> oldModel) {
		encuestaEnfoDifeClp oldClpModel = (encuestaEnfoDifeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getencuestaEnfoDifeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputgeneroUsuario(BaseModel<?> oldModel) {
		generoUsuarioClp oldClpModel = (generoUsuarioClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getgeneroUsuarioRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputgeneroUsuarioComite(
		BaseModel<?> oldModel) {
		generoUsuarioComiteClp oldClpModel = (generoUsuarioComiteClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getgeneroUsuarioComiteRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputjuresprudenciaInternacional(
		BaseModel<?> oldModel) {
		juresprudenciaInternacionalClp oldClpModel = (juresprudenciaInternacionalClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getjuresprudenciaInternacionalRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputjuresprudenciaNacional(
		BaseModel<?> oldModel) {
		juresprudenciaNacionalClp oldClpModel = (juresprudenciaNacionalClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getjuresprudenciaNacionalRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputnormasInteracionales(
		BaseModel<?> oldModel) {
		normasInteracionalesClp oldClpModel = (normasInteracionalesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getnormasInteracionalesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputnormasNacionales(BaseModel<?> oldModel) {
		normasNacionalesClp oldClpModel = (normasNacionalesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getnormasNacionalesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputpreguntasClave(BaseModel<?> oldModel) {
		preguntasClaveClp oldClpModel = (preguntasClaveClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getpreguntasClaveRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputsubcategoria(BaseModel<?> oldModel) {
		subcategoriaClp oldClpModel = (subcategoriaClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getsubcategoriaRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputtipoDecision(BaseModel<?> oldModel) {
		tipoDecisionClp oldClpModel = (tipoDecisionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.gettipoDecisionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.auditoriaImpl")) {
			return translateOutputauditoria(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.casoLVImpl")) {
			return translateOutputcasoLV(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.categoriaImpl")) {
			return translateOutputcategoria(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.claseProcesoImpl")) {
			return translateOutputclaseProceso(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.distritoGImpl")) {
			return translateOutputdistritoG(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.encuestaCriteriosImpl")) {
			return translateOutputencuestaCriterios(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.encuestaEnfoDifeImpl")) {
			return translateOutputencuestaEnfoDife(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.generoUsuarioImpl")) {
			return translateOutputgeneroUsuario(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.generoUsuarioComiteImpl")) {
			return translateOutputgeneroUsuarioComite(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.juresprudenciaInternacionalImpl")) {
			return translateOutputjuresprudenciaInternacional(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.juresprudenciaNacionalImpl")) {
			return translateOutputjuresprudenciaNacional(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.normasInteracionalesImpl")) {
			return translateOutputnormasInteracionales(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.normasNacionalesImpl")) {
			return translateOutputnormasNacionales(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.preguntasClaveImpl")) {
			return translateOutputpreguntasClave(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.subcategoriaImpl")) {
			return translateOutputsubcategoria(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ability.genero.server.model.impl.tipoDecisionImpl")) {
			return translateOutputtipoDecision(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchauditoriaException")) {
			return new com.ability.genero.server.NoSuchauditoriaException();
		}

		if (className.equals("com.ability.genero.server.NoSuchcasoLVException")) {
			return new com.ability.genero.server.NoSuchcasoLVException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchcategoriaException")) {
			return new com.ability.genero.server.NoSuchcategoriaException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchclaseProcesoException")) {
			return new com.ability.genero.server.NoSuchclaseProcesoException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchdistritoGException")) {
			return new com.ability.genero.server.NoSuchdistritoGException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchencuestaCriteriosException")) {
			return new com.ability.genero.server.NoSuchencuestaCriteriosException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchencuestaEnfoDifeException")) {
			return new com.ability.genero.server.NoSuchencuestaEnfoDifeException();
		}

		if (className.equals("com.ability.genero.server.NoSuchUsuarioException")) {
			return new com.ability.genero.server.NoSuchUsuarioException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchUsuarioComiteException")) {
			return new com.ability.genero.server.NoSuchUsuarioComiteException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchjuresprudenciaInternacionalException")) {
			return new com.ability.genero.server.NoSuchjuresprudenciaInternacionalException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchjuresprudenciaNacionalException")) {
			return new com.ability.genero.server.NoSuchjuresprudenciaNacionalException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchnormasInteracionalesException")) {
			return new com.ability.genero.server.NoSuchnormasInteracionalesException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchnormasNacionalesException")) {
			return new com.ability.genero.server.NoSuchnormasNacionalesException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchpreguntasClaveException")) {
			return new com.ability.genero.server.NoSuchpreguntasClaveException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchsubcategoriaException")) {
			return new com.ability.genero.server.NoSuchsubcategoriaException();
		}

		if (className.equals(
					"com.ability.genero.server.NoSuchtipoDecisionException")) {
			return new com.ability.genero.server.NoSuchtipoDecisionException();
		}

		return throwable;
	}

	public static Object translateOutputauditoria(BaseModel<?> oldModel) {
		auditoriaClp newModel = new auditoriaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setauditoriaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcasoLV(BaseModel<?> oldModel) {
		casoLVClp newModel = new casoLVClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcasoLVRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputcategoria(BaseModel<?> oldModel) {
		categoriaClp newModel = new categoriaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setcategoriaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputclaseProceso(BaseModel<?> oldModel) {
		claseProcesoClp newModel = new claseProcesoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setclaseProcesoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputdistritoG(BaseModel<?> oldModel) {
		distritoGClp newModel = new distritoGClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setdistritoGRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputencuestaCriterios(BaseModel<?> oldModel) {
		encuestaCriteriosClp newModel = new encuestaCriteriosClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setencuestaCriteriosRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputencuestaEnfoDife(BaseModel<?> oldModel) {
		encuestaEnfoDifeClp newModel = new encuestaEnfoDifeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setencuestaEnfoDifeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputgeneroUsuario(BaseModel<?> oldModel) {
		generoUsuarioClp newModel = new generoUsuarioClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setgeneroUsuarioRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputgeneroUsuarioComite(
		BaseModel<?> oldModel) {
		generoUsuarioComiteClp newModel = new generoUsuarioComiteClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setgeneroUsuarioComiteRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputjuresprudenciaInternacional(
		BaseModel<?> oldModel) {
		juresprudenciaInternacionalClp newModel = new juresprudenciaInternacionalClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setjuresprudenciaInternacionalRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputjuresprudenciaNacional(
		BaseModel<?> oldModel) {
		juresprudenciaNacionalClp newModel = new juresprudenciaNacionalClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setjuresprudenciaNacionalRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputnormasInteracionales(
		BaseModel<?> oldModel) {
		normasInteracionalesClp newModel = new normasInteracionalesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setnormasInteracionalesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputnormasNacionales(BaseModel<?> oldModel) {
		normasNacionalesClp newModel = new normasNacionalesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setnormasNacionalesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputpreguntasClave(BaseModel<?> oldModel) {
		preguntasClaveClp newModel = new preguntasClaveClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setpreguntasClaveRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputsubcategoria(BaseModel<?> oldModel) {
		subcategoriaClp newModel = new subcategoriaClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setsubcategoriaRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputtipoDecision(BaseModel<?> oldModel) {
		tipoDecisionClp newModel = new tipoDecisionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.settipoDecisionRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}