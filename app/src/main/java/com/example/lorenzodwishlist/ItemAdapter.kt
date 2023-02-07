package com.example.lorenzodwishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


    class ItemAdapter(private val emails: List<Item>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
        // Provide a direct reference to each of the views within a data item
        // Used to cache the views within the item layout for fast access
        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            // TODO: Create member variables for any view that will be set
            // as you render a row.
            val senderTextView: TextView
            val titleTextView: TextView
            val summaryTextView: TextView
            // We also create a constructor that accepts the entire item row
            // and does the view lookups to find each sub-view
            init {
                // TODO: Store each of the layout's views into
                // the public final member variables created above
                senderTextView = itemView.findViewById(R.id.sender)
                titleTextView = itemView.findViewById(R.id.title)
                summaryTextView = itemView.findViewById(R.id.summary)
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val context = parent.context
            val inflater = LayoutInflater.from(context)
            // Inflate the custom layout
            val contactView = inflater.inflate(R.layout.insidewishlist, parent, false)
            // Return a new holder instance
            return ViewHolder(contactView)
        }

        override fun getItemCount(): Int {
            return emails.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val email = emails.get(position)
            // Set item views based on views and data model
            holder.senderTextView.text = email.Name
            holder.titleTextView.text = email.Price
            holder.summaryTextView.text = email.Link
        }
    }
