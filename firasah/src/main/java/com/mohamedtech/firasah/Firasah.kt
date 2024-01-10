package com.mohamedtech.firasah

class Firasah {



    companion object {
        init {
            System.loadLibrary("firasah")
        }

        external fun WelcomeMessage() : String
    }
}