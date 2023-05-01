package com.ilya.shoppinglist.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopList(shopItemId: ShopItem){
        shopListRepository.deleteShopList(shopItemId)
    }
}