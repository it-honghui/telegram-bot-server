package com.telegram.bot.command;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * @author honghui 2022/4/13
 */
public class StartCommand implements Command {

  @Override
  public SendMessage execute(Update update) {
    return new SendMessage(update.getMessage().getChatId().toString(), "Start命令被执行！");
  }

}
