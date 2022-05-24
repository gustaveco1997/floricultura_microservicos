package br.com.luminaapps.loja.client;

import br.com.luminaapps.loja.model.InfoFornecedorDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("fornecedor")
public interface FornecedorClient {
    @RequestMapping("info/{estado}")
    InfoFornecedorDTO getInforPorEstado(@PathVariable String estado);

}
