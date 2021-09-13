package com.artemissoftware.cryptocurrency.domain.repository

import com.artemissoftware.cryptocurrency.data.remote.dto.CoinDetailDto
import com.artemissoftware.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}