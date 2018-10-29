public class PantryTester3{
    public static void main(String[] args) {
      Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
      Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
      Jam rhub  = new Jam( "Rhubarb", "10/31/99", 16 );
  
      Pantry hubbard = new Pantry( goose, apple );
      System.out.println( hubbard );
  
      if ( hubbard.select(3) )
        hubbard.spread(2);
      else
        System.out.println("Selection not available");
      System.out.println( hubbard );
  
      hubbard.replace( rhub, 2 );
      hubbard.replace( rhub, 3 );
      System.out.println( hubbard );
  
      if ( hubbard.select(3) )
        hubbard.spread(2);
      else
        System.out.println("Selection not available");
      System.out.println( hubbard );
        

      //selection 3 is not available since the pantry object was
      //made with only 2 jars, so replacing the 3rd is not possible
      //since the replace function calls on the select function
      //which doesn't select a null object, which is what jam3 is in
      //the pantry with 2 jams
    }

}