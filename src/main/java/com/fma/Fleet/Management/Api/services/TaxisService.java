package com.fma.Fleet.Management.Api.services;

import com.fma.Fleet.Management.Api.models.TaxisModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface TaxisService {

    Page<TaxisModel> getTaxis(Pageable pageable);
    TaxisModel getTaxisById(Long id);
    TaxisModel getTaxisByPlate(String plate);


}
