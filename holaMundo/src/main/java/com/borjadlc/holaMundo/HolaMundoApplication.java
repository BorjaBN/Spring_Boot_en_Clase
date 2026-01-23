package com.borjadlc.holaMundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public void holaMundo {

		@GetMapping("/hola")
		public String holaMundo(
				@RequestParam(name = "nombre", required = false, defaultValue = "Munfo") String nombre,
				Model model){
			model.addAttribute("nombre", nombre);
			return "Hola";
		}
		}




