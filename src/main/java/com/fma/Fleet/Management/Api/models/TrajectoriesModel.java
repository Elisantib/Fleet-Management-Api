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

    @ManyToOne
    @JoinColumn(name = "taxi_id", referencedColumnName = "id")
    private TaxisModel taxisModel;

    @Column
    @Timestamp
    private LocalDateTime date;

    @Column
    private Double latitude;

    @Column
    private Double Longitude;

    //Getter and Setter

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public TaxisModel getTaxisModel() {return taxisModel;}
    public void setTaxisModel(TaxisModel taxisModel) {this.taxisModel = taxisModel;}
    public LocalDateTime getDate() {return date;}
    public void setDate(LocalDateTime date) {this.date = date;}
    public Double getLatitude() {return latitude;}
    public void setLatitude(Double latitude) {this.latitude = latitude;}
    public Double getLongitude() { return Longitude; }
    public void setLongitude(Double longitude) { Longitude = longitude; }
}
