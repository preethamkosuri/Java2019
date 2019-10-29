package M9.Abs;  
class Animal{
  {
    System.out.println(1);
  }
}
class Horse extends Animal{
  {
    System.out.println(2);
  }
}
class Cat extends Horse{
  {
    System.out.println(3);
  }

}
  
public class Main{
  public static void main(String[] args) {
    Cat c=new Cat();
  }
}

