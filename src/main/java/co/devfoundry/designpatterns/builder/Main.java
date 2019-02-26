package co.devfoundry.designpatterns.builder;

import co.devfoundry.designpatterns.builder.flights.FlightLeg;

public class Main {

    public static void main(String[] args) {

        FlightLeg leg = new FlightLeg.FlightLegBuilder().builderFrom("Gdańsk").builderTo("Wrocław").builderPrice(100)
                .build();

        //FlightLeg freeLeg = new FlightLeg.FlightLegBuilder().builderFrom("Gdańsk").builderTo("Wrocław").builderPrice(0).build();

        System.out.println(leg);
        //System.out.println(freeLeg);
    }
}
