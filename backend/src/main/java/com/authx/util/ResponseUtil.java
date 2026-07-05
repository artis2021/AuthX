package com.authx.util;

import com.authx.common.ApiResponse;

import java.time.LocalDateTime;

public final class ResponseUtil {
    private ResponseUtil() {}

    public static <T> ApiResponse<T> success(String message, T data) {
        return ApiResponse.<T>builder().data(data).success(true).message(message).build();
    }

    public static <T> ApiResponse<T> success(String message) {
        return ApiResponse.<T>builder().success(true).message(message).build();
    }

    public static <T> ApiResponse<T> failure(String message) {
        return ApiResponse.<T>builder().success(false).message(message).build();
    }
}





