package com.samuelbernard.kotlinfundamental.basic

// Single line comment
/*
*  Multi line Comment
*/

// Main Function
val name = "Samuel"
val age = 17
val handsome = true
val height = 55.0

fun main(args: Array<String>) {
    println("Hello World") // print dan membuat baris baru
    print("Hello Kotlin") // print tanpa membuat baris baru
    println(tesKata("Haloooooooo"))
    println(name)
    testKataVoid("kata dari paramterrrr")
}

fun tesKata(kata:String): String {
 return kata
}

fun testKataVoid(kata: String){
    println("KATA VOIDDDD")
    println(kata)
}


/*fun loopingAh(jumlah: int){
    for (int i = 0; i < jumlah; i++){

    }
}*/
