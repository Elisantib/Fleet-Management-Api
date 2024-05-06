package com.fma.Fleet.Management.Api.controllers;

import com.fma.Fleet.Management.Api.services.TrajectoriesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")

@RestController
@RequestMapping("/trajectories")
public class TrajectoriesController {

    @Autowired
    TrajectoriesServiceImpl trajectoriesService2;


}
