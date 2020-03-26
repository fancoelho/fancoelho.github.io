package hello;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntradaController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/entrada")
    public Entrada greeting(@RequestParam(value="name", defaultValue="World") String name) throws URISyntaxException, IOException {
    	
//    	HttpPost post = new HttpPost(builder.build());
    	HttpClient httpClient = HttpClientBuilder.create().build();
//    	JSONObject json = new JSONObject();
//    	json.put("command", "put");
//    	json.put("key", "animal");
//    	json.put("payload", "{\"name\":Tarzan}");
    	
    	try {
    		

    	    HttpPost request = new HttpPost("http://localhost:2222/");
    	    StringEntity params =new StringEntity("{\"command\": put, \"key\": animal, \"payload\": {\"name\": tarzan}}");
    	    request.addHeader("content-type", "application/x-www-form-urlencoded");
    	    request.setEntity(params);
    	    HttpResponse response = httpClient.execute(request);
    	    Header[] head = response.getAllHeaders();

    	    //handle response here...

    	}catch (Exception ex) {

    	    //handle exception here

    	} 
        return new Entrada(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
