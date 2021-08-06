package kodlamaio.Hrms.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="skills")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Skill {
    @Id
    @GeneratedValue
    @Column(name="skill_id")
    private int skillId;


    @Column(name="skill_name")
    private String skillName;

    @Column(name="skill_framework")
    private String skillFramework;

    @ManyToMany()
    @JoinColumn(name="id")
    private List<JobSeekers> jobSeekers;

    @ManyToOne()
    @JoinColumn(name="job_seeker_cv_id")
    private JobSeekerCv jobSeekerCv;

}
