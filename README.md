JustTestIt
==========

Sample application showing how to integrate different testing frameworks into an Android Application.


Pure JUnit tests
One module of the app is a pure java module. 
In there, the Java classes can be tested wiht pure JUnit. 
The tests sit under the src/test/ directory

The tests can be ran on the JVM using: 

  `$./gradlew :core:test`

On the android module, robolectic is added as a dependency.
The robolectric plugin is configure to exclude the tests under the espresso/ directory and only run the test classes that have the "Test" suffix in their name.
The tests sit under the src/androidTest/ directory.
There is also a simple custom runner for robolectric.

The tests can be ran on the JVM using: 

  `$./gradlew :app:test`
  
It is possible to run all the pure JUnit and Robolectric tests using:

  `$./gradlew test`

On the android module, espresso is added as a dependency.
The tests sit under the src/androidTest/espresso/ directory.

The tests can be ran on a real device using: 

  `$./gradlew connectedAndroidTest --info`
  
Find the test report under app/build/outputs/androidTest-results/
  
