package com.fma.Fleet.Management.Api.DTO;

import java.time.LocalDateTime;

public class LastTrajectoryDTO {
    private Long id;
    private LocalDateTime date;
    private String plate;
    private Double latitude;
    private Double longitude;


    public LastTrajectoryDTO(Long id, LocalDateTime date, String plate, Double latitude, Double longitude) {
        this.id = id;
        this.date = date;
        this.plate = plate;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
