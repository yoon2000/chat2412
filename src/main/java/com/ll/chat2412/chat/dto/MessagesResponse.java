package com.ll.chat2412.chat.dto;

import com.ll.chat2412.chat.ChatMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class MessagesResponse {

    List<ChatMessage> chatMessages;
    private int totalCount;
}
