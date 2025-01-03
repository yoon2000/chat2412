package com.ll.chat2412.chat;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RsData<T> {
    private String code;
    private String message;
    private T data;
}