package com.cantalloc.personal.controller;

import com.cantalloc.personal.entity.Personal;
import com.cantalloc.personal.entity.PersonalResponsable;
import com.cantalloc.personal.service.PersonalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personal")
public class PersonalController {
    private final PersonalService personalService;

    public PersonalController(PersonalService personalService) {
        this.personalService = personalService;
    }

    @GetMapping("/listarPersonal")
    public List<Personal> listarPersonal(
            @RequestParam(required = false) Integer dni,
            @RequestParam(required = false) Integer idPersonal,
            @RequestParam(required = false) String nombrePersonal,
            @RequestParam(required = false) String apellidoPersonal) {
        return personalService.listarPersonal(dni, idPersonal, nombrePersonal, apellidoPersonal);
    }

    @GetMapping("/listarResponsable")
    public List<PersonalResponsable> listarResponsables(
            @RequestParam(required = false) Integer dni,
            @RequestParam(required = false) Integer idPersonalResponsable,
            @RequestParam(required = false) String nombrePersonal) {
        return personalService.listarResponsables(dni,idPersonalResponsable,nombrePersonal);
    }
}
