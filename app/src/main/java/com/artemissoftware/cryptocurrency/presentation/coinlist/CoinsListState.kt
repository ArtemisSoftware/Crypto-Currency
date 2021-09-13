package com.artemissoftware.cryptocurrency.presentation.coinlist

import com.artemissoftware.cryptocurrency.domain.model.Coin

data class CoinsListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)