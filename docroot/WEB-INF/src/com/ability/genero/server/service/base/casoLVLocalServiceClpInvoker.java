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

package com.ability.genero.server.service.base;

import com.ability.genero.server.service.casoLVLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class casoLVLocalServiceClpInvoker {
	public casoLVLocalServiceClpInvoker() {
		_methodName0 = "addcasoLV";

		_methodParameterTypes0 = new String[] {
				"com.ability.genero.server.model.casoLV"
			};

		_methodName1 = "createcasoLV";

		_methodParameterTypes1 = new String[] { "int" };

		_methodName2 = "deletecasoLV";

		_methodParameterTypes2 = new String[] { "int" };

		_methodName3 = "deletecasoLV";

		_methodParameterTypes3 = new String[] {
				"com.ability.genero.server.model.casoLV"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "fetchcasoLV";

		_methodParameterTypes9 = new String[] { "int" };

		_methodName10 = "getcasoLV";

		_methodParameterTypes10 = new String[] { "int" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getcasoLVs";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getcasoLVsCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updatecasoLV";

		_methodParameterTypes14 = new String[] {
				"com.ability.genero.server.model.casoLV"
			};

		_methodName15 = "updatecasoLV";

		_methodParameterTypes15 = new String[] {
				"com.ability.genero.server.model.casoLV", "boolean"
			};

		_methodName96 = "getBeanIdentifier";

		_methodParameterTypes96 = new String[] {  };

		_methodName97 = "setBeanIdentifier";

		_methodParameterTypes97 = new String[] { "java.lang.String" };

		_methodName102 = "findByDespacho";

		_methodParameterTypes102 = new String[] { "java.lang.String" };

		_methodName103 = "findByDespachoAnhio";

		_methodParameterTypes103 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName104 = "findByDespachoAnhioAdmin";

		_methodParameterTypes104 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return casoLVLocalServiceUtil.addcasoLV((com.ability.genero.server.model.casoLV)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return casoLVLocalServiceUtil.createcasoLV(((Integer)arguments[0]).intValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return casoLVLocalServiceUtil.deletecasoLV(((Integer)arguments[0]).intValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return casoLVLocalServiceUtil.deletecasoLV((com.ability.genero.server.model.casoLV)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return casoLVLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return casoLVLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return casoLVLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return casoLVLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return casoLVLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return casoLVLocalServiceUtil.fetchcasoLV(((Integer)arguments[0]).intValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return casoLVLocalServiceUtil.getcasoLV(((Integer)arguments[0]).intValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return casoLVLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return casoLVLocalServiceUtil.getcasoLVs(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return casoLVLocalServiceUtil.getcasoLVsCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return casoLVLocalServiceUtil.updatecasoLV((com.ability.genero.server.model.casoLV)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return casoLVLocalServiceUtil.updatecasoLV((com.ability.genero.server.model.casoLV)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return casoLVLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			casoLVLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return casoLVLocalServiceUtil.findByDespacho((java.lang.String)arguments[0]);
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return casoLVLocalServiceUtil.findByDespachoAnhio((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return casoLVLocalServiceUtil.findByDespachoAnhioAdmin((java.lang.String)arguments[0]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName96;
	private String[] _methodParameterTypes96;
	private String _methodName97;
	private String[] _methodParameterTypes97;
	private String _methodName102;
	private String[] _methodParameterTypes102;
	private String _methodName103;
	private String[] _methodParameterTypes103;
	private String _methodName104;
	private String[] _methodParameterTypes104;
}