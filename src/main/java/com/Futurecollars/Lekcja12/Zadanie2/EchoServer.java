package com.Futurecollars.Lekcja12.Zadanie2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {

        int portNumber = 12345;

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            System.out.println("Server Echo works");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                    System.out.println("New connection accepted");
                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {

                        System.out.println("Received from client: " + inputLine);

                        String response = inputLine.toUpperCase();
                        out.println(response);
                    }

                } catch (IOException e) {
                    System.err.println("Błąd podczas obsługi klienta: " + e.getMessage());
                }
            }

        }
        catch (IOException e) {
            System.err.println("Błąd podczas nasłuchiwania na porcie " + portNumber + ": " + e.getMessage());
        }


    }
}
