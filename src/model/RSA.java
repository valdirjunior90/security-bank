package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA implements Serializable {

    private final static BigInteger one = new BigInteger("1");
    private final static SecureRandom random = new SecureRandom();

    private BigInteger privateKey;
    private BigInteger publicKey;
    private BigInteger modulus;

    // Gera um par de chaves pública/privada usando o tamanho da chave especificado
    public RSA(int bitLength) {
        // Escolhe dois números primos grandes aleatórios
        BigInteger p = BigInteger.probablePrime(bitLength / 2, random);
        BigInteger q = BigInteger.probablePrime(bitLength / 2, random);

        // Calcula n = p * q e φ(n) = (p - 1) * (q - 1)
        BigInteger phi = (p.subtract(one)).multiply(q.subtract(one));
        modulus = p.multiply(q);

        // Escolhe um número inteiro "e" que é coprimo com φ(n)
        publicKey = new BigInteger("65537"); // 65537 é um valor típico para "e"
        while (phi.gcd(publicKey).compareTo(one) > 0 && publicKey.compareTo(phi) < 0) {
            publicKey = publicKey.add(one);
        }

        // Calcula a chave privada "d" como a inversa multiplicativa de "e" módulo φ(n)
        privateKey = publicKey.modInverse(phi);
    }

    // Criptografa o texto usando a chave pública
    public byte[] encrypt(byte[] message) {
        return (new BigInteger(message)).modPow(publicKey, modulus).toByteArray();
    }

    // Decifra o texto usando a chave privada
    public byte[] decrypt(byte[] message) {
        return (new BigInteger(message)).modPow(privateKey, modulus).toByteArray();
    }
}