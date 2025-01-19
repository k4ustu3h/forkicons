package k4ustu3h.forkicons.model

data class IconRequest(
    val label: String,
    val componentName: String,
)

data class IconRequestModel(
    val list: List<IconRequest>,
    val iconCount: Int,
)
