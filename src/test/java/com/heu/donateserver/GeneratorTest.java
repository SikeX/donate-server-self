package com.heu.donateserver;


import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.Scanner;

public class GeneratorTest {

    @Test
    public void generate() {

        // 数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig
                .Builder("jdbc:mysql://localhost:3306/donate","root","root")
                .build();

        String projectPath = System.getProperty("user.dir");

        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig
                .Builder()
                .outputDir(projectPath + "/src/main/java")
                .author("sike")
                .openDir(false)
                .build();

        // 包配置
        PackageConfig packageConfig = new PackageConfig
                .Builder()
                .parent("com.heu")
                .moduleName("donateserver")
                .build();


        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig
                .Builder()
                .entityBuilder()
                .naming(NamingStrategy.underline_to_camel)
                .columnNaming(NamingStrategy.underline_to_camel)
                .enableLombok()
                .controllerBuilder()
                .enableRestStyle()
                .build();

        TemplateConfig templateConfig = new TemplateConfig.Builder().build(); // 激活所有默认模板

        InjectionConfig injectionConfig = new InjectionConfig.Builder().build();

        // 代码生成器
        new AutoGenerator(dataSourceConfig)
                .global(globalConfig)
                .packageInfo(packageConfig)
                .strategy(strategyConfig)
                .template(templateConfig)
                .injection(injectionConfig)
                .execute();
    }
}
