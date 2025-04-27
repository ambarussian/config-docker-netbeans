/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author utfpr
 */
public class PessoaDao {
    public void cadastrarPessoa(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa (nome) VALUES (?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pessoa.getNome());
            stmt.executeUpdate();
        }
        catch (Exception e) {
                e.printStackTrace();
        }
    }
}
