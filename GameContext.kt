import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable

data class GameState(
    var balance: Int = 1000,
    var bet: Int = 10,
    var bonusTriggered: Boolean = false,
    var spinCount: Int = 0,
    var lastResult: List<Any> = emptyList()
)

class GameViewModel {
    var balance by mutableStateOf(1000)
        private set
    var bet by mutableStateOf(10)
    var bonusTriggered by mutableStateOf(false)
    var spinCount by mutableStateOf(0)
    var lastResult by mutableStateOf<List<Any>>(emptyList())

    fun updateBalance(amount: Int) {
        balance += amount
    }
}

val LocalGameViewModel = compositionLocalOf<GameViewModel> { error("No GameViewModel provided") }

@Composable
fun GameProvider(content: @Composable () -> Unit) {
    val gameViewModel = remember { GameViewModel() }
    CompositionLocalProvider(LocalGameViewModel provides gameViewModel) {
        content()
    }
}

@Composable
fun useGame(): GameViewModel = LocalGameViewModel.current
