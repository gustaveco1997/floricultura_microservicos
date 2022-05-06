package br.com.luminaapps.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luminaapps.fornecedor.model.InfoForncedorCadastroDTO;
import br.com.luminaapps.fornecedor.model.InfoFornecedor;
import br.com.luminaapps.fornecedor.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;
	
	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}

	public InfoFornecedor cadastrar(InfoForncedorCadastroDTO cadastroDTO) {
		
		return infoRepository.save(new InfoFornecedor(cadastroDTO));
	}

}
