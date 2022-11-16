package com.telegram.bot.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author honghui 2022/11/15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class MessageDto implements Serializable {

  private static final long serialVersionUID = 3072287864899007849L;
  private String chatId;
  private String text;

}

