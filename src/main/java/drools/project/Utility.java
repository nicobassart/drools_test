package com.ablehealth;

import org.drools.core.spi.KnowledgeHelper;

import com.ablehealth.model.ClinicalActivity;

public class Utility {
   public static void help(final KnowledgeHelper drools, final String message){
      System.out.println(message);
      System.out.println("\nrule triggered: " + drools.getRule().getName());
   }
   public static void helper(final KnowledgeHelper drools, String rule){
	  
      System.err.println("Cantidad de Facts: " + drools.getKnowledgeRuntime().getFactHandles().size() + " Rule: "+ rule + " Activation: " + drools.getMatch().getActivationNumber() + " Variable: " + drools.getMatch().getDeclarationIds().toString());
      drools.getMatch().getDeclarationIds().toString();
      for (String iterable_element :  drools.getMatch().getDeclarationIds()) {
    	  Object object = drools.getMatch().getDeclarationValue(iterable_element);
    	  if( object instanceof ClinicalActivity) {
    		  ClinicalActivity clinical = (ClinicalActivity)object;
		//Here put your code
    		  System.out.println(clinical.toString());
    	  }
		
	}
      //drools.getMatch().getDeclarationValue("$prueba2")
      if ( drools.getMatch().getActivationNumber() == 140949 && ("exlusion3").equals(rule)) {
    	  	System.out.println("error");
    	  	//con esto podemos determinar las variables del string
    	  	drools.getMatch().getDeclarationIds().toString();
    	  	//drools.getMatch().getDeclarationValue("$prueba2")
      }
   }
}
