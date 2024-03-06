package com.demo.implicits
  object TypeClasses extends App{

    //Type classes in Scala allows different types to exhibit the same behavior without directly modifying their code

    case class User(name:String,age:Int,email:String)

    trait HtmlSerializer[T]{
      def serialize(value:T):String
    }
//    object UserSerializer extends HtmlSerializer[User]{
//      override def serialize(user: User): String = s"<div>${user.name}(${user.age} hello <a href=${user.email}/></div>"
//    }
//    val ravi= User("ravi",23,"imcrt17@gmail.com")
//    println( UserSerializer.serialize(ravi))

    import java.util.Date
    object DateSerializer extends HtmlSerializer[Date]{
      override def serialize(date: Date): String = s"<div>${date.toString}/></div>"


      case class Carnivores(name:String,food:String)
      trait Animal[T]{
        def eat(value:T):String
      }
      object Lion extends Animal[Carnivores]{
        override def eat(carnivore:Carnivores): String = s"i am ${carnivore.name} i eat ${carnivore.food}"
      }
      val lion= Carnivores("lion","meat")
     println(Lion.eat(lion))

    }


}
