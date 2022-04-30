package com.medicalHealth.swasthyamita;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Component;

@Component
public class Codec {

	 public String decrypt(String encrypted) throws Exception {
		   String key1="IjfgGhpOiLjbrtJf";
		   String key2="pOiJlKmmHgFvdStf";
	    IvParameterSpec iv = new IvParameterSpec(key2.getBytes("UTF-8"));

	    SecretKeySpec skeySpec = new SecretKeySpec(key1.getBytes("UTF-8"), "AES");

	    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	    cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
	    byte[] original = cipher.doFinal(Base64.getDecoder().decode(encrypted.getBytes()));

	    return new String(original);
	  }
	 
	 public String encrypt(String encrypted) throws Exception {
		 if(encrypted==""|| encrypted==null) {
			 return "";
		 }
			String key1 = "IjfgGhpOiLjbrtJf";
			String key2 = "pOiJlKmmHgFvdStf";
			IvParameterSpec iv = new IvParameterSpec(key2.getBytes("UTF-8"));

			SecretKeySpec skeySpec = new SecretKeySpec(key1.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
			byte[] ctbytes = cipher.doFinal(encrypted.getBytes());
			String original = new String(Base64.getEncoder().encode(ctbytes), "UTF-8");
			return original;
		}
}
