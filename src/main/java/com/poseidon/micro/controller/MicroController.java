package com.poseidon.micro.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author pczhangyu
 * @date 2018/4/24
 * @description 服务控制调用
 */
@RestController
public class MicroController {

    private static Logger logger = LoggerFactory.getLogger(MicroController.class);

    @GetMapping(value="/micro/job")
    public String microJob(@RequestParam(value="p1")String param1,
                         @RequestParam(value="p2")String param2)
    {
        logger.info(param1+param2);
        return "success";
    }
}
