package com.study.kotl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlApplication

fun main(args: Array<String>) {
	runApplication<KotlApplication>(*args)
}
