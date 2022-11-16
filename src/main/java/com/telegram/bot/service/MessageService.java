package com.telegram.bot.service;

import com.telegram.bot.domain.dto.MessageDto;

/**
 * @author honghui 2022/4/13
 */
public interface MessageService {

  void sendMessage(MessageDto messageDto);
}
