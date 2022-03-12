import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class spotifyplaylist {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<String> Acoustic = new ArrayList<>();
		ArrayList<String> Instrumental = new ArrayList<>();
		ArrayList<String> Rock = new ArrayList<>();
		ArrayList<String> Rap = new ArrayList<>();
		ArrayList<String> Jazz = new ArrayList<>();
		ArrayList<String> Pop = new ArrayList<>();
		File file = new File("/home/bora/Downloads/tracks.txt");
		Scanner scan = new Scanner(file);
		String fileContent = "";
		ArrayList<String> lines = new ArrayList<>();
		
		while(scan.hasNextLine()) {
			lines.add(fileContent);
			fileContent = fileContent.concat(scan.nextLine() + "\n");
			//String[] lines = new String[fileContent.split("\n").length];
			//String[] lines2 = {fileContent.split("\n")};
			
			
			
		}
		String[] fileContent2 = fileContent.split("\n");
		System.out.println(Arrays.toString(fileContent2));

		int i;
		for(i=0; i<fileContent2.length; i++) {
			System.out.println(fileContent2[i].charAt(0));
			if(fileContent2[i].charAt(0) == '1') {
				Acoustic.add(fileContent2[i]);
				System.out.println("yes");
				
			}
	

		}
		System.out.println(Acoustic);
		
	}


}
