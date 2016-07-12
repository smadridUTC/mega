package controllers;

import java.util.List;

import models.Usuario;
import play.mvc.*;

public class retrinsion_pagina extends Application {

	 @Before
	    static void checkUser() {
	        if(connected() == null) {
	            flash.error("Please log in first");
	            Application.index();
	        }
	    }
	    
	

		    
	   
	    }

