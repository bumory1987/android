
open class Warrior(){
    fun attack(){
        println("복잡한 코드 + 공격")
    }

}

class DefenceWarrior():Warrior(){
    fun defence(){
        println("방어")
    }

}


val soilder = DefenceWarrior()
soilder.attack()