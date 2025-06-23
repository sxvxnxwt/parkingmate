package capstone.parkingmate.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ParkingLotNearbyResponseDTO {

    private Long p_id;
    private String name;
    private double recommendationScore;
    private String address;
    private int fee;

    private int extraFee;

    private double distance;
}
