package com.fma.Fleet.Management.Api.services;

import com.fma.Fleet.Management.Api.models.TaxisModel;
import com.fma.Fleet.Management.Api.models.TrajectoriesModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface TrajectoriesService {

    Page<TrajectoriesModel> getTrajectories(Pageable pageable);

    List<TrajectoriesModel> getTrajectoriesById(Long taxi_id,
                                                Date date,
                                                Integer pageNumber,
                                                Integer pageSize);

}
