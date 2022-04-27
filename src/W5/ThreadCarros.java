package W5;

public class ThreadCarros extends Thread{

	int carros[];
	
	float position, speed, LinhaChegada;
	
	int i;
	
	public ThreadCarros(int carros[],float speed,float LinhaChegada, int i)
	{
		
		this.carros = carros;
		this.speed = speed;
		this.LinhaChegada = LinhaChegada;
		this.i = i;
	}
	
	@Override
	public void run( ) {
		
		Start();
		
		
		
	}
			
	private void Start()
	{
		
		float deltaTime = 0;
		
		while(true)
		{
			
			long start = System.currentTimeMillis();
			
			Update(deltaTime);
			Render();
			
			long end = System.currentTimeMillis();
			deltaTime = (float) (end - start)/ 1000.0f;
			
			if (position > LinhaChegada)
			{
				System.out.println("Carro_0" + carros[i] + "      Metros que ele percorreu: " + position);
				return;
			}
			
		}
		
		
	}
	
	private void Update(float deltaTime)
	{
		
		position = position + speed * deltaTime;
		//System.out.println(position);
	
	}
	
	public void Render()
	{
		
		
		
	}

}
