package com.fma.Fleet.Management.Api.models;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "trajectories")
public class TrajectoriesModel {

    //ATRIBUTOS DE LA CLASE
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long taxi_id;

    @Column
    @Timestamp
    private LocalDateTime date;

    @Column
    private Integer latitude;

    @Column
    private Integer Longitude;

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaxi_id() {
        return taxi_id;
    }

    public void setTaxi_id(Long taxi_id) {
        this.taxi_id = taxi_id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getLongitude() {
        return Longitude;
    }

    public void setLongitude(Integer longitude) {
        Longitude = longitude;
    }
}
