package com.lovify.app.service.impl;

import com.lovify.app.dto.project.FileContentResponse;
import com.lovify.app.dto.project.FileNode;
import com.lovify.app.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
