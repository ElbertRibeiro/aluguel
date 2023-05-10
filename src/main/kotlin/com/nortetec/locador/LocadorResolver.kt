package com.nortetec.locador

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("locador")
class LocadorResolver {
    @GetMapping
    fun hello(): String {
        return "hello"
    }
}