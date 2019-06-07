package org.acme.groovy.bean

class Song {
    def name
    def artist
    def genre

    String toString() {
//        "$name, $artist, $genre"
        "${name}, ${artist}, ${getGenre()}"
    }

    def getGenre(suffix) {
        genre?.toUpperCase() + ", $suffix!"
    }
}

