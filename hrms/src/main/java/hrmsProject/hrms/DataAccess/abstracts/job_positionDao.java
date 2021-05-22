package hrmsProject.hrms.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsProject.hrms.Entities.concretes.job_position;

public interface job_positionDao extends JpaRepository<job_position, Integer>{
	
}
