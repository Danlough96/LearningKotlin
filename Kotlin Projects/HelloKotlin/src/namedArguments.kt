
// One thing you can do is assign a default value to a parameter
// This means you wont have to call it inside your main function. e.g.
fun greetPerson(greeting: String = "Hello", name: String){
    println("$greeting, $name")
}
fun main(){
    //as you can see, greeting is not inside the call. meaning that when run it will use the default parameter set
    greetPerson(name = "World!")

}