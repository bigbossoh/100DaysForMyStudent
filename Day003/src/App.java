
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

    // we want to create a cron to wrote every two seconds the current time

    //for that we will create first static scheduler 
    private  final ScheduledExecutorService scheduledExecutorService=Executors.newSingleThreadScheduledExecutor();
    public static void main(String[] args) throws Exception {
        System.out.println("Il programme commence maintenant, ");

        var day003 =new App();
        day003.afficherHeureTouteLesDeuxSecond();
        //Thread.sleep(1_000);
        day003.ArreterExecutorDUCron();
    }

    public void afficherHeureTouteLesDeuxSecond(){
            Runnable task= new Runnable() {
                public void run(){
                    System.out.println(LocalDateTime.now());
                }
            };
            scheduledExecutorService.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);

             
    }

    public void ArreterExecutorDUCron(){
        scheduledExecutorService.shutdown();

    }
}
