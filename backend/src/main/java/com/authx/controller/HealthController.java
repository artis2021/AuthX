package com.authx.controller;

import com.authx.common.ApiResponse;
import com.authx.util.ResponseUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/v1/health")
    public ApiResponse<String> health() {
        return ResponseUtil.success("AuthX service is running successfully.",
                "UP");
    }
}
