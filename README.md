# SimpleCircleIndicator
A simple circle indicator which support slide animation

[ ![Download](https://api.bintray.com/packages/kenilt/SimpleCircleIndicator/com.kenilt.circleindicator/images/download.svg) ](https://bintray.com/kenilt/SimpleCircleIndicator/com.kenilt.circleindicator/_latestVersion)


<img src="/screenshot/app_demo.gif" width="300">



Gradle
------------


##### AndroidX
```groovy
dependencies {
    implementation 'com.kenilt.circleindicator:circleindicator:1.0.0'
}
```


Usage
--------

```kotlin
vpPager.adapter = adapter
circleIndicator.setViewPager(vpPager)
```


XML Properties
--------

```xml
<com.kenilt.circleindicator.CirclePageIndicator
	android:id="@+id/indicator"
	android:layout_width="match_parent"
	android:layout_height="48dp"/>
```

| Properties			| Default Value			|
| ----------------------------- | ----------------------------- |
| app:centered	 		| true				|
| app:fillColor			| #ffffff				|
| app:pageColor			| #40ffffff				|
| android:orientation		| 0  	|
| app:radius	| 4dp	|
| app:snap		| false	|
| app:strokeColor	| #40ffffff				|
| app:strokeWidth		| 1dp			|
