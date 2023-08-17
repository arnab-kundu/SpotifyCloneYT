package com.plcoding.spotifycloneyt.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import com.plcoding.spotifycloneyt.R
import com.plcoding.spotifycloneyt.databinding.SwipeItemBinding

class SwipeSongAdapter : BaseSongAdapter(R.layout.swipe_item) {

    override val differ = AsyncListDiffer(this, diffCallback)
    private lateinit var binding: SwipeItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        binding = SwipeItemBinding.bind(parent)
        return super.onCreateViewHolder(parent, viewType)
    }
    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songs[position]
        holder.itemView.apply {
            val text = "${song.title} - ${song.subtitle}"
            binding.tvPrimary.text = text

            setOnClickListener {
                onItemClickListener?.let { click ->
                    click(song)
                }
            }
        }
    }

}



















