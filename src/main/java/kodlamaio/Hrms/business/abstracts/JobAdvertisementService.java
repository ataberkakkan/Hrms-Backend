package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.Dtos.JobAdvertisementDto;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementService {
    Result add(JobAdvertisementDto jobAdvertisementDto);
    DataResult<List<JobAdvertisement>> getAllActives();
    DataResult<List<JobAdvertisement>> findAllByOrderByReleaseDateAsc();
    DataResult<List<JobAdvertisement>> findAllByOrderByReleaseDateDesc();
    DataResult<List<JobAdvertisement>> findAllActivesByCompanyId(int id);
    Result changeActiveStatus(boolean status, int jobAdvertisementId);
}
