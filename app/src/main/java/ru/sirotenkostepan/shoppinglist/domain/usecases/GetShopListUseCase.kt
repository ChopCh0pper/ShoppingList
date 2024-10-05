package ru.sirotenkostepan.shoppinglist.domain.usecases

import androidx.lifecycle.LiveData
import ru.sirotenkostepan.shoppinglist.domain.models.ShopItem
import ru.sirotenkostepan.shoppinglist.domain.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}