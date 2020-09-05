fun main() {
    val likes = 10555
    val ones = likes % (likes / 10)
    var ending: String = "";

    when (ones) {
        0 -> ending = "подписчиков"
        1 -> ending = "подписчик"
        2 -> ending = "подписчика"
        3 -> ending = "подписчика"
        4 -> ending = "подписчика"
        5 -> ending = "подписчиков"
        6 -> ending = "подписчиков"
        7 -> ending = "подписчиков"
        8 -> ending = "подписчиков"
        9 -> ending = "подписчиков"
    }
        println("У Вас $likes $ending")









}