package W5;

public class GameLoop {
	
	
	float position = 0;
	float speed = 10.0f;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameLoop gl = new GameLoop();
		gl.Start();
		
	}
	
	
	public void Input()
	{
		
	}
	
	public void Update(float deltaTime)
	{
		
		position = position + speed * deltaTime;
		
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
