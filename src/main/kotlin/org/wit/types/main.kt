package org.wit.types

/* fun main(args: Array<String>){
    //Task 1

    println("Hello World !")
    println("Working with Variables and Types")

    //Task 2

    val doubleNumber = 1200.45
    val floatNumber = 700.78f
    val longNumber = 98765432L
    val intNumber  =123456
    val shortNumber = 345
    val byteNumber = 127


    println("doubleNumber Value is: " + doubleNumber + ", and the type is: " + doubleNumber.javaClass)
    println("floatNumber Value is: " + floatNumber + ", and the type is: " + floatNumber.javaClass)
    println("longNumber Value is: " + longNumber + ", and the type is: " + longNumber.javaClass)
    println("intNumber Value is: " + intNumber + ", and the type is: " + intNumber.javaClass)
    println("shortNumber Value is: " + shortNumber + ", and the type is: " + shortNumber.javaClass)
    println("byteNumber Value is: " + byteNumber + ", and the type is: " + byteNumber.javaClass)


    //Task 3

    println("\nUsing underscores to make values more readable:")
    val oneMillion = 1_000_000
    val threeThousand = 3_000
    val creditCardNumber = 1234_4321_5678_8765

    println("\t" + oneMillion + " - the type is: " + oneMillion.javaClass)
    println("\t" + threeThousand + " - the type is: " + threeThousand.javaClass)
    println("\t" + creditCardNumber + " - the type is: " + creditCardNumber.javaClass)

}
*/

fun main(args: Array<String>){
    val byteNum : Byte = 10
    val intNum : Int = byteNum.toInt()
    val floatNum : Float = byteNum.toFloat()
    val doubleNum : Double = byteNum.toDouble()

    println("byteNum Value is: " + byteNum + ", and the type is: " + byteNum.javaClass)
    println("intNum Value is: " + intNum + ", and the type is: " + intNum.javaClass)
    println("floatNum Value is: " + floatNum + ", and the type is: " + floatNum.javaClass)
    println("doubleNum Value is: " + doubleNum + ", and the type is: " + doubleNum.javaClass)

    println("________________________________________________________________________________\n")

    val aChar = 'a'
    val bChar : Char = 'b'

    println("aChar: " + aChar + " - the type is: " + aChar.javaClass)
    println("bChar: " + bChar + " - the type is: " + bChar.javaClass)

    println("________________________________________________________________________________\n")

    val aFlag = true
    val bFlag : Boolean = false

    println("aFlag: " + aFlag + " - the type is: " + aFlag.javaClass)
    println("bFlag: " + bFlag + " - the type is: " + bFlag.javaClass)

}