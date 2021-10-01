package in.codegram.ppmapi.service;

import in.codegram.ppmapi.domain.ProjectTask;

public interface ProjectTaskService {
	public static final Integer LOW = 3;
	public static final Integer MEDIUM = 2;
	public static final Integer HIGH = 1;
	public static final String TODO = "TO DO";
	public static final String IN_PROGRESS = "IN PROGRESS";
	public static final String DONE = "DONE";
	

	public ProjectTask addProjectTask(String projectIdentifier, ProjectTask projectTask);
	
	public ProjectTask findPTByProjectSequence(String backlog_id,String pt_id);
	
	public ProjectTask updateByProjectSequence(ProjectTask updatedTask,String backlog_id,String pt_id );
	
	public void deletePTByProjectSequence(String backlog_id,String pt_id);
}
