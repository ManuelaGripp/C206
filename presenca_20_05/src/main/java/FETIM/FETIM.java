package FETIM;

import exceptions.NomeRepetidoException;
import exceptions.NotaInsufienteException;

import java.util.HashMap;
import java.util.Map;


public class FETIM {

    Map<String, Double> projetos = new HashMap<>();


    public void addProjeto(String chave, double valor) throws NomeRepetidoException, NotaInsufienteException {

        if (projetos.get(chave) != null)
            throw new NomeRepetidoException("Nome ja cadastrado");
        else if (valor < 60) {
            projetos.put(chave, valor);
            throw new NotaInsufienteException("Nota insuficiente");
        }else
            projetos.put(chave,valor);
    }
}



