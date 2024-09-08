package br.com.clinica.model1;

import java.util.Date;

public class Consulta {
    int idConsulta;
    PlanoSaude planoSaude;
    ProfissionalSaude profissionalSaude;
    Paciente paciente;
    double precoConsulta;
    Date horaConsulta;
    Date dataConsulta;
    String statusConsulta;

    public Consulta(int idConsulta, PlanoSaude planoSaude, ProfissionalSaude profissionalSaude, Paciente paciente, double precoConsulta, Date horaConsulta, Date dataConsulta, String statusConsulta) {
        this.idConsulta = idConsulta;
        this.planoSaude = planoSaude;
        this.profissionalSaude = profissionalSaude;
        this.paciente = paciente;
        this.precoConsulta = precoConsulta;
        this.horaConsulta = horaConsulta;
        this.dataConsulta = dataConsulta;
        this.statusConsulta = statusConsulta;
    }

    
}
