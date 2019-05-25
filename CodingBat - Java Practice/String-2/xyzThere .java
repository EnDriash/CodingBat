Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.


xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true

public boolean xyzThere(String str) {
  boolean a=false;
  int len=str.length();
  
  if(len>2&&str.substring(0,3).equals("xyz")){
  a=true;  
  }
  for(int i=1;len-2>i;i++){
      if(str.substring(i,i+3).equals("xyz")&&str.charAt(i-1)!='.'){
      a=true;
    
  }}
  return a;
}

