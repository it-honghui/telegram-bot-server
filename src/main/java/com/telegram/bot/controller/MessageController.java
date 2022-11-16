package com.telegram.bot.controller;

import com.telegram.bot.config.annotation.PasswordPermission;
import com.telegram.bot.domain.R;
import com.telegram.bot.domain.dto.MessageDto;
import com.telegram.bot.service.MessageService;
import org.springframework.web.bind.annotation.*;

/**
 * @author honghui 2022/11/15
 */
@RestController
@RequestMapping("/message")
public class MessageController {

  private final MessageService messageService;

  public MessageController(MessageService messageService) {
    this.messageService = messageService;
  }

  @PostMapping("/send/{password}")
  @PasswordPermission(requirePassword = true)
  public R<String> sendMessage(@PathVariable String password,
                               @RequestBody MessageDto messageDto) {
    messageService.sendMessage(messageDto);
    return R.ok("发送成功");
  }

}
