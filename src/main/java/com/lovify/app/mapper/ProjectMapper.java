package com.lovify.app.mapper;

import com.lovify.app.dto.project.ProjectResponse;
import com.lovify.app.dto.project.ProjectSummaryResponse;
import com.lovify.app.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListProjectSummaryResponse(List<Project> project);
}
