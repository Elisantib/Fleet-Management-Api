package com.fma.Fleet.Management.Api.repositories;

import com.fma.Fleet.Management.Api.models.TaxisModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@Repository
//se utiliza para indicar que una clase es un componente de acceso a datos
//utilizado para acceder a una base de datos o realizar operaciones de persistencia.
//Clase que nos permite hacer querys a la base de datos

public interface TaxisRepository extends JpaRepository<TaxisModel, Long> {

    @Query(value = "SELECT t FROM TaxisModel t where t.plate = :plate", nativeQuery = false)
    TaxisModel findByPlate(@Param("plate") String plate);

}
