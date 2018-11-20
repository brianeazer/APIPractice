package co.apilab.famouslab;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.apilab.famouslab.model.Complete;
import co.apilab.famouslab.model.PeopleResponse;
import co.apilab.famouslab.model.Tiny;


@Component
public class ApiService {
private RestTemplate restTemplateWithUserAgent;

// This is an instance initialization block. It runs when a new instance of the class is created--
// right before the constructor.
{
    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
	// request. Some of the APIs in this demo have a bug where User-Agent is required.
	ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
        return execution.execute(request, body);
	 };
	    restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
}
		public List<Tiny> showTinyList(){
			String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
			
			PeopleResponse response = restTemplateWithUserAgent.getForObject(url, PeopleResponse.class);
			return response.getTiny();
		}
		
		public List<Complete> showCompleteList(){
			String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
			
			PeopleResponse response = restTemplateWithUserAgent.getForObject(url, PeopleResponse.class);
			return response.getComplete();
		}
}