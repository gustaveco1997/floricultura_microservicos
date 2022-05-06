package br.com.luminaapps.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luminaapps.fornecedor.model.InfoForncedorCadastroDTO;
import br.com.luminaapps.fornecedor.model.InfoFornecedor;
import br.com.luminaapps.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	@Autowired
	private InfoService infoService;
	
	@GetMapping("/{estado}")
	public ResponseEntity<InfoFornecedor> getInforPorEstado(@PathVariable String estado){
		InfoFornecedor info = infoService.getInfoPorEstado(estado);
		if(info == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(info); 
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<InfoFornecedor> cadastrar(@RequestBody InfoForncedorCadastroDTO cadastroDTO){
		
		InfoFornecedor info = infoService.cadastrar(cadastroDTO);
		if(info == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(info); 
	}

}
