package com.example.kkingsbe.cataanhelper;

enum Resources
{
    BRICK, SHEEP, WOOD, WHEAT, ORE, GOLD, NONE
}

public class ResourceTile {
    int tile = 0;
    Resources resource;

    ResourceTile(Resources tempResource, int tempTile){
        tile = tempTile;
        resource = tempResource;
    }
}
