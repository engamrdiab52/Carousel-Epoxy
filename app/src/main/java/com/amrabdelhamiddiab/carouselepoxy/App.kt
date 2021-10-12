package com.amrabdelhamiddiab.carouselepoxy

import android.app.Application
import android.content.Context
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.airbnb.epoxy.Carousel

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        // Carousel.setDefaultGlobalSnapHelperFactory(null)
        /*    Carousel.setDefaultGlobalSnapHelperFactory(
                object : Carousel.SnapHelperFactory() {
                    override fun buildSnapHelper(context: Context?
                    ): SnapHelper {
                        // Return anything!
                        // Anything you could ever possibly dream of!
                        return PagerSnapHelper()
                    })

                }*/
        Carousel.setDefaultGlobalSnapHelperFactory(object : Carousel.SnapHelperFactory() {
            override fun buildSnapHelper(context: Context?): SnapHelper {
                return PagerSnapHelper()
            }
        })
    }
}