package med.vol.api.paciente;

import jakarta.validation.Valid;
import med.vol.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid
        DadosEndereco endereco
) {
}