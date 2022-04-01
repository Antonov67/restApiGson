package com;




import com.google.gson.Gson;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String responseBody;
        responseBody = new ConnectionFirst().getStringBuffer().toString();

        Gson gson = new Gson();
        Album[] arr= gson.fromJson(responseBody,Album[].class);
        System.out.println(Arrays.toString(arr));




        //new ConnectionSecond().setConnection();
    }
}
