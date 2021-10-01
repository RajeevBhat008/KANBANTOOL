package in.codegram.ppmapi.service;

import in.codegram.ppmapi.domain.Project;

public interface ProjectService {
	public Project saveOrUpdate(Project project);
	public Project findProjectByProjectIdentifier(String projectId);
	
	public Iterable<Project> findAll();
	
	public void deleteProjectByIdentifier(String projectId);

}
