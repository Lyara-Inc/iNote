package com.app.inote.common

public var name = "Bob"
    private set

private age = 10

fun describePerson(){
    name = "Mike"
    println("La personne a pour infos : $name et a $age ans")
}