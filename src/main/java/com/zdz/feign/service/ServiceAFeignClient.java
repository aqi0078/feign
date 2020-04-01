package com.zdz.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "service-hi")
public interface ServiceAFeignClient {

    @RequestMapping(value = "/hi")
    String test();

}
