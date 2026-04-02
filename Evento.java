package model;

import java.time.LocalDateTime;

public class Evento {

    private String nome;
    private String endereco;
    private String categoria;
    private LocalDateTime horario;
    private String descricao;

    public Evento(String nome, String endereco, String categoria, LocalDateTime horario, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
        this.horario = horario;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public String toFileString() {
        return nome + ";" + endereco + ";" + categoria + ";" + horario + ";" + descricao;
    }

    @Override
    public String toString() {
        return "Evento: " + nome +
                "\nCategoria: " + categoria +
                "\nEndereço: " + endereco +
                "\nHorário: " + horario +
                "\nDescrição: " + descricao;
    }
}
