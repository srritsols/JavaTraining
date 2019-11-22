package exceptions.practice.khushi;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NumberException {
	
	public static void main (String[] args) throws FileNotFoundException, IOException {
		try {
			numException(3);
			numException(-4);
		}catch(FileNotFoundException e) {
			System.out.print(e.getMessage());

		}catch (IOException e1) {
			System.out.println(e1.getMessage());
		}finally {
			System.out.println("Remove unused object");
		}
		
	}
	public static void numException(int i) throws FileNotFoundException, IOException{
		if(i<10) {
			FileNotFoundException exception =new FileNotFoundException("this is a negative value");
			throw exception;
		}else if (1>10) {
			throw new IOException("it is a positive value");
		}
	}

}
