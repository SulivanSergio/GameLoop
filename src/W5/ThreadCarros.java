package W5;

public class ThreadCarros extends Thread{

	int carros[];
	GameLoop gl = new GameLoop();
	public float position, speed, LinhaChegada;
	
	
	
	public ThreadCarros(int carros[],float speed,float LinhaChegada,GameLoop gl)
	{
		
		this.carros = carros;
		this.speed = speed;
		this.LinhaChegada = LinhaChegada;
		this.gl = gl;
	}
	
	@Override
	public void run( ) {
		
		
		
		
		gl.Start();
		
		
	}
			
	
}
