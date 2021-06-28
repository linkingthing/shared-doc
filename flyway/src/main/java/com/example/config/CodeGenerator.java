package com.example.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * @Description 代码生成器
 * @Author huangliang
 * @Date 2020/7/29 15:10
 */
public class CodeGenerator {

    public static void main(String[] args) {
        //项目路径
        String projectPath = System.getProperty("user.dir") + "/flyway/src/main/java";

        //构建生成器
        AutoGenerator generator = new AutoGenerator();
        //设置全局属性
        generator.setGlobalConfig(new GlobalConfig()
                .setOutputDir(projectPath)//输出目录
                .setFileOverride(true)// 是否覆盖文件
                .setOpen(false)//生成后打开文件夹
                .setAuthor("huangliang")
                .setServiceName("%sService")
                .setMapperName("%sRepository")
                .setSwagger2(false)
                .setDateType(DateType.TIME_PACK)
        );

        //设置数据源
        generator.setDataSource(new DataSourceConfig()
                .setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://121.40.78.211:3306/flyway_db?allowMultiQueries=true&serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8&useSSL=false")
                .setUsername("root")
                .setPassword("mysql")
        );

        //设置生成策略
        generator.setStrategy(new StrategyConfig()
                .setTablePrefix("t_")// 此处可以修改表前缀
                .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
                .setColumnNaming(NamingStrategy.underline_to_camel)// 字段名生成策略
                .setRestControllerStyle(true)
                .setChainModel(true) // setter返回的this而不是void
                .setEntityLombokModel(true) // 是否为lombok模型（默认 false）
                .setRestControllerStyle(true)
                .setInclude("sys_user")
        );

        //包配置
        generator.setPackageInfo(new PackageConfig()
                .setParent("com.example")
                .setController("controller")
                .setService("service")
                .setServiceImpl("service.impl")
                .setEntity("domain.entity")
                .setMapper("domain.repository")
                .setXml("domain.repository.mapper"));

        //指定模板引擎
        generator.setTemplateEngine(new FreemarkerTemplateEngine());

        //模板配置
        generator.setTemplate(
                new TemplateConfig()
                        .setXml("templates/mapperPro.xml")
                        .setMapper("templates/mapperPro.java")
                        .setEntity("templates/entityPro.java")
                        .setServiceImpl("templates/serviceImplPro.java")
                        .setService("templates/servicePro.java")
                        .setController("templates/controllerPro.java")
        );

        //执行生成
        generator.execute();
    }

}
