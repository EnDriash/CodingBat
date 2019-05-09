
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true


boolean doubleX(String str) {
  
    while(str.length()>1&&str.charAt(0)!='x'){
      str=str.substring(1,str.length());
    }
    if(str.length()>1&&str.charAt(0)=='x'&&str.charAt(1)=='x'){
      return true;
    }
    
    return false;
}

