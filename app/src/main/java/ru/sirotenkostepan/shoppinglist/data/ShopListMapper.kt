package ru.sirotenkostepan.shoppinglist.data

import ru.sirotenkostepan.shoppinglist.domain.models.ShopItem

class ShopListMapper {

    fun mapEntityToDbModel( shopItem: ShopItem) = ShopItemDbModel(
            id = shopItem.id,
            name = shopItem.name,
            count = shopItem.count,
            enabled = shopItem.enabled
    )

    fun mapDbModelToEntity( shopItemDbModel: ShopItemDbModel) = ShopItem(
        id = shopItemDbModel.id,
        name = shopItemDbModel.name,
        count = shopItemDbModel.count,
        enabled = shopItemDbModel.enabled
    )

    fun mapListDbModelToListEntity(lisr: List<ShopItemDbModel>) = lisr.map {
        mapDbModelToEntity(it)
    }
}