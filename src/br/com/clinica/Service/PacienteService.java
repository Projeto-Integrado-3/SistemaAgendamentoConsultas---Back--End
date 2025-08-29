package br.com.clinica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clinica.model.Paciente; // Ajuste o caminho se necessário
import br.com.clinica.repository.PacienteRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public void deletarPaciente(Long id) {
        if (!pacienteRepository.existsById(id)) {
            throw new EntityNotFoundException("Paciente com ID " + id + " não encontrado.");
        }
        pacienteRepository.deleteById(id);
    }
}
