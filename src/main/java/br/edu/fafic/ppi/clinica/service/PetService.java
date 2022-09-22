package br.edu.fafic.ppi.clinica.service;

import br.edu.fafic.ppi.clinica.domain.Pet;
import br.edu.fafic.ppi.clinica.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetService {

    private final PetRepository petRepository;

    public Pet save(Pet pet){
        return petRepository.save(pet);
    }

    public List<Pet> getAll(){
        return petRepository.findAll();
    }
}
