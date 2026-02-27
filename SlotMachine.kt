import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SlotMachine(
    spin: () -> Unit,
    lastResult: List<String>,
    bonusTriggered: Boolean
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "🎱 BlackGhost Slots",
            fontSize = 26.sp,
            color = Color.White,
            modifier = Modifier.padding(bottom = 20.dp),
            fontWeight = FontWeight.Bold
        )

        SlotReel(result = lastResult)

        Box(
            modifier = Modifier
                .padding(top = 20.dp)
                .background(Color(0xFF2ECC71), RoundedCornerShape(10.dp))
                .clickable { spin() }
                .padding(horizontal = 32.dp, vertical = 15.dp)
        ) {
            Text(
                text = "Spin",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier.align(Alignment.Center)
            )
        }

        if (bonusTriggered) {
            Text(
                text = "🎉 Bonus Unlocked!",
                color = Color(0xFFFFD700),
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 20.dp)
            )
        }
    }
}

@Composable
fun SlotReel(result: List<String>) {
    // Placeholder implementation for SlotReel
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(vertical = 16.dp)
    ) {
        result.forEach { symbol ->
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(Color.DarkGray, RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(text = symbol, color = Color.White, fontSize = 24.sp)
            }
        }
    }
}
