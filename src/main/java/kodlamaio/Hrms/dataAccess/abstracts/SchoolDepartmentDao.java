package kodlamaio.Hrms.dataAccess.abstracts;

import kodlamaio.Hrms.entities.concretes.SchoolDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolDepartmentDao extends JpaRepository<SchoolDepartment, Integer> {
}
