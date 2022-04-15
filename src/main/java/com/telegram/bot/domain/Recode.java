package com.telegram.bot.domain;

import lombok.Getter;

/**
 * @author honghui 2022/4/13
 */
@Getter
public enum Recode {

  SUCCESS(1, "ok"),

  NOT_FOUND(404, "not found"),

  PASSWORD_ERROR(101, "password error"),
  ;

  private final Integer code;
  private final String msg;

  Recode(Integer code, String msg) {
    this.code = code;
    this.msg = msg;
  }
}
