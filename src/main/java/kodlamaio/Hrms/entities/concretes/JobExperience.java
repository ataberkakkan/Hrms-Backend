package kodlamaio.Hrms.entities.concretes;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;




@Table(name="job_experiences")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JobExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "job_experience_id")
    private int jobExperienceId;


    @ManyToOne()
    @JoinColumn(name="employer_id")
    private Employer employer;


    @ManyToOne()
    @JoinColumn(name="job_position_id")
    private JobPosition jobPosition;


    @Column(name="starting_date")
    private Date startingDate;

    @Column(name="leaving_date")
    private Date leavingDate;

    @Column(name="is_continue")
    private boolean isContinue;


    @Column(name="year_of_experience")
    private int yearOfExperience;

    @ManyToOne()
    @JoinColumn(name="job_seeker_id")
    private JobSeekers jobSeeker;

    @ManyToOne()
    @JoinColumn(name="job_seeker_cv_id")
    private JobSeekerCv jobSeekerCv;

}
