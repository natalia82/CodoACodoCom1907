public class Discografica {
		private DiscoMusical[] discografia;
		private String nombre;
		private int aniocreacion;
		private int cont=0; // cuenta los elementos utilizados. Es distinto del tamaño que le definimos.

		public Discografica(int tamanio, String n, int anio) {
			discografia = new DiscoMusical [tamanio];
			nombre = n;
			aniocreacion = anio;
			
			}

		public boolean agregarDisco (DiscoMusical disco) {
			boolean resultado = false;
			if (!(cont > discografia.length)) {
				discografia[cont]=disco;
				cont++;
			    resultado = true;
			}
		return resultado;
		}
			
		public DiscoMusical buscarDisco(String autor) {
			boolean noExiste = true;
			int i = 0;
			do {
				if (autor.equalsIgnoreCase(discografia[i].getAutor())) {
					noExiste = false;	
				}
			} while(i<discografia.length && noExiste);
			return discografia[i];
		}
			
		/*public DiscoMusical buscarDisco(String titulo, String autor, int anioEdicion) {
			
			}*/
			
		public String toString() {
			DiscoMusical disco;
			String texto="";
			for (int i = 0; i < discografia.length; i++) {
			disco = discografia[i];
			texto += disco.toString() + "\n";
			}
			return texto;
        }	   
}

