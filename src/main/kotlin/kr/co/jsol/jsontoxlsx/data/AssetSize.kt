package kr.co.jsol.jsontoxlsx.data

import kotlinx.serialization.Serializable


/**
 *         "size": {
 *             "width": 4032,
 *             "height": 3024
 *         },
 */
@Serializable
data class AssetSize(
    val width: Int,
    val height: Int,
)
