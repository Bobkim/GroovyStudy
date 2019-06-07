package org.acme.groovy

import org.acme.groovy.bean.Song

class SongExample {
    static void main(args) {
        def song = new Song(name:"Happy", artist:"Bob", genre:"Jazz")

        def sng3 = new Song()
        sng3.name = "Funkytown"
        sng3.artist = "Lipps Inc."
        sng3.setGenre("Disco")

        def sng2 = new Song()

        println sng3
        println sng3.getGenre("good")
    }
}