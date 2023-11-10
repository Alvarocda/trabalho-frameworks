package br.edu.ifmt.apresentacaoframeworks.controllers;

import br.edu.ifmt.apresentacaoframeworks.Dtos.UsuarioDto;
import br.edu.ifmt.apresentacaoframeworks.entities.Usuario;
import br.edu.ifmt.apresentacaoframeworks.repositories.UsuariosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/sign-up")
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public UsuariosController(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    @PostMapping
    public ResponseEntity<UsuarioDto> criar(@RequestBody @Valid Usuario usuario) {

        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
        String senhaCriptografada = bcrypt.encode(usuario.getSenha());

        usuario.setId(UUID.randomUUID().toString());
        usuario.setSenha(senhaCriptografada);

        usuariosRepository.save(usuario);

        UsuarioDto usuarioDto = new UsuarioDto(usuario.getId(), usuario.getNomeUsuario());

        return ResponseEntity.status(201).body(usuarioDto);
    }

}



