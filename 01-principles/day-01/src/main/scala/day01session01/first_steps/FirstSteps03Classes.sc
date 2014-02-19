package day01session01.first_steps

/*
 * This file is part of the "Scala Hack Session".
 *
 * Scala Hack Session is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Scala Hack Session is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Scala Hack Session.  If not, see <http://www.gnu.org/licenses/>.
 *
 * =================================================================================
 *
 */
object FirstSteps03Classes {

  //class definitions
  //inside the class define:
  // - dateFormat and
  // - constructionTime
  //like in the previous exercise
  class ScalaFun {
    //unlike Java imports can also be defined within a class or function
    import java.text.SimpleDateFormat

    private val alive = true
    //define variables for dateFormat and constructionTime here
    var constructionTime = ???
    val dateFormat = ???

    //Constructors with params are defined using "def this(params)".
    //The first call must always be the primary constructor "this()"
    def this(constructionTime: Long) = {
      ???
    }
  }

  //now instantiate the class and have a look at the output
  //note: in Scala for default constructors a "new MyClass" without brackets is just fine
  //in Scala
  val instance = ???

  //do a println using the instance' dateFormat and constructionTime
  println(???)

  //Example taken from: http://www.artima.com/pins1ed/case-classes-and-pattern-matching.html
  //Case classes: adding the "case" modifier to a class lets the compiler add some syntactic conveniences to the class:
  //- a factory method making instantiation easier: "CaseClass(param)" instead of "new CaseClass(param)"
  //- all arguments get a "val" prefix and can be publicly accessed as fields
  //- adds "natural" implementations of toString, hashCode and equals.
  //case classes are always structually (deep) compared (using "equals" resp. "==")
  abstract class Expr
  case class Var(name: String) extends Expr
  case class Number(num: Double) extends Expr
  case class VarNumber(num: Double, name: String) extends Expr

  //instantiate Number and Var and print them out
  val num = ???
  val variable = ???
  //print
  ???
  //another convenience is the copy function of case classes where you can call caseClass.copy(param1Value, param2Value, ...)
  //the copy function requires at least one param, are others will then be copied
  //in case a specific param should be overridden then use: copy(param3=value, param2=value)
  val varNum1 = VarNumber(2.4, "varNum1")
  //copy with first value changed
  val varNum2 = ???
  //call copy with only the second value changed
  val varNum3 = ???
  
  case class Super
  //try to define a case class extending from super
  //this will break. have a look at the error message
}