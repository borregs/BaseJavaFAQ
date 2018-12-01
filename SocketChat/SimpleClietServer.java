package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClientServer {
    public static void main(String[] args){
        try{
            System.out.println("Inicializando cliente");
            Socket sc = new Socket("127.0.0.1",9000);
            
            InputStream is = sc.getInputStream();//Para recivir mensaje
            DataInputStream recibe = new DataInputStream(is);
            System.out.println("\n\t MENSAJE RECIBIDO, " +recibe.readUTF());
            
            OutputStream os = sc.getOutputStream();//permite enviar mensaje desde teclado
                DataOutputStream enviar = new DataOutputStream(os);
                
                Scanner leer = new Scanner(System.in);
                String txt = leer.nextLine();
                enviar.writeUTF(txt);//envia msj teclado
            
            System.out.println("Cliente conectado");                    
            sc.close();
            System.out.println("Cliente desconectado");
        }catch(Exception e){
            System.out.println("Error "+e);
        }
    }
}

