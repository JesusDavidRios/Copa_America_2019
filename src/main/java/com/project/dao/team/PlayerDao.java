package com.project.dao.team;

import com.project.model.PlayerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerDao extends JpaRepository<PlayerModel, Integer> {
    List<PlayerModel> findByName(String name);
}
