package com.example.kmptestapp.ui.splash


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import assignment.composeapp.generated.resources.Res
import assignment.composeapp.generated.resources.ic_logo_jb
import com.example.kmptestapp.ui.dashboard.home.viewModels.HomeViewModel
import com.example.kmptestapp.ui.dashboard.navigation.Dashboard
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.painterResource


@Composable
fun SplashComposeView(homeViewModel: HomeViewModel, navController: NavController){

    LaunchedEffect(Unit) {

        delay(3000)
        navController.navigate(Dashboard.HomePage.route) {
            popUpTo(Dashboard.Splash.route) {
                inclusive = true
            }
            launchSingleTop = true
        }
        
    }


    Column(modifier = Modifier.fillMaxSize().background(Color(0xFF6650A3))) {

        Spacer(modifier = Modifier.height(100.dp))
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            Image(
                modifier = Modifier.size(80.dp),
                painter = painterResource(Res.drawable.ic_logo_jb),
                contentDescription = ""
            )

            Text(
                modifier = Modifier.wrapContentWidth().padding(start = 20.dp),
                text = "Demo App",
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Left,
                color = Color.White,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

        }

    }

}