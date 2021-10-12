package com.amrabdelhamiddiab.carouselepoxy

import android.content.Context
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.TypedEpoxyController
import com.airbnb.epoxy.carousel

class HomeController : TypedEpoxyController<List<Message>>() {
    override fun buildModels(listItems: List<Message>) {
        val models = listItems.map {
            MessageItemModel_().id("carousel_item").message1(it)
        }

        carousel {
            id("carousel_me")
            padding(Carousel.Padding.dp(24,4,24,16,16))
            hasFixedSize(true)
            numViewsToShowOnScreen(1.2F)
            models(models)

       /* listItems.forEach {
            messageItem {
                id("all_messages")
                message1(it)

            }*/
        }
    }
}