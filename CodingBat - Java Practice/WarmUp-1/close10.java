Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0



public int close10(int a, int b) {
  int a1=Math.abs(10-a);
  int b1=Math.abs(10-b);
  int resulte = 0; 
  if (a1>b1){
    resulte=b;
  }
  if (a1<b1){
    resulte=a;
  }
  if(a1==b1){
    resulte=0;
    
  }
  return resulte;
}
