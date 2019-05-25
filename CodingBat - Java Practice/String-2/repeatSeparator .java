Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.


repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"

public String repeatSeparator(String word, String sep, int count) {
  String a="";
  for(int i=count; i>1; i--){
    a=a+sep+word;
  }
  if(count>0){
  return word+a;
  }
  else{
    return a;
    
  }
}
