package com.project.clinic.entity;

import java.util.List;

public class Coovid {
	List<Covid> cov;

	public Coovid(List<Covid> cov) {
		super();
		this.cov = cov;
	}

	public List<Covid> getcov() {
		return cov;
	}

	public Coovid() {
		super();
	}

	public void setcov(List<Covid> cov) {
		this.cov = cov;
	}

	@Override
	public String toString() {
		return "covrs [cov=" + cov + "]";
	}
	

}
