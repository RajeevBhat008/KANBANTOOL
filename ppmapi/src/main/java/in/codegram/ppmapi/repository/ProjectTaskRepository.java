package in.codegram.ppmapi.repository;

import org.springframework.data.repository.CrudRepository;

import in.codegram.ppmapi.domain.ProjectTask;

public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {

	ProjectTask findByProjectSequence(String projectSequence);

}
