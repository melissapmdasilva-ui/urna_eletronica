package urna_ele;
import javax.swing.JOptionPane;

public class urnaelet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int quant=0;
		String cand="";
		int n1=0;
		int n2=0;
		int votar;
		int contador=0;
		String con="";
		
		quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos candidatos participarão da disputa?"));
		
		String nomes [] = new String [quant];
		int votos [] = new int [quant];
		
		
		for (int c=0; c < quant; c++) {
				
				nomes [c] = JOptionPane.showInputDialog("Informe o nome dos candidatos que participarão:");
				
				n1++;
				cand = cand +  " " + n1 + "." + nomes  [c];
				
			}
		
		do {
			
			
		
			
			votar = Integer.parseInt(JOptionPane.showInputDialog("Eleitor, escolha o número de seu candidato: "
					+ cand));
			
			votos[votar-1]++;
			
			contador++;
			
	
		
		
		con=JOptionPane.showInputDialog("Continuar votando? (S ou N)");
		}
			
			while (con.equalsIgnoreCase("S")); {
				JOptionPane.showMessageDialog(null, "Votação encerrada.");
				
				for (int c=0; c<quant; c++) {
					JOptionPane.showMessageDialog(null, cand + " "
						+	"O reusltado foi: " + "O candidato " + (c+1) + " teve " + votos[c] + " votos.");
				}
			}
	}

}
