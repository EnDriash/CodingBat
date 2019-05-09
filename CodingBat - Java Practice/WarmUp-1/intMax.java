Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3



public int intMax(int a, int b, int c) {
  int x=0;
  if(a>b&&a>c){
    x=a; 
  }
  if(b>c&&b>a){
    x=b;
  }
  if(c>a&&c>b){
    x=c;
  }
  return x;
}
