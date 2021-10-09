package com.ws.worldskills.repository;

import com.ws.worldskills.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactoryRepository extends JpaRepository<User, Long> {
}