
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2


public int last2(String str) {

int x=0;
 
 if(str.length()>1){
   String end=str.substring(str.length()-2);
     for(int e=0;e<str.length()-2;e++){
       if(end.equals(str.substring(e,e+2))){
         x++;
       }
     }
   
 }
    
return x;
}
