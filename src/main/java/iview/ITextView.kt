package iview

object Visibility {
    val VISIBLE = 0x00000000
    val INVISIBLE = 0x00000004
    val GONE = 0x00000008
}

val Boolean.visibility: Int
    get() = if (this) Visibility.VISIBLE else Visibility.GONE


interface IView {
    fun setVisibility(visibility: Int)
}

interface ITextView : IView {
    fun setText(text: CharSequence)
}

interface IImageView : IView {

}

interface IRecycler : IView {
    var length: Int
}
