package com.ll.chat2412.chat.dto;

import com.ll.chat2412.chat.ChatMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WriteMessageResponse {
    private ChatMessage chatMessage;
}
