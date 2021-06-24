package com.cloudbreaker.stores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.cloudbreaker.stores.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mAdapter: StoreAdapter
    private lateinit var mGridLayout: GridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btnSave.setOnClickListener {
            val store = Store(name = mBinding.etName.text.toString().trim())
            mAdapter.add(store)
        }

        setupRecylcerView()
    }

    private fun setupRecylcerView() {
        mAdapter = StoreAdapter(mutableListOf(),this)
        mGridLayout = GridLayoutManager(this,2)

        mBinding.recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = mGridLayout
            adapter = mAdapter


        }

    }
    //No hay TODOs que hacer, sigue el ROOM
    //TODO

    /*
    * OnClickListener
    * */
    override fun onClick(store: Store) {
        TODO("Not yet implemented")
    }
}