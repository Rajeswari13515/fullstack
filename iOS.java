public class iOS{
public void startApp(){
System.out.println("Added Startup");}
public void increaseVolume(){
System.out.println("Added IncreaseVolume");}
public void shutdown(){
System.out.println("Added Shutdown");}
public static void main(String[] args) {
		iOS set=new iOS();
		set.startApp();
		set.increaseVolume();
                set.shutdown();
	}
	
}

