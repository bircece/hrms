package hrmsProject.hrms.ApiControllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrmsProject.hrms.Business.abstracts.job_positionService;
import hrmsProject.hrms.Entities.concretes.job_position;


@RestController
@RequestMapping("/api/job_positions")

public class job_positionController {

private job_positionService job_positionService;

@Autowired
public job_positionController(hrmsProject.hrms.Business.abstracts.job_positionService job_positionService) {
	super();
	this.job_positionService = job_positionService;
}
	
@GetMapping("/getall")             
public List<job_position> getAll(){
	
	return this.job_positionService.getAll();
	
}


}
