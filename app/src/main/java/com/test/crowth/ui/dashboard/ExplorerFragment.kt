package com.test.crowth.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.test.crowth.databinding.FragmentExplorerBinding
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.MotionEvent

import android.view.View.OnTouchListener




class ExplorerFragment : Fragment() {

    var recyclerView: RecyclerView? = null
    var source: ArrayList<Crowth>? = null
    var RecyclerViewLayoutManager: RecyclerView.LayoutManager? = null
    var adapter: Adapter? = null
    var HorizontalLayout: LinearLayoutManager? = null


    private lateinit var explorerViewModel: ExplorerViewModel
    private var _binding: FragmentExplorerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        explorerViewModel =
            ViewModelProvider(this).get(ExplorerViewModel::class.java)

        _binding = FragmentExplorerBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.scrollView.setOnTouchListener(OnTouchListener { v, event -> true })


        recyclerView = binding.recyclerview
        RecyclerViewLayoutManager = LinearLayoutManager(context)
        recyclerView!!.layoutManager = RecyclerViewLayoutManager

        AddItemsToRecyclerViewArrayList()
        adapter = Adapter(source!!)

        HorizontalLayout = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView!!.layoutManager = HorizontalLayout
        recyclerView!!.adapter = adapter

        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // Function to add items in RecyclerView.
    fun AddItemsToRecyclerViewArrayList() {
        // Adding items to ArrayList
        source = ArrayList()
        val element1 = Crowth("Android Developer", "$101")
        source!!.add(element1)
        val element2 = Crowth("Flutter Developer", "$150")
        source!!.add(element2)
        val element3 = Crowth("iOS Developer", "$800")
        source!!.add(element3)
        val element4 = Crowth("PHP Developer", "$900")
        source!!.add(element4)
        val element5 = Crowth("Node Developer", "$300")
        source!!.add(element5)
        val element6 = Crowth("Web Developer", "$200")
        source!!.add(element6)
        val element7 = Crowth("React Developer", "$190")
        source!!.add(element7)
        val element8 = Crowth(".NET Developer", "$202")
        source!!.add(element8)
        val element9 = Crowth("KMP Developer", "$300")
        source!!.add(element9)
        val element10 = Crowth("Angular Developer", "$700")
        source!!.add(element10)

    }
}