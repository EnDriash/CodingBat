Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.


withoutDoubles(2, 3, true) → 5
withoutDoubles(3, 3, true) → 7
withoutDoubles(3, 3, false) → 6

public int withoutDoubles(int a, int b, boolean noDoubles) {
  int x=a+b;
  if(noDoubles==true&&a==b&&a>=1&&b<6){
    x=a+b+1;
  }
  else if(a==b&&a==6&&noDoubles==true){
    x=7;
  }
  
  return x;
}
