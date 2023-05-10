package com.nortetec

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class AluguelApi {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(AluguelApi::class.java, *args)
        }
    }
}