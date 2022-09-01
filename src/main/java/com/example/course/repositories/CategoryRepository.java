package com.example.course.repositories;

import com.example.course.entities.Category;
import com.example.course.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
