package com.scrum.evae.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.scrum.evae.metier.model.Enseignant;



public class IndexControllerImpl extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		List<Enseignant> Model = null;
		Map<String, Object> attributes = new HashMap<String, Object>();
		attributes.put("enseignant",Model);
		attributes.put("message", "L'action sur la personne a bien été traitée");
		
		return new ModelAndView("index", attributes);
	}

}
