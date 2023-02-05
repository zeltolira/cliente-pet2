package br.com.petz.clientepet2.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.petz.clientepet2.cliente.application.repository.ClienteRespository;
import br.com.petz.clientepet2.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRespository {

	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		clienteSpringDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}

}
