package com.lwhtarena.sourcecode.spring.beans;

import java.util.Properties;

/**
 * @Author: liwh
 * @Date: 2017/7/2 14:19
 * Description:
 */
public class DataSource {

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}
