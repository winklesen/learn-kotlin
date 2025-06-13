package id.winklesen.learnKotlin.fundamental

fun main() {
    // boolean: A boolean variable represents a value that can be either true or false.

    // Define office opening and closing hours
    val officeOpen = 7
    val officeClosed = 16
    // Get the current hour
    val now = 20

    // (operator AND &&)
    // Check if the current time is between office opening and closing hours
    val isOpen = if (now >= officeOpen && now <= officeClosed) {
        true
    } else {
        false
    }

    println("Office is open : $isOpen")

    // (operator OR ||)
    // Check if the current time is either before office opening or after office closing
    val isClosed = now < officeOpen || now > officeClosed

    println("Office is closed : $isClosed")

    // (operator NOT !)
    // Check if the office is closed using the NOT operator
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}
