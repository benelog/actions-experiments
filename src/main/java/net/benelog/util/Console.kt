package net.benelog.util

import java.io.PrintStream

class Console(private val out: PrintStream) {
    fun hello(name: String) {
        this.out.println("Hello $name")
    }
}
