//This is an example of a function, you can assign the return type just like you assign a var
//You can also set parameters inside ()
fun getGreeting(): String {
    return "Hello Kotlin!"
}
//How do you change from a function? you use function parameters e.g. below
fun sayHello(itemToGreet:String) {
    //as you can see itemToGreet was set as a string above, this means that msg when printed will print the value plus pre defined text. This can be altered n this function or
    //the main funciton
    //val msg = "Hello" + itemToGreet This is one way to do it but kotlin allows you to input parameter values into a string e.g.
    val msg = "Hello $itemToGreet"//this is for convenience and a way of shortening code
    println(msg)

}

//Multiple parameters in function Below:
fun multiHello(first:String, second:String) = println("$first $second")

fun main(){
    println("Hello World!")
    //You can call a function just like you would in java, here we are printing what it returns
    println(getGreeting())
    //Here it has been edited
    sayHello(itemToGreet = "Myself")

    //setting multi param here. You will have to set both if they are not already set
    multiHello(first = "Hello", second = "Universe")
}