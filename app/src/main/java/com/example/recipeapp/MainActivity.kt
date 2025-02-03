package com.example.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeApp()
        }
    }
}

@Composable
fun RecipeApp() {
    // Use Card as the container for the entire screen
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        shape = RoundedCornerShape(12.dp)
    ) {
        // Use Column to arrange the sections vertically
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(16.dp)
        ) {
            // Title section: Use Box to center the title text
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Delicious Pancake Recipe", style = MaterialTheme.typography.headlineSmall)
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Image section: Use Box to center the image
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pancake_image),
                    contentDescription = "Pancake Image",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Divider
            Divider(color = Color.Gray, thickness = 1.dp)

            Spacer(modifier = Modifier.height(8.dp))

            // Ingredients section
            Text(text = "Ingredients", style = MaterialTheme.typography.titleMedium)
            Column(modifier = Modifier.padding(start = 8.dp, top = 4.dp)) {
                Row { Text(text = "• 1 cup flour") }
                Row { Text(text = "• 1 cup milk") }
                Row { Text(text = "• 1 egg") }
                Row { Text(text = "• 2 tablespoons sugar") }
                Row { Text(text = "• A pinch of salt") }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Divider
            Divider(color = Color.Gray, thickness = 1.dp)

            Spacer(modifier = Modifier.height(8.dp))

            // Preparation steps section
            Text(text = "Preparation Steps", style = MaterialTheme.typography.titleMedium)
            Column(modifier = Modifier.padding(start = 8.dp, top = 4.dp)) {
                Text(text = "1. Mix all the ingredients well.")
                Text(text = "2. Pour the batter into a preheated pan.")
                Text(text = "3. Flip when bubbles appear on the surface.")
                Text(text = "4. Cook until both sides are golden brown and enjoy.")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecipeAppPreview() {
    RecipeApp()
}
