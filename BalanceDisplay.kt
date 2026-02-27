
package com.yourdomain.slotmachine.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.yourdomain.slotmachine.GameViewModel

@Composable
fun BalanceDisplay(game: GameViewModel) {
    Text("Balance: ${game.balance}", color = Color.Green)
}
