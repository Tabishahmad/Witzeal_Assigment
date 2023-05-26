package com.example.bookapi.domain.usecase

data class UseCase(val getListUseCase: GetListUseCase,
                   val markFavUseCase: ManageBookFavoriteUseCase) {
}