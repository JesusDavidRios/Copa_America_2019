package com.project.facade.impl;

import com.project.facade.MatchFacade;
import com.project.model.MatchModel;
import com.project.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MatchFacadeImpl implements MatchFacade {
    @Autowired
    private MatchService matchService;
    @Override
    public List<MatchModel> listAll() {
        return this.matchService.listAll();
    }

    @Override
    public MatchModel findById(int id) {
        return this.matchService.getOne(id);
    }


}
