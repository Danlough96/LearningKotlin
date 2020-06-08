//Interfaces

interface PersonInfoProvider{
    //we can set properties as well as methods
    val providerInfo: String //this will have to be overridden

    fun printInfo(person: Person){
        //the problem with doing this is that our default intro is a string
        //println("Basic infro provider")
        println(providerInfo)//We have now encapsulated the provider info within itself
        person.printInfo()
    }
}

//second interface
interface SessionInfoProvider {
    fun getSessionId() : String
}
//you can create a class within the same file you dont need a seperate file
//This now implements the interface
//You can also implement multiple interfaces using a ',' this is shown in the class
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    //to override an interface you need the override keyword. without it, it wont compile
    //override fun printInfo(person: Person) {
        //This is one way to do this. but maybe you want to encapsulate this inso of the interface. to make it always show
        //To do thid you remove it from the override and place it within the printinfo method itself
        //println("Basic infro provider")
        //person.printInfo()
        //In Kotlin interfaces can provide default implementation inside of a default method
    //}
    //To set the property provider info we can do it just like a method
    override val providerInfo: String
        //so we override the inerface property and get a string to display
        get() = "BasicInfoProvider"
    //we can also use this with the above override but i will display it below

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    //override for 2nd interface
    override fun getSessionId(): String {
        return "Session"
    }
}

fun main(){
    //Once this is run with the code above it will print out the override
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    provider.getSessionId()
    //call the checkType function
    checkTypes(provider)
}
//this is a function to check if the info provider is a session info provider
fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider is SessionInfoProvider){
        println("is a session provider")
        infoProvider.getSessionId()
    }
    else {
        println("Not a session info provider")

    }
}
