package com.nortetec

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AluguelApi {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(AluguelApi::class.java, *args)
        }
    }
}