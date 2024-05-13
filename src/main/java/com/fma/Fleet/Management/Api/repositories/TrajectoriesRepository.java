package com.fma.Fleet.Management.Api.repositories;

import com.fma.Fleet.Management.Api.models.TrajectoriesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrajectoriesRepository extends JpaRepository<TrajectoriesModel, Long> {

}
