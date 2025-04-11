package com.delek.heroland.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.delek.heroland.databinding.ActivityRoleBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RoleActivity : AppCompatActivity() {

    private val roleViewModel: RoleViewModel by viewModels()
    private lateinit var binding: ActivityRoleBinding
    private lateinit var adapter: RoleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hideSystemBars()
        binding = ActivityRoleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {
        adapter = RoleAdapter(onItemSelected = {
            Toast.makeText(this, it.name, Toast.LENGTH_SHORT).show()
        })
        binding.rvRole.layoutManager = GridLayoutManager(this, 2)
        binding.rvRole.adapter = adapter

        roleViewModel.onCreate()

        roleViewModel.roles.observe(this) {
            adapter.updateList(it)
        }
    }

    private fun hideSystemBars() {
        enableEdgeToEdge()
        val controller = WindowInsetsControllerCompat(window, window.decorView)
        controller.hide(WindowInsetsCompat.Type.systemBars())
        controller.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    }
}