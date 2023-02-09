import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public static void main(String[] args) {  
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
    Date date = new Date();  
    System.out.println(formatter.format(date));  
}  
