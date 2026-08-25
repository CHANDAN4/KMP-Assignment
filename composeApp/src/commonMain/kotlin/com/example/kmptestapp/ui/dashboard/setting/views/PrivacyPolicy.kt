package com.example.kmptestapp.ui.dashboard.setting.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Password
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.kmptestapp.ui.dashboard.home.viewModels.HomeViewModel
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PrivacyPolicy(homeViewModel: HomeViewModel, navController: NavController) {

    var currentPassword by remember { mutableStateOf("") }
    var newPassword by remember { mutableStateOf("") }
    var isUnderstandAndAgree by remember { mutableStateOf(false) }

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
                        text = "Privacy Policy",
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

                Column(modifier = Modifier.fillMaxWidth()) {

                    Text(
                        modifier = Modifier.fillMaxWidth().padding(start = 15.dp),
                        text = "GENERAL DECLARATION:",
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Left,
                        color = Color.Black,
                        fontSize = 15.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        modifier = Modifier.fillMaxWidth().padding(start = 15.dp),
                        text = "I/we hereby declare that the above statements and answers are true and correct and that no material fact has been withheld/misrepresented and that I/we agree that this proposal-cum-policy schedule and this declaration shall be the basis of the contract between me/us and Oriental Insurance Company whose standard policy terms and exceptions are acceptable to me/us.",
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Left,
                        color = Color.Gray,
                        fontSize = 13.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        modifier = Modifier.fillMaxWidth().padding(start = 15.dp),
                        text = "PROHIBITION OF REBATES (Section 41 of the Insurance Act 1938 provides):",
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Left,
                        color = Color.Black,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        modifier = Modifier.fillMaxWidth().padding(start = 15.dp),
                        text = "No person shall allow, or offer to allow, either directly or indirectly, as an inducement to any person to take out or renew or continue an insurance in respect of any kind of risk relating to lives or property in India, any rebate of the whole or part of the commission payable or any rebate of the premium shown on the policy, nor shall any person taking out or renewing or continuing a policy accept any rebate except such rebate as may be allowed in accordance with the published prospectus or tables of the Insurer. Any person making default in complying with the provisions of this section shall be liable for a penalty which may extend to ten lakh rupees.",
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Left,
                        color = Color.Gray,
                        fontSize = 13.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = isUnderstandAndAgree,
                            onCheckedChange = {
                                isUnderstandAndAgree = it
                            },
                            colors = CheckboxDefaults.colors(
                                checkedColor = if (isUnderstandAndAgree) Color.Blue else Color.Gray,
                                uncheckedColor = if (isUnderstandAndAgree) Color.Green else Color.Gray
                            ),
                            modifier = Modifier.size(25.dp),
                        )
                        Text(
                            text = "I understand this agreement",
                            modifier = Modifier
                                .padding(start = 10.dp)
                                .weight(1f),
                            fontSize = 13.sp,
                            lineHeight = 12.sp,
                            color = Color.Gray,
                            fontWeight = FontWeight.Normal,
                        )
                    }

                }

                Spacer(modifier = Modifier.height(200.dp))


            }


        }

    }
}