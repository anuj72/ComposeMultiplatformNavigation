import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("org.openjfx.javafxplugin") version "0.0.10"

}

group = "com.compose"
version = "1.0-SNAPSHOT"
val korimVersion = "4.0.2"




@OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
kotlin {
    jvm {
        jvmToolchain(11)
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":shared"))
               // implementation(project(":navigator"))
                implementation(compose.desktop.currentOs)
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                api(compose.material3)
                api(compose.materialIconsExtended)
                implementation("com.github.sarxos:webcam-capture:0.3.12")
                implementation("com.arkivanov.decompose:decompose:2.0.0-compose-experimental-alpha-02")
                implementation("com.arkivanov.decompose:extensions-compose-jetbrains:2.0.0-compose-experimental-alpha-02")

                implementation("no.tornado:tornadofx:1.7.20")
                implementation("org.slf4j:slf4j-simple:1.7.30")
               // implementation("origami:origami:4.5.1-3")
              //  implementation("origami:filters:1.20")

                implementation ("org.openpnp:opencv:4.5.3-1")
                implementation("org.openjfx:javafx-controls:20")
                implementation("org.openjfx:javafx-graphics:20")
                implementation("org.openjfx:javafx-base:20")
                implementation("org.openjfx:javafx-fxml:20")
                implementation("org.openjfx:javafx-swing:20")

                implementation("com.github.sarxos:webcam-capture:0.3.12")
                implementation("com.soywiz.korlibs.korim:korim-jvm:$korimVersion")
                implementation("io.github.succlz123:compose-imageloader-desktop:0.0.2")

                implementation ("com.github.ben-manes.caffeine:caffeine:3.0.0")

                //implementation("com.alialbaali.kamel:kamel-image:0.4.0")
                implementation("media.kamel:kamel-image:0.7.3")

                implementation ("org.jetbrains.skiko:skiko:0.7.77")

                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")

                implementation("com.itextpdf:itextpdf:5.5.13.2")

                implementation("org.apache.pdfbox:pdfbox:2.0.27")



            }
        }
        val jvmTest by getting
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
        description = "Retail App for Shops."
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)

            packageVersion = "1.0.0"
            packageName = "RetailApp"
            copyright = "© 2023 Revest. All rights reserved."
            vendor = "Revest"
            val iconsRoot = project.file("src/jvmMain/resources/drawable")
            macOS {
                bundleID = "com.revest.retail"
                iconFile.set(iconsRoot.resolve("logo.icns"))
            }
            windows {
                iconFile.set(iconsRoot.resolve("logo.ico"))
                // Wondering what the heck is this? See : https://wixtoolset.org/documentation/manual/v3/howtos/general/generate_guids.html
                // https://www.guidgen.com/
                upgradeUuid = "2286fbf1-fbe9-4a07-b74e-8955cdd1f7af"
                menuGroup = packageName
                msiPackageVersion = packageVersion
                exePackageVersion = packageVersion
            }
            linux {
                iconFile.set(iconsRoot.resolve("logo.png"))
                debMaintainer = ""
                debMaintainer = "aschan@jazeeratech.in"
                menuGroup = "Menu"
                appRelease = "1"
                appCategory = "RETAIL"
                rpmLicenseType = "TYPE_OF_LICENSE"
                debPackageVersion = packageVersion
                rpmPackageVersion = packageVersion
            }

            modules("java.sql")

        }
    }
}

javafx {
    version = "20"
    modules = listOf("javafx.controls", "javafx.swing", "javafx.web", "javafx.graphics")
}







