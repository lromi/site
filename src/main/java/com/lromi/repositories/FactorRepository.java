package com.lromi.repositories;

import com.lromi.domains.Factor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lromi on 24.11.2016.
 */
public interface FactorRepository extends JpaRepository<Factor, Long> {
}
