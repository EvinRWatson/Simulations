public class Calc
{
  //Constructor
  public Calc(int s, int f_S, String b_S, String b_f_S)
  {
    s = 1; f_S = 0;
    b_S = "";
    b_f_S = "";
  }
  //startCalc Method
  public String startCalc(int s)
  {
    String b_S = Integer.toBinaryString(s);
    String b_f_S = (b_S.substring(1, b_S.length())) + (b_S.substring(0,1));
    int f_S = Integer.parseInt(b_f_S, 2);
    if(f_S == 1)
    {
      System.out.println();
    }
    String output = (s + "\t\t:\t\t" + f_S);
    return output;
  }
  
}