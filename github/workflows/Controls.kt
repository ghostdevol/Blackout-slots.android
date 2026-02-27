import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Controls(game: GameViewModel) {
    Button(onClick = { game.spinReels() }) {
        Text("SPIN")
    }
}
