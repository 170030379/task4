package task4;

public class Interest 
{
  public float simpleinterest(int P,int T,int R) 
  {
	  return (P*T*R/100);
  }
  public float compoundinterest(float P,float  R,float n,float t)

{
	 return (float) (P*Math.pow((1+R/n),n*t));

}
}
