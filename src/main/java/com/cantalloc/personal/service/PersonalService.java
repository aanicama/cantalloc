package com.cantalloc.personal.service;

import com.cantalloc.personal.entity.Personal;
import com.cantalloc.personal.entity.PersonalResponsable;
import com.cantalloc.personal.repository.PersonalRepository;
import com.cantalloc.personal.repository.PersonalResponsableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalService {
    private final PersonalRepository personalRepository;
    private final PersonalResponsableRepository personalResponsableRepository;

    public PersonalService(PersonalRepository personalRepository, PersonalResponsableRepository personalResponsableRepository) {
        this.personalRepository = personalRepository;
        this.personalResponsableRepository = personalResponsableRepository;
    }

    public List<Personal> listarPersonal(Integer dni, Integer id_personal, String nombre_personal, String apellido_personal) {
        // Si no se envía ningún filtro, devuelve todos los registros
        if (dni == null && id_personal == null && nombre_personal == null && apellido_personal == null) {
            return personalRepository.findAll();
        }
        return personalRepository.findByFilters(dni, id_personal, nombre_personal, apellido_personal);

        //return personalRepository.findAll();
    }

    public List<PersonalResponsable> listarResponsables(Integer dni, Integer id_personal_responsable, String nombre_personal ) {
        // Si no se envía ningún filtro, devuelve todos los registros
        if (dni == null && id_personal_responsable == null && nombre_personal == null) {
            return personalResponsableRepository.findAll();
        }
        return personalResponsableRepository.findByFilters(dni, id_personal_responsable, nombre_personal);

    }
}
