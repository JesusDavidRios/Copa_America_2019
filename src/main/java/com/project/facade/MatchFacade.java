package com.project.facade;

import com.project.model.MatchModel;

import java.util.List;

public interface MatchFacade {
    List<MatchModel> listAll();

    MatchModel findById(int id);
}
