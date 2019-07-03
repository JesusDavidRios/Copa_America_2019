package com.project.service;

import com.project.model.MatchModel;

import java.util.List;

public interface MatchService {

    List<MatchModel> listAll();

    MatchModel getOne(int id);

    MatchModel save(MatchModel entity);
}
