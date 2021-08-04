package kodlamaio.Hrms.dataAccess.abstracts;

import kodlamaio.Hrms.entities.concretes.JobSeekers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekersDao extends JpaRepository<JobSeekers, Integer> {
    boolean existsByEmail(String email);
    boolean existsByNationalityId(String nationalityId);
}
