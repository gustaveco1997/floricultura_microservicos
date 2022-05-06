package br.com.luminaapps.loja.model;

import java.util.List;

import lombok.Data;

@Data
public class CompraDTO {
	private List<ItemDTO> itens;
	private EnderecoDTO endereco;

}
