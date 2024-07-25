package com.usp.banking.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v2")
public abstract class TsBaseController {

    public abstract void nullfy();
}
