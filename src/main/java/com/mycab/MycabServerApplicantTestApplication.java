package com.mycab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class MycabServerApplicantTestApplication extends WebMvcConfigurerAdapter
{

    public static void main(String[] args)
    {
        SpringApplication.run(MycabServerApplicantTestApplication.class, args);
    }

    @Bean
    public Docket docket()
    {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage(getClass().getPackage().getName()))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo());
    }


    private ApiInfo apiInfo()
    {
        return new ApiInfoBuilder()
            .license("Apache 2.0")
            .version("Version 1.0 - mw")
            .termsOfServiceUrl("urn:tos")
            .title("mycab Server Applicant Test Service")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
            .contact(new Contact("mycab", null, "career@mycab.com"))
            .description("This service is to check the technology knowledge of a server applicant for mycab.")
            .build();
    }
}
