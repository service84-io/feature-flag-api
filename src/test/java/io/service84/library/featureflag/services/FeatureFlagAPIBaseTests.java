package io.service84.library.featureflag.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class FeatureFlagAPIBaseTests {
  @TestConfiguration
  public static class Configuration {
    @Bean
    public FeatureFlagAPI getFeatureFlagAPI() {
      return new FeatureFlagAPIBase() {};
    }
  }

  // Test Subject
  @Autowired private FeatureFlagAPI featureFlagService;

  @Test
  public void existenceTest() {
    assertNotNull(featureFlagService);
  }
}
