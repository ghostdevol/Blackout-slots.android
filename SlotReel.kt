import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource

data class Symbol(val imageResId: Int)

val SYMBOLS = listOf(
    Symbol(imageResId = R.drawable.symbol0),
    Symbol(imageResId = R.drawable.symbol1),
    Symbol(imageResId = R.drawable.symbol2),
    // Add other symbols here
)

@Composable
fun SlotReel(result: List<List<Int>>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        result.forEach { row ->
            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp,
                    alignment = androidx.compose.ui.Alignment.CenterHorizontally),
                modifier = Modifier.fillMaxWidth()
            ) {
                row.forEach { symbolIndex ->
                    Image(
                        painter = painterResource(id = SYMBOLS[symbolIndex].imageResId),
                        contentDescription = null,
                        modifier = Modifier.size(50.dp),
                        contentScale = ContentScale.Fit
                    )
                }
            }
        }
    }
}
