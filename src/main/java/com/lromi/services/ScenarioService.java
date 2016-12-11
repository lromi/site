package com.lromi.services;

import com.lromi.domains.Scenario;

import java.util.List;

/**
 * Created by lromi on 25.11.2016.
 */
public interface ScenarioService {
    List<Scenario> getAll();
    Scenario getByID(long id);
    Scenario save(Scenario scenario);
    void remove(long id);
}
