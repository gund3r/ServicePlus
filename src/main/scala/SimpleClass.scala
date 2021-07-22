class SimpleClass(id: Int, description: String, kind: Option[Int]) {

  object Kind {

    def isKindThere(simpleObject: SimpleClass): String = {
      if (kind.isEmpty) return "unknown"
      else if (kind.get % 2 == 0) return "even"
      else return description
    }

    def sumOfOddValues(sequence: Seq[Int]): Int = {
      return sequence.filter(_ % 2 != 0).sum
    }

  }

}
