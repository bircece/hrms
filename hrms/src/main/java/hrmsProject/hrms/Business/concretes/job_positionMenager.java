package hrmsProject.hrms.Business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsProject.hrms.Business.abstracts.job_positionService;
import hrmsProject.hrms.DataAccess.abstracts.job_positionDao;
import hrmsProject.hrms.Entities.concretes.job_position;

@Service
public class   job_positionMenager implements job_positionService {

	
	private job_positionDao _job_positionDao;

	
	@Autowired
	
	public job_positionMenager(job_positionDao _job_positionDao) {
		super();
		this._job_positionDao = _job_positionDao;
	}




	@Override
	public List<job_position> getAll() {

		return this._job_positionDao.findAll();
	}


	

	

}
