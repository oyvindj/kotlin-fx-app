package oj.view

import oj.app.Styles
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = hbox {
        addClass(Styles.body)
        vbox {
            label(title) {
                addClass(Styles.heading)
            }
            button("Click Me") {
                style {
                    fontSize = 34.px
                    minWidth = 100.px

                }
            }

        }
    }
}
