package com.lromi.repositories;

import com.lromi.domains.News;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lromi on 24.11.2016.
 */
public interface NewsRepository extends CrudRepository<News,Long> {
}
