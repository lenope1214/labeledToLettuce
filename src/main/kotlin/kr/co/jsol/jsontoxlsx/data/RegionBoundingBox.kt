package kr.co.jsol.jsontoxlsx.data

import kotlinx.serialization.Serializable


/**
 *          *             "boundingBox": {
 *  *                 "height": 294.39252336448595,
 *  *                 "width": 228.4485981308411,
 *  *                 "left": 2575.345794392523,
 *  *                 "top": 1302.392523364486
 *  *             },
 */
@Serializable
data class RegionBoundingBox(
    val height: Double,
    val width: Double,
    val left: Double,
    val top: Double,
)
