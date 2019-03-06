object main extends App {
    def odwroc(str: String, acc: Int): String = {
        if(acc==(-1)) " "
        else{
            str(acc)+odwroc(str,acc-1)
        } 
    }
    var napis=io.StdIn.readLine()
    println(odwroc(napis,napis.length()-1))
}