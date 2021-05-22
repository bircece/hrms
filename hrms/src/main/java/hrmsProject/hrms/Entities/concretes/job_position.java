package hrmsProject.hrms.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_position")
public class job_position {

	@Id
	@GeneratedValue
	
	@Column(name = "id")
	private int jobId;
	
	@Column(name = "position")
	private String position;
	
	public job_position() {
		
	}

	public job_position(int jobId, String position) {
		super();
		this.jobId = jobId;
		this.position = position;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
	

}

