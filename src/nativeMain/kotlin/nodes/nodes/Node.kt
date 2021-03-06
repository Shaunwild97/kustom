package nodes.nodes

import interpreter.Context
import parser.ParseException
import parser.lexer.token.Token

abstract class Node(val start: Token, val end: Token = start) {
    var parent: Node? = null

    abstract fun visit(context: Context): Any?

    protected fun fail(message: String) = ParseException("file", message, start, end)
}
