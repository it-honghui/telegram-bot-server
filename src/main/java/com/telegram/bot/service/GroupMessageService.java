package com.telegram.bot.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

/**
 * @author honghui 2022/4/13
 */
public interface GroupMessageService {

  SendMessage joinGroupEvent(Update update, User user);
}
