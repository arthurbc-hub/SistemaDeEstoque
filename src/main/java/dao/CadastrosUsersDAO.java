

package dao;

import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import model.CadastroUsuarioModel;

/**
 *
 * @author 232.999257
 */
public class CadastrosUsersDAO {
   public boolean cadastrar(CadastroUsuarioModel user){
       String sql = "INSERT INTO users" +
               "(username, psw, nome, sobrenome, matricula, cpf, sexo, email, telefone, função, cep, endereço, bairro, cidade, estado, numero, complemento)"+
               "VALUE(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
       try(var con = ConnectionFactory.getConnection()){
          PreparedStatement stmt = con.prepareStatement(sql);
          stmt.setString(1, user.getNome());
          stmt.setString(2, user.getSobrenome());
          stmt.setString(3, user.getCpf());
          stmt.setString(4, user.getSexo());
          stmt.setLong(5, user.getCep());
          stmt.setString(6, user.getEndereço());
          stmt.setString(7, user.getEstado());
          stmt.setString(8, user.getBairro());
          stmt.setString(9, user.getCidade());
          stmt.setLong(10, user.getNumero());
          stmt.setString(11, user.getNomeUsuario());
          stmt.setString(12, user.getSenha());
          stmt.setString(13, user.getFunçao());
        
          stmt.executeUpdate();
          return true;
         
          
       }catch(Exception e){
           e.printStackTrace();
           return false;
       }
   }

    
}
