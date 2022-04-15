package com.telegram.bot.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author honghui 2022/4/13
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class R<T> {

  /**
   * 错误码
   */
  private Integer code;

  /**
   * 提示信息
   */
  private String msg;

  /**
   * 具体内容
   */
  private T data;

  public static <T> R<T> ok(T t) {
    return R.<T>builder()
        .code(Recode.SUCCESS.getCode())
        .msg(Recode.SUCCESS.getMsg())
        .data(t).build();
  }

  public static R error(Recode err) {
    return R.builder()
        .code(err.getCode())
        .msg(err.getMsg()).build();
  }

  public static R error(Integer code, String msg) {
    return R.builder()
        .code(code)
        .msg(msg).build();
  }
}
