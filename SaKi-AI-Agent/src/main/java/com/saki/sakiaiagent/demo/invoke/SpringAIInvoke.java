package com.saki.sakiaiagent.demo.invoke;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * SpringAIAlibaba
 * @author sakisaki
 * @date 2025/7/1 18:04
 */
// @Component
public class SpringAIInvoke implements CommandLineRunner {

    @Resource
    private ChatModel dashscopeChatModel;

    @Override
    public void run(String... args) throws Exception {
        AssistantMessage output = dashscopeChatModel
                .call(new Prompt("你好，我是SaKi酱"))
                .getResult()
                .getOutput();
        System.out.println(output.getText());
    }
}

