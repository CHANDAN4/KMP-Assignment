package com.example.kmptestapp.ui.dashboard.home.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.kmptestapp.data.network.ApiState
import com.example.kmptestapp.ui.dashboard.home.viewModels.HomeViewModel
import com.example.kmptestapp.utils.Type
import com.example.kmptestapp.utils.getType
import androidx.compose.ui.window.Dialog
import coil3.compose.AsyncImage
import com.example.kmptestapp.ui.dashboard.home.models.products.Product
import com.example.kmptestapp.ui.dashboard.home.models.products.ResponseProducts

@Composable
fun HomePage(homeViewModel: HomeViewModel, navController: NavController) {

    //val homeViewModel: HomeViewModel = koinViewModel()
    val response by homeViewModel.responseProducts.collectAsState()

    LaunchedEffect(Unit) {
         homeViewModel.getProductsList()
    }


    when (val result = response) {

        is ApiState.Loading -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

        is ApiState.Success -> {
            SurveyorAssessList(result.data, navController)
        }

        is ApiState.Error -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = result.message)
            }
        }

        is ApiState.Empty -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("No Data Found")
            }
        }


    }


    Column(modifier = Modifier.fillMaxWidth().padding(5.dp)) {

        Spacer(modifier = Modifier.height(20.dp))
        Column {
            Text(
                modifier = Modifier.fillMaxWidth().padding(start = 15.dp),
                text = "Home",
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Left,
                color = Color.Black,
                fontSize = 22.sp
            )

        }


    }

}


@Composable
fun SurveyorAssessList(
    product: ResponseProducts,
    navController: NavController
) {

    var deviceType = getType()

    Column(modifier = Modifier.fillMaxSize()) {

        Spacer(modifier = Modifier.height(80.dp))
        Text(
            modifier = Modifier.fillMaxWidth().padding(start = 15.dp),
            text = "Products",
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Left,
            color = Color.Black,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        if (deviceType == Type.Desktop) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(3)
            ) {

                if (product.products.isNotEmpty()) {
                    items(product.products) { res ->

                        AssessmentItem(
                            res,
                            onClick = {

                            }
                        )
                    }
                }

            }
        } else {
            LazyColumn {

                if (product.products.isNotEmpty()) {
                    items(product.products) { res ->

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


@Composable
fun AssessmentItem(
    content: Product,
    onClick: () -> Unit
) {

    var showDialog by remember { mutableStateOf(false) }
    var selectedContent by remember { mutableStateOf<Product?>(null) }

    Card(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 8.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            AsyncImage(
                model = content.thumbnail,
                contentDescription = content.title,
                modifier = Modifier.fillMaxWidth()
                    .height(120.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    modifier = Modifier.weight(1f),
                    text = "Name",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    modifier = Modifier.weight(.5f),
                    text = content?.title ?: "",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }

            Spacer(Modifier.height(6.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    modifier = Modifier.weight(1f),
                    text = "Price",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    modifier = Modifier.weight(.5f),
                    text = "₹${content.price}",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }

            Spacer(Modifier.height(15.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    showDialog = true
                    selectedContent = content
                }
            ) {
                Text("View Details")
            }
        }
    }

    if (showDialog) {
        FullScreenDialog(
            selectedContent,
            showDialog,
            onDismiss = {
                showDialog = false
            }
        )
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FullScreenDialog(
    content: Product?,
    showDialog: Boolean,
    onDismiss: () -> Unit
) {
    if (showDialog) {

        Dialog(
            onDismissRequest = onDismiss
        ) {

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {

                Column(
                    modifier = Modifier.fillMaxSize()
                ) {

                    TopAppBar(
                        title = {
                            Text("View Products")
                        },
                        navigationIcon = {
                            IconButton(onClick = onDismiss) {
                                Icon(
                                    Icons.Default.ArrowBack,
                                    contentDescription = null
                                )
                            }
                        }
                    )

                    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {

                        Column {

                            AsyncImage(
                                model = content?.thumbnail,
                                contentDescription = content?.title,
                                modifier = Modifier.fillMaxWidth()
                                    .height(120.dp)
                                    .clip(RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.Crop
                            )
                            Spacer(Modifier.height(12.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(start = 10.dp,end=10.dp),
                            ) {

                                Text(
                                    modifier = Modifier.weight(.5f),
                                    text = "Name",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )

                                Text(
                                    modifier = Modifier.weight(1f),
                                    text = content?.title ?: "NA",
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    textAlign = TextAlign.End,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }

                            Spacer(Modifier.height(12.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(start = 10.dp,end=10.dp)
                            ) {

                                Text(
                                    modifier = Modifier.weight(.5f),
                                    text = "Description",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )

                                Text(
                                    modifier = Modifier.weight(1f),
                                    text = content?.description ?: "",
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    textAlign = TextAlign.End,
                                    fontWeight = FontWeight.SemiBold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }

                            Spacer(Modifier.height(12.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(start = 10.dp,end=10.dp),
                            ) {

                                Text(
                                    modifier = Modifier.weight(.5f),
                                    text = "Brand",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )

                                Text(
                                    modifier = Modifier.weight(1f),
                                    text = "${content?.brand}",
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    textAlign = TextAlign.End,
                                    fontWeight = FontWeight.SemiBold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }

                            Spacer(Modifier.height(12.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(start = 10.dp,end=10.dp),
                            ) {

                                Text(
                                    modifier = Modifier.weight(.5f),
                                    text = "Price",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )

                                Text(
                                    modifier = Modifier.weight(1f),
                                    text = "₹${content?.price}",
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    textAlign = TextAlign.End,
                                    fontWeight = FontWeight.SemiBold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                            Spacer(Modifier.height(12.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "Rating",
                                    tint = Color(0xFFFFC107)
                                )

                                Spacer(modifier = Modifier.width(4.dp))

                                Text(
                                    text =  "${content?.rating}"
                                )
                            }
                            Spacer(Modifier.height(12.dp))
                        }

                    }
                }
            }
        }
    }
}




