package preparation.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLICheck {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		try {
			Process p = rt.exec("touch rupu.txt");
			new Thread(new Runnable() {
			    public void run() {
			        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
			        String line = null;

			        try {
			            while ((line = input.readLine()) != null)
			                System.out.println(line);
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
			    }
			}).start();

			p.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
