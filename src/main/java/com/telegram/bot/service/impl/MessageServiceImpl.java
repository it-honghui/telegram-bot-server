package com.telegram.bot.service.impl;

import com.telegram.bot.component.TelegramLongPollingBotComponent;
import com.telegram.bot.domain.dto.MessageDto;
import com.telegram.bot.service.MessageService;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

/**
 * @author honghui 2022/4/13
 */
@Service
public class MessageServiceImpl implements MessageService {

  private final TelegramLongPollingBotComponent telegramLongPollingBotComponent;

  public MessageServiceImpl(TelegramLongPollingBotComponent telegramLongPollingBotComponent) {
    this.telegramLongPollingBotComponent = telegramLongPollingBotComponent;
  }

  @Override
  public void sendMessage(MessageDto messageDto) {
    telegramLongPollingBotComponent.send(new SendMessage(messageDto.getChatId(), messageDto.getText()));
  }

}
