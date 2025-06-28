package com.saki.sakiaiagent.controller;

import com.saki.sakiaiagent.common.BaseResponse;
import com.saki.sakiaiagent.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sakisaki
 * @date 2025/6/27 16:58
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("ok");
    }
}

