val toplvl: String = "Example of top level"
//You could also place variables outside of the main function. these are called top level. Top lvl var's can also be altered inside of the main. they work just like they do
//inside the main

var nullstring: String? = "mike"
//above is an example of a null string. in kotlin variables are all set to non null unless you make it so YOU CAN STILL ASIGN VALUES TO NULL STRINGS!

//kotlin can figure out what type of varaible your using so technically you dont have to use it e.g. is below
val num1 = 2
//as you can see it doesnt have the type of var but it still works if run
fun main(){
    //Var works to define variables that can be change

    //val variables cannot be changed
    val name: String = "Daniel"

    //now the name variable cannot be re defined
    var varname: String = "Mike"
    varname = "Shaun"
    println(name)

    println(varname)
    //Once Run you can see that the Mike value has changed to shaun. InteliJ helps you see this by greying out the Mike string
    println(toplvl)
    println(nullstring)
    nullstring = null
    println(nullstring)
    println(num1)
    //now lets look at control flow
    var controltest: String? = null
    if(controltest != null){
        println(controltest)
    } else{
        println("Test for control")
    }
    //this is an example of if/else statements to control when variables are called.
    //When statements
    //When statements work just like switch statements from java example below
    var whentest: String? = null
    when(whentest){
        null -> println("Hi")
        else -> println(whentest)
    }
    //when whentest is null it will print hi. otherwise it will print whatever string is assigned

    //If and when can be used as expression to assign a value depending on conditions e.g. below
    var assignTest: String? = null
    // assignTest = "It Works"  Remove this test and '//' to prove it works
    val assignTestToPrint = if (assignTest != null) assignTest else "Value Is NULL"
    println(assignTestToPrint)
    //this is another way we can assign different values depending on parameters the same works for when and is layed out the same

    



}
