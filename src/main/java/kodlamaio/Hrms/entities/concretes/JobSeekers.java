package kodlamaio.Hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_seekers")
public class JobSeekers extends User{

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_year")
    private int birthYear;

    @Column(name = "nationality_id")
    private String nationalityId;

    @OneToMany(mappedBy="jobSeeker")
    private List<JobExperience> jobExperiences;

    @OneToMany(mappedBy="jobSeeker")
    private List<EducationalBackground> educationalBackgrounds;

    @ManyToMany(mappedBy="jobSeekers")
    private List<Skill> jobSeekerSkills;

    @OneToMany(mappedBy="jobSeeker")
    private List<Image> images;

    @ManyToMany(mappedBy="jobSeekers")
    private List<Language> languages;

    @OneToOne(mappedBy="jobSeeker")
    private JobSeekerCv jobSeekerCv;
}
