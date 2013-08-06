
public class VetorDeLetras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=26;
		char Letra='A';
		char [] Letras = new char [N];
		for (int i=0; i<=N-1; i++){
			Letras[i]=Letra;
			Letra++;
		}
		for (int i=0; i<=N-1; i++){
			System.out.printf("%3c", Letras[i]);
		//System.out.println();	
		}

	}

}
