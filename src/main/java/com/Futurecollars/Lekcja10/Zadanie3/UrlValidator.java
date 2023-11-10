package com.Futurecollars.Lekcja10.Zadanie3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {

    public static boolean validation(String url)
    {
        String urlRegex = "^(https?|ftp):\\/\\/(www\\.)?[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})+(\\/[^\\s]*)?$";

        Pattern pattern = Pattern.compile(urlRegex);

        Matcher matcher = pattern.matcher(url);

        return matcher.matches();
    }
}
