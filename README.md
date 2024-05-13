# Basseta Application Journey Example


It's supported by Kotlin and Java


**Handle Basseta library with any android project**

- Add the dependency

>     // Add Basseta lib
>     implementation 'com.github.KamalKhalaf:Basseta_lib:2.0.2'

- Add it in your root build.gradle at the end of repositories:

>    	dependencyResolutionManagement {
>    		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
>    		repositories {
>    			mavenCentral()
>    			maven { url 'https://jitpack.io' }
>    		}
>    	}

**How does Basseta Library work (step-by-step) ?**
------------
- Initalize instance and set the below configration
- "isDebug" true in case of the UAT environment else false.
- "language" should be 'ar' or 'en' based on the application language.
- "merchantId" your merchnat ID which was provided by ours.

>      
>      private lateinit var bassetaConfigration : BassetaConfigration
>      bassetaConfigration = BassetaConfigration(this)
>      bassetaConfigration.setConfiguration(isDebug = true, language = "ar", merchantId = "1")
>

- To start Basseta application journey, just you need to call the below function:

>      
>      bassetaConfigration.showBassetaJourney()
>
