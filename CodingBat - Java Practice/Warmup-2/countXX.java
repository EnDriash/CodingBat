
Count the number of "xx" in the given string. 
We will say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3


int countXX(String str) {
int x=0;
  while(str.length()>1){
    if(str.charAt(0)=='x'&&str.charAt(1)=='x'){
        x++;
        str=str.substring(1);
    }
      else{
    str=str.substring(1);
      }
  }
  return x;
}
