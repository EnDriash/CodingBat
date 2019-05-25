Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.


sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true

public boolean sameStarChar(String str) {
  if(str.length()>2){
      for(int i =1;i<str.length()-1;i++){
        if(str.charAt(i)=='*'&&str.charAt(i-1)==str.charAt(i+1)){
          str=str.substring(0,i)+str.substring(i+1,str.length());
        }
        
      }
      if(str.charAt(0)=='*'){
        str=str.substring(1,str.length());
      }
      if(str.charAt(str.length()-1)=='*'){
        str=str.substring(0,str.length()-1);
      }
      
      if(str.contains("*")) {
        return false;
      }
      
}

  return true;

}