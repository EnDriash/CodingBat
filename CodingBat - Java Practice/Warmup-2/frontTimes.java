
Given a string and a non-negative int n 
we will say that the front of the string is the first 3 chars, 
or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"


public String frontTimes(String str, int n) {
  String x="";
  while(str.length()>2&&n>0){
    x=x+str.substring(0,3);
    n--;
  }
   while(str.length()<3&&n>0){
    x=x+str;
    n--;
  }
  return x;
}
