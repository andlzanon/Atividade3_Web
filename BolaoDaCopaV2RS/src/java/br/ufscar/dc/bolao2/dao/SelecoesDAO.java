/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.bolao2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.sql.DataSource;

/**
 *
 * @author Andre
 */
@RequestScoped
public class SelecoesDAO {
    
    private final static String SQL_SELECOES_PARTICIPANTES =
            "select nome from selecoes";
    
    @Resource(name = "jdbc/Bolao2DBLocal")
    DataSource dataSource;
    
    public List<String> getSelecoes() throws SQLException{
        List<String> selecoes = new ArrayList<String>();
        try (Connection con = dataSource.getConnection();
                PreparedStatement ps = con.prepareStatement(SQL_SELECOES_PARTICIPANTES)){
            try (ResultSet rs = ps.executeQuery()) {
                while(rs.next()){
                    String selecao = rs.getString("nome");
                    selecoes.add(selecao);
                }
            }
        }
        selecoes.sort(String::compareToIgnoreCase);
        return selecoes;
    }
}
