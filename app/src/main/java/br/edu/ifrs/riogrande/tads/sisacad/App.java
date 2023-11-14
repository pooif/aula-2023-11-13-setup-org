package br.edu.ifrs.riogrande.tads.sisacad;

import org.apache.commons.lang3.StringUtils;

import br.edu.ifrs.riogrande.tads.sisacad.route.OiRoute;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

public class App {
    public static void main(String[] args) {
        // System.out.println("Funciona!");
        // // Levenstein Distance
        // String a = "pato";
        // String b = "pata";

        // int distance = StringUtils.getLevenshteinDistance(a, b);
        
        // System.out.println(distance);

        // http://localhost:4567/oi
        // abstrato = new concreto
        Spark.port(8080); // <= 1024 portas privilegiadas (portas admin)

        Route oi = new OiRoute();

        Spark.get("/oi", oi);
        Spark.get("/ola", oi);
    }
}
