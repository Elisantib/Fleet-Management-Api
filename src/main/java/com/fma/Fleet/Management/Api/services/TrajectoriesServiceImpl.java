package com.fma.Fleet.Management.Api.services;

import com.fma.Fleet.Management.Api.DTO.LastTrajectoryDTO;
import com.fma.Fleet.Management.Api.models.TrajectoriesModel;
import com.fma.Fleet.Management.Api.repositories.TrajectoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TrajectoriesServiceImpl implements TrajectoriesService{

    @Autowired
    TrajectoriesRepository trajectoriesRepository;

    @Override
    public Page<TrajectoriesModel> getTrajectories(Pageable pageable) {
        return trajectoriesRepository.findAll(pageable);
    }

    @Override
    public List<TrajectoriesModel> getTrajectoriesById(Long taxi_id,
                                                       Date date,
                                                       Integer pageNumber,
                                                       Integer pageSize) {
        String patern = "dd-mm-yyyy";
        DateFormat dateFormat = new SimpleDateFormat(patern);
        return trajectoriesRepository.findTrajectoriesByIdAndDate(
                taxi_id, dateFormat.format(date), pageNumber, pageSize);
    }

    @Override
    public List<LastTrajectoryDTO> getLastTrajectory() {
        List<LastTrajectoryDTO> lastTrajectoryDTOList = new ArrayList<>();

        List<TrajectoriesModel> lastTrajectoryList = trajectoriesRepository.findLastTrajectory();

        for (TrajectoriesModel lastTrajectory: lastTrajectoryList) {
            lastTrajectoryDTOList.add(new LastTrajectoryDTO(
                    lastTrajectory.getId(),
                    lastTrajectory.getDate(),
                    lastTrajectory.getTaxisModel().getPlate(),
                    lastTrajectory.getLatitude(),
                    lastTrajectory.getLongitude()));
        }

        return lastTrajectoryDTOList;

    }

}
