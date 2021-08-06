package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="images")
public class Image {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="image_id")
    private int imageId;


    @Column(name="image_link")
    private String imageLink;

    @Column(name="uploaded_date")
    private String uploadedDate;

    @ManyToOne()
    @JoinColumn(name="job_seeker_id")
    private JobSeekers jobSeeker;

    @OneToOne()
    @JoinColumn(name="job_seeker_cv_id")
    private JobSeekerCv jobSeekerCv;


}
