package id.winklesen.learnKotlin////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//    val name = "Kotlin"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }
//}


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
