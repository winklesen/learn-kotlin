package com.samuelbernard.kotlinfundamental.basic

// Single line comment
/*
*  Multi line Comment
*/

// Main Function
val name = "Samuel"
val age = 17
val handsome = true
val height : Double = 55.0
val initial : Char = 'B'
val girlFriend :String? = null

fun main(args: Array<String>) {
    println("Hello World") // print dan membuat baris baru
    print("Hello Kotlin") // print tanpa membuat baris baru
    println(tesKata("Haloooooooo"))
    println(name)
    testKataVoid("kata dari paramterrrr")
    setUser("Samuel")
}

fun tesKata(kata:String): String {
 return kata
}

fun testKataVoid(kata: String){
    println("KATA VOIDDDD")
    println(kata)
}

fun setUser(nama :String){
    print("Nama saya adalah $nama")
}

val line = "Line 1\n" +
        "Line 2\n" +
        "Line 3\n" +
        "Line 4\n"

val lineLagi = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()


/*fun loopingAh(jumlah: int){
    for (int i = 0; i < jumlah; i++){

    }
}*/
