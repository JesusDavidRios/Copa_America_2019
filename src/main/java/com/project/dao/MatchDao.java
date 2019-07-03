package com.project.dao;

import com.project.model.MatchModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchDao extends JpaRepository<MatchModel, Integer> {
}
