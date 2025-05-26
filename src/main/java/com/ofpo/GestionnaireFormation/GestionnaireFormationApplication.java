package com.ofpo.GestionnaireFormation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Point d'entrée principal de l'application Spring Boot "GestionnaireFormation".
 * Cette classe lance l'application et initialise le contexte Spring.
 */
@SpringBootApplication
public class GestionnaireFormationApplication {

	/**
	 * Méthode principale qui démarre l'application Spring Boot.
	 *
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		SpringApplication.run(GestionnaireFormationApplication.class, args);
	}

}
