Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"



public String everyNth(String str, int n) {
int index=0;
int loper = 0;
int checks=((str.length()-1)/n)+1;
char[] tab=new char[checks];
for(index=0; index<=str.length(); index=index+n){
  tab[loper]= str.charAt(index);
  loper++;
  if (checks==loper){
    str= new String(tab);
  }
}
return str;
  
}