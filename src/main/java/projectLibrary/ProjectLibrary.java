package projectLibrary;

public class ProjectLibrary {
	
	//Step 1: Create the keys as global variables
	String createdBy;
	String projectName;
	String status;
	int teamSize;
	
	//Step 2: Create a constructor to initialize the variable
	public ProjectLibrary(String createdBy, String projectName, String status, int teamSize) {
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	
	
	//Step 3: provide getters and setters to access the variables

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public String getStatus() {
		return status;
	}

	public int getTeamSize() {
		return teamSize;
	}
	
	
	

}
