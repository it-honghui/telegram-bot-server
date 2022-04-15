package com.telegram.bot.service.impl;

import com.telegram.bot.service.ReplyMessageService;
import com.telegram.bot.utils.ButtonModuleUtils;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author honghui 2022/4/13
 */
@Service
public class ReplyMessageServiceImpl implements ReplyMessageService {

  @Override
  public SendMessage regexAchievements(String text, SendMessage message) {
    if ("yes".equals(text)) {
      message.setText("yes yes yes ");
      InlineKeyboardMarkup inlineKeyboardMarkup = ButtonModuleUtils.getAddModule("no");
      message.setReplyMarkup(inlineKeyboardMarkup);
    } else {
      message.setText("no no no !");
      InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
      List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
      List<InlineKeyboardButton> buttons = new ArrayList<>();
      InlineKeyboardButton back = new InlineKeyboardButton("CANCEL");
      back.setCallbackData("CANCEL");
      buttons.add(back);
      keyboard.add(buttons);
      inlineKeyboardMarkup.setKeyboard(keyboard);
      message.setReplyMarkup(inlineKeyboardMarkup);
    }
    return message;
  }

}
