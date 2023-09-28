package com.api.internet.banking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.internet.banking.model.dto.ClienteDTO;
import com.api.internet.banking.service.ClienteService;
import com.api.inversao.controle.service.impl.ImpostoSPServiceImpl;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService; 
	
	@PostMapping(value = "/tax", name = "Cadastrar cliente")
	public ResponseEntity<ClienteDTO> criar(@Valid @RequestBody ClienteDTO dto) throws Exception {
		
		clienteService.criar(dto);
		return ResponseEntity.status(HttpStatus.OK)
				.body();
	}
}
