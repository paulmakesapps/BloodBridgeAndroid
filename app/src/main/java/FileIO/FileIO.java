package FileIO;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.paulmakesapps.paul.bloodbridge.Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import GenericCharacter.*;

/**
 * Created by Paul on 6/4/2017.
 */
public class FileIO extends Main{

    public FileIO(){

    }

    public void appendToFile(String filename) {
            try {

                OutputStreamWriter osw = new OutputStreamWriter(this.openFileOutput(filename+".txt", Context.MODE_WORLD_READABLE));
                BufferedWriter bw = new BufferedWriter(osw);

                bw.append(filename);
                bw.newLine();

                //Toast.makeText(getActivity(), filename + " saved", Toast.LENGTH_SHORT).show();
                bw.close();
                osw.close();

            } catch (Exception e) {

            }
    }

    public void readFile(String filename, int i) {
        String line = "xcv";



        try {

                InputStreamReader isr = new InputStreamReader(this.openFileInput(filename + ".txt"));

            BufferedReader br = new BufferedReader(isr);

            while (line != null) {

                line = br.readLine();
                //return[i] = line;
                i++;

            }
            br.close();
            isr.close();

        } catch (Exception e) {

        }
    }

    public void writeToFile(String filename) {

        String hold = filename + ".txt";
        try {


            OutputStreamWriter osw = new OutputStreamWriter(this.openFileOutput(hold, Context.MODE_WORLD_WRITEABLE));
            BufferedWriter bw = new BufferedWriter(osw);

                    bw.write(hold);
                    bw.newLine();

            bw.close();
            osw.close();

        } catch (Exception e) {
            Log.e("MYAPP", "exception", e);
        }
    }


    public GenericCharacter getMainCharacter() {
        GenericCharacter chr= new GenericCharacter("name","Warrior","generic description","mainchar",8,14,1,1,5);
String line="xcv";
        int i=0;
        try {

            InputStreamReader isr = new InputStreamReader(this.openFileInput("player.txt"));

            BufferedReader br = new BufferedReader(isr);

            while (line != null) {
            //(String name, String type, String description, String imgName,int atk, int def, int dmg,int level,int health) {
                if(i==0) {
                    chr.setName(br.readLine());
                }

                if(i==1) {
                    chr.setType(br.readLine());
                }





                //line = br.readLine();
                //return[i] = line;
                i++;

            }
            br.close();
            isr.close();

        } catch (Exception e) {

        }

return chr;

    }


        public void saveMainCharacter(GenericCharacter chr) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(this.openFileOutput("player.txt", Context.MODE_WORLD_READABLE));
            BufferedWriter bw = new BufferedWriter(osw);

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

}
