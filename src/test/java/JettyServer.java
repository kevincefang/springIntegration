import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class JettyServer {
    
    public static void main(String[] args) throws Exception {
        final Server server = new Server(8090);
        WebAppContext webAppContext = new WebAppContext("src/main/webapp", "/weixin");
        webAppContext.setMaxFormContentSize(1024*1024*60);
        server.setHandler(webAppContext);
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                try {
                    server.stop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        server.start();
        server.join();
    }
}
