package com.telegram.bot.utils;

import com.telegram.bot.constant.InlineKeyboardButtonFiled;
import org.telegram.telegrambots.meta.api.objects.LoginUrl;
import org.telegram.telegrambots.meta.api.objects.games.CallbackGame;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author honghui 2022/4/13
 */
public class ButtonModuleUtils {

  public static InlineKeyboardMarkup getAddModule(String kind) {
    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
    List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
    List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
    InlineKeyboardButton add = addInlineKeyboard("ADD", "ADD", InlineKeyboardButtonFiled.CALLBACK_DATA);
    keyboardButtonsRow1.add(add);
    if ("back".equals(kind)) {
      InlineKeyboardButton back = addInlineKeyboard("CANCEL", "CANCEL", InlineKeyboardButtonFiled.CALLBACK_DATA);
      keyboardButtonsRow1.add(back);
    } else if ("no".equals(kind)) {
      InlineKeyboardButton back = addInlineKeyboard("No more, show my report", "OTHERS", InlineKeyboardButtonFiled.CALLBACK_DATA);
      keyboardButtonsRow1.add(back);
    }
    rowList.add(keyboardButtonsRow1);
    inlineKeyboardMarkup.setKeyboard(rowList);
    return inlineKeyboardMarkup;
  }


  private static InlineKeyboardButton addInlineKeyboard(String text, Object arg, InlineKeyboardButtonFiled filed) {
    InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton(text);
    switch (filed) {
      case LOGIN_URL:
        inlineKeyboardButton.setLoginUrl((LoginUrl) arg);
        break;
      case PAY:
        inlineKeyboardButton.setPay((Boolean) arg);
        break;
      case CALLBACK_DATA:
        inlineKeyboardButton.setCallbackData((String) arg);
        break;
      case CALLBACK_GAME:
        inlineKeyboardButton.setCallbackGame((CallbackGame) arg);
        break;
      case SWITCH_INLINE_QUERY:
        inlineKeyboardButton.setSwitchInlineQuery((String) arg);
        break;
      case SWITCH_INLINE_QUERY_CURRENT_CHAT:
        inlineKeyboardButton.setSwitchInlineQueryCurrentChat((String) arg);
        break;
      default:

    }
    return inlineKeyboardButton;
  }

}
