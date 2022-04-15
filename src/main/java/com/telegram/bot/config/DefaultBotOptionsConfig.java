package com.telegram.bot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;

/**
 * @author honghui 2022/4/13
 */
@Configuration
public class DefaultBotOptionsConfig {

  @Value("${spring.profiles.active}")
  private String springProfileActive;

  @Bean
  public DefaultBotOptions newDefaultBotOptions() {
    final DefaultBotOptions defaultBotOptions = new DefaultBotOptions();
    if ("dev".equalsIgnoreCase(springProfileActive)) {
      defaultBotOptions.setProxyHost("127.0.0.1");
      defaultBotOptions.setProxyPort(7890);
      defaultBotOptions.setProxyType(DefaultBotOptions.ProxyType.SOCKS5);
    }
    return defaultBotOptions;
  }

}
