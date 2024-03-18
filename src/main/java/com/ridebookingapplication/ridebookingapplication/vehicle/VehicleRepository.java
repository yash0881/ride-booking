package com.ridebookingapplication.ridebookingapplication.vehicle;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<VehicleEntity, VehicleId> {
}
