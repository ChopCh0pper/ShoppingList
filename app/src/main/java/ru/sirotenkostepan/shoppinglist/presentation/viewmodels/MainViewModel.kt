package ru.sirotenkostepan.shoppinglist.presentation.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import ru.sirotenkostepan.shoppinglist.data.ShopListRepositoryImpl
import ru.sirotenkostepan.shoppinglist.domain.usecases.DeleteShopItemUseCase
import ru.sirotenkostepan.shoppinglist.domain.usecases.EditShopItemUseCase
import ru.sirotenkostepan.shoppinglist.domain.usecases.GetShopListUseCase
import ru.sirotenkostepan.shoppinglist.domain.models.ShopItem

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = ShopListRepositoryImpl(application)

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}