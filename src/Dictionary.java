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
				/*
				 * for(i<array.length){
				 * 用 str1.compareto(str2) <0 =0/ >0
				 * 找到合适的位置
				 * 	for(j=i; ;j++){
				 * 	吧后面的每一个都往后移一个位置 如果超了array.length 创建一个新的array 把老的copy 
				 * 		
				 * 		
				 * 	
				 * 	}
				 * }
				 * 
				 * 
				 * 
				 * 
				 */
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
