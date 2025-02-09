static void main(String[] args) {}

def countElements(List<Integer> list) {
  def result = [:]
  list.each { element ->
    result[element] = result.getOrDefault(element, 0) + 1
  }
  return result
}

def list = [1, 3, 4, 5, 1, 5, 4]
def result = countElements(list)
println(result) // [1:2, 3:1, 4:2, 5:2]
