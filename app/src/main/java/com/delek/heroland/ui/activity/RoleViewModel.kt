package com.delek.heroland.ui.activity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.delek.heroland.domain.GetRolesUseCase
import com.delek.heroland.domain.model.Role
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RoleViewModel @Inject constructor(private val getRolesUseCase: GetRolesUseCase) :
    ViewModel() {

    val roles = MutableLiveData<List<Role>>()

    fun onCreate() {
        viewModelScope.launch {
            val result = getRolesUseCase()
            if (result.isNotEmpty()) {
                roles.postValue(result)
            }
        }
    }

    /*    init {
            viewModelScope.launch {
                roleEntity.value = getRolesUseCase.getAllRoles()
            }
        }*/

}