package servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class TesteServlet extends HttpServlet   {
	public void doGet(HttpServletRequest request, HttpServletResponse
		      response) throws ServletException, IOException {

	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.print("<html> " + 
	    		"  <head> " + 
	    		"    <title> Formulario do Gato</title> " + 
	    		"  </head> " + 
	    		"  <body> " + 
	    		"    <h1> " + 
	    		"      Preencha os dados do gato abaixo " + 
	    		" <form method=\"post\"> "+
	    		"    </h1> " + 
	    		"    <table> " + 
	    		"            <thead> " + 
	    		"                <tr> " + 
	    		"                    <th> " + 
	    		"                        <b>Nome do Gato</b> " + 
	    		"                    </th> " + 
	    		"                    <th> " + 
	    		"                        <input required type=\"text\" value=\"\"> " + 
	    		"                    </th>     " + 
	    		"                </tr> " + 
	    		"                <tr> " + 
	    		"                    <th> " + 
	    		"                        <b>Peso do Gato</b> " + 
	    		"                    </th> " + 
	    		"                    <th> " + 
	    		"                        <input type=\"text\" value=\"\"> " + 
	    		"                    </th> " + 
	    		"                </tr> " + 
	    		"                <tr> " + 
	    		"                    <th><b>Sexo do Gato</b></th> " + 
	    		"                    <th> " + 
	    		"                		<select> " + 
	    		"                      		<option>Macho</opition> " + 
	    		"                           	<option>Fêmea</option> " + 
	    		"                		</select> " + 
	    		"                 	</th> " + 
	    		"                </tr> " + 
	    		"                <tr> " + 
	    		"                    <th><b>Idade do Gato</b></th> " + 
	    		"                    <th><input type=\"number\" value=\"\"></th> " + 
	    		"                </tr> " + 
	    		"                <tr> " + 
	    		"                    <th><b>Fase da vida do Gato</b></th> " + 
	    		"                   <th> " + 
	    		"                		<select> " + 
	    		"                      		<option>Filhote</opition> " + 
	    		"                           	<option>Adulto</option> " + 
	    		"                		</select> " + 
	    		"                 	</th> " + 
	    		"                </tr> " + 
	    		"              	<tr> " + 
	    		"                    <th><b>Raça</b></th> " + 
	    		"                    <th><input type=\"text\" value=\"\"></th> " + 
	    		"                </tr> " + 
	    		"              <tr> " + 
	    		"                    <th><b>Tomou Antirabica</b></th> " + 
	    		"                    <th> " + 
	    		"                		<select> " + 
	    		"                      		<option>Sim</opition> " + 
	    		"                           	<option>Não</option> " + 
	    		"                		</select> " + 
	    		"                 	</th> " + 
	    		"                </tr> " + 
	    		"              <tr> " + 
	    		"                    <th><b>Castrado?</b></th> " + 
	    		"                    <th> " + 
	    		"                		<select> " + 
	    		"                      		<option>Sim</opition> " + 
	    		"                           	<option>Não</option> " + 
	    		"                		</select> " + 
	    		"                 	</th> " + 
	    		"                	 " + 
	    		"                </tr> " + 
	    		"                <tr> " + 
	    		"                     <th><input type=\"text\"  disabled  value=\"Nome do Dono\"></th> " + 
	    		"                </tr><tr> " + 	
	    		"                		<th><button type=\"submit\">Enviar</button></th> " + 
	    		"                		<th><button type='reset'>Limpar Campos</button></th> " + 
	    		"                </tr> " + 
	    		"            </thead> " + 
	    		"        </table> " + 
	       		"	</form>"+
	    		"  </body> " + 
	    		"</html>");
	}
	//TODO disfazer se der merda 
	public void doPost(HttpServletRequest request, HttpServletResponse
		      response) throws ServletException, IOException {

	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
	    out.print("OIA");
	    out.print(""+
	    		  ""+
	    		  "");
	    		 
	}
	
}
