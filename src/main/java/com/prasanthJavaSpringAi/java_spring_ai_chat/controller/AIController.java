package com.prasanthJavaSpringAi.java_spring_ai_chat.controller;

import com.prasanthJavaSpringAi.java_spring_ai_chat.service.LlamaAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIController {
    @Autowired
        private LlamaAIService llamaAIService;
        @GetMapping("/api/v1/generate")
         public String get(@RequestParam(value = "promptMessage") String promptMessage) {
            return llamaAIService.getResult(promptMessage);
        }
}
