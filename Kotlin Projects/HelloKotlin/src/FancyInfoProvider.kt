//This is how to inherit classes
//by default classes are closed, meaning they cannot be inherited or extended
//to get around this we use the 'open' term before the class. this means its open to inheritence
class FancyInfoProvider : BasicInfoProvider(){
    //this overrides the provider info in BasicInfoProvider...Meaning that if you were to call this, inside of the PersonInfoProvider.kt it would display the text
    //below
    override val providerInfo: String
        get() = "Fancy info provider"
    //again this overrides the printInfo function. if you call this, it will also display this
    override fun printInfo(person: Person) {
        println("Fancy Info")
    }
}