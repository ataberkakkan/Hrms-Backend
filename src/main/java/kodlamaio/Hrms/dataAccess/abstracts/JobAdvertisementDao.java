package kodlamaio.Hrms.dataAccess.abstracts;



import kodlamaio.Hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

    List<JobAdvertisement> findAllByIsActiveTrue();
    List<JobAdvertisement> findAllByOrderByReleaseDateAsc();
    List<JobAdvertisement> findAllByOrderByReleaseDateDesc();
    List<JobAdvertisement> findAllByEmployer_IdAndIsActiveTrue(int id);
}