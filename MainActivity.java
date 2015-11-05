package insight.com.br.funfacts;                                                                 
                                                                                                 
import android.app.Activity;                                                                     
import android.os.Bundle;                                                                        
import android.view.Menu;                                                                        
import android.view.MenuItem;                                                                    
import android.view.View;                                                                        
import android.widget.Button;                                                                    
import android.widget.RelativeLayout;                                                            
import android.widget.TextView;                                                                  
import android.widget.Toast;                                                                     
                                                                                                 
public class MainActivity extends Activity {                                                     
                                                                                                 
    private Facts mFactBook = new Facts();                                                       
    private Colors mColorWheel = new Colors();                                                   
                                                                                                 
    @Override                                                                                    
    protected void onCreate(Bundle savedInstanceState) {                                         
        super.onCreate(savedInstanceState);                                                      
        setContentView(R.layout.activity_main);                                                  
                                                                                                 
        //Declare our View variables and asisgn the Views from the layout file                   
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);                   
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);                
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
                                                                                                 
        View.OnClickListener listener = new View.OnClickListener() {                             
            @Override                                                                            
            public void onClick(View v) {                                                        
                                                                                                 
                String fact = mFactBook.getFact();                                               
                                                                                                 
                //Update the label with our dynamic fact                                         
                factLabel.setText(fact);                                                         
                                                                                                 
                int color = mColorWheel.getColor();                                              
                                                                                                 
                relativeLayout.setBackgroundColor(color);                                        
                                                                                                 
                showFactButton.setTextColor(color);                                              
            }                                                                                    
        };                                                                                       
                                                                                                 
        showFactButton.setOnClickListener(listener);                                             
        Toast.makeText(this, "Welcome to Fun Facts!!", Toast.LENGTH_LONG).show();                
                                                                                                 
    }                                                                                            
}                                                                                                
                                                                                                 
