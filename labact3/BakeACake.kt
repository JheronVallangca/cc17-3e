fun main() 
{
    val Age = 20
    val layer = 5
    
    printCakeCandles(Age)   
    printCakeTop(Age)
    printCakeBottom(layer,Age)

}
fun printCakeCandles(Age:Int)
{
    repeat(Age)
    {
        print(",")
    }
    	println()
    
    repeat(Age)
    {
        print("|")
    }
    	println()
}
   

fun printCakeTop(Age:Int)
{
    repeat(Age)
    {
        print("=")
    }
    println()
}

fun printCakeBottom(layer:Int ,Age:Int)
{
    repeat(layer)
    {
        repeat(Age)
        {
            print("@")
        }
        println()
}
}
