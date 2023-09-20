package kr.co.jsol.jsontoxlsx.data

import kotlinx.serialization.Serializable

/**
 * {
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
 *     },
 *     "regions": [
 *         {
 *             "id": "IE4d3GKm5",
 *             "type": "RECTANGLE",
 *             "tags": [
 *                 "ill"
 *             ],
 *             "boundingBox": {
 *                 "height": 294.39252336448595,
 *                 "width": 228.4485981308411,
 *                 "left": 2575.345794392523,
 *                 "top": 1302.392523364486
 *             },
 *             "points": [
 *                 {
 *                     "x": 2575.345794392523,
 *                     "y": 1302.392523364486
 *                 },
 *                 {
 *                     "x": 2803.7943925233644,
 *                     "y": 1302.392523364486
 *                 },
 *                 {
 *                     "x": 2803.7943925233644,
 *                     "y": 1596.7850467289718
 *                 },
 *                 {
 *                     "x": 2575.345794392523,
 *                     "y": 1596.7850467289718
 *                 }
 *             ]
 *         },
 *         {
 *             "id": "5KpzYzaZJ",
 *             "type": "RECTANGLE",
 *             "tags": [
 *                 "ill"
 *             ],
 *             "boundingBox": {
 *                 "height": 244.93457943925233,
 *                 "width": 282.6168224299065,
 *                 "left": 2749.6261682242985,
 *                 "top": 1005.6448598130839
 *             },
 *             "points": [
 *                 {
 *                     "x": 2749.6261682242985,
 *                     "y": 1005.6448598130839
 *                 },
 *                 {
 *                     "x": 3032.242990654205,
 *                     "y": 1005.6448598130839
 *                 },
 *                 {
 *                     "x": 3032.242990654205,
 *                     "y": 1250.5794392523364
 *                 },
 *                 {
 *                     "x": 2749.6261682242985,
 *                     "y": 1250.5794392523364
 *                 }
 *             ]
 *         },
 *         {
 *             "id": "jSEyLsVFM",
 *             "type": "RECTANGLE",
 *             "tags": [
 *                 "ill"
 *             ],
 *             "boundingBox": {
 *                 "height": 256.7102803738318,
 *                 "width": 177.8130841121506,
 *                 "left": 2872.093457943924,
 *                 "top": 1495.5140186915885
 *             },
 *             "points": [
 *                 {
 *                     "x": 2872.093457943924,
 *                     "y": 1495.5140186915885
 *                 },
 *                 {
 *                     "x": 3049.9065420560746,
 *                     "y": 1495.5140186915885
 *                 },
 *                 {
 *                     "x": 3049.9065420560746,
 *                     "y": 1752.2242990654202
 *                 },
 *                 {
 *                     "x": 2872.093457943924,
 *                     "y": 1752.2242990654202
 *                 }
 *             ]
 *         }
 *     ],
 *     "version": "2.2.0"
 * }
 *
 */
@Serializable
data class LettuceData(
    val asset: Asset,
    val regions: List<Region>,
    val version: String,
)
