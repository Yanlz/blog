package org.yanlz.blog.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by yanliangzhao on 15/12/28.
 */
@Configuration
@EnableConfigurationProperties(DatabasePorperties.class)
public class DatabaseConfiguration {

    @Autowired
    DatabasePorperties databasePorperties;

    @Bean
    DataSource dataSource(){
        databasePorperties.setPoolName("Blog_DatabasePool");
        return new HikariDataSource(databasePorperties);
    }
}
