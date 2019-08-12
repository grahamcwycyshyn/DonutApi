package co.grandcircus.DonutApi.service;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import co.grandcircus.DonutApi.entity.Details;
import co.grandcircus.DonutApi.entity.Result;
import co.grandcircus.DonutApi.entity.ResultResponse;

@Component
public class ApiService {
	
private RestTemplate restTemplate = new RestTemplate();
	
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public List<Result> getResults() {
		String url = UriComponentsBuilder.fromHttpUrl("https://grandcircusco.github.io/demo-apis/donuts.json").toUriString();
		ResultResponse response = restTemplate.getForObject(url, ResultResponse.class);
		List<Result> results = response.getResults();
		return results;
	}
	
	public Details getDetails(Long id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		Details response = restTemplate.getForObject(url, Details.class);
		return response;
	}
}
