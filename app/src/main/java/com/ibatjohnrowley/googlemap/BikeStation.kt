package com.ibatjohnrowley.googlemap

class Position (var lat: Double, var lng: Double )

class BikeStation(var number: Int, var address: String, var position: Position)

class Stations(val stations: List<BikeStation>)
