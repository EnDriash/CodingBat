Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.


countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1

public int countHi(String str) {
    if(str.length()>1){
        if(str.charAt(str.length()-1)=='i'&&str.charAt(str.length()-2)=='h'){
              return countHi(str.substring(0,str.length()-1)) + 1;
            }
         else{
               return countHi(str.substring(0,str.length()-1)) +0;
            }
       
  }
  else{
    return 0;
  }
}
