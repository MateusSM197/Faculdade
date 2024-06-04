package com.academy.a3mainproj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.TimeZone;

public class DAO {

    public boolean existesUsuario(Pessoa pessoa) throws Exception {
        String sql = "SELECT * FROM tb_pessoa WHERE usuario = ? AND senha = ?";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, pessoa.getUsuario());
            ps.setString(2, pessoa.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public void alterarSenhaUsuario(Pessoa pessoa) throws Exception {
        String sql = "UPDATE tb_pessoa SET senha = ? WHERE nome = ? AND usuario = ?";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, pessoa.getSenha());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getUsuario());
            ps.execute();
        }
    }

    public void alteraDadosUsuario(Pessoa pessoa) throws Exception {
        String sql = "UPDATE tb_pessoa SET senha = ?, usuario = ? WHERE id = ?";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, pessoa.getSenha());
            ps.setString(2, pessoa.getUsuario());
            ps.setInt(3, pessoa.getId());
            ps.execute();
        }
    }

    public void inserirUsuario(Pessoa pessoa) throws Exception {
        String sql = "INSERT INTO tb_pessoa (nome, senha, idade, peso, altura, sexo, usuario, tipo) VALUES (?,?,?,?,?,?,?, 'usuario');";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getSenha());
            ps.setInt(3, pessoa.getIdade());
            ps.setDouble(4, pessoa.getPeso());
            ps.setDouble(5, pessoa.getAltura());
            ps.setString(6, String.valueOf(pessoa.getSexo()));
            ps.setString(7, pessoa.getUsuario());
            ps.execute();
        }
    }
    
    public void atualizarUsuario(Pessoa pessoa) throws Exception {
        String sql = "UPDATE tb_pessoa SET usuario = ?, senha = ?, nome = ?, idade = ?, peso = ?, altura = ?, sexo = ? WHERE id  = ?";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, pessoa.getUsuario());
            ps.setString(2, pessoa.getSenha());
            ps.setString(3, pessoa.getNome());
            ps.setInt(4, pessoa.getIdade());
            ps.setDouble(5, pessoa.getPeso());
            ps.setDouble(6, pessoa.getAltura());
            ps.setString(7, String.valueOf(pessoa.getSexo()));
            ps.setInt(8, pessoa.getId());
            ps.execute();
        }
    }
    
    public void removerUsuario(Pessoa pessoa) throws Exception {
        String sql = "DELETE FROM tb_pessoa WHERE id = ?";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, pessoa.getId());
            ps.execute();
        }
    }
    
    public Pessoa[] obterUsuario() throws Exception {
        String sql = "SELECT * FROM tb_pessoa";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY); ResultSet rs = ps.executeQuery()) {

            int totalDeUsuarios = rs.last() ? rs.getRow() : 0;
            Pessoa[] pessoa = new Pessoa[totalDeUsuarios];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("id");
                String usuario = rs.getString("usuario");
                String senha = rs.getString("senha");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                Double peso = rs.getDouble("peso");
                Double altura = rs.getDouble("altura");
                char sexo = rs.getString("sexo").charAt(0);
                
                pessoa[contador++] = new Pessoa(id, nome, senha, idade, peso, altura, sexo, usuario);
            }
            return pessoa;
        }
    }
    
    public void inserirHabito(Habitos habito) throws Exception{
        String sql = "INSERT INTO tb_habito (nome, descricao, grau, habilitado) VALUES (?,?,?,?);";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, habito.getNome());
            ps.setString(2, habito.getDescricao());
            ps.setInt(3, habito.getGrau());
            ps.setBoolean(4, habito.getHabilitado());
            ps.execute();
        }
    }
    
    public void atualizarHabito(Habitos habito) throws Exception{
        String sql = "UPDATE tb_habito SET nome = ?, descricao = ?, grau = ?, habilitado = ? WHERE id = ?";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, habito.getNome());
            ps.setString(2, habito.getDescricao());
            ps.setInt(3, habito.getGrau());
            ps.setBoolean(4, habito.getHabilitado());
            ps.setString(5, Integer.toString(habito.getId()));
            ps.execute();
        }
    }
    
    public void removerHabito(Habitos habito) throws Exception{
        String sql = "DELETE FROM tb_habito WHERE id = ?";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, habito.getId());
            ps.execute();
        }
    }
    
    public Habitos[] obterHabitos() throws Exception{
        String sql = "SELECT * FROM tb_habito";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY); ResultSet rs = ps.executeQuery()) {

            int totalDeHabitos = rs.last() ? rs.getRow() : 0;
            Habitos[] habito = new Habitos[totalDeHabitos];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                int grau = rs.getInt("grau");
                boolean habilitado = rs.getBoolean("habilitado");
                
                habito[contador++] = new Habitos(id, nome, descricao, grau, habilitado);
            }
            return habito;
        }
    }
    
    public void inserirAlarme(Alarme alarme) throws Exception{
        String sql = "INSERT INTO tb_timer (fk_habito_id, hora_toque) VALUES (?,?);";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, alarme.getIdHabito());
            ps.setTime(2, Time.valueOf(alarme.getHoraToque()));
            ps.execute();
        }
    }
    
    public void atualizarAlarme(Alarme alarme) throws Exception{
        String sql = "UPDATE tb_timer SET hora_toque = ? WHERE fk_habito_id = ? AND id = ?";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setTime(1, Time.valueOf(alarme.getHoraToque()));
            ps.setInt(2, alarme.getIdHabito());
            ps.setInt(3, alarme.getId());
            ps.execute();
        }
    }
    
    public void removerAlarme(Alarme alarme) throws Exception{
        String sql = "DELETE FROM tb_timer WHERE fk_habito_id = ? AND id = ?";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, alarme.getIdHabito());
            ps.setInt(2, alarme.getId());
            ps.execute();
        }
    }
    
    public Alarme[] obterAlarme(int fk_habito_id) throws Exception{
        String sql = "SELECT id, hora_toque FROM tb_timer WHERE fk_habito_id = ?";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);) {
            ps.setInt(1, fk_habito_id);
            
            ResultSet rs = ps.executeQuery();
            int totalDeAlarmes = rs.last() ? rs.getRow() : 0;
            Alarme[] alarme = new Alarme[totalDeAlarmes];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("id");
                String horaToque = String.valueOf(rs.getTime("hora_toque"));
                
                alarme[contador++] = new Alarme(id, horaToque);
                System.out.println(id +" "+ horaToque);
            }
            return alarme;
        }
    }
    
    public HabitoAlarme[] obterFks() throws Exception{
        String sql = "SELECT * FROM tb_habito_timer";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY); ResultSet rs = ps.executeQuery()) {

            int totalDeFks = rs.last() ? rs.getRow() : 0;
            HabitoAlarme[] fks = new HabitoAlarme[totalDeFks];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                int idHabito = rs.getInt("fk_habito_id");
                int id = rs.getInt("fk_timer_id");
                
                fks[contador++] = new HabitoAlarme(idHabito, id);
            }
            return fks;
        }
    }
}
