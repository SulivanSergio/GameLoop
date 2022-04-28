package W5;

import java.util.Random;

public class GameLoop {
	
	static final int C = 6;
	static final int T = 6;
	
	
	final int SYNC = 30;
	
	
	
	static int carros[] = new int[C];
	
	static ThreadCarros thread[] = new ThreadCarros[T];
	
	public static void main(String[] args) {
		
		Random random = new Random();
		GameLoop gl = new GameLoop();
		
		for(int i =0; i< C; i++)
		{
			
			carros[i] = i;
			
		}
		
		for(int i = 0; i< T;i++)
		{
			thread[i] = new ThreadCarros(carros,random.nextFloat(5),10f, gl);
			thread[i].start();
			
		}
		
		
		
	}
	
	
	public void Input()
	{
		
	}
	
	public void Update(float deltaTime)
	{
		
		for(int i = 0; i< T;i++)
		{
			
			try
			{
				if(thread[i].isInterrupted() == false)
				{
					thread[i].position += thread[i].speed * deltaTime;
					
					
				}
				
				if (thread[i].position > thread[i].LinhaChegada)
				{
					if(thread[i].isInterrupted() == false)
					{
						
						System.out.println("Carro_0" + carros[i] + "      Metros que ele percorreu: " + thread[i].position);
						thread[i].interrupt();
						//thread[i].stop();
						//thread[i].join();
					}
				}
			}
			
			catch(Exception e)
			{
				System.out.println("Thread ainda não foi criada no GameLoop");
			}
			
			
		}
		
		
		
		
		
	}
	public void FixedUpdate(float fixedDeltaTime)
	{
		
		
	}
	
	public void Render()
	{
		
		
		
	}
	
	
	public void Start()
	{
		float deltaTime = 0;
		
		
		while(true)
		{
			long start = System.currentTimeMillis();
			
			
			
			Input();
			Update(deltaTime);
			
			
			
			Render();
			
			long end = System.currentTimeMillis();
			deltaTime = (float) (end - start)/ 1000.0f;
		
			
			
			
		}
		
		
	}
	
	

}
