package com.ms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.Feature;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.jdbc.JDBCStateRepository;
import org.togglz.core.spi.FeatureProvider;
import org.togglz.core.user.NoOpUserProvider;
import org.togglz.core.user.UserProvider;

import javax.sql.DataSource;

@Configuration
public class TogglzConfiguration implements TogglzConfig {

    @Autowired
    private DataSource dataSource;

    @Override
    public Class<? extends Feature> getFeatureClass() {
        return FeatureOptions.class;
    }

    @Bean
    public StateRepository getStateRepository() {
        return new JDBCStateRepository(dataSource);
    }

    @Bean
    public UserProvider getUserProvider() {
        return new NoOpUserProvider();
    }

    @Bean
    public FeatureProvider featureProvider() {
        return new EnumBasedFeatureProvider(FeatureOptions.class);
    }
}
