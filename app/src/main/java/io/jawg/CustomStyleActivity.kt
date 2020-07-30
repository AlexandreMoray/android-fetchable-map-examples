package io.jawg

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.maps.MapView
import kotlinx.android.synthetic.main.activity_custom_styles.*

class CustomStyleActivity: AppCompatActivity() {
    private var mapView: MapView? = null
    /*
     * Enter you style ID from the lab here.
     * To get one see https://jawg/io/docs/maps#get-custom-style-id
     * Or go to https://jawg.io/lab/styles to create one directly.
     */
    private var styleId: String = "YOUR_CUSTOM_STYLE_ID"

    // Returns the Jawg url depending on the style given
    // See /res/values/strings which contains the url and your access token.
    private fun makeStyleUrl(style: String = styleId ): String {
        return "${getString(R.string.jawg_styles_url) + style}.json?access-token=${getString(R.string.jawg_access_token)}";
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(styleId == "") {
            Toast.makeText(applicationContext, "You need to set a style id in CustomStyleActivity to make this view work.", Toast.LENGTH_LONG).show();
        }
        // Get the Mapbox context.
        Mapbox.getInstance(this, null)
        // Then set the activity layout
        setContentView(R.layout.activity_custom_styles)
        val input : EditText = edit_text

        input.setOnEditorActionListener { v, actionId, event ->
            if(actionId == EditorInfo.IME_ACTION_DONE){
                switchStyle(v.text.toString());
                true
            } else {
                false
            }
        }
        // We get the map view to set its style with the desired Jawg url.
        mapView = findViewById(R.id.mapView)
        mapView?.onCreate(savedInstanceState)
        mapView?.getMapAsync { map ->
            map.setStyle(makeStyleUrl()) {
                // Map fully loaded in this scope.
                //Attributions position
                map.uiSettings.setAttributionMargins(15,0,0,15)
            }
        }
    }

    fun switchStyle(styleId: String) {
        mapView?.getMapAsync { map ->
            map.setStyle(makeStyleUrl(styleId)) {
                // Map fully loaded in this scope.
            }
        }
    }
    override fun onStart() {
        super.onStart()
        mapView?.onStart()
    }

    override fun onResume() {
        super.onResume()
        mapView?.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView?.onPause()
    }

    override fun onStop() {
        super.onStop()
        mapView?.onStop()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView?.onLowMemory()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView?.onDestroy()
    }

}