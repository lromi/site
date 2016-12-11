package com.lromi.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by lromi on 24.11.2016.
 */

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.lromi.domains"})
@EnableJpaRepositories(basePackages = {"com.lromi.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
