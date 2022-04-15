package com.telegram.bot.domain;

import lombok.Getter;

/**
 * @author honghui 2022/4/13
 */
@Getter
public class ERR extends RuntimeException {

  private final Integer code;

  public ERR(Recode rc) {
    super(rc.getMsg());
    this.code = rc.getCode();
  }

  public ERR(Recode rc, String extraMsg) {
    super(String.format("%s : %s", rc.getMsg(), extraMsg));
    this.code = rc.getCode();
  }

  public ERR(Integer code, String msg) {
    super(msg);
    this.code = code;
  }

  public String toStr() {
    return String.format("[%s] %s", this.getCode(), this.getMessage());
  }

  public static ERR of(Recode rc) {
    return new ERR(rc);
  }

  public static ERR of(Recode rc, String extraMsg) {
    return new ERR(rc, extraMsg);
  }

  public static ERR of(Integer code, String msg) {
    return new ERR(code, msg);
  }
}
