import java.io.File

/**
 * P22-Names Scores
 * Using src/main/resources/p022_names.txt,
 * a 46K text file containing over five-thousand first names,
 * begin by sorting it into alphabetical order.
 *
 * Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order,
 * COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */
fun p22() {
    var scores = 0L; var itemScore = 0L
    val alphabet = listOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')
    File("src/main/resources/p022_names.txt")
            .readText()
            .replace("\"", "")
            .split(",")
            .sorted()
            .forEachIndexed() { i, name ->
                name.toCharArray().forEach { char -> itemScore += alphabet.indexOf(char) + 1 }
                scores += (i + 1).toLong() * itemScore
                itemScore = 0
            }
    println(scores)
}