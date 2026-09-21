package com.keerthi.Service.Interfaces;

import com.keerthi.DTO.ProjectDTO;
import com.keerthi.Entity.Project;

import java.util.List;

public interface ProjectService {
    Project addProject(ProjectDTO dto);
    List<Project> getAllProjects();
    Project getProjectById(Long id);
    Project updateProject(Long id, ProjectDTO dto);
    void deleteProject(Long id);
}
