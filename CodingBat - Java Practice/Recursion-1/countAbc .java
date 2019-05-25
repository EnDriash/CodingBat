Count recursively the total number of "abc" and "aba" substrings that appear in the given string.


countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2

public int countAbc(String str) {
   if(str.length()>2){
      if(str.substring(str.length()-3,str.length()).contains("abc")||str.substring(str.length()-3,str.length()).contains("aba")){
      return countAbc(str.substring(0,str.length()-1)) + 1;
      }
      else{
        return countAbc(str.substring(0,str.length()-1)) + 0;
      }
   }
   else{
     return 0;
   }
}
