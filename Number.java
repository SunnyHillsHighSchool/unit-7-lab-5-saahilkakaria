//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Saahil Kakaria


//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number
{
  //private instance variable (must be an Integer)
  private Integer num;

  //constructor (no argument)
  public Number()
  {
    num = 0;
  }
  public Number(Integer a)
  {
    num = a;

  }


  //getter method
  public Integer getNumber()
  {
    return num;
  }


  //setter method
  public void setNum(Integer a)
  {
    num = a;
  }


  //isOdd method
  public boolean isOdd()
  {
      if(num%2 != 0)
      {
        return true;
      }
      else
      {
        return false;
      }
  }


  //isPerfect method
  public boolean isPerfect()
  {
      int sum = 0;
      for(int i=1; i<num; i++)
      {
        if(num % i == 0)
        sum = sum + i;
      }
      if(num == sum)
        return true;
      else
        return false;
  }


  //toString
  public String toString()
  {
    return "" + num;
  }
}