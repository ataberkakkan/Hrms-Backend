package kodlamaio.Hrms.dataAccess.abstracts;

import kodlamaio.Hrms.entities.concretes.JobSeekerCv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerCvDao extends JpaRepository<JobSeekerCv, Integer> {
}
