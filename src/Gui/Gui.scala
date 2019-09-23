package Gui

import scalafx.application.JFXApp

import io.socket.client.{IO, Socket}
import io.socket.emitter.Emitter
import javafx.scene.control.Button
import javafx.scene.input.{KeyCode, KeyEvent}
import javafx.scene.text.Text
import play.api.libs.json.{JsValue, Json}
import scalafx.animation.AnimationTimer
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.control.TextField
import scalafx.scene.layout.StackPane
import scalafx.scene.paint.Color
import scalafx.scene.shape.Rectangle

import scalafx.scene.{Group, Scene}

object Gui extends JFXApp{

  val windowHeight = 750
  val windowWidth = 1200
  var graphics: Group = new Group{}

  val road = new Rectangle{
    width = 75
    height = 750
    fill = Color.rgb(179, 134, 0)

    translateX = windowWidth / 2
    translateY = windowHeight /2
  }

  graphics.children.addAll(road)

  this.stage = new PrimaryStage {
    this.title = "RPG"
    scene = new Scene(windowWidth, windowHeight + 10) {
      content = List(graphics)
      fill = Color.rgb(100, 180, 100)
    }
  }
}
