/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.RecemNascido;
/**
 *
 * @author Administrador
 */
public class DaoRecemNascido {
    public static boolean inserir(RecemNascido objeto) {
        String sql = "INSERT INTO recemnascido (sexo, n_quarto, peso, nome_mae) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getSexo());
            ps.setInt(2, objeto.getN_quarto());
            ps.setDouble(3, objeto.getPeso());
            ps.setString(4, objeto.getNome_mae());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
     public static void main(String[] args) {
        RecemNascido objeto = new RecemNascido();
        objeto.setSexo("f");
        objeto.setN_quarto(23);
        objeto.setPeso(2.55);
        objeto.setNome_mae("maria");
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
      public static boolean alterar(RecemNascido objeto) {
        String sql = "UPDATE recemnascido SET sexo = ?, n_quarto = ?, peso = ?,nome_mae = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getSexo()); 
            ps.setInt(2, objeto.getN_quarto());
            ps.setDouble(3, objeto.getPeso());
            ps.setString(4, objeto.getNome_mae());
            ps.setInt(5, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
      public static boolean excluir(RecemNascido objeto) {
        String sql = "DELETE FROM recemnascido WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
