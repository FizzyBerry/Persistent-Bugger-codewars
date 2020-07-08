fun LengthOfNumber(num: Int) : Int{
    var CopyNum = num
    var length = 0
    while(CopyNum >= 0){
        CopyNum = CopyNum/10
        if(CopyNum == 0)
            CopyNum = -1
        length++
    }
    return length
}

fun DividingNumber(num: Int) : IntArray{
    var CopyNum = num
    var length = LengthOfNumber(num)
    var arr = IntArray(length)
    for (i in 0..length-1){
        arr[i] = CopyNum % 10
        CopyNum = (CopyNum - arr[i])/10
    }
    return arr
}

fun persistence(num: Int) : Int {
    var CopyNum = num
    var MultPers = 0
    while(CopyNum > 9){
        MultPers = MultPers + 1
        var arr = DividingNumber(CopyNum)
        CopyNum = 1
        for(i in 0..arr.size - 1){
            CopyNum = CopyNum * arr[i]
        }
    }

    return MultPers
}
fun main() {
    print(persistence(10))
    println()
    print(persistence(999))
    println()
    print(persistence(4))
}