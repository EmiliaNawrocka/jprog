object main2 extends App {
    def palindrom(tab: Array[Int], acc: Int, i: Int): Boolean = {
        if(acc<=i) true
        else 
        {
            if(tab(acc)==tab(i)){
               palindrom(tab,acc-1,i+1) 
            }
            else false
        }
    }
    println("Podaj ilosc liczb")
    var n = io.StdIn.readInt()
    println("Podaj liczby do tablicy")
    var tab = new Array[Int](n)
    var i=0
    while(i<n)
    {
        tab(i)=io.StdIn.readInt()
        i+=1
    } 
    println(palindrom(tab,n,0))
}
