package com.example.fede.todoapp.model

import com.google.gson.annotations.SerializedName

data class Repo(val id: String,
                @SerializedName("node_id") val nodeId: String,
                val name: String)