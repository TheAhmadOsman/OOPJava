package quizzes;

/**
 * Quiz 10 interfaces and classes
 * @author yasiro01
 */
interface A {
  
  final int VAR1 = 10;
  String VAR2 = "A";
  
  void method1();
  int method2(int param);
  String method3();
}

interface B extends A {
  
  String VAR2 = "B";
  
  int method4();
}

abstract class C implements A {
  
  int VAR1 = 5;
  
  public C() {
    VAR1 = 15;
  }
  
  public C(String s) {
    this();
    VAR1 = 1;
  }
  
  @Override
  public void method1() {
    System.out.println(VAR1);
  }

  @Override
  public int method2(int param) {
    return VAR1 + param;
  }

}

class D implements B {
  
  @Override
  public void method1() {
    System.out.println("D");
  }

  @Override
  public int method2(int param) {
    return VAR1 - param;
  }

  @Override
  public String method3() {
    return VAR2 + "D";
  }
  
  @Override
  public int method4() {
    return VAR1 + 1;
  }
}

class E extends C implements B {
  int VAR3;
  
  public E() {
    super();
    this.VAR3 = 20;
  }

  @Override
  public String method3() {
    return "E";
  }
  
  @Override
  public int method4() {
    return super.VAR1 + VAR3;
  }
}