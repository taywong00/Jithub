public class Woo {
    // public static int level = 1;
    public static int pointCtr = 1;
    private static Display foo;
    private static Values boo;
    private static boolean flippedTopher = false;
    
    //NOTE: display method has methods to find x and y of a letter in the display grid 
    
    //flip method
    public static void flip(String letter) {
        //find the coordinatyes of the letter;
	
        int letterR = foo.findR(letter);
	int letterC = foo.findC(letter);
	
	//System.out.println("======" + foo.findR(letter));
	//System.out.println("======" + foo.findC(letter));
        
        //get new number from boo (values)
        
        int newNumVal = boo.gridVal[letterR][letterC];
        
        //check to see if you flipped a topher!
        if (newNumVal == 0) {
            foo.gridDis[letterR][letterC] = "" + newNumVal;
            flipAll();
            flippedTopher = true;
        }
        else {
            //put the regular newNumVal where the letter was (and thats it)
            foo.gridDis[letterR][letterC] = "" + newNumVal;
        }
        
        
    }
    
    //occurs when you flip a topher
    //basically just set the gridDis to gridVal
    public static  void flipAll() {
       
    for (int r = 0; r < 5; r ++){
        for (int c = 0; c < 5; c ++){
        foo.gridDis[r][c] = "" + boo.gridVal[r][c];
        }
    }
    }
    
    
    

        //convert the 0s to @'s for topher
    public static  void toTopher() {
        for (int r = 0; r < 5; r ++){
        for (int c = 0; c < 5; c ++){
                if (foo.gridDis[r][c] == "0") {
                    foo.gridDis[r][c] = "@";
                }
            }
        }
    }
    
    
    public static void playTurn(){
        System.out.println("Enter a letter coordinate that's shown above:");
        String letter = Keyboard.readString().toUpperCase();
	
        System.out.println(letter);
    
        System.out.println("What do you want to do with it?");
        System.out.println("1. Flip it!");
        System.out.println("2. Take notes...");
        int choice = Keyboard.readInt();
    System.out.println(boo.allNotes);
    
        
        if (choice == 1){
	    flip(letter);
	   
            toTopher();
	    foo.printAll();
	    
            //regular continue of gameplay
	    /*
            if (flippedTopher == false) {
                System.out.println("Here's what your grid looks like after you flipped " + letter + ":\n");
                foo.printAll();
            }
            else {
                System.out.print("Oh no! Looks like you flipped a Topher!");
                foo.printAll();
            }
	    */
            
        }
        else{
        takeNotes(letter);
        }
     }

    //====================
            //takeNotes
    public static void takeNotes(String letter){
    System.out.println("Please enter your notes for " + letter);
    String notes = Keyboard.readString();
    //System.out.println(notes);
    boo.allNotes += letter + ": " +  notes;
    
    }
    //====================
       
           
    public static void main(String[] args){
    
        //Display
        foo = new Display();
        foo.populate();
        foo.printAll();
	


        //Value
    
        boo = new Values();
            
        boo.popLineVal();

        boo.popGridVal();

	playTurn();
          //actual game playing
        while (flippedTopher = false) {
            playTurn();
        }
        
     
           
    }
}
