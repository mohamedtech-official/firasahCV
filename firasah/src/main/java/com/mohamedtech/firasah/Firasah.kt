package com.mohamedtech.firasah

class Firasah {
    companion object {
        external fun stringFromJNI(): String
        init {
            System.loadLibrary("firasah")
        }
    }
}