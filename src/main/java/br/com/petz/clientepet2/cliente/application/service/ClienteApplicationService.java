package br.com.petz.clientepet2.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet2.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet2.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet2.cliente.application.repository.ClienteRespository;
import br.com.petz.clientepet2.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRespository clienteRepository;
	
	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
						.build();
	}
}
