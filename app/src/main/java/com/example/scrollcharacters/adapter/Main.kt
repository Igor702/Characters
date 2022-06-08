package com.example.scrollcharacters.adapter

class SimpleThread: Thread(){
    override fun run() {
        println("${Thread.currentThread()} has run")
    }
}

class SimpleRunnable: Runnable{
    override fun run() {
        println("${Thread.currentThread()} has run")
    }
}

fun main() {
    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()

    kotlin.concurrent.thread {
        println("${Thread.currentThread()} has run f")
    }
}