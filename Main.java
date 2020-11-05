class Main {
  public static void main(String[] args)
   {
  String[ ] carBrands = {"Toyota", "Honda", "Ford", "Chevy", "Mazda", "Kia", "Jeep", "Saturn", "Subaru"};
   
   for(int i = 0; i < 7; i++){
   System.out.println("The car brand is " + carBrands[i]);
   }
     
  carBrands[6]= "Dodge";

  for(int i = 0; i < 7; i++){ 
    System.out.println( "The update is " + carBrands[i]);
  }
  }  
} 

     
