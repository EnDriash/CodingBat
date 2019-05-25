Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"

public String starOut(String str) {
 String end="";
 
for(int i=0;i<str.length();i++){
  if(str.charAt(i)=='*'){
    
    if(i!=0&&i!=str.length()-1){
      end=end.substring(0,end.length()-1);
      i++;
          if(str.charAt(i)=='*'){
              while(str.charAt(i)=='*'){
                i++;
              }
          }
      
    }
    else if(i==0){
      i=i+1;
    }
    else if(i==str.length()-1){
      end=end.substring(0,end.length()-1);
    }
  }
  else{
    end=end+str.charAt(i);
  }
}

   return end;
}
