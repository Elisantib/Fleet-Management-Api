package com.fma.Fleet.Management.Api.repositories;

import com.fma.Fleet.Management.Api.models.TrajectoriesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TrajectoriesRepository extends JpaRepository<TrajectoriesModel, Long> {

    @Query(value = "SELECT * FROM trajectories WHERE taxi_id = :taxi_id AND " +
            "TO_CHAR(date, 'dd-mm-yyyy') = :date offset (:pageNumber * :pageSize) " +
            "rows fetch next :pageSize rows only", nativeQuery = true)
    List<TrajectoriesModel> findTrajectoriesByIdAndDate(
            Long taxi_id, String date, Integer pageNumber, Integer pageSize);

    @Query(value = "SELECT ID, TAXI_ID, date, LONGITUDE, LATITUDE " +
            "FROM (" +
            "SELECT ID, TAXI_ID, date, LONGITUDE, LATITUDE, " +
            "ROW_NUMBER() OVER (PARTITION BY TAXI_ID ORDER BY date DESC) as row_num " +
            "FROM public.TRAJECTORIES) AS ranked " +
            "WHERE row_num = 1", nativeQuery = true)
    List<TrajectoriesModel> findLastTrajectory();

}
