package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    List<JobPosition> getAll();
}