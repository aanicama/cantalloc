package com.cantalloc.personal.repository;

import com.cantalloc.personal.entity.Personal;
import com.cantalloc.personal.entity.PersonalResponsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonalResponsableRepository extends JpaRepository<PersonalResponsable, Integer> {

    @Query("SELECT pr FROM PersonalResponsable pr " +
            "WHERE (:dni IS NULL OR pr.dni = :dni) " +
            "AND (:idPersonalResponsable IS NULL OR pr.idPersonalResponsable = :idPersonalResponsable) " +  // ✅ Ahora coincide
            "AND (:nombrePersonal IS NULL OR LOWER(pr.nombrePersonal) LIKE LOWER(CONCAT('%', :nombrePersonal, '%'))) ")
    List<PersonalResponsable> findByFilters(
            @Param("dni") Integer dni,
            @Param("idPersonalResponsable") Integer idPersonalResponsable,  // ✅ Ahora coincide
            @Param("nombrePersonal") String nombrePersonal
    );
}
