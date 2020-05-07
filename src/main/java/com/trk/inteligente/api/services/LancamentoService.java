package com.trk.inteligente.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.trk.inteligente.api.entities.Lancamento;

public interface LancamentoService {

	/**
	 * Busca um funcionario por Id
	 * 
	 * @param funcionadioId
	 * @param pageRequest
	 * @return
	 */
	Page<Lancamento> buscarPorFuncionarioId(Long funcionadioId, PageRequest pageRequest);

	/**
	 * Retorna um lançamento por id
	 * 
	 * @param id
	 * @return
	 */
	Optional<Lancamento> buscarPorId(Long id);

	/**
	 * Persiste um lançamento na base de dados
	 * 
	 * @param lancamento
	 * @return
	 */
	Lancamento persistir(Lancamento lancamento);

	/**
	 * Remove um lançamento da base de dados
	 * 
	 * @param id
	 */
	void remover(Long id);
}
