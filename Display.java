public class Display{
    
    //Inst Vars

    public String[][] gridDis;
    public int flippedVal;
    

    private String[] ALPHABET={
    "A","B","C","D","E","F","G","H","I","J","K","L","M",
    "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
    };

    
    //default constructor
    public Display(){
        gridDis = new String[5][5];
       
    }

 

  //populates gridDis with letters of alphabet
    public void populate(){
    int alphaIndex = 0;
    for (int i = 0; i < gridDis.length; i ++){
        for (int u = 0; u < gridDis[1].length; u ++){
            gridDis[i][u] = ALPHABET[alphaIndex];
        alphaIndex ++;
        }
    }
    }
    
    
    //return the "x" (row) val of a letter in the grid
    public int findR(String letter) {
    for (int r = 0; r < 6; r ++){
        for (int c = 0; c < 6; c ++){
                if (letter == this.gridDis[r][c]) {
                    return r;
        }
        }
    }
    return 0;
    }
    
    
    //return the "y" (row) val of a letter in the grid
    public int findC(String letter) {
       for (int r = 0; r < 6; r ++){
        for (int c = 0; c < 6; c ++){
                if (letter == this.gridDis[r][c]) {
                    return c;
        }
        }
       }
       return 0;
    }
              
    
    // TO BE CHANGED TO PRINT THE GRID AND POINTS AND TOPHERS
    //prints the grid
    public void printAll(){
        System.out.println("----------");   
        for(String[] r :gridDis){
     
            for (String x: r){
                System.out.print(x + " ");
                
            }
            System.out.println(""); 
        }
        System.out.println("----------");
    }

    
   
    
    
    public void multiplier(){
        Woo.pointCtr = Woo.pointCtr*flippedVal;
    }

    
}
