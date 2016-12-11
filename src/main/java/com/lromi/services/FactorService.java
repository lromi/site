package com.lromi.services;

import com.lromi.domains.Factor;

import java.util.List;

/**
 * Created by lromi on 25.11.2016.
 */
public interface FactorService {
    List<Factor> getAll();
    Factor getByID(long id);
    Factor save(Factor factor);
    void remove(long id);
}
