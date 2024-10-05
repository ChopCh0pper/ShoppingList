package ru.sirotenkostepan.shoppinglist.domain.usecases

import ru.sirotenkostepan.shoppinglist.domain.models.ShopItem
import ru.sirotenkostepan.shoppinglist.domain.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}