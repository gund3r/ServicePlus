import org.scalatest.FunSuite

class SimpleClassTest extends FunSuite {

  val Odd: SimpleClass = new SimpleClass(0, "with odd kind", Some(3))
  val Even: SimpleClass = new SimpleClass(1, "with even kind", Some(2))
  val Empty: SimpleClass = new SimpleClass(2, "with empty kind", Option.empty)
  val list: List[Int] = List.range(1, 6)

  test("withOdd") {
    assert(Odd.Kind.isKindThere(Odd).equals("with odd kind"))
  }

  test("withEven") {
    assert(Even.Kind.isKindThere(Even).equals("even"))
  }

  test("withEmpty") {
    assert(Empty.Kind.isKindThere(Empty).equals("unknown"))
  }

  test("sumOfOddValues") {
    assert(Empty.Kind.sumOfOddValues(list) == 9)
  }

}
