package com.micronaut.demo

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.micronaut.demo")
		.start()
}

