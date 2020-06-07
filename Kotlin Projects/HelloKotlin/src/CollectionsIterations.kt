fun sayHello(greeting:String, itemToGreet:List<String>){
    //this works just like the other for loops
    itemToGreet.forEach { itemToGreet ->
        //itemToGreet is defined in the main function
        println("$greeting $itemToGreet")
    }
}
//start going down here before top function
fun main(){
    //as soon as string is added via "" array can defer that the values are strings
    val interestingThings = arrayOf("kotlin", "programming", "chicken nuggets")
    //this prints size of array
    println(interestingThings.size)
    //calls num 2 in array
    println(interestingThings[2])
    //works same as above 1
    println(interestingThings.get(0))
    //for loop to print our array
    for (interestingThings in interestingThings){
        println(interestingThings)
    }
    //This works much like a for loop, however it is a pre made function in the base library
    //interestingThings.forEach {it: String
    //println(it)
    //}

    //you can also rename the it value to make it less confusing e.g.
    interestingThings.forEach {interestingThing -> //this will rename the 'it' to a string of your choice
    println(interestingThing)
    }
    //However what if we want to find out what index our strings are in? well we use the for each index to do this e.g. below:
    interestingThings.forEachIndexed { index, interestingThingIndexed ->
        println("$interestingThingIndexed is at index $index")
    }
    //all that can be used in arrays can be used in lists as well
    val interestingThingsList = mutableListOf("example 1", "example 2", "example 3") //was originally listOf changed to mutableListOf
    interestingThingsList.get(2)
    interestingThingsList[0]
    interestingThingsList.forEach { interestingList ->
        println(interestingList)
    }

    //We can also use a type called a map. a map works by taking pair values e.g. below:
    //This means that you can pair two varaibels together e.g. 1 can = a meaning that the value 1 has a string value of a
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    //when it comes to finding in the index the number is the space in the index and the string is what will be shown
    //e.g. if i called index 0, it would be null because i havent assigned a pair value to it
    //but if i call index 1 it will display an 'a'
    println(map[1])

    map.forEach { key, value -> println("$key -> $value") }

    //Now lets look at how to add to the index
    //first to do this it has to be a mutable of e.g.lists: mutableListOf this shows that it can mutate, or change
    interestingThingsList.add("example 4")
    //same works for map however instead of add its put
    //this is a list i made to use this
    val otherFunctionList = listOf("Chicken", "Dog", "Cat")
    //Now lets use it with a function the function that this will work with has already been pre called above
    sayHello("Hello", otherFunctionList)
    //This can be used with an array but will have to be defined in function parameters

}