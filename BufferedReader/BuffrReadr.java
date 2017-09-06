import static java.lang.System.*;
import java.io.*;

class BufferedReader1 
 {
	public static void main(String[] args)throws Exception
 	{
		out.println("Enter Something");
		
		InputStreamReader x = new InputStreamReader(in);//x does not have readLine() it has only read(). Bufferedreader has readLine() like DataInputStream on top of InputStream. read() methods in both InputStream and InputStreamReader return int, but one reads a byte to make sense and other reads multiplebytes to make sense using specified Charset-class in java API

//read() method in x parses character from underlying byte-input(gives byte as input) stream by using the specified charset. read() returns int corresponding to char,Each invocation of one of an InputStreamReader's read() methods may cause one or more bytes to be read from the underlying byte-input stream. To enable the efficient conversion of bytes to characters, more bytes may be read ahead from the underlying stream than are necessary to satisfy the current read operation. 
		
		BufferedReader y = new BufferedReader(x);

//read() or readLine() method stores the characters from underlying character-input stream(gives character as input)in a buffer for effective reading of characters. each read() request made of a Reader(inputStreamreader) causes a corresponding read request to be made of the underlying character or byte stream.  It is therefore advisable to wrap a BufferedReader around any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders. Without buffering, each invocation of read() or readLine() could cause bytes to be read from the file, converted into characters, and then returned, which can be very inefficient.
		
		String s = y.readLine();// first invocation gets all of the input from the source and stores it in the buffer.
		out.println(s);
		
	}
  }