package controllers


import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.data.format.Formats._

/**
  * Created by mind7 on 08/11/16.
  */
@Singleton
class UserController @Inject() extends Controller  {

  case class UserData(name: String,age: Int)

  val userForm = Form(
    mapping(
      "name" -> text,
      "age"  -> number
    )(UserData.apply)(UserData.unapply)
  )
}
