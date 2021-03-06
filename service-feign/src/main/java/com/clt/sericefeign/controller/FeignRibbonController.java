package com.clt.sericefeign.controller;

import com.clt.sericefeign.impl.FeignRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignRibbonController {
    @Autowired
    FeignRibbonService feignService;

    @RequestMapping(value = "/ribbon", method = RequestMethod.GET)
    public String ribbon(@RequestParam String name) {
        return feignService.ribbon(name);
    }
}
