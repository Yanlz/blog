package org.yanlz.blog.config;

import com.zaxxer.hikari.HikariDataSource;
import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * Created by yanliangzhao on 15/12/28.
 */
@org.springframework.context.annotation.Configuration
@EnableConfigurationProperties(DatabasePorperties.class)
public class DatabaseConfiguration {

    @Autowired
    DatabasePorperties databasePorperties;

    @Bean
    DataSource dataSource(){
        databasePorperties.setPoolName("Blog_DatabasePool");
        return new HikariDataSource(databasePorperties);
    }

    @Bean
    PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(this.dataSource());
    }

    @Bean
    @Primary
    Configuration blogJooqConfig() {
        DataSource dataSource = this.dataSource();
        return new DefaultConfiguration()
                .set(new DataSourceConnectionProvider(dataSource))
                .set(new NoTransactionProvider()) //
                .set(new DefaultExecuteListenerProvider(new DefaultExecuteListener())) //
                .set(SQLDialect.MYSQL);
    }
}
