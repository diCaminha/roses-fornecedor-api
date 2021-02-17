package br.com.alura.microservice.fornecedor.fornecedor.controller;

import br.com.alura.microservice.fornecedor.fornecedor.model.InfoFornecedor;
import br.com.alura.microservice.fornecedor.fornecedor.service.InfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    private InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("/{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {
        return this.infoService.getInfoPorEstado(estado);
    }
}
