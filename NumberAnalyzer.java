//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Saahil Kakaria

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int[]s)
  {
    list = new ArrayList<Number>();
    for(int n:s)
    {
      list.add(new Number(n));
    }
  }


  //add method
  public void add (Number x)
  {
    list.add(x);
  }

	//write count odds
  public int countOdds()
  {
    int oddCount = 0;
    for(Number odd:list)
    {
      if(odd.isOdd())
      {
        oddCount++;
      }
    }
    return oddCount;
  }

	//write count evens
  public int countEvens()
  {
    int evenCount = 0;
    for(Number even: list)
    {
      if(even.isOdd() == false)
      {
        evenCount++;
      }
    }
    return evenCount;
  }

	//write count perfects
  public int countPerfects()
  {
    int perfectCount = 0;
    for(Number perfect: list)
    {
      if(perfect.isPerfect())
      {
        perfectCount++;
      }
    }
    return perfectCount;
  }

	//write a toString
  public String toString()
  {
    return "" + list;
  }
}