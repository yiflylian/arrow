package kategory.collections

import kategory.Tuple2

fun <K, V> mapOf(vararg tuple: Tuple2<K, V>): Map<K, V> =
        if (tuple.isNotEmpty()) tuple.map { it.a to it.b }.toMap() else emptyMap()