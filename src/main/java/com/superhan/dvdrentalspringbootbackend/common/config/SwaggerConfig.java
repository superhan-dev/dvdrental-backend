package com.superhan.dvdrentalspringbootbackend.common.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;

@OpenAPIDefinition(info = @Info(title = "DVD Rental Service", description = "API documentation", version = "v1"))
@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {
  @Bean
  public GroupedOpenApi dvdRentalOpenApi() {
    String[] paths = { "/v1/**" };

    return GroupedOpenApi.builder()
        .group("DVD Rental Service")
        .pathsToMatch(paths).build();
  }
}
