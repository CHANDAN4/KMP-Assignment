package com.example.kmptestapp.ui.dashboard.setting.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Password
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.kmptestapp.ui.dashboard.home.viewModels.HomeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ResetPassword(homeViewModel: HomeViewModel, navController: NavController) {


    var newPassword by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFF5F5F5))
            .verticalScroll(rememberScrollState())
    ) {

        Column {
            TopAppBar(
                modifier = Modifier.fillMaxWidth().background(Color(0xFFF5F5F5)),
                title = {
                    Text(
                        modifier = Modifier.fillMaxWidth().padding(start = 15.dp),
                        text = "Reset Password",
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Left,
                        color = Color.Black,
                        fontSize = 22.sp
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigateUp()
                    }) {
                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = null
                        )
                    }
                }
            )
        }

        Column {
            Column(modifier = Modifier.fillMaxWidth()) {

                Spacer(modifier = Modifier.height(40.dp))

                Column(
                    modifier = Modifier.fillMaxWidth().padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Column(
                        modifier = Modifier.padding(5.dp)
                    ) {

                        OutlinedTextField(
                            value = newPassword,
                            onValueChange = {
                                newPassword = it
                            },

                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                            placeholder = {
                                Text("New Password")
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Password,
                                    contentDescription = "New Password"
                                )
                            },
                            singleLine = true
                        )

                        Spacer(Modifier.height(12.dp))

                        OutlinedTextField(
                            value = confirmPassword,
                            onValueChange = {
                                confirmPassword = it
                            },
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                            placeholder = {
                                Text("Confirm Password")
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Password,
                                    contentDescription = "Confirm Password"
                                )
                            },
                            singleLine = true
                        )


                    }

                    Spacer(Modifier.height(15.dp))

                    Button(
                        modifier = Modifier.width(120.dp),
                        onClick = {
                            navController.navigateUp()
                        },
                        shape = RoundedCornerShape(50)
                    ) {
                        Text("Submit")
                    }

                }


            }


        }

    }
}