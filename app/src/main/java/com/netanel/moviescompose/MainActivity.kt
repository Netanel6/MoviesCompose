package com.netanel.moviescompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.netanel.moviescompose.ui.Navigation
import com.netanel.moviescompose.ui.components.uiComponents.AppText
import com.netanel.moviescompose.ui.theme.MainColor
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scaffoldState = rememberScaffoldState()
            val modifier = Modifier
            Scaffold(backgroundColor = MainColor, scaffoldState = scaffoldState, topBar = {
                TopAppBar(elevation = 6.dp, backgroundColor = MainColor) {
                    Row(
                        modifier = modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Image(
                            modifier = modifier.padding(8.dp),
                            painter = painterResource(id = R.drawable.ic_movie),
                            contentDescription = "Top app bar"
                        )
                        AppText(
                            modifier = modifier.align(Alignment.CenterVertically),
                            text = stringResource(id = R.string.app_name)
                        )

                    }
                }
            }) {
                Navigation()
            }
        }
    }
}