package kodlamaio.Hrms.entities.Dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {

    private int jobPositionId;
    private int cityId;
    private int numberOfPosition;
    private int maxSalary;
    private int minSalary;
    private LocalDate deadline;
    private String description;
    private int employerId;
    private String jobDescription;

    @JsonIgnore
    private boolean isActive=true;

}