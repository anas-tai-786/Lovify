package com.lovify.app.repository;

import com.lovify.app.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query("""
            SELECT p FROM Project p
            WHERE p.deletedAt is NULL
            AND p.owner.id = :userId
            ORDER BY p.updatedAt desc
            """)
    List<Project> findAllAcceesibleByUser(@Param("userId") Long userId);
}
