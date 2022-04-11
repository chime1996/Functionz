fun main() {

 /*   greetingz("Agom")
     rollDice()
    nameEntry("Ahmed","Bola",22)
    printScore("x")
    arraysFun("i")
    printMax( 90 ,90)

}

fun greetingz(name:String) {

    println("\t Hello  , \n  \t $name :) " + "\n" +
            "  \t welcome to kotlin class")



}



fun rollDice (){
    val result =(1..6).random()
    println("Your random number is : $result")
}


fun nameEntry(firstname:String , lastname : String , age : Int ){

    println("your name is : $firstname , $lastname"+ " and your are $age years old .")
}

fun printScore(score: String){

    var x =10
    for (i in 1..10){
        println(x)
        x++

    }
}


fun arraysFun(aray:String){

    val chy = arrayOf("Edx", 22 , 33, "a", "b", "c")
    for (index in chy){

        println(chy[0])
        println(chy[1])
        println(chy[2])
        println(chy[3])
        println(chy[4])
        println(chy[5])
    }
}


fun printMax(numbera : Int , numberb : Int){
    var a = numbera ; numberb

    when {
        numbera > numberb -> println("$a is greater")
        numbera < numberb -> println("$a is lesser")
        numbera >= numberb -> println("equal")
        else -> {
            println("invalid")
        }



    }*/

    var person = Person("Dennis","panjuta" ,22 ,"Sleeping")
    println(person.sHobby())
    println("_________________________________")
    println("_________________________________")
    println("_________________________________")
    println(person)


    var den = Person("fre","freew" , 22 , "Singing")
    println(den.sHobby())
    println("_________________________________")
    println("_________________________________")
    println("_________________________________")
    println(den)
}

class Person(var FName:String ,var  Lname :String ){
    var hobby =""
    fun sHobby (){

        println("My name is : $FName  $Lname and my hobby is : $hobby")
    }

    init {

      //  println("Hello ")
    }

    constructor( FName:String , Lname :String, Age : Int , Hobby:String):this(  FName, Lname ){

        this .FName = FName
        this.Lname =Lname
        this.hobby=Hobby




            println("my details are now : $FName  $Lname  \n I am $Age years old and my hobby is $Hobby")

    }








}


