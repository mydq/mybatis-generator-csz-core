# mybatis generator

> MyBatis 自动生成工具，集成了分页、批量插入、序列化功能，本例只针对于mysql数据库

## 打开方式

> maven pom.xml add  
          
        <plugin>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-maven-plugin</artifactId>
            <version>1.3.5</version>
            <configuration>
                <configurationFile>
                    mybatis-generator/generatorMybatis-mysql.xml
                </configurationFile>
                <overwrite>true</overwrite>
                <verbose>true</verbose>
            </configuration>
            <dependencies>
                <dependency>
                    <groupId>com.generator</groupId>
                    <artifactId>mybatis-generator-csz-core</artifactId>
                    <version>1.0.0</version>
                </dependency>
            </dependencies>
        </plugin>
## 使用方式

> 修改xml文件路径
* 修改其中的数据库连接配置；allowMultiQueries=true
* 修改相关mybatis对象的包名及生成路径；
* 配置需要生成的数据表；
* 配置需要使用的plugin
* 执行plugin mybatis-generator 插件
