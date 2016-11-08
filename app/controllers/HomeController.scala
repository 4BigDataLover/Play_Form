package controllers

import javax.inject.{Inject, Singleton}

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

@Singleton
class HomeController @Inject() extends Controller {
  val form = Form("firstname" -> text)

  def index = Action {
    Ok(views.html.index())
  }

  def submit = Action { implicit request =>
    val fname = form.bindFromRequest.get
    Ok("Hi %s ".format(fname))
  }
}
