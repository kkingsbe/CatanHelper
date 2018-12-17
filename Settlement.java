package com.example.kkingsbe.cataanhelper;

import java.util.ArrayList;

public class Settlement {
    ArrayList<ResourceTile> resources = new ArrayList<>();

    Settlement(ResourceTile tile1, ResourceTile tile2, ResourceTile tile3){
        resources.add(tile1);
        resources.add(tile2);
        resources.add(tile3);
    }
}
