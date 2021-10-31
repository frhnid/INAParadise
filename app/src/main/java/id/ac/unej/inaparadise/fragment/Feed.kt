package id.ac.unej.inaparadise.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import id.ac.unej.inaparadise.R
import android.widget.ArrayAdapter
import id.ac.unej.inaparadise.model.DaftarFeed
import android.support.v7.widget.RecyclerView
import id.ac.unej.inaparadise.adapter.FeedAdapter
import android.support.v7.widget.LinearLayoutManager
import id.ac.unej.inaparadise.adapter.DaftarNotifikasiAdapter
import android.content.Intent
import android.support.v4.app.Fragment
import android.view.View
import android.widget.GridView
import id.ac.unej.inaparadise.adapter.GridViewAdapter
import android.widget.AdapterView
import id.ac.unej.inaparadise.adapter.AdapterDaftarPesan
import java.util.ArrayList

class Feed : Fragment() {
    var daftarFeed: MutableList<DaftarFeed>? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root: View = inflater.inflate(R.layout.fragment_feed, container, false)
        val feed: RecyclerView = root.findViewById(R.id.umpan)
        daftarFeed = ArrayList()
        val adapter = FeedAdapter(daftarFeed, object : FeedAdapter.OnItemClickListener {
            override fun onItemClick(model: DaftarFeed?) {}
        })
        populate()
        feed.layoutManager = LinearLayoutManager(activity)
        feed.adapter = adapter
        adapter.notifyDataSetChanged()
        return root
    }

    fun populate() {
        daftarFeed!!.add(DaftarFeed())
    }
}