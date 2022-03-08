fun main() {
    val lastsum = 15000.0
    val regular = true
    val sum = 1000.0
    var newsum = sum
    var discont = 0.0
    println("Покупка: " + sum + " руб.")
    if (lastsum > 1000 && lastsum <= 10000) {
        discont = 100.0
        newsum = newsum - discont
        println("После применения скидки 100 рублей: " + newsum + "руб.")
    }
    else if (lastsum > 10000) {
        discont = newsum * 0.05
        newsum = newsum - discont
        println("После применения скидки 5%: " + newsum + " руб.")
    }

    if (regular == true) {
        discont = newsum * 0.01
        newsum = newsum - discont
        println("После применения скидки 1%: " + newsum + " руб.")
    }
    println("Итоговая сумма покупки: " + newsum + " руб.")
    println("Ваша скидка составила: " + (sum - newsum) + " руб.")
}