fun countNumberVieWord(str: String): Int {
    val combinations = setOf("aw", "aa", "dd", "ee", "oo", "ow", "w")
    var count = 0

    for (i in 0 until str.length - 1) {
        val pair = "${str[i]}${str[i + 1]}"
        if (pair in combinations || (str[i] !in setOf('a', 'o') && str[i + 1] == 'w')) {
            count++
        }
    }

    return count
}
