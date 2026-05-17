package com.sample.ai.controller;

import com.sample.ai.dto.ChatRequest;
import dev.langchain4j.model.chat.ChatModel;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/chat")
public class ChatController {
    private ChatModel chatModel;

    public ChatController(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping
    public String chat(@RequestParam String message) {
        return chatModel.chat(message);
    }

    @PostMapping
    public String chatPost(@RequestBody ChatRequest request) {
        return chatModel.chat(request.message());
    }

}
