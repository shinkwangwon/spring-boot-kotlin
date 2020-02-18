package com.study.index

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexViewController {
    @GetMapping("/")
    fun main(): String {
        return "index";
    }
}