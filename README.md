# Jawg Maps on Android examples

This repository contains multiple examples on how to integrate Jawg Maps on your mobile app with Mapbox GL Android. 

> Don't forget to set your personal acces token in [strings.xml](./app/src/main/res/values/strings.xml). 

## Examples description : 

[SimpleMapActivity](./app/src/main/java/io/jawg/SimpleMapActivity.kt) : Displaying a simple dynamic map.

[MarkerMapActivity](./app/src/main/java/io/jawg/MarkerMapActivity.kt) : Adding a simple marker on a map. 

[PopupMapActivity](./app/src/main/java/io/jawg/PopupMapActivity.kt) : Adding a popup with markers on a map. 

[GeometryMapActivity](./app/src/main/java/io/jawg/GeometryMapActivity.kt) : Adding geometry on your map with GeoJSON. 

[SwitchLanguagesActivity](./app/src/main/java/io/jawg/SwitchLanguagesActivity.kt) : Changing your map's language. 

[DifferentStylesActivity](./app/src/main/java/io/jawg/DifferentStylesActivity.kt) : Changing your map style using our default styles.

[CustomStyleActivity](./app/src/main/java/io/jawg/CustomStyleActivity.kt) : Using a custom style from [Jawg Lab](https://jawg.io/lab) on your map. 

> You'll need to set a style ID in `CustomStyleActivity` to make this example work. 
>
> If you don't have any style ID yet, go to [Jawg Lab](https://jawg.io/lab/styles) to create one or read [this documentation](https://jawg.io/docs/maps#get-custom-style-id) for more informations.  