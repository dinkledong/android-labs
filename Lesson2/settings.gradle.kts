pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Lesson2"
include(":app")
include(":multiactivity")
include(":intentfilter")
include(":intentfilter2")
include(":toastapp")
include(":notificationapp")
include(":dialog")
include(":dialogtask2")
