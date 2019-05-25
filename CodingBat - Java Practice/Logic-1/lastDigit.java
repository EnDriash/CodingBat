public boolean lastDigit(int a, int b, int c) {
  a=a%10;
  b=b%10;
  c=c%10;
  boolean t=false;
  if(a==b||b==c||c==a){
    t=true;
  }
  return t;
}
