package ejercicio_patrones;

import java.io.FileReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

class filtered_text {


	public static void main (String args[]){
		file_not_filtered("./ejercicio_patrones/test_file.txt");
		file_words_just_t("./ejercicio_patrones/test_file.txt");
		file_words_five_characters("./ejercicio_patrones/test_file.txt");
		file_words_palindrome("./ejercicio_patrones/test_file.txt");
	}

	public static void file_not_filtered (String url) {
		Scanner in = null;
		File file = null;
        PrintWriter pw = null;
        file = new File("./ejercicio_patrones/test_file_not_filtered.txt");
		try{
			in = new Scanner (new FileReader(url));
			FileWriter writer = new FileWriter(file);
			BufferedWriter bwriter = new BufferedWriter(writer);
			PrintWriter pwriter = new PrintWriter(bwriter);
			while(in.hasNext()){
				String word = in.next();
				pwriter.println(word);
			}
			bwriter.close();
			pwriter.close();
		}catch(FileNotFoundException e){
				e.printStackTrace();
				System.out.println("Error abriendo el fichero" + url);
			}catch(IOException e2){
				e2.printStackTrace();
			}finally{
				if (in!=null){
					in.close();
				}
			}
		}


	public static void file_words_just_t (String url) {
		Scanner in = null;
		File file = null;
        PrintWriter pw = null;
        file = new File("./ejercicio_patrones/test_file_words_just_t.txt");
		try{
			in = new Scanner (new FileReader(url));
			FileWriter writer = new FileWriter(file);
			BufferedWriter bwriter = new BufferedWriter(writer);
			PrintWriter pwriter = new PrintWriter(bwriter);
			while(in.hasNext()){
				String word = in.next();
				if(word.charAt(0)=='t'){
					pwriter.println(word);
				}
				
			}
			bwriter.close();
			pwriter.close();
		}catch(FileNotFoundException e){
				e.printStackTrace();
				System.out.println("Error abriendo el fichero" + url);
			}catch(IOException e2){
				e2.printStackTrace();
			}finally{
				if (in!=null){
					in.close();
				}
			}
		}

	public static void file_words_five_characters (String url) {
		Scanner in = null;
		File file = null;
        PrintWriter pw = null;
        file = new File("./ejercicio_patrones/file_words_five_characters.txt");
		try{
			in = new Scanner (new FileReader(url));
			FileWriter writer = new FileWriter(file);
			BufferedWriter bwriter = new BufferedWriter(writer);
			PrintWriter pwriter = new PrintWriter(bwriter);
			while(in.hasNext()){
				String word = in.next();
				if(word.length()==5){
					pwriter.println(word);
				}
				
			}
			bwriter.close();
			pwriter.close();
		}catch(FileNotFoundException e){
				e.printStackTrace();
				System.out.println("Error abriendo el fichero" + url);
			}catch(IOException e2){
				e2.printStackTrace();
			}finally{
				if (in!=null){
					in.close();
				}
			}
		}

		public static void file_words_palindrome (String url) {
		Scanner in = null;
		File file = null;
        PrintWriter pw = null;
        file = new File("./ejercicio_patrones/file_words_palindrome.txt");
		try{
			in = new Scanner (new FileReader(url));
			FileWriter writer = new FileWriter(file);
			BufferedWriter bwriter = new BufferedWriter(writer);
			PrintWriter pwriter = new PrintWriter(bwriter);
			while(in.hasNext()){
				String word = in.next();
				StringBuilder builder = new StringBuilder(word);
				String word_reverse = builder.reverse().toString();
				if(word_reverse.equals(word)){
					pwriter.println(word);
				}
				
			}
			bwriter.close();
			pwriter.close();
		}catch(FileNotFoundException e){
				e.printStackTrace();
				System.out.println("Error abriendo el fichero" + url);
			}catch(IOException e2){
				e2.printStackTrace();
			}finally{
				if (in!=null){
					in.close();
				}
			}
		}
	}

