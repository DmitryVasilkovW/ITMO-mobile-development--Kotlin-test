import java.util.*

fun <T> Iterable<T>.partitionTo(
    first: MutableCollection<T>,
    second: MutableCollection<T>,
    predicate: (T) -> Boolean
): Pair<MutableCollection<T>, MutableCollection<T>> {
    for (item in this) {
        if (predicate(item)) {
            first.add(item)
        } else {
            second.add(item)
        }
    }
    return first to second
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
            .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
            .partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}
