/**
 * @Title: TestController.java
 * @Package: com.bk.jenkins.controller
 * Company: 湖南教育出版社-贝壳网
 * Copyright (c) 2019, www.bakclass.com. All Rights Reserved.
 */
package com.bk.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author shijh
 * @date 2019/9/26 14:24
 */
@RestController
public class TestController {


    @GetMapping("test")
    public String test(@RequestParam("name") String name){
        return "你好----jar：" + name;
    }

}
