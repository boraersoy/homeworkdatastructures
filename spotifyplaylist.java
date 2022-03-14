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
		int numberoftracks = 0;
		int i;
		int totalduration = 0;
		int k;
		String[][] filecontent3 = new String[85][4];
		for(i=0; i<fileContent2.length; i++) {
			for (k=0; k<=4; k++) {
				filecontent3[i] = fileContent2[i].split(",");

			}
		}
		

		for(i=0; i<fileContent2.length; i++) {
			System.out.println(fileContent2[i].charAt(0));
			if(fileContent2[i].charAt(0) == '1') {
				Acoustic.add(fileContent2[i]);
				numberoftracks++;

				
			}
			else if (fileContent2[i].charAt(0) == '2') {
				Instrumental.add(fileContent2[i]);
				numberoftracks++;


			}
			else if (fileContent2[i].charAt(0) == '3') {
				Rock.add(fileContent2[i]);
				numberoftracks++;

			}
			else if (fileContent2[i].charAt(0) == '4') {
				Rap.add(fileContent2[i]);
				numberoftracks++;

			}
			else if (fileContent2[i].charAt(0) == '5') {
				Jazz.add(fileContent2[i]);
				numberoftracks++;

			}
			else {
				Pop.add(fileContent2[i]);
				numberoftracks++;

			}

		}
		for(i=0; i<85; i++) {
			 
			totalduration += (Integer.parseInt(filecontent3[i][2]));
			

		
	}
		//workingonesmarkedascomment
		//System.out.println(filecontent3);
		//System.out.println(Acoustic);
		//System.out.println(Instrumental);
		//System.out.println(Rock);
		//System.out.println(Rap);
		//System.out.println(Jazz);
		//System.out.println(Pop);
		System.out.println(numberoftracks);
		System.out.println(totalduration/60 + " minutes"  + " " + totalduration%60 + " seconds");
	
		//add remove in bag adt sort by popularity and genres
		
	}


}
