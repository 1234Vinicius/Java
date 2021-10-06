
public class Video implements AcoesVideo{
		
	
		private String titulo;
		private int avalia��o;
		private int curtidas;
		private int view;
		private boolean reproduzindo;
		
		
		
		
		
	
	

	public Video(String titulo) {
			
			this.titulo = titulo;
			this.avalia��o = 1;
			this.view = 0;
			this.curtidas = 0;
			this.reproduzindo = false;
		}

	
	
	
	public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getAvalia��o() {
			return avalia��o;
		}

		public void setAvalia��o(int avalia��o) {
			this.avalia��o = avalia��o;
		}

		public int getCurtidas() {
			return curtidas;
		}

		public void setCurtidas(int curtidas) {
			this.curtidas = curtidas;
		}

		public int getView() {
			return view;
		}

		public void setView(int view) {
			this.view = view;
		}

		public boolean getReproduzindo() {
			return reproduzindo;
		}

		public void setReproduzindo(boolean reproduzindo) {
			this.reproduzindo = reproduzindo;
		}

	@Override
	public void play() {
		this.reproduzindo = true;
		
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
		
	}

	@Override
	public void like() {
		this.curtidas ++;
		
	}




	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avalia��o=" + avalia��o + ", curtidas=" + curtidas + ", view=" + view
				+ ", reproduzindo=" + reproduzindo + "]";
	}



 
	
	
	
	

}
