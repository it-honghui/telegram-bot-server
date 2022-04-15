package com.telegram.bot.service.impl;

import com.telegram.bot.service.GroupMessageService;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

/**
 * @author honghui 2022/4/13
 */
@Service
public class GroupMessageServiceImpl implements GroupMessageService {

  @Override
  public SendMessage joinGroupEvent(Update update, User user) {
    return new SendMessage(update.getMessage().getChatId().toString(), "Hello! " + user.getUserName());
  }

}
