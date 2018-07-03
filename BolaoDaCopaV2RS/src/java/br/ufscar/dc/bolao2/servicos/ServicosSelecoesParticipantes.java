/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.bolao2.servicos;

import br.ufscar.dc.bolao2.dao.SelecoesDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Andre
 */
@Stateless
@Path("selecoesParticipantes")
public class ServicosSelecoesParticipantes {

    @Inject
    SelecoesDAO selecoesDAO;

    /**
     * Retrieves representation of an instance of br.ufscar.dc.bolao2.servicos.ServicosSelecoesParticipantes
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSelecoesParticipantes() {
        simularDemora();
        try {
            return Response.ok(selecoesDAO.getSelecoes()).build();
        } catch (SQLException ex) {
            Logger.getLogger(ServicosSelecoesParticipantes.class.getName()).log(Level.SEVERE, null, ex);
            return Response.serverError().build();
        }
    }
    
    private void simularDemora() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ServicosPalpite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
