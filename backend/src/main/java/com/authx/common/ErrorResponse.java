package com.authx.common;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
public class ErrorResponse {

    private boolean success;
    private String errorCode;
    private String message;
    private int  status;
    @Builder.Default
    private LocalDateTime timestamp = LocalDateTime.now();
    private String path;
}
