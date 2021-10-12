package com.amrabdelhamiddiab.carouselepoxy

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.amrabdelhamiddiab.carouselepoxy.R.layout
import com.amrabdelhamiddiab.carouselepoxy.R.layout.view_holder_message_item as view_holder_message_item1

@EpoxyModelClass(layout = view_holder_message_item1)
abstract class MessageItemModel : EpoxyModelWithHolder<MessageItemModel.Holder>() {
    @EpoxyAttribute
    lateinit var message1: Message

    override fun bind(holder: Holder){
        super.bind(holder)
        with(message1){
            holder.title.text = title
            holder.content.text = content
        }
    }

    class Holder : EpoxyHolder() {
        lateinit var title: TextView
        lateinit var content: TextView

        override fun bindView(itemView: View) {
            title = itemView.findViewById(R.id.textViewTitle)
            content = itemView.findViewById(R.id.content)
        }

    }
}