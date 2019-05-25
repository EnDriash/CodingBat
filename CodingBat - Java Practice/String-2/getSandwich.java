A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""

public String getSandwich(String str) {
 int cf=0;
 int ce=0;
 
 if(str.contains("bread")&&str.length()>4){
   
     for(int i=0;i<str.length();i++){
       
             if(str.substring(i,i+5).equals("bread")){
               cf=cf+5;
               break;
             }
             cf++;
     }
     
      for(int i=str.length();i>0;i--){
      
             if(str.substring(i-5,i).equals("bread")){
              ce=ce+5;
              break;
             }
             ce++;
      }  
    }  
  if(cf<str.length()-ce&&str.contains("bread")){
      return str.substring(cf,str.length()-ce);
    } else{
    return "";
  }
}

