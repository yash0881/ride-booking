package com.ridebookingapplication.ridebookingapplication.vehicle;


import java.time.LocalDateTime;


import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {


    private String vehicleNumber;
    private VehicleType vehicleType;
    private String city;
    private AreaType areaType;
    private boolean isAvailable;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
