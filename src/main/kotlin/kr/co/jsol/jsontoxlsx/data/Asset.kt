package kr.co.jsol.jsontoxlsx.data

import kotlinx.serialization.Serializable


/**
 *     "asset": {
 *         "format": "JPG",
 *         "id": "00a92f83cf4cc01eb9b0fd459c4ab6e9",
 *         "name": "lettuce(703).JPG",
 *         "path": "file:C:/Users/User/Desktop/3.%20%EB%8D%B0%EC%9D%B4%ED%84%B0/3.%20%EB%8D%B0%EC%9D%B4%ED%84%B0/b_%EB%B3%91%EC%B6%A9%ED%95%B4%EC%9E%91%EB%AC%BC%20%EC%9D%B4%EB%AF%B8%EC%A7%80/image_set/lettuce(703).JPG",
 *         "size": {
 *             "width": 4032,
 *             "height": 3024
 *         },
 *         "state": 2,
 *         "type": 1
 *         "predicted": true
 *     },
 */
@Serializable
data class Asset(
    val format: String,
    val id: String,
    val name: String,
    val path: String,
    val size: AssetSize,
    val state: Int,
    val type: Int,
    val predicted: Boolean = false,
)
