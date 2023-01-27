package br.com.petz.clientepet2.cliente.application.service;

import br.com.petz.clientepet2.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet2.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clienteRequest);

}
