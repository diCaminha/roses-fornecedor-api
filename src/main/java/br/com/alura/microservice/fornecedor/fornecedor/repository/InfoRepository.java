package br.com.alura.microservice.fornecedor.fornecedor.repository;

import br.com.alura.microservice.fornecedor.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;

public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

    InfoFornecedor findByEstado(String estado);
}
