//This is linked to the person class
fun main(){
    //one way to initialise the construcotr in Person to make a value
    //val person = Person("Mike", "Wozawski")
    //When this version is run, the init blocks run before the secondary constructor
    val person = Person()

    //when this is used with the override section in Person it will change the way its displayed. Run to see
    //person.nickName = "Spidey"
    //person.nickName = "Spider-Man"
    //println(person.nickName)
    //Un comment this section when you want to see how getters and setters work without a method
    //this is how you call a method
    person.printInfo()
}