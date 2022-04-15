package com.telegram.bot.command;

import com.telegram.bot.command.annotation.AdminCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * @author honghui 2022/4/13
 */
@AdminCommand
public class DeleteCommand implements Command {

  @Override
  public SendMessage execute(Update update) {
    return new SendMessage(update.getMessage().getChatId().toString(), "delete命令被执行！");
  }

}
