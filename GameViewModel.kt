package com.yourdomain.slotmachine

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

data class Symbol(val name: String, val imageResId: Int)

val SYMBOLS = listOf(
    Symbol("CreditCard", R.drawable.symbol0),
    Symbol("HundredDollar", R.drawable.symbol1),
    Symbol("Bitcoin", R.drawable.symbol2),
    Symbol("WildBlonde", R.drawable.symbol3),
    Symbol("Scatter8Ball", R.drawable.symbol4),
    Symbol("PoolBall1", R.drawable.symbol5),
    Symbol("PoolBall2", R.drawable.symbol6),
    Symbol("PoolBall3", R.drawable.symbol7),
    Symbol("PoolBall4", R.drawable.symbol8),
    Symbol("PoolBall5", R.drawable.symbol9),
    Symbol("PoolBall6", R.drawable.symbol10),
    Symbol("PoolBall7", R.drawable.symbol11),
)

class GameViewModel {
    var balance by mutableStateOf(1000)
    var bet by mutableStateOf(10)
    var spinCount by mutableStateOf(0)
    var bonusTriggered by mutableStateOf(false)
    var lastResult by mutableStateOf(List(3) { List(5) { SYMBOLS[0] } }) // 3x5 grid

    fun spinReels() {
        lastResult = List(3) {
            List(5) { SYMBOLS.random() }
        }
        spinCount += 1
        balance -= bet

        val scatterCount = lastResult.flatten().count { it.name == "Scatter8Ball" }
        bonusTriggered = scatterCount >= 3
    }

    fun updateBalance(amount: Int) {
        balance += amount
    }
}
