package ru.sirotenkostepan.shoppinglist.domain.usecases

import ru.sirotenkostepan.shoppinglist.domain.models.ShopItem
import ru.sirotenkostepan.shoppinglist.domain.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}