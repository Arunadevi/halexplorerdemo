package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.functional.syntax._
import play.api.libs.json.Json._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  val producthal = obj(
  "_links" -> obj (    "product" -> obj(      "href" -> "/pd"    )),
  "welcome" -> "Welcome to business elements.",
  "version" -> "0.1-SNAPSHOT",
  "build" -> "2014-03-17T20:46+0000"
)

  def product = Action {
    Ok(producthal)
  }
}