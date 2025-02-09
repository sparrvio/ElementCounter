class CountElements {
  static void main(String[] args) {
    def list = [1, 3, 4, 5, 1, 5, 4]
    def result = countElements(list)
    println(result)
  }

  static def countElements(List<Integer> list) {
    def result = [:]
    list.each { element ->
      result[element] = result.getOrDefault(element, 0) + 1
    }
    return result
  }
}