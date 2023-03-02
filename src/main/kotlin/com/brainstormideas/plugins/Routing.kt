package com.brainstormideas.plugins

import com.brainstormideas.routes.userRouting
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello Ktor!")
        }
        userRouting()
    }
}
