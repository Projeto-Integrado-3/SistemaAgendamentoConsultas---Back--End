package br.com.clinica.model;

import java.util.Date;

public class PacienteProfSaude {
    String paciente;
    String profissionalSaude;
    Date dataAtendimento;

    public PacienteProfSaude(String paciente, String profissionalSaude, Date dataAtendimento) {
        this.paciente = paciente;
        this.profissionalSaude = profissionalSaude;
        this.dataAtendimento = dataAtendimento;
    }
}
