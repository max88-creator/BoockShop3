package com.example.boockshop3.ui.theme.main_screen.bottom_menu

import com.example.boockshop3.R

sealed class BottomMenuItem(
    val route: String,
    val title: String,
    val iconId: Int
) {
    object Home : BottomMenuItem(
        route = "Home",
        title = "Home",
        iconId = R.drawable.ic_home
    )
    object Favs: BottomMenuItem(
        route = "",
        title = "favs",
        iconId = R.drawable.ic_favs
    )
    object Settings: BottomMenuItem(
        route = "",
        title = "settings",
        iconId = R.drawable.ic_settings
    )
}