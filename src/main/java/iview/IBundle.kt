package iview

interface IBundle {
    fun putString(key: String, value: String)
    fun putInt(key: String, value: Int)
    fun getString(key: String): String
    fun getInt(key: String): Int
    fun realBundle(): Any
}