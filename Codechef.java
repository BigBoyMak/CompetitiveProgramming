import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		// StringTokenizer st = new StringTokenizer(br.readLine()); 
		// int n = Integer.parseInt(st.nextToken()); 
		// int k = Integer.parseInt(st.nextToken()); 

		//input logic
		Queue<Processor> queue = new LinkedList<>();
		
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
		    //read each test case input
		    //process input and add to processor class
		    queue.add(new Processor());
		}
		
		while(!queue.isEmpty()){
		    Processor curr = queue.poll();
		    System.out.println(curr.getResult());
		}
	}
	

}

class Processor{
    //sample input 
    int[] map;
    int[] colours;
    
    Processor(int[] map, int[] colours){
        this.map = map;
        this.colours = colours;
    }
    
    public int getResult(){
        //core logic
        int ans = 0;
	    int prev = -1;
	    for(int i=0; i<colours.length; i++){
	        int currColor = colours[i];
	        int curr = map[currColor];
	        if(prev != curr){
	            ans++;
	        }
	        prev = curr;
	    }
	    return ans;
    }
}
