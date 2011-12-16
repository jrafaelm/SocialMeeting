package com.socialmeeting;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;

import com.socialmeeting.domain.Usuario;
import com.socialmeeting.domain.product.Editions;
import com.socialmeeting.domain.product.ProductFactory;
import com.socialmeeting.properties.AppProperties;

public class SocialMeetingActivity extends Activity {
	
	private ProductFactory productFactory;
	private EditText edtLogin;
	private EditText edtSenha;
	private SharedPreferences preferences;
	private Editor editor;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        productFactory = new ProductFactory();
        edtLogin = (EditText) findViewById(R.id.editText1);
        edtSenha = (EditText) findViewById(R.id.editText2);
        
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        
    }
    
    public void btnLogarClick(View v) {
    	
    	login(); 
    	
    }
    
    private void login() {
    	Usuario usuario = new Usuario();
    	usuario.setLogin(edtLogin.getText().toString());
    	usuario.setSenha(edtSenha.getText().toString());
    	
    	editor = preferences.edit();
        
		
		
    	if (usuario.getSenha().equals("demonstration")) {
    		editor.putString(AppProperties.EDITION, Editions.DEMONSTRATION.name());
        		
		}
    	else if (usuario.getSenha().equals("enterprise")) {
    		editor.putString(AppProperties.EDITION, Editions.ENTERPRISE.name());
        }
    	else if (usuario.getSenha().equals("personal")) {
    		editor.putString(AppProperties.EDITION, Editions.PERSONAL.name());
        }
		editor.commit();
		Intent i = new Intent(this, MeetingListActivity.class);
		i.putExtra("usuario", usuario);
		startActivity(i);
		
    }
    
}