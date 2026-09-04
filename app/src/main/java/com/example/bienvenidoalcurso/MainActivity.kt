package com.example.bienvenidoalcurso

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bienvenidoalcurso.ui.theme.BienvenidoAlCursoTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.material3.TextField
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource
import com.example.bienvenidoalcurso.R
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Switch
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            BienvenidoAlCursoTheme {
                Surface(
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingCard()
                }
            }
        }
    }
}

@Composable
fun GreetingCard() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Welcome to the Course!",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Text(
            text = "Hello Diego!",
            fontSize = 20.sp
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Green
                )
            ) {
                Text("Accept")
            }

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Green
                )
            ) {
                Text("Decline")
            }
        }

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Image(
            painter = painterResource(
                id = R.drawable.android_logo
            ),
            contentDescription = "Course Image",
            modifier = Modifier.size(100.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGreetingCard() {
        GreetingCard()
}

@Composable
fun ControlesCompose() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Controles de Compose",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Image(
            painter = painterResource(
                id = R.drawable.android_logo
            ),
            contentDescription = "Imagen de ejemplo",
            modifier = Modifier.size(80.dp)
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text("Ingrese su nombre")
            }
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green,
                contentColor = Color.White
            )
        ) {
            Text("Guardar")
        }

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green,
                contentColor = Color.White
            )
        ) {
            Text("Cancelar")
        }

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = "Opciones",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Checkbox(
                checked = true,
                onCheckedChange = {}
            )

            Text("Aceptar términos")
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Switch(
                checked = true,
                onCheckedChange = {}
            )

            Text("Modo activo")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewControles() {
    BienvenidoAlCursoTheme {
        ControlesCompose()
    }
}
@Composable
fun ContenedoresCompose() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Contenedores de Compose",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )


            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {

                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Tarjeta de información",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )

                    Text(
                        text = "Ejemplo usando Card dentro de una pantalla Compose"
                    )
                }
            }


            Spacer(
                modifier = Modifier.height(20.dp)
            )


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                Button(
                    onClick = {}
                ) {
                    Text("Aceptar")
                }


                Button(
                    onClick = {}
                ) {
                    Text("Cancelar")
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewContenedores() {
    BienvenidoAlCursoTheme {
        ContenedoresCompose()
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ControlesAvanzadosCompose() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TopAppBar(
            title = {
                Text("Mi aplicación Compose en Programación en Moviles")
            }
        )


        Spacer(
            modifier = Modifier.height(30.dp)
        )


        Text(
            text = " Configuracion ",
            fontSize = 40.sp
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )


        Text(
            text = "Controles avanzados",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )


        Spacer(
            modifier = Modifier.height(20.dp)
        )


        LinearProgressIndicator(
            modifier = Modifier.fillMaxWidth()
        )


        Spacer(
            modifier = Modifier.height(20.dp)
        )


        Button(
            onClick = {}
        ) {
            Text("Mostrar mensaje")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewControlesAvanzados() {
    BienvenidoAlCursoTheme {
        ControlesAvanzadosCompose()
    }
}