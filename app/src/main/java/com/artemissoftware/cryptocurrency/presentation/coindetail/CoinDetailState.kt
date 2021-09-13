package com.artemissoftware.cryptocurrency.presentation.coindetail

import com.artemissoftware.cryptocurrency.domain.model.Coin
import com.artemissoftware.cryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)