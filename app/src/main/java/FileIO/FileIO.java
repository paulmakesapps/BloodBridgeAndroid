package FileIO;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.paulmakesapps.paul.bloodbridge.Main;
import com.paulmakesapps.paul.bloodbridge.NamingOpen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import GenericCharacter.*;

/**
 * Created by Paul on 6/4/2017.
 */
public class FileIO {

    public FileIO(){

    }


    public GenericCharacter getPlayer(Context cnx) {
        GenericCharacter chr= new GenericCharacter("name","Warrior","generic description","mainchar",8,14,1,1,5);
String line="xcv";
        int i=0;
        try {

            InputStreamReader isr = new InputStreamReader(cnx.openFileInput("player.txt"));
            BufferedReader br = new BufferedReader(isr);

            while (line != null) {
            //(String name, String type, String description, String imgName,int atk, int def, int dmg,int level,int health) {
                if(i==0) {
                    chr.setName(br.readLine());
                }
                if(i==1) {
                    chr.setType(br.readLine());
                }
                if(i==2) {
                    chr.setDescription(br.readLine());
                }
                if(i==3) {
                    chr.setImgName(br.readLine());
                }
                if(i==4) {
                    chr.setAtk(Integer.parseInt(br.readLine()));
                }
                if(i==5) {
                    chr.setDef(Integer.parseInt(br.readLine()));
                }
                if(i==6) {
                    chr.setDmg(Integer.parseInt(br.readLine()));
                }
                if(i==7) {
                    chr.setLevel(Integer.parseInt(br.readLine()));
                }
                if(i==8) {
                    chr.setHealth(Integer.parseInt(br.readLine()));
                }

                i++;

            }
            br.close();
            isr.close();

        } catch (Exception e) {}

return chr;

    }


        public void savePlayer(GenericCharacter chr,Context mcontext) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(mcontext.openFileOutput("player.txt", Context.MODE_WORLD_READABLE));
            BufferedWriter bw = new BufferedWriter(osw);

            Toast.makeText(mcontext,"FROM SAVE PLAYER",Toast.LENGTH_LONG).show();

   // public Character(String name, String type, String description, String imgName,int atk, int def, int dmg,int level,int health)
            bw.write(chr.getName());
            bw.newLine();
            bw.write(chr.getType());
            bw.newLine();
            bw.write(chr.getDescription());
            bw.newLine();
            bw.write(chr.getImgName());
            bw.newLine();
            bw.write(chr.getAtk()+"");
            bw.newLine();
            bw.write(chr.getDef()+"");
            bw.newLine();
            bw.write(chr.getDmg()+"");
            bw.newLine();
            bw.write(chr.getLevel()+"");
            bw.newLine();
            bw.write(chr.getHealth()+"");
            bw.newLine();

            bw.close();
            osw.close();

        } catch (Exception e) {
            Log.e("MYAPP", "exception", e);
        }
    }

    public void saveData(Context mContext) {
        Toast.makeText(mContext,"FROM SAVE DATA",Toast.LENGTH_LONG).show();

        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(mContext.openFileOutput("file.txt", Context.MODE_WORLD_READABLE));
            outputStreamWriter.write("hallo welt");
            outputStreamWriter.close();
        }
        catch (IOException e) {
        }
    }


}
