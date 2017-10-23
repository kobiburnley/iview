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

interface IPopupMenu {
    var handleItemClick: (itemId: Int) -> Boolean
    fun show()
    fun dismiss()
    fun addItems(vararg pairs: Pair<Int, String>)
}

interface IToolbar: IView {
    fun setTitle(title: CharSequence)
}

interface IButton : IView {
    fun setText(text: CharSequence)
}

interface IImageButton: IImageView {

}

interface IImageView : IView {

}

interface IEditText: IView {
    fun getWindowToken(): Any
}

interface IRecycler : IView {
    var length: Int
    var position: Int
    var scroll: Boolean
}
