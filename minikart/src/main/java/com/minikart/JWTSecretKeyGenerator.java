package com.minikart;

import java.security.SecureRandom;
import java.util.Base64;

public class JWTSecretKeyGenerator {

    public static void main(String[] args) {
        // Generate a 256-bit (32-byte) random key
        byte[] key = generateRandomKey(32);

        // Encode the key using Base64
        String encodedKey = Base64.getEncoder().encodeToString(key);

        // Print the encoded key
        System.out.println("Generated JWT Secret Key: " + encodedKey);
    }

    private static byte[] generateRandomKey(int length) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] key = new byte[length];
        secureRandom.nextBytes(key);
        return key;
    }
}

