package com.fma.Fleet.Management.Api.services;

import com.fma.Fleet.Management.Api.models.TaxisModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TaxisService {

    Page<TaxisModel> getTaxis(Pageable pageable);
}
