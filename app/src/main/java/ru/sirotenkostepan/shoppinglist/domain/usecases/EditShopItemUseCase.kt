package ru.sirotenkostepan.shoppinglist.domain.usecases

import ru.sirotenkostepan.shoppinglist.domain.models.ShopItem
import ru.sirotenkostepan.shoppinglist.domain.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}