package com.rnarcgis;

import java.util.List;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.esri.android.map.MapView;
import com.esri.android.map.MapOptions;
import com.esri.android.map.MapOptions.MapType;

public class ReactArcGISMapViewViewManager extends SimpleViewManager<MapView> {
 

 public static final String REACT_CLASS = "RCTArcGISMapView";

 @Override
 public String getName(){
     return REACT_CLASS;
 }

 @Override
 public MapView createViewInstance(ThemedReactContext context) {

     MapOptions topo = new MapOptions(MapType.TOPO, 23, -110, 9);
     MapView mapView = new MapView(context, topo);
    
     return mapView;
 }



 
}
