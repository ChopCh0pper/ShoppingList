package ru.sirotenkostepan.shoppinglist.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import ru.sirotenkostepan.shoppinglist.domain.models.ShopItem

class ShopItemDiffCallback: DiffUtil.ItemCallback<ShopItem>() {

    override fun areContentsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem == newItem
    }

    override fun areItemsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem.id == newItem.id
    }
}