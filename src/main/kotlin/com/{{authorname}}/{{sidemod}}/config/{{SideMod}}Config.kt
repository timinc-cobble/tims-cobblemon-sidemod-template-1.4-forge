package com.{{authorname}}.{{sidemod}}.config

import com.google.gson.GsonBuilder
import com.{{authorname}}.{{sidemod}}.{{SideMod}}
import java.io.File
import java.io.FileReader
import java.io.PrintWriter

class {{SideMod}}Config {
    val multiplier = 1.0

    class Builder {
        companion object {
            fun load() : {{SideMod}}Config {
                val gson = GsonBuilder()
                    .disableHtmlEscaping()
                    .setPrettyPrinting()
                    .create()

                var config = {{SideMod}}Config()
                val configFile = File("config/${{{SideMod}}.MOD_ID}.json")
                configFile.parentFile.mkdirs()

                if (configFile.exists()) {
                    try {
                        val fileReader = FileReader(configFile)
                        config = gson.fromJson(fileReader, {{SideMod}}Config::class.java)
                        fileReader.close()
                    } catch (e: Exception) {
                        println("Error reading config file")
                    }
                }

                val pw = PrintWriter(configFile)
                gson.toJson(config, pw)
                pw.close()

                return config
            }
        }
    }
}