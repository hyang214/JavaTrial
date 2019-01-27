package com.tal.cd.hyang.javatrial.controller;

import com.tal.cd.hyang.javatrial.domain.SFCResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * title: SpringFox 整合测试
 *
 * @author Hao YANG
 * @since 2019.01.27
 */
@Slf4j
@RestController
@RequestMapping(value = "/sfc", method = {RequestMethod.GET, RequestMethod.POST})
public class SpringFoxTestController {

    private static int count = 0;

    @RequestMapping("/firstTest")
    public SFCResponse firstTest(@RequestParam String name) {
        log.info("firstTest->name={}", name);
        SFCResponse response = new SFCResponse();
        response.setName(name);
        response.setNumber(++count);
        return response;
    }
}
