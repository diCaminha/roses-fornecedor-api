package br.com.alura.microservice.fornecedor.fornecedor.service;

import br.com.alura.microservice.fornecedor.fornecedor.model.InfoFornecedor;
import br.com.alura.microservice.fornecedor.fornecedor.repository.InfoRepository;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private InfoRepository infoRepository;

    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public InfoFornecedor getInfoPorEstado(String estado) {
        return this.infoRepository.findByEstado(estado);
    }
}
