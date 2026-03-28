package controler;


import dao.CadastrosUsersDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.CadastroUsuarioModel;

@WebServlet("/cadastro")
public class CadastroController extends HttpServlet{
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        CadastroUsuarioModel user = new CadastroUsuarioModel();
            user.setNome(request.getParameter("namefist"));
            user.setNome(request.getParameter("sobrenome"));
            user.setNome(request.getParameter("matricula"));
            user.setNome(request.getParameter("cpf"));
            user.setNome(request.getParameter("date"));
            user.setNome(request.getParameter("email"));
            user.setNome(request.getParameter("usuario"));
            user.setNome(request.getParameter("senha"));
            
            CadastrosUsersDAO dao = new CadastrosUsersDAO();
         
            if(dao.cadastrar(user)){
                response.sendRedirect("pages/dashboard.html");
            }
            
        }
}
    

