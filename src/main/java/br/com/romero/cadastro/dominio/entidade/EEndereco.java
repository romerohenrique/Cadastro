package br.com.romero.cadastro.dominio.entidade;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Builder

public class EEndereco {
    String rua;
    Integer numero;
    String bairro;
    String cidade;
}
