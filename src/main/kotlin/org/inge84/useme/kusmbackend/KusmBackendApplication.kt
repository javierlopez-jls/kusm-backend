package org.inge84.useme.kusmbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KusmBackendApplication

fun main(args: Array<String>) {
	runApplication<KusmBackendApplication>(*args)
}
