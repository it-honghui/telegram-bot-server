package com.telegram.bot.utils;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ForceReplyKeyboard;

/**
 * @author honghui 2022/4/13
 */
public class MessageUtils {
  public static ForceReplyKeyboard forceReply() {
    ForceReplyKeyboard replyKeyboard = new ForceReplyKeyboard();
    replyKeyboard.setForceReply(true);
    return replyKeyboard;
  }
}
