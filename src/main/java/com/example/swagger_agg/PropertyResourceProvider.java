package com.example.swagger_agg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Controller
@Primary
public class PropertyResourceProvider implements SwaggerResourcesProvider {
    @Autowired
    private SwaggerServicesConfig config;
   

	@Override
	public List<SwaggerResource> get() {
		 return config.services.stream().map(service -> {
		      SwaggerResource swaggerResource = new SwaggerResource();
		      swaggerResource.setName(service.getName());
		      swaggerResource.setLocation(service.getUrl());
		      swaggerResource.setSwaggerVersion(service.getVersion());
		      return swaggerResource;
		    }).collect(Collectors.toList());
	}
	  
    	  
    	  


}
