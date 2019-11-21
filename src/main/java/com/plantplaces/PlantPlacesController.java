package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlantPlacesController {

	@RequestMapping("/start")
	public String start()
	{
		return "start";
	}
	
	@RequestMapping("/")
	public String index1()
	{
		return "start";
	}
}
