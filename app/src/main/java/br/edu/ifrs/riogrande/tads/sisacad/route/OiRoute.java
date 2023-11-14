package br.edu.ifrs.riogrande.tads.sisacad.route;

import spark.Request;
import spark.Response;
import spark.Route;
// sqlite, h2, hsqldb, derby, .. ("mochinho")
// embedded database (banco de dados embutido)
public class OiRoute implements Route {

  @Override
  public Object handle(Request request, Response response) throws Exception {
    
    return "Oi, tudo bem?";

  }
}
