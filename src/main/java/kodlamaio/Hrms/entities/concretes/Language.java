package kodlamaio.Hrms.entities.concretes;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="languages")
public class Language {
    @Id
    @GeneratedValue
    @Column(name="language_id")
    private int languageId;

    @Column(name="language_name")
    private String languageName;

    @Min(1)
    @Max(5)
    @NotNull
    @Column(name="language_level")
    private int languageLevel;

    @ManyToMany()
    @JoinColumn(name="job_seeker_id")
    private List<JobSeekers> jobSeekers;
}