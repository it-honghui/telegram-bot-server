package com.telegram.bot.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * @author honghui 2022/4/13
 */
public interface ButtonMessageService {

  SendMessage addButton(Update update);

  EditMessageText cancelButton(Update update);

  EditMessageText normalButton(Update update);

}
