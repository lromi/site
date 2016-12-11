package com.lromi.services;

import com.lromi.domains.Factor;
import com.lromi.repositories.FactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lromi on 25.11.2016.
 */
@Service
public class FactorServiceImpl implements FactorService {

    @Autowired
    private FactorRepository repository;

    @Override
    public Factor getByID(long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Factor> getAll() {
        return repository.findAll();
    }

    @Override
    public Factor save(Factor factor) {
        return repository.saveAndFlush(factor);
    }

    @Override
    public void remove(long id) {

        repository.delete(id);
    }
}
