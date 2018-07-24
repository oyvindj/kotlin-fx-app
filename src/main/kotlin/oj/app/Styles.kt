package oj.app

import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
        val body by cssclass()
    }

    init {
        body {
            backgroundColor += Color.ORANGE
        }
        label and heading {
            padding = box(10.px)
            fontSize = 34.px
            fontWeight = FontWeight.BOLD
        }
    }
}
