package kodlamaio.Hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "educational_background")
public class EducationalBackground {
    @Id
    @GeneratedValue()
    @Column(name= "educational_background_id")
    private int educationalBackgroundId;

    @ManyToOne()
    @JoinColumn(name="department_id")
    private SchoolDepartment schoolDepartment;


    @ManyToOne()
    @JoinColumn(name="school_id")
    private School school;

    @Column(name="school_starting_date")
    private Date schoolStartingDate;

    @Column(name="school_graduation_date")
    private Date schoolGraduationDate;

    @Column(name="is_continue")
    private boolean isContinue;

    @ManyToOne()
    @JoinColumn(name="job_seeker_id")
    private JobSeekers jobSeeker;

    @ManyToOne()
    @JoinColumn(name="job_seeker_cv_id")
    private JobSeekerCv jobSeekerCv;

}
