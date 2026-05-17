import com.sun.net.httpserver.HttpsServer;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ServletLife")
public class ServletLife extends HttpServlet
{

// Servlet Lifecycle Step 1: Loading and Instantiation(init) starts here.
// STATIC BLOCK :- Static block executes only once -> when class is loaded into JVM memory.
// This happens before object creation.
static
{
    System.out.println("Servlet is Loaded");
}

// Servlet Lifecycle Step 2: Servlet Object Creation
// CONSTRUCTOR:- executes when servlet object is created by servlet container (Tomcat).
// This also runs only once.
    public class ServletLife()
{
   System.out.println("Servlet Object is Created")''
}

// Servlet Lifecycle Step 3: Request Processing
// SERVICE METHOD:- Handles every http Request
// Whenever browser sends request,this method gets executed.
// request  -> client data ; response -> sends output back to client
    protected void service (HttpServletRequest request , HttpServletResponse response ) {
        System.out.println("Service Method to handel http resquest and response back");
    }

// Servlet Lifecycle Step 4:Servlet Destruction
// destroy() method executes only once before servlet is removed from memory.
// Closing Resources
 public void destroy()
 {

 }

}



