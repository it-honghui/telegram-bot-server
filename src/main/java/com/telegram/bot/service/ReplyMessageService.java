package com.telegram.bot.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

/**
 * @author honghui 2022/4/13
 */
public interface ReplyMessageService {

  SendMessage regexAchievements(String text, SendMessage message);
}
