package com.saki.sakiaiagent.app;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;


@SpringBootTest
class LoveAppTest {

    @Resource
    private LoveApp loveApp;

    @Test
    void testChat() {
        // 对话记忆的唯一标识
        String chatId = UUID.randomUUID().toString();

        // 第一轮
        String message = "你好，我是程序员SaKi酱";
        String answer = loveApp.doChat(message, chatId);
        Assertions.assertNotNull(answer);

        // 第二轮
        message = "我想让另一半（MaYi酱）更爱我";
        answer = loveApp.doChat(message, chatId);
        Assertions.assertNotNull(answer);

        // 第三轮
        message = "我的另一半叫什么来着？刚跟你说过，帮我回忆一下";
        answer = loveApp.doChat(message, chatId);
        Assertions.assertNotNull(answer);
    }
}