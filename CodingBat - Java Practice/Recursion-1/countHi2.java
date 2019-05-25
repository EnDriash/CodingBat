Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.


countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0

public int countHi2(String str) {
  if(str.length()>2){
                if(str.substring(str.length()-3,str.length()).contains("xhi")){
                  return countHi2(str.substring(0,str.length()-3)) +0;
                }
              else if(str.substring(str.length()-2,str.length()).contains("hi")){
                  return countHi2(str.substring(0,str.length()-2)) +1;
                }
                else{
                  return countHi2(str.substring(0,str.length()-1)) +0;
                }
  }
  
 else if (str.length()>1){
                if(str.contains("hi")){
                  return 1;
                }
                else{
                  return 0;
                }
  }
else{
  return 0;
}
}
