package com.api.internet.banking.service;

import com.api.internet.banking.model.dto.ClienteDTO;

public interface ClienteService {
	
	ClienteDTO criar(ClienteDTO dto) throws Exception;
}

