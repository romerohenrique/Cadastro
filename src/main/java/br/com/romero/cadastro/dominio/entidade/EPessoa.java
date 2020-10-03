package br.com.romero.cadastro.dominio.entidade;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class EPessoa {

    private String nome;
    private Date dataNacimento;
    private Long cpf;
    private String nomeMae;

}
