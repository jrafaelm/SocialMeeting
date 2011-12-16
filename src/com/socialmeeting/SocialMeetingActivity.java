package com.socialmeeting;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import com.socialmeeting.domain.Edition;
import com.socialmeeting.domain.ProductEdition;
import com.socialmeeting.domain.ProductFactory;
import com.socialmeeting.domain.Usuario;

public class SocialMeetingActivity extends Activity {
	
	private ProductFactory productFactory;
	private EditText edtLogin;
	private EditText edtSenha;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        productFactory = new ProductFactory();
        edtLogin = (EditText) findViewById(R.id.editText1);
        edtSenha = (EditText) findViewById(R.id.editText2);
    }
    
    public void btnLogarClick() {
    	// trocar essa gambi por coisa mais bonita depois.
    	Usuario usuario = new Usuario();
    	gambiarraJediPraLogarNaTora(usuario); 
    	
    	/*
    	* fabricar um produto e fazer alguma coisa com ele 
    	* que nao sei o que eh. Talvez seja mais adequado
    	* usar um command.
    	*/
    	ProductEdition productEdition = productFactory.create(usuario.getEdition());
    }
    
    private Usuario gambiarraJediPraLogarNaTora(Usuario usuario) {
    	usuario.setLogin(edtLogin.getText().toString());
    	usuario.setSenha(edtSenha.getText().toString());
    	
    	if (usuario.getLogin().equals("demonstration")) {
			usuario.setEdition(Edition.DEMONSTRATION);
		}
    	else if (usuario.getLogin().equals("enterprise")) {
			usuario.setEdition(Edition.ENTERPRISE);
		}
    	else if (usuario.getLogin().equals("personal")) {
			usuario.setEdition(Edition.PERSONAL);
		}
    	return usuario;
    }
    
}