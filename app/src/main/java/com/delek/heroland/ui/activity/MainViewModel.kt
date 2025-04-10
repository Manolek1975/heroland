package com.delek.heroland.ui.activity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.delek.heroland.data.RoleRepository
import com.delek.heroland.domain.model.RoleProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: RoleRepository): ViewModel() {

    fun insertRoles() = viewModelScope.launch {
        repository.insertRoles(RoleProvider.roles)
    }

}