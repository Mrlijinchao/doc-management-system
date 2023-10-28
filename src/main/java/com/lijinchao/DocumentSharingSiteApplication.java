package com.lijinchao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
 * //@EnableAsync(proxyTargetClass=true)
 * //@EnableAsync
 * //@EnableTransactionManagement(proxyTargetClass = true)
 * @ClassName DocumentSharingSiteApplication
 * @Description SpringBoot application
 * @Author lijinchao
 * @Date 2022/6/2 10:58 下午
 * @Version 1.0
 **/
@ServletComponentScan(basePackages = "com.lijinchao.filter")
@SpringBootApplication
public class DocumentSharingSiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(DocumentSharingSiteApplication.class, args);
    }

}
