package clases;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec; 
import java.util.*;
import sun.misc.BASE64Encoder;

public class AES {

    public String encryptAES(String llavesimetrica, String mensaje){
        byte[] hacerCifracion = null;
        
        SecretKeySpec key = new SecretKeySpec(llavesimetrica.getBytes(), "AES");
        Cipher cifracion;
        try {
            cifracion = Cipher.getInstance("AES");
            cifracion.init(Cipher.ENCRYPT_MODE, key);
            hacerCifracion = cifracion.doFinal(mensaje.getBytes());
            
            String base64 = new BASE64Encoder().encode(hacerCifracion);
            
            return base64;
        } catch (Exception e) {
            return "La longitud de la llave tiene que ser de 16, 24 o 32 caracteres ENCR";
        }
    }
    
    public byte[] encryptAESHidden(String llavesimetrica, String mensaje){
        byte[] hacerCifracion = null;
        SecretKeySpec key = new SecretKeySpec(llavesimetrica.getBytes(), "AES");
        Cipher cifracion;
        try {
            cifracion = Cipher.getInstance("AES");
            cifracion.init(Cipher.ENCRYPT_MODE, key);
            hacerCifracion = cifracion.doFinal(mensaje.getBytes());
            
            return hacerCifracion;
            
        } catch (Exception e) {
            System.out.println("ERROR, la llave es muy chica o muy grande");
            System.out.println(e.getMessage());
        }
        
        return hacerCifracion;
    }
    
    
    public String decryptAES(String llavesimetrica, byte[] hacerCifracion){
        byte[] haceDescifracion = null;
        
        SecretKeySpec key = new SecretKeySpec(llavesimetrica.getBytes(), "AES");
        Cipher cifracion;       
        try {
            cifracion = Cipher.getInstance("AES");
            cifracion.init(Cipher.DECRYPT_MODE, key);
            byte[] mensajeDescifrado = cifracion.doFinal(hacerCifracion);
            String mensajedesci = new String(mensajeDescifrado);
            
            return mensajedesci;
        } catch (Exception e) {
            return "La longitud de la llave tiene que ser de 16, 24 o 32 caracteres";
        }
    }
    
}