import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource

@Composable
fun Symbol(symbol: Symbol) {
    Image(
        painter = painterResource(symbol.imageResId),
        contentDescription = symbol.name,
        contentScale = ContentScale.Fit,
        modifier = Modifier.size(50.dp)
    )
}
