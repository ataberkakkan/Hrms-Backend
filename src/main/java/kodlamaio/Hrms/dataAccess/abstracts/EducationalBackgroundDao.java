package kodlamaio.Hrms.dataAccess.abstracts;

import kodlamaio.Hrms.entities.concretes.EducationalBackground;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationalBackgroundDao extends JpaRepository<EducationalBackground, Integer> {
}
