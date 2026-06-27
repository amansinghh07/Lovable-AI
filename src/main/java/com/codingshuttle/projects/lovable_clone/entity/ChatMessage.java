package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.enums.MessageRole;

import java.time.Instant;

public class ChatMessage {
    Long id;
    ChatSession chatSession;
    String content;
    MessageRole role;
    String tollCalls;
    Integer tokensUsed;
    Instant createdAt;
}
