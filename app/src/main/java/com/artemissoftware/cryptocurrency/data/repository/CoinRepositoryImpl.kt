package com.artemissoftware.cryptocurrency.data.repository

import com.artemissoftware.cryptocurrency.data.remote.CoinPaprikaApi
import com.artemissoftware.cryptocurrency.data.remote.dto.CoinDetailDto
import com.artemissoftware.cryptocurrency.data.remote.dto.CoinDto
import com.artemissoftware.cryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val api: CoinPaprikaApi): CoinRepository{

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}