package com.cantalloc.personal.repository;

import com.cantalloc.personal.entity.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonalRepository extends JpaRepository<Personal, Integer> {
    //List<Personal> findByFilters(Integer dni, Integer idPersonal, String nombrePersonal, String apellidoPersonal);

    @Query("SELECT p FROM Personal p " +
            "WHERE (:dni IS NULL OR p.dni = :dni) " +
            "AND (:idPersonal IS NULL OR p.idPersonal = :idPersonal) " +  // ✅ Ahora coincide
            "AND (:nombrePersonal IS NULL OR LOWER(p.nombrePersonal) LIKE LOWER(CONCAT('%', :nombrePersonal, '%'))) " +
            "AND (:apellidoPersonal IS NULL OR LOWER(p.apellidoPersonal) LIKE LOWER(CONCAT('%', :apellidoPersonal, '%')))")
    List<Personal> findByFilters(
            @Param("dni") Integer dni,
            @Param("idPersonal") Integer idPersonal,  // ✅ Ahora coincide
            @Param("nombrePersonal") String nombrePersonal,
            @Param("apellidoPersonal") String apellidoPersonal
    );
}
