package org.yanlz.blog.config;

import com.zaxxer.hikari.HikariConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by yanliangzhao on 15/12/28.
 */
@ConfigurationProperties(prefix = "blog.dataSource")
public class DatabasePorperties extends HikariConfig {

}
