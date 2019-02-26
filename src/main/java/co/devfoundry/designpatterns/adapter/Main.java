package co.devfoundry.designpatterns.adapter;

import co.devfoundry.designpatterns.adapter.api.LibraryAPI;
import co.devfoundry.designpatterns.adapter.api.LibraryAPIImpl;
import co.devfoundry.designpatterns.adapter.api.LibraryAPIv2;
import co.devfoundry.designpatterns.adapter.api.LibraryAPIv2Impl;

public class Main {

    public static void main(String[] args) {

        LibraryAPI api = new LibraryAPIImpl();
        User user = new User("Jakub", "Czapiewski", "912863");
        BookConnector connector = new BookConnector(user, api);

        connector.checkAviability("Dobry");

        LibraryAPIv2 apIv2 = new LibraryAPIv2Impl();
        APIAdapter adapter = new APIAdapter(apIv2, user);

        BookConnector bookConnector = new BookConnector(user, adapter);
        bookConnector.checkAviability("Dlsdfj");

    }
}
