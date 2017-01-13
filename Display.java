public class Display{
 
    //Inst Vars

    private String[][] gridDis;
    private int[][] pointsDis;
    private int[][] tophersDis;
    private int flippedVal;

    private static String[] ALPHABET={
	"A","B","C","D","E","F","G","H","I","J","K","L","M",
	"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
    };

    
    //default constructor
    public Display(){
        String[][] gridDis = new String[5][5];
        int alphaIndex = 0;
	int[][] pointsDis = new int[2][5];
        int[][] tophersDis = new int[2][5];
    }

    //populates gridDis with letters of alphabet
    public void populate(){
	int alphaIndex = 0;
	for (String[] r : gridDis) {
	    for (String c : r) {
		c = ALPHABET[ alphaIndex ];
		alphaIndex += 1;
	    }
	}
    }

    //prints the grid
    public void printGrid(){
	for(String[] i : gridDis)
	    {
		for (String x: i){
		    System.out.println(x);
		}
		System.out.print("\n");	
	    }
	
    }

    //copies a meaningful value from class Values into Display to be displayed
    //simulates a flip
    public void transcribe(Values grid, int x, int y){
	String s = "" + Values.getValue(x, y);
	gridDis[x][y] = s;
	flippedVal = Values.getValue(x,y);
    }
    
    public void multiplier(){
        Woo.pointCtr = Woo.pointCtr*flippedVal;
    }
    

    
 
}
