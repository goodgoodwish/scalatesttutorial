import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(2) === 8)
    assert(CubeCalculator.cube(3) === 27)
  }
}

class CubeCalculatorTest2 extends FunSuite {
  test("CubeCalculator.cube 2") {
    assert(CubeCalculator.cube(0) === 0)
  }
}
