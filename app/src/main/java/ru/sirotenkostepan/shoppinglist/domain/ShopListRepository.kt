package ru.sirotenkostepan.shoppinglist.domain

import androidx.lifecycle.LiveData
import ru.sirotenkostepan.shoppinglist.domain.models.ShopItem

interface ShopListRepository {

    suspend fun addShopItem(shopItem: ShopItem)
    suspend fun deleteShopItem(shopItem: ShopItem)
    suspend fun editShopItem(shopItem: ShopItem)
    suspend fun getShopItem(shopItemId: Int): ShopItem
    fun getShopList(): LiveData<List<ShopItem>>
}