package com.example.kmptestapp.ui.dashboard.profile.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MobileOff
import androidx.compose.material.icons.filled.VerifiedUser
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import assignment.composeapp.generated.resources.Res
import assignment.composeapp.generated.resources.profile
import com.example.kmptestapp.ui.dashboard.home.viewModels.HomeViewModel
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditProfilePage(homeViewModel: HomeViewModel, navController: NavController) {

    var name by remember { mutableStateOf("") }
    var mobileNo by remember { mutableStateOf("+91-9867566765") }
    var email by remember { mutableStateOf("abc@gmail.com") }


    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFF5F5F5))
            .verticalScroll(rememberScrollState())
    ) {

        Column {
            Column(modifier = Modifier.fillMaxWidth()) {
                Column {
                    TopAppBar(
                        title = {
                            Text(
                                modifier = Modifier.fillMaxWidth().padding(start = 15.dp),
                                text = "Edit Profile",
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

                Spacer(modifier = Modifier.height(40.dp))

                Column(
                    modifier = Modifier.fillMaxWidth().padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Box(
                        modifier = Modifier.size(120.dp),
                        contentAlignment = Alignment.BottomEnd
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.profile),
                            contentDescription = "Profile Image",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(CircleShape)
                                .border(2.dp, Color.Gray, CircleShape),
                            contentScale = ContentScale.Crop
                        )

                        IconButton(
                            onClick = {},
                            modifier = Modifier
                                .size(25.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colorScheme.primary)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Edit,
                                contentDescription = "Edit",
                                tint = Color.White,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }


                    Spacer(Modifier.height(25.dp))

                    Column(
                        modifier = Modifier.padding(5.dp)
                    ) {

                        OutlinedTextField(
                            value = name,
                            onValueChange = {
                                name = it
                            },
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                            placeholder = {
                                Text("Name")
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.VerifiedUser,
                                    contentDescription = "Search"
                                )
                            },
                            singleLine = true
                        )

                        Spacer(Modifier.height(8.dp))

                        OutlinedTextField(
                            value = mobileNo,
                            onValueChange = {
                            },

                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                            placeholder = {
                                Text("Mobile No")
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.MobileOff,
                                    contentDescription = "Search"
                                )
                            },
                            singleLine = true
                        )

                        Spacer(Modifier.height(12.dp))

                        OutlinedTextField(
                            value = email,
                            onValueChange = {
                            },
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                            placeholder = {
                                Text("Email")
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Email,
                                    contentDescription = "Search"
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