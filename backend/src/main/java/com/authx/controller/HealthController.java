package com.authx.controller;

import com.authx.common.ApiResponse;
import com.authx.exception.BadRequestException;
import com.authx.util.ResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/v1/health")
    public ResponseEntity<ApiResponse<String>> health() {
        return ResponseEntity.ok(
                ResponseUtil.success(
                        "API AUTH SERVER IS RUNNING",
                        "UP"
                )
        );
    }

    @GetMapping("/api/v1/error")
    public ResponseEntity<Void> error() {
        throw new BadRequestException("This is a Bad Request");
    }
}
