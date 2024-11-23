package model;

public class Department {
	private int dept_id;
	private String dept_name;
	private String location;
	
	

//	public Department(int dept_id, String dept_name, String location) {
//		super();
//		this.dept_id = dept_id;
//		this.dept_name = dept_name;
//		this.location = location;
//	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
