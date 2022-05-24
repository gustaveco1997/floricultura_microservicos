package br.com.luminaapps.loja.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luminaapps.loja.model.CompraDTO;
import br.com.luminaapps.loja.service.CompraService;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public ResponseEntity<?> compra(@RequestBody CompraDTO compra, UriComponentsBuilder uriBuilder) throws Exception {
        compraService.realizarCompra(compra);
        URI uri = uriBuilder.path("/compra/{id}").buildAndExpand(0).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public ResponseEntity<List<String>> instancesFornecedor() {
        //Ribbon
        return ResponseEntity.ok(compraService.getInstancesFornecedor());
    }

}
