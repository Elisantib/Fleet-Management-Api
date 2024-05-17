package com.fma.Fleet.Management.Api.controllers;

import com.fma.Fleet.Management.Api.models.TaxisModel;
import com.fma.Fleet.Management.Api.models.TrajectoriesModel;
import com.fma.Fleet.Management.Api.services.TrajectoriesServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@CrossOrigin("*")

@RestController
@RequestMapping("/trajectories")
public class TrajectoriesController {

    @Autowired
    TrajectoriesServiceImpl trajectoriesService;

    @GetMapping("/list")
    @Operation(summary = "Get alls trajectories",
            description = "no params required, gets all trajectories")
    public Page<TrajectoriesModel> getTrajectories(Pageable pageable) {
        return this.trajectoriesService.getTrajectories(pageable);
    }

    @GetMapping("/by-taxi")
    @Operation(summary = "get trajectories of latitude, longitude and time ",
            description = "get all latitude, longitude and time trajectories according to taxi id and date")
    public List<TrajectoriesModel> getTrajectoriesByTaxi(
            @RequestParam Long taxi_id,
            @RequestParam @DateTimeFormat(pattern = "dd-MM-yyyy") Date date,
            @RequestParam Integer pageNumber,
            @RequestParam Integer pageSize) {
        return this.trajectoriesService.getTrajectoriesById(taxi_id, date, pageNumber, pageSize);
    }


}
