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

rootProject.name = "Dice Roller"
include(":app")
include(":gestiondetache")
include(":interfacetolearn")
include(":carteanniversaire")
include(":carte_visite")
include(":cartevisite")
include(":quadrant")
include(":adresse")
include(":myapplication")
