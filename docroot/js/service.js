Liferay.Service.register("Liferay.Service.genero", "com.ability.genero.server.service", "PerspectivaGenero-portlet");

Liferay.Service.registerClass(
	Liferay.Service.genero, "casoLV",
	{
		findByDespacho: true,
		findByDespachoAnhio: true,
		findByDespachoAnhioAdmin: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.genero, "despacho",
	{
		findByDespachoCodigo: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.genero, "generoUsuario",
	{
		findByPorUsuario: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.genero, "subcategoria",
	{
		findBysubCatXCat: true
	}
);