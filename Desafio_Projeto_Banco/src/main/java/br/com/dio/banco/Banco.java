package br.com.dio.banco;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Getter @Setter @ToString
public class Banco extends Conta{

    private String nome;

    public Banco(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {

    }
}
