//This class is linked to the classTest.kt file
//quick guide to class definitions
//all classes methods etc are public by default
//internal-states this the class is public within a module.
//private-private means that its only available within the file its implemented
//protected-protected is only available within the class or any subclass that is made
//open-meaning it can be inherited/extended
class Person(val _firstName: String = "Peter",val _lastName: String = "Parker") {
    //This is a way to initialise properties on the class
    //another way to do this would be to stick the val in the primary constructor e.g. Person( val _firstName: String)
    //val firstName: String = _firstName
    //val lastName: String = _lastName
    // one way to initialise properties
    //init{
        //firstName = _firstName
        //lastName = _lastName
    //}
    //This is how you can call a secondary constructor inside of your class
    //In alot of cases init blocks and secondary constructors arent needed. simply because you can set values inside of the main constructor
    //init {
        //println("init 1")
    //}
    //constructor(): this("Peter", "Parker") {
        //println("Secondary constructor")
    //}
    //init {
        //println("init 2")
    //}

    //Now we'll add editable properties
    //var and val properties already have getters and setters pre made, but you can create your own if you like
    //you can do this overriding them. This is how you do that
    var nickName: String? = null
        //this changes the setter
        set(value) {
            field = value //if we dont do this the value of nickname wont be updated
            println("The new nickname is $value")
        }
        //this is how you override a getter
        //get() {
           // println("the return value is $field")
            //return field
        //}
    //This is how we make a method in a class
    fun printInfo(){
        //one way to make nicname not display null value. Problem is it can be simplified. see below
        //val nickNameToPrint = if(nickName != null){nickName} else "No nickname"
        val nickNameToPrint = nickName ?: "No nickname" // the ?: is known as the elvis operator. it basically says to check whatever is left of it and says
        //if that the value isnt null reutrn it otherwise return what is on the right of it
        println("$_firstName, ($nickNameToPrint), $_lastName")


        //In Kotlin classes and everything else of public by default
    }
}