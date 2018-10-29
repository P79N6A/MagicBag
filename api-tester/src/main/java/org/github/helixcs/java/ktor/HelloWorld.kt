/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.github.helixcs.java.ktor

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

/**
 * @Author: Helixcs
 * @Time:9/2/18
 * @sample :https://ktor.io/quickstart/index.html
 */

fun Application.mymodule() {
    routing {
        get("/sin") {
            call.respondText("Ok")
        }
    }
}

fun main(args: Array<String>) {
    embeddedServer(Netty, 8085, watchPaths = listOf("HelloWorld"), module = Application::mymodule).start()
}
//
//fun main(args: Array<String>) {
//    var server = embeddedServer(Netty, port = 8085) {
//        routing {
//            get("/") {
//                call.respondText("Hello World!", ContentType.Text.Html);
//            }
//        }
//    }
//
//    server.start(wait = true)
//}