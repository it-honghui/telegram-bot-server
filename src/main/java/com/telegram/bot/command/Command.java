package com.telegram.bot.command;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * @author honghui 2022/4/13
 */
public interface Command {

  SendMessage execute(Update update);
}
