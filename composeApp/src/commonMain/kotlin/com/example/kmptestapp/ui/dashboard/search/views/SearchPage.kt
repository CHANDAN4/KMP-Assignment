package com.example.kmptestapp.ui.dashboard.search.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
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
import com.example.kmptestapp.data.network.ApiState
import com.example.kmptestapp.ui.dashboard.home.models.ResponseSurveyorAssessment
import com.example.kmptestapp.ui.dashboard.home.models.products.ResponseProducts
import com.example.kmptestapp.ui.dashboard.home.viewModels.HomeViewModel
import com.example.kmptestapp.ui.dashboard.home.views.AssessmentItem
import com.example.kmptestapp.utils.Type
import com.example.kmptestapp.utils.getType

@Composable
fun SearchPage(homeViewModel: HomeViewModel, navController: NavController){

    val response by homeViewModel.responseProducts.collectAsState()
    var deviceType=getType()
    var searchText by remember { mutableStateOf("") }

    val filteredList = remember(searchText, response) {
        when (response) {
            is ApiState.Success -> {
                val data = (response as ApiState.Success<ResponseProducts>).data

                data.products.filter {
                    it.title.contains(searchText, ignoreCase = true)
                    //it.brand.contains(searchText, ignoreCase = true)
                }
            }

            else -> emptyList()
        }
    }



    Column( modifier = Modifier.fillMaxSize().padding(16.dp)) {

        Column(modifier = Modifier.fillMaxWidth().padding(5.dp)) {

            Spacer(modifier = Modifier.height(20.dp))
            Column {
                Text(
                    modifier = Modifier.fillMaxWidth().padding(start = 15.dp),
                    text = "Search",
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Left,
                    color = Color.Black,
                    fontSize = 22.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = searchText,
            onValueChange = {
                searchText=it
            },
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            placeholder = {
                Text("Title")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search"
                )
            },
            trailingIcon = {
                if (searchText.isNotEmpty()) {
                    IconButton(
                        onClick = {
                            searchText = ""
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Clear,
                            contentDescription = "Clear"
                        )
                    }
                }
            },
            singleLine = true
        )

        Spacer(Modifier.height(8.dp))

        if (filteredList.isEmpty()) {

            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("No results found")
            }

        } else {

            if(deviceType== Type.Desktop){
                LazyVerticalGrid(
                    columns = GridCells.Fixed(3)
                ) {

                    if (filteredList.isNotEmpty()) {
                        items(filteredList) { res ->

                            AssessmentItem(
                                res,
                                onClick = {

                                }
                            )
                        }
                    }

                }
            }else{
                LazyColumn {

                    if (filteredList.isNotEmpty()) {
                        items(filteredList) { res ->
                            AssessmentItem(
                                res,
                                onClick = {

                                }
                            )
                        }
                    }

                }
            }

        }
    }

}