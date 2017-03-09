/**
 * 
 */
package br.com.alura.listavip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.listavip.model.Convidado;
import br.com.alura.listavip.repository.ConvidadoRepository;

/**
 * @author Ramon Vieira
 *
 */

@Service
public class ConvidadoService {

	@Autowired
	private ConvidadoRepository repository;

	public Iterable<Convidado> buscaTodos() {
		return repository.findAll();
	}

	/**
	 * @param convidado
	 */
	public void salvar(Convidado convidado) {
		repository.save(convidado);
	}
	
}
