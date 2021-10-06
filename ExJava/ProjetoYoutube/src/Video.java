
public class Video implements AcoesVideo{
		
	
		private String titulo;
		private int avaliação;
		private int curtidas;
		private int view;
		private boolean reproduzindo;
		
		
		
		
		
	
	

	public Video(String titulo) {
			
			this.titulo = titulo;
			this.avaliação = 1;
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

		public int getAvaliação() {
			return avaliação;
		}

		public void setAvaliação(int avaliação) {
			this.avaliação = avaliação;
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
		return "Video [titulo=" + titulo + ", avaliação=" + avaliação + ", curtidas=" + curtidas + ", view=" + view
				+ ", reproduzindo=" + reproduzindo + "]";
	}



 
	
	
	
	

}
