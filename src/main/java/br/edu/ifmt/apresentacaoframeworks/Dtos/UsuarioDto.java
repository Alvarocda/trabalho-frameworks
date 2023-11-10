package br.edu.ifmt.apresentacaoframeworks.Dtos;

public class UsuarioDto {
    private String id;
    private String nomeUsuario;
    public UsuarioDto(String id, String nomeUsuario) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
    }
    public String getId() {
        return id;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
}
