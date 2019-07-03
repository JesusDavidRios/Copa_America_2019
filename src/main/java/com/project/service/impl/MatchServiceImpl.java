package com.project.service.impl;

import com.project.dao.MatchDao;
import com.project.model.MatchModel;
import com.project.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {
    @Autowired
    private MatchDao matchDao;

    @Override
    public List<MatchModel> listAll() {
        return this.matchDao.findAll();
    }

    @Override
    public MatchModel getOne(int id) {
        return this.matchDao.getOne(id);
    }

    @Override
    public MatchModel save(MatchModel entity) {
        return this.matchDao.save(entity);
    }
}
