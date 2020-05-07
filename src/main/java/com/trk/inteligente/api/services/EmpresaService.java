package com.trk.inteligente.api.services;

import java.util.Optional;

import com.trk.inteligente.api.entities.Empresa;

public interface EmpresaService {
	
	/**
	 * Retorna uma empresa pelo cnpej
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);

	/**
	 * Cadastra uma nova empresa na base de dados
	 * 
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);
}
