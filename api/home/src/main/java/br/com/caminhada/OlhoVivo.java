package br.com.caminhada;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/olhovivo")
public class OlhoVivo {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        
        return "Olá, mundo! eu sou o novo projeto! Vamos caminhar juntos?";
    }
}