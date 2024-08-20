package com.example.jmrealestate.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jmrealestate.R
import com.example.jmrealestate.navigation.ADD_PRODUCTS_URL
import com.example.jmrealestate.navigation.ROUT_HOME
import com.example.jmrealestate.navigation.ROUT_PROPERTY
import com.example.jmrealestate.navigation.VIEW_PRODUCTS_URL
import com.example.jmrealestate.ui.theme.LightBlue

@Composable
fun DashboardScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Image(painterResource(
            id = R.drawable.icon),
            contentDescription = "home",
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Manage your properties with ease",
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(15.dp))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            //Main Card
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(LightBlue)

                ) {
                //Row1
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card One
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable { navController.navigate(ROUT_HOME) },
                        elevation = CardDefaults.cardElevation(20.dp)

                    ) {
                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon2),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Home",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //End of card one
                    Spacer(modifier = Modifier.width(25.dp))
                    //Card One
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_PROPERTY) }
                        .width(160.dp)
                        .height(180.dp)) {
                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Property",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //End of card one

                }
                //End of row1
                //Row1
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card One
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                    ) {
                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.settings),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Settings",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //End of card one
                    Spacer(modifier = Modifier.width(25.dp))
                    //Card One
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                    ) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.profile),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Profile",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )

                    }


                }
                //End of card one


                //End of row2
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card One
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable { navController.navigate(ADD_PRODUCTS_URL) },
                        elevation = CardDefaults.cardElevation(20.dp)

                    ) {
                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon2),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Add Products",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //End of card one
                    Spacer(modifier = Modifier.width(25.dp))
                    //Card One
                    Card(modifier = Modifier
                        .clickable { navController.navigate(VIEW_PRODUCTS_URL) }

                        .width(160.dp)
                        .height(180.dp)) {
                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "View Products",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //End of card one

                }
                //End of row1
            }
            //End of main card



            }


        }

    }




@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController() )

}
