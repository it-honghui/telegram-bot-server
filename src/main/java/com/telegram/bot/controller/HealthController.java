package com.telegram.bot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author honghui 2022/4/13
 */
@RestController
public class HealthController {

  @GetMapping
  public String health() {
    return "healthy!";
  }

}
