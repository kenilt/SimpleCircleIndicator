# SimpleCircleIndicator
[ ![Download] ](https://central.sonatype.com/artifact/io.github.kenilt/circleindicator)

A simple circle indicator which supports slide animation


## Demo screenshot
<img src="/screenshot/app_demo.gif" width="300">


# Sample app
You can download the apk for the sample app of this library [at this link](./app/apk).

The code of the sample app is available [at this link](./app/).

Having the sample apps installed is a good way to be notified of new releases. Although watching this repository will allow GitHub to email you whenever a new release is published.


# Download
The Gradle dependency is available via [mavenCentral](https://central.sonatype.com/artifact/io.github.kenilt/circleindicator).

The minimum API level supported by this library is API 21.

##### AndroidX
The latest version here [ ![Download] ](https://central.sonatype.com/artifact/io.github.kenilt/circleindicator)
```
dependencies {
    implementation("io.github.kenilt:circleindicator:1.0.1")
}
```


# Usage

```kotlin
vpPager.adapter = adapter
circleIndicator.setViewPager(vpPager)
```


### XML Properties

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

# Credits

 * [Patrik Åkerfeldt][1] - Author of [ViewFlow][2], a precursor to the ViewPager,
   which supports paged views and is the original source of both the title
   and circle indicators.
 * [Francisco Figueiredo Jr.][3] - Idea and [first implementation][4] for
   fragment support via ViewPager.
 * Jake Wharton - <jakewharton@gmail.com> - Author of the original library



# License

    Copyright 2020 Kenilt Nguyen
    Copyright 2012 Jake Wharton
    Copyright 2011 Patrik Åkerfeldt
    Copyright 2011 Francisco Figueiredo Jr.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.






 [1]: https://github.com/pakerfeldt
 [2]: https://github.com/pakerfeldt/android-viewflow
 [3]: https://github.com/franciscojunior
 [4]: https://gist.github.com/1122947
