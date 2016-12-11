package com.lromi.services;

import com.lromi.domains.News;

import java.util.List;

/**
 * Created by lromi on 25.11.2016.
 */
public interface NewsService {
    List<News> getAll();
    News getByID(long id);
    News save(News news);
    void remove(long id);
}
