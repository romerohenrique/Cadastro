package br.com.romero.cadastro.dominio.repositorio;

import br.com.romero.cadastro.dominio.entidade.EPessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPessoa extends JpaRepository<EPessoa, Integer > {
}
