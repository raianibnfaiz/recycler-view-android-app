package com.raian.affirmations.adapter

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.raian.affirmations.DetailsActivityActivity
import com.raian.affirmations.R
import com.raian.affirmations.model.Affirmation


/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */
class ItemAdapter(private val context: Context,private val dataset: List<Affirmation>):

    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.

    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
        val image: ImageView = view.findViewById(R.id.imageView)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        val bitmap = BitmapFactory.decodeResource(context.resources, item.imageResourceId)
        val resized = Bitmap.createScaledBitmap(bitmap, 200, 200, true)
        holder.image.setImageBitmap(resized)
        Log.d("Main","This is in text: "+context.resources.getString(item.stringResourceId))
        holder.image.setOnClickListener {
            val intent = Intent(context, DetailsActivityActivity::class.java)
//            intent.putExtra("string_value", item.stringResourceId.toString())
//            intent.putExtra("image_value", item.imageResourceId.toString())
            val player = Affirmation(item.stringResourceId,item.imageResourceId)
            intent.putExtra("player",player)
            context.startActivity(intent)
        }


    }
    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
        override fun getItemCount() = dataset.size

}