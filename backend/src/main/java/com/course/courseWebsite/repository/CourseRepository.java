package com.course.courseWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.courseWebsite.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}