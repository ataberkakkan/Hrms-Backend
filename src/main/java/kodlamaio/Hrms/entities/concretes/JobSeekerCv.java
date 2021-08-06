package kodlamaio.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seeker_cvs")
public class JobSeekerCv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_seeker_cv_id")
    private int jobSeekerCvId;


    @OneToOne()
    @JoinColumn(name="job_seeker_id")
    private JobSeekers jobSeeker;


    @OneToMany(mappedBy="jobSeekerCv")
    private List<Skill> skills;


    @OneToMany(mappedBy="jobSeekerCv")
    private List<EducationalBackground> educationalBackgrounds;

    @OneToMany(mappedBy="jobSeekerCv")
    private List<JobExperience> jobExperiences;

    @OneToOne(mappedBy="jobSeekerCv")
    private Image image;

}