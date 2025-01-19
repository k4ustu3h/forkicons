package k4ustu3h.forkicons.model

data class SearchInfo(
    val iconInfo: IconInfo,
    val indexOfMatch: Int,
    val matchAtWordStart: Boolean,
)

enum class SearchMode {
    LABEL,
    COMPONENT,
    DRAWABLE,
}
