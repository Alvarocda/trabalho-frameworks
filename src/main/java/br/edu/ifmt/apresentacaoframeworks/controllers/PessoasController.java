package br.edu.ifmt.apresentacaoframeworks.controllers;

import br.edu.ifmt.apresentacaoframeworks.Dtos.PessoaDto;
import br.edu.ifmt.apresentacaoframeworks.entities.Pessoa;
import br.edu.ifmt.apresentacaoframeworks.mappers.PessoaMapperMS;
import br.edu.ifmt.apresentacaoframeworks.repositories.PessoasRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {

    @Autowired
    private PessoasRepository pessoasRepository;

    @Autowired
    private PessoaMapperMS pessoaMapperMS;

    @GetMapping
    public ResponseEntity<List<PessoaDto>> listar() {
        List<Pessoa> listaPessoas = pessoasRepository.findAll();

        // usando lambda com construtor
//        List<PessoaDto> listaPessoasDto = listaPessoas.stream().map(pessoa ->
//              new PessoaDto(pessoa.getId(),pessoa.getNome(), pessoa.getCpf())
//         ).toList();

        // usando lambda com getters/setters
//        List<PessoaDto> listaPessoasDto = listaPessoas.stream().map(pessoa -> {
//            PessoaDto pessoaDto  = new PessoaDto();
//            pessoaDto.setId(pessoa.getId());
//            pessoaDto.setNome(pessoa.getNome());
//            pessoaDto.setCpf(pessoa.getCpf());
//            return pessoaDto;
//        }).toList();

        // usando mapstruct
        List<PessoaDto> listaPessoasDto = listaPessoas.stream().map(pessoa ->
            pessoaMapperMS.toDto(pessoa)
        ).toList();

        // usando modelMapper
//        ModelMapper modelMapper = new ModelMapper();
//        List<PessoaDto> listaPessoasDto = listaPessoas.stream().map(
//                pessoa -> modelMapper.map(pessoa, PessoaDto.class)
//        ).toList();

        return ResponseEntity.status(200).body(listaPessoasDto);
    }
}
