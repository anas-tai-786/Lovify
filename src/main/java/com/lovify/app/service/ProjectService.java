package com.lovify.app.service;

import com.lovify.app.dto.project.ProjectRequest;
import com.lovify.app.dto.project.ProjectResponse;
import com.lovify.app.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects();

    ProjectResponse getUserProjectById(Long id);

    ProjectResponse createProject(ProjectRequest request);

    ProjectResponse updateProject(Long id, ProjectRequest request);

    void softDelete(Long id);
}
