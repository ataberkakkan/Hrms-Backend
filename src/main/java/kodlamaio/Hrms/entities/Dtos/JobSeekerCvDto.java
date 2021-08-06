package kodlamaio.Hrms.entities.Dtos;
import java.util.Date;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerCvDto {
    private int id;

    private String firstName;

    private String lastName;

    private String schoolName;

    private String schoolDepartmentName;

    private Date schoolStartingDate;

    private Date schoolLeavingDate;

    private String skill;

    private String languageName;

    private int languageLevel;

    private String imageLink;
}