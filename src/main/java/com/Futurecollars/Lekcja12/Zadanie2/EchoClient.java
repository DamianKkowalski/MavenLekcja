package com.Futurecollars.Lekcja12.Zadanie2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        String hostName = "localhost";
        int portNumber = 12345;
        try (Socket socket = new Socket(hostName, portNumber);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Connected to the server");
            String userInputLine;
            while ((userInputLine = userInput.readLine()) != null) {
                out.println(userInputLine);

                String response = in.readLine();
                System.out.println("Received from server: " + response);
            }
    } catch (IOException e) {
            System.err.println("Błąd podczas komunikacji z serwerem: " + e.getMessage());

        }
    }
}

