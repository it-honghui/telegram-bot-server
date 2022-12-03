# telegram-bot-server

- 进群事件
- 退群事件
- 正常事件
  - 群组消息
  - 命令执行
  - 回复消息
- 按钮事件
- 发送消息

---

```shell
cd telegram-bot-server
docker build -t telegram-bot:v1.0.0 .
docker run -it -d -p 8080:8080 --name telegram-bot -v $PWD/log/:/log/ telegram-bot:v1.0.0
```
