	package br.com.luminaapps.fornecedor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class InfoFornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String estado;
	private String endereco;
	
	public InfoFornecedor(InfoForncedorCadastroDTO cadastroDTO) {
		this.nome = cadastroDTO.getNome();
		this.estado=cadastroDTO.getEstado();
		this.endereco=cadastroDTO.getEndereco();
		
	}

}
