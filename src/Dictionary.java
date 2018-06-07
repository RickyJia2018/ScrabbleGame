import java.io.*;
public class Dictionary {
	
	public  String[]words;
	public int size;
	public Dictionary(int size) {
		this.size=size;
		this.words= new String[size];
		
	}
	
	public  void fill(String fileName,int num) {
		String inputLine;
		int index=0;
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			while((inputLine=br.readLine())!=null&&index<num) {
				//
				index++;
				
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
			
		}
		
	}


	public boolean search(String word) {
	    return binarySearch(words, 0, words.length-1, word);
	}

	public boolean binarySearch(String[] words, int start, int end, String target) {
	    int middle = (start + end) / 2;
	    if(end < start) {
	        return false;
	    } 

	    if(target==words[middle]) {
	        return true;
	    } else if(target.compareTo(words[middle])<0) {
	        return binarySearch(words, start, middle - 1, target);
	    } else {
	        return binarySearch(words, middle + 1, end, target);
	    }
	}

}
