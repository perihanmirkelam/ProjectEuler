/**
 * P17-Number Letter Counts
 * If the numbers 1 to 5 are written out in words:
 * one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 * NOTE: Do not count spaces or hyphens. For example,
 * 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.
 */
const val THOUSAND = "thousand"
const val HUNDRED = "hundred"
const val AND = "and"

fun p17() {
    var str = ""
    for (i in 1..1000) {
        str += when (i.getDigitCount()) {
            1 -> i.getSingleDigit()
            2 -> i.getTensDigit()
            3 -> i.getHundredsDigit()
            4 -> i.getThousandsDigit()
            else -> ""
        }
    }
    println("A17: ${str.length}")
}

private fun Int.getDigitCount(): Int {
    return this.toString().length
}

fun Int.getSingleDigit(): String {
    return when (Character.getNumericValue(this.toString()[0])) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        6 -> "six"
        7 -> "seven"
        8 -> "eight"
        9 -> "nine"
        else -> ""
    }
}

fun Int.getTensDigit(): String {
    return if (this.toString()[0] == '1') {
        this.getTeenDigit()
    } else {
        this.getRegularTensDigit() + (this % 10).getSingleDigit()
    }
}

fun Int.getTeenDigit(): String {
    return when (this) {
        10 -> "ten"
        11 -> "eleven"
        12 -> "twelve"
        13 -> "thirteen"
        14 -> "fourteen"
        15 -> "fifteen"
        16 -> "sixteen"
        17 -> "seventeen"
        18 -> "eighteen"
        19 -> "nineteen"
        else -> ""
    }
}

fun Int.getRegularTensDigit(): String {
    return when (this / 10) {
        2 -> "twenty"
        3 -> "thirty"
        4 -> "forty"
        5 -> "fifty"
        6 -> "sixty"
        7 -> "seventy"
        8 -> "eighty"
        9 -> "ninety"
        else -> ""
    }
}

fun Int.getHundredsDigit(): String {
    return this.getSingleDigit() + HUNDRED + AND + (this % 100).getTensDigit()
}

fun Int.getThousandsDigit(): String {
    return this.getSingleDigit() + THOUSAND
}



