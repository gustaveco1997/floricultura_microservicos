package br.com.luminaapps.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luminaapps.loja.model.CompraDTO;
import br.com.luminaapps.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@PostMapping
	public ResponseEntity<?> compra(@RequestBody CompraDTO compra){
		compraService.realizarCompra(compra);
		return ResponseEntity.ok().build();
	}

}
