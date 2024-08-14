package com.example.jmrealestate.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jmrealestate.R
import com.example.jmrealestate.data.AuthViewModel
import com.example.jmrealestate.navigation.ROUT_SIGNUP

@Composable
fun LoginScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.background), contentScale = ContentScale.FillBounds),

        horizontalAlignment = Alignment.CenterHorizontally

        ) {
        Spacer(modifier = Modifier.height(40.dp))
        Image(painterResource(id = R.drawable.property), contentDescription = "home", modifier = Modifier.size(80.dp))
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Welcome Back",
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            color = Color.Blue
        )
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Already have an account please enter your credentials",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Spacer(modifier = Modifier.height(40.dp))

        OutlinedTextField(
            value = email,
            onValueChange ={email = it},
            label = { Text(text = "Email Address")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = Color.Blue) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        Spacer(modifier = Modifier.height(40.dp))

        OutlinedTextField(
            value = password,
            onValueChange ={password = it},
            label = { Text(text = "Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = Color.Blue) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.height(40.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)
        Button(onClick = { authViewModel.login(email, password)  },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(10.dp)

        ) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Do not have an account? Signup",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.clickable {
                navController.navigate(ROUT_SIGNUP)
            }
        )




    }


}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(rememberNavController() )

}
