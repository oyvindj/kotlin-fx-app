package oj.view

import oj.app.Styles
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = hbox {
        addClass(Styles.body)
        label(title) {
            addClass(Styles.heading)
        }
    }
}
