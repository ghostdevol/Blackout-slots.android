package com.yourdomain.slotmachine.composables

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.yourdomain.slotmachine.GameViewModel

@Composable
fun Controls(game: GameViewModel) {
    Button(onClick = { game.spinReels() }) {
        Text("SPIN")
    }
}
