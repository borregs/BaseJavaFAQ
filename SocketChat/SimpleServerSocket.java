package sockets;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServerSocket {

    public static void main(String[] args) {
        try{
            System.out.println("Inicializando servidor");
            ServerSocket servidor = new ServerSocket(9000);
            System.out.println("Servidor en operación");
            
            for(int i=0;i<10;i++){//solo para q se conecten 10 clientes
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado: "+(i+1));
                
                
                //
                
                OutputStream os = cliente.getOutputStream();//permite enviar mensaje
                DataOutputStream enviar = new DataOutputStream(os);
                enviar.writeUTF("HOLA DESDE  EL SERVIDOR AL CLIENTE \n\n");
                
                
                
            InputStream is = cliente.getInputStream();//Para recivir mensaje del cliente
            DataInputStream recibe = new DataInputStream(is);
            System.out.println("\n\t MENSAJE RECIBIDO: " +recibe.readUTF());
            
                cliente.close();
            }

            System.out.println("Cliente desconectado");
            servidor.close();
            System.out.println("Servidor desconectado");
        }catch(IOException e){
            System.out.println("Error "+e);
        }
    }
    
}
