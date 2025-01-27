package com.prasanthJavaSpringAi.java_spring_ai_chat.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LlamaAIService {

    @Autowired
    private OllamaChatModel chatModel;
    public String getResult(String prompt) {
        ChatResponse response = chatModel.call(
                new Prompt(
                        prompt,
                        OllamaOptions.builder()
                                .model(OllamaModel.LLAMA2)
                                .temperature(0.4)
                                .build()
                ));
        return response.getResult().getOutput().getContent();
    }
}
