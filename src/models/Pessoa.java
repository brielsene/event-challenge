package models;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String email;

    private static List<Pessoa> pessoas = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static List<Pessoa> getPessoas() {
        return pessoas;
    }

    public static void setPessoas(List<Pessoa> pessoas) {
        Pessoa.pessoas = pessoas;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
