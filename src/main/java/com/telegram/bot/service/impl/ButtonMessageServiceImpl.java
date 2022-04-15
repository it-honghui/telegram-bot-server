package com.telegram.bot.service.impl;

import com.telegram.bot.service.ButtonMessageService;
import com.telegram.bot.utils.MessageUtils;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ForceReplyKeyboard;

/**
 * @author honghui 2022/4/13
 */
@Service
public class ButtonMessageServiceImpl implements ButtonMessageService {

  @Override
  public SendMessage addButton(Update update) {
    SendMessage message = new SendMessage();
    message.setChatId(update.getCallbackQuery().getMessage().getChatId().toString());
    message.setText("add button!");
    ForceReplyKeyboard replyKeyboard = MessageUtils.forceReply();
    message.setReplyMarkup(replyKeyboard);
    return message;
  }

  @Override
  public EditMessageText cancelButton(Update update) {
    EditMessageText editMessageText = new EditMessageText();
    editMessageText.setChatId(update.getCallbackQuery().getMessage().getChatId().toString());
    editMessageText.setMessageId(update.getCallbackQuery().getMessage().getMessageId());
    editMessageText.setText("cancel button!");
    return editMessageText;
  }

  @Override
  public EditMessageText normalButton(Update update) {
    EditMessageText editMessageText = new EditMessageText();
    editMessageText.setChatId(update.getCallbackQuery().getMessage().getChatId().toString());
    editMessageText.setMessageId(update.getCallbackQuery().getMessage().getMessageId());
    editMessageText.setText("normal button!");
    return editMessageText;
  }


}
