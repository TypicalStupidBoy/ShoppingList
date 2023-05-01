package com.ilya.shoppinglist.domain

interface ShopListRepository {

    fun addShopList(shopItem: ShopItem)

    fun deleteShopList(shopItemId: ShopItem)

    fun editShopList(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>
}