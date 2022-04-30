package com.culqi.culqiapp.culqi_mini.ui

import java.util.*


fun main() {
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    val m = input.nextInt()
    val mapItemsN = mutableMapOf<Int, Boolean>()
    var ans = 0
    for (i in 0 until n) {
        val item = input.nextInt()
        mapItemsN[item] = true
    }
    for (i in 0 until m) {
        val itemA = input.nextInt()
        val itemB = input.nextInt()
        if (mapItemsN.containsKey(itemA)) {
            ans += 1
        }
        if (mapItemsN.containsKey(itemB)) {
            ans -= 1
        }
    }
    println(ans)
}
