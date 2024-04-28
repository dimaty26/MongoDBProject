package com.zmeev.mongodbproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongoDbProjectApplication

fun main(args: Array<String>) {
    runApplication<MongoDbProjectApplication>(*args)
}
