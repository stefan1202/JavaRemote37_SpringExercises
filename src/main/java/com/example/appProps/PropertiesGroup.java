package com.example.appProps;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component // or //@EnableConfigurationProperties(PropertiesGroup.class)
@ConfigurationProperties(prefix = "pl.sdacademy.group")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Profile("prod,uat")
public class PropertiesGroup {
  private String propA;
  private Integer propB;
}

