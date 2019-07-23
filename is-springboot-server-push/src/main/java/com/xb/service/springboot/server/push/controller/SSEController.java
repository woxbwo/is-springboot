package com.xb.service.springboot.server.push.controller;

/**
 * @ClassName: SSEController
 * @Description:
 * @Author: Coding_wxb
 * @Date 2019.07.24 3:18
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sse")
public class SSEController {

    @RequestMapping(value = "/get_data", produces = "text/event-stream;charset=UTF-8")
    public String push() {

        try {
            Thread.sleep(1000);
            //第三方数据源调用
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "data:xdclass 行情" + Math.random() + "\n\n";
    }
}
