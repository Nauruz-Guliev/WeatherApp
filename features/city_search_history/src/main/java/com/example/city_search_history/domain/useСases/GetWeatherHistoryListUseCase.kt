package com.example.city_search_history.domain.useСases

import com.example.city_search_history.domain.WeatherHistoryRepository
import javax.inject.Inject

class GetWeatherHistoryListUseCase @Inject constructor(
    private val weatherHistoryRepository: WeatherHistoryRepository
) {
    suspend operator fun invoke() = weatherHistoryRepository.getWeatherForecastHistoryList()

}