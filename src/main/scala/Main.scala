import com.demo.oops.{Shapes, ShapesUsingClass,ShapesUsingCaseClasses}

object Main extends App {

val shapesUsingClass= new ShapesUsingClass()
shapesUsingClass.areaOfTheCircle("circle",3.2)
 shapesUsingClass.areaOfTheRectangle("rectangle",5,4.3)
 shapesUsingClass.areaOfTheSquare("square",5.5)
 shapesUsingClass.areaOfTheTriangle("triangle",4.2,5)

//2nd way
 val circle = new Shapes("circle")
 circle.areaOfTheCircle(3.23)

 val rectangle=new Shapes("rectangle")
 rectangle.areaOfTheRectangle(5,6.1)

 val square= new Shapes("square")
 square.areaOfTheSquare(2.5)

 val triangle = new Shapes("traingle")
 triangle.areaOfTheTriangle(5.5,4)

 //case classes
 val circle1 = ShapesUsingCaseClasses("circle")
 circle1.areaOfTheCircle(3.23)

 val rectangle1= ShapesUsingCaseClasses("rectangle")
 rectangle1.areaOfTheRectangle(5,6.1)

 val square1= ShapesUsingCaseClasses("square")
 square1.areaOfTheSquare(2.5)

 val triangle1 = ShapesUsingCaseClasses("traingle")
 triangle1.areaOfTheTriangle(5.5,4)

}
