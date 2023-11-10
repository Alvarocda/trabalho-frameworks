package br.edu.ifmt.apresentacaoframeworks.mappers;

import br.edu.ifmt.apresentacaoframeworks.Dtos.PessoaDto;
import br.edu.ifmt.apresentacaoframeworks.entities.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface PessoaMapperMS {

    @Mapping(target = "nascimento", dateFormat = "dd/MM/yyyy")
    @Mapping(target = "numeroRg", source = "rg")
    @Mapping(target = "cpf", source = "cpf", qualifiedByName = "formatarCpf")
    PessoaDto toDto(Pessoa pessoa);
    @Mapping(target = "rg", source = "numeroRg")
    Pessoa toEntity(PessoaDto pessoaDto);

    @Named("formatarCpf")
    default String formatarCpf(Long cpf) {
        if (cpf == null)
            return null;
        StringBuilder sBuilder = new StringBuilder(padLeftZeros(String.valueOf(cpf), 11));
        sBuilder.insert(3, ".");
        sBuilder.insert(7, ".");
        sBuilder.insert(11, "-");
        return sBuilder.toString();
    }

    default String padLeftZeros(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();
    }
}
