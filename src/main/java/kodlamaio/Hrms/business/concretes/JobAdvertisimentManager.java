package kodlamaio.Hrms.business.concretes;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.CityDao;
import kodlamaio.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.Hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.Hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.Hrms.entities.Dtos.JobAdvertisementDto;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JobAdvertisimentManager implements JobAdvertisementService {

    private JobAdvertisementDao jobAdvertisementDao;
    private CityDao cityDao;
    private JobPositionDao jobPositionDao;
    private EmployerDao employerDao;
    @Override
    public Result add(JobAdvertisementDto jobAdvertisementDto) {
        JobAdvertisement jobAdvertisement= new JobAdvertisement();
        jobAdvertisement.setReleaseDate(LocalDate.now());
        jobAdvertisement.setDeadline(jobAdvertisementDto.getDeadline());
        jobAdvertisement.setNumberOfPosition(jobAdvertisementDto.getNumberOfPosition());
        jobAdvertisement.setMaxSalary(jobAdvertisementDto.getMaxSalary());
        jobAdvertisement.setMinSalary(jobAdvertisementDto.getMinSalary());
        jobAdvertisement.setJobDescription(jobAdvertisementDto.getJobDescription());

        jobAdvertisement.setEmployer(this.employerDao.getById(jobAdvertisementDto.getEmployerId()));
        jobAdvertisement.setCity(this.cityDao.getById(jobAdvertisementDto.getCityId()));
        jobAdvertisement.setJobPosition(this.jobPositionDao.getById(jobAdvertisementDto.getJobPositionId()));
        jobAdvertisement.setActive(true);

        this.jobAdvertisementDao.save(jobAdvertisement);

        return new SuccessResult("İş ilanı eklendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllActives() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAllByIsActiveTrue());
    }

    @Override
    public DataResult<List<JobAdvertisement>> findAllByOrderByReleaseDateAsc() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAllByOrderByReleaseDateAsc());
    }

    @Override
    public DataResult<List<JobAdvertisement>> findAllByOrderByReleaseDateDesc() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAllByOrderByReleaseDateDesc());
    }

    @Override
    public DataResult<List<JobAdvertisement>> findAllActivesByCompanyId(int id) {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAllByEmployer_IdAndIsActiveTrue(id));
    }

    @Override
    public Result changeActiveStatus(boolean status, int jobAdvertisementId) {
        JobAdvertisement jobAdvertisement= this.jobAdvertisementDao.getById(jobAdvertisementId);
        jobAdvertisement.setActive(status);
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("Başarıyla değiştirildi");
    }


}