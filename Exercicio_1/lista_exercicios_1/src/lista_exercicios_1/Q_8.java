package lista_exercicios_1;

class reprodutorDeMusica {
	String musicaTocando,artista,album,status;
	int ano;
	
	void tocarMusica(String musica, String artista, String album) {
		this.musicaTocando = musica;
		this.artista = artista;
		this.album = album;
		this.status = "Play";
	}
	
	void playMusic() {
		this.status = "Play";
	}
	
	void pauseMusic() {
		if(status!="Stop")
			this.status = "Pause";
	}
	
	void stopMusic() {
		this.status = "Stop";
	}
	
	void status() {
		System.out.println(this.status);
	}
	
	void infoRep () {
		System.out.println("Música : "+this.musicaTocando+"\nArtista/Banda : "+this.artista+"\nAlbum : "+this.album+"\nStatus : "+this.status);
	
	}
}

public class Q_8 {

	public static void main(String[] args) {
		reprodutorDeMusica vlc = new reprodutorDeMusica();
		vlc.tocarMusica("Shiver", "COldplay", "X&Y");
		vlc.stopMusic();
		vlc.pauseMusic();
		vlc.status();
		vlc.infoRep();

	}

}
