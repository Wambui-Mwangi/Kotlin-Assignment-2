fun main() {
    var areaCircle= area(7)
    println(areaCircle)

    hello("anitab")
    divWithRem(2, 15)
    sum(40, 20, 10, 5)
    fact("One of my hobbies is watching chicken exist")
}
    fun area(radius: Int): Double {
        var areaOfCircle = (radius * radius )* 3.142159246
        return (areaOfCircle)
    }

fun hello(name: String){
    var greeting = "Hello " + name
    println(greeting)

}
fun divWithRem(num1: Int, num2: Int){
    var div = num2 % num1
    println(div)
}

fun sum(num1: Int, num2: Int, num3: Int, num4: Int) {
    var summ = num1 + num2 + num3 + num4
    println(summ)
}

fun fact( self: String) {
    println(self)
}





