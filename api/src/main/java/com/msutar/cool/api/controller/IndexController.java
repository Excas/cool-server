package com.msutar.cool.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("index")
@Api(tags = "首页")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class IndexController {

    @GetMapping
    @ApiOperation(value = "hello", notes = "hello")
    public String index () {
        return "hello j";
    }
}
