package com.lovify.app.service;

import com.lovify.app.dto.auth.project.ProjectRequest;
import com.lovify.app.dto.auth.project.ProjectResponse;
import com.lovify.app.dto.auth.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
