fun main() {
    val likes = 126742
    val neOnes = likes / 10
    val ones = likes % (likes / 10)
    val tens = likes / 10 % 10 * 10 + ones
    var ending: String = ""

    if ((likes >= 0) && (likes < 10)) {
        when (likes) {
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
    } else {
        if ((likes >= 10) && (likes <= 20)) {
            ending = "подписчиков"
        } else {
            if ((tens > 10) && (tens < 20)) {
                ending = "подписчиков"
            } else {

                if ((likes > 20) || (likes < 10)) {
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
                }
            }
        }
    }
    println("neOnes = $neOnes")
    println("ones = $ones")
    println("tens = $tens")
    println("У Вас $likes $ending")
}