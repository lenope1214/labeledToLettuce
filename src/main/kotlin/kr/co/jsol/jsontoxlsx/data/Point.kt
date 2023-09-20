package kr.co.jsol.jsontoxlsx.data

import kotlinx.serialization.Serializable


/**
 *   {
 *                    "x": 2872.093457943924,
 *                    "y": 1495.5140186915885
 *                },
 */
@Serializable
data class Point(
    val x: Double,
    val y: Double,
)
