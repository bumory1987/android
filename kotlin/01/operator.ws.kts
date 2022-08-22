val number: Int? = null

val number2: Int? = 10
val number3: Int? = 5

var number4: Int = number2!! + number3!!
//println(number4)


//연산자
// === !== 잘사용하지 않는다
//주소값이 같은지 물어보는 연산자

/*

1. Unit
-자바 void


2. Any/Any?
- any -> non-null 타입의 조상
- any? -> nullable 타입의 조상


3.Nothing
fun 함수명(변수명:타입, ...) : Nothing{

}
이 함수를 호출하면 에러

 */

fun plusNumber(first_num:Int, second_num:Int): Int{
    return first_num+second_num
}


//println(plusNumber(1,2))



fun plusNumberVoid(first_num:Int, second_num:Int): Unit{
    println(first_num+second_num)
}

//plusNumberVoid(10, 20)



fun shortPlusNumber(first:Int, second:Int)= first+second


//println(shortPlusNumber(100, 20000))



fun plusMultiplus(vararg numbers: Int){
//    println(numbers)
    for (number in numbers){
        println(number)
    }
}

//plusMultiplus(1,2,3,4,5,6)