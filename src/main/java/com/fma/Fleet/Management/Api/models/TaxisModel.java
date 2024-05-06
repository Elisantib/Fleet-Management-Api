package com.fma.Fleet.Management.Api.models;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;

//Models representa la estructura de los datos y suelen tener anotaciones
// o metadatos para mapearlos a las tablas de la base de datos.
@Entity//esta clase es una entidad en el contexto de JPA. Mapea a una tabla en una BD
@Table(name = "taxis")
public class TaxisModel {

    //ATRIBUTOS DE LA CLASE
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column //indica que el campo 'plate' se mapeará a una columna en la tabla de la base de datos
    private String plate;

    //METODOS GETTER Y SETTER para acceder y modificar atributos fuera de la clase
    public Long getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
