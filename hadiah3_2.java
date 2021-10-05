// Tugas Teori PBO nomor 2
import java.io.*;
class nomor2 {
	public static void main(String arfs[]){
		DataInputStream in = new DataInputStream(System.in);
	
		String nama="";
		String alamat="";
		String umur="";
	
		
		try {
			System.out.print("Nama    :");
			nama= in.readLine();
		}
			catch(IOException e)
			{System.out.println(e);}
		try {
			System.out.print("Alamat  :");
			alamat= in.readLine();
		}
		catch(IOException e)
			{System.out.println(e);}
			
			try {
			System.out.print("Umur    :");
			umur= in.readLine();
		}
		catch(IOException e)
			{System.out.println(e);}
			
			
		
		
	
	System.out.println("Saudara    		: " + (nama));
	System.out.println("Tinggal di jalan: " + (alamat));
	System.out.println ("Berumur   		: " + (umur) + " tahun");
	
	}
	}