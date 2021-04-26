import kotlin.math.sqrt
// მაგალითი პირველი
// extension ქვეკლასის გამოყენებით საჭიროა მშობელი კლასი იყოს open ტიპის, რადგან სტანდარტულად კლასი არის დახურული. Open კი გვაძლევს საშუალებას კლასი გაგრძელებადი გავხადოთ
open class Student(Name: String, GPA: Int){
    init{
        println("Name $Name")
        println("GPA $GPA")
    }
}
class Zura(Name: String, GPA: Int): Student(Name, GPA) {
    fun age() {
        println("Age 20")
    }
}

// მაგალითი მეორე
// extension გამოყენებულია main ფუნქციაშივე.
class Rectangle (val a: Int, val b: Int){
    fun perimeter(): Int{
        return (a+b)*2
    }
    fun area():Int{
        return a*b
    }
}


fun main(){
    val s1 = Zura("Zura", 51)
    s1.age()
    println("")

    // Rectangle კლასის extension
    fun Rectangle.diagonal(): Double {
        return sqrt((a*a+b*b).toDouble())
    }
    val newRectangle = Rectangle(3,4)
    println("Area: ${newRectangle.area()}")
    println("Perimeter: ${newRectangle.perimeter()}")
    println("Diagonal: ${newRectangle.diagonal()}")
}
