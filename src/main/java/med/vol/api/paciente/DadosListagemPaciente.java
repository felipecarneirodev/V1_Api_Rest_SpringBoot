package med.vol.api.paciente;

import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;

public record DadosListagemPaciente(Long id, String nome, String email, String cpf) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}