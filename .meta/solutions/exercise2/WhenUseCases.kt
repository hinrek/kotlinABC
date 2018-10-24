fun getOutputBasedOnInputType(input: Any): Any =
        when(input) {
            is String -> "String"
            is Int -> 0
            else -> "else"
        }