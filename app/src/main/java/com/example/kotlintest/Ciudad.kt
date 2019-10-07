package com.example.kotlintest

class Ciudad (nombre:String, grados:Int, estatus:String) {
    var nombre:String = ""
    var grados:Int = 0
    var estatus:String = ""
    init{
        this.grados = grados
        this.estatus = estatus
        this.nombre = nombre
    }
}