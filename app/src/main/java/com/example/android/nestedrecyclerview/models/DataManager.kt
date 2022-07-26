package com.example.android.nestedrecyclerview.models

object DataManager {
    val parentList = ArrayList<Item>()
    val animationList = ArrayList<Movie>()
    val adventureList = ArrayList<Movie>()
    val scienceFictionList = ArrayList<Movie>()
    val actionList = ArrayList<Movie>()
    val ambiguityList = ArrayList<Movie>()

    init {
        animationList.add(Movie("Up","https://th.bing.com/th/id/OIP.aPJ3KrwORAUaQtoV0LQQCQHaKl?pid=ImgDet&rs=1"))
        animationList.add(Movie("Inside Out", "https://th.bing.com/th/id/R.cb966cff1c8122d6c3ade3bc0c54c380?rik=h40bf3CcddLikQ&riu=http%3a%2f%2fwww.dvdsreleasedates.com%2fposters%2f800%2fI%2fInside-Out-2015-movie-poster.jpg&ehk=3U0dmpyXQQ6qemL2uNaUma%2f8PmfnNtoAhFu8hhRmZlw%3d&risl=&pid=ImgRaw&r=0"))
        animationList.add(Movie("Coco", "https://th.bing.com/th/id/R.a35551f483abaa6acc59cfad376cadf7?rik=AtA3b%2bkB7WzgrA&pid=ImgRaw&r=0"))
        animationList.add(Movie("Toy Story 3","https://th.bing.com/th/id/R.bc63dfc28c96f8d4c43a836a060bf426?rik=4YyCDBqHOHT%2f6g&pid=ImgRaw&r=0"))
        animationList.add(Movie("Zootopia","https://th.bing.com/th/id/R.ea2f92104cde82008a0018f288ea4f35?rik=USkTSMUQ6Uu60g&pid=ImgRaw&r=0"))
        animationList.add(Movie("Frozen","https://th.bing.com/th/id/R.0fb9aa3b45027bbb1c4482056d7013e2?rik=hs%2bI2qinhN0DmQ&pid=ImgRaw&r=0"))

        adventureList.add(Movie("Morbius", "https://th.bing.com/th/id/R.4f6c74ca7b3147e71be583d0099629e8?rik=gSzB%2fKEQIAiLpA&pid=ImgRaw&r=0"))
        adventureList.add(Movie("Mulan","https://th.bing.com/th/id/R.648d07ee797b82aceae9d5a3c8b96153?rik=e28zwF7YrWUejg&pid=ImgRaw&r=0"))
        adventureList.add(Movie("Finch","https://th.bing.com/th/id/R.63a043c65643a6aa58e50a0e1a1d2360?rik=dwlclzxZy7imww&pid=ImgRaw&r=0"))
        adventureList.add(Movie("Okja","https://th.bing.com/th/id/R.68179059ebe059e96a4c7ff1712aedcd?rik=x%2f1WpPe12ORCjw&riu=http%3a%2f%2fwww.vanyaland.com%2fwp-content%2fuploads%2f2017%2f05%2fokja-poster.jpeg&ehk=SGwhrNgqP2S%2bir86I9jHGn9xD34lje%2fmVKLQ6wNBHKw%3d&risl=&pid=ImgRaw&r=0"))
        adventureList.add(Movie("Predators","https://th.bing.com/th/id/OIP.2KckT9IuSvK-KsZMMga9MwHaKt?pid=ImgDet&rs=1"))
        adventureList.add(Movie("Hercules","https://th.bing.com/th/id/R.f1dfde94ab9532364d9e0c5e1bdc97f6?rik=P4FkMtzVBsNboQ&pid=ImgRaw&r=0"))

        scienceFictionList.add(Movie("Interstellar","https://th.bing.com/th/id/R.78b598256406f899144900830afd163a?rik=ZJoNWP%2bQzOtGWA&pid=ImgRaw&r=0"))
        scienceFictionList.add(Movie("Logan","https://th.bing.com/th/id/R.0a73fd1914bcad2a65022627575496dc?rik=%2bb%2fLlIr1WFj6dw&pid=ImgRaw&r=0"))
        scienceFictionList.add(Movie("Arrival","https://th.bing.com/th/id/OIP.CzemMm7JtraB9S5EjR4A8gHaLk?pid=ImgDet&rs=1"))
        scienceFictionList.add(Movie("gravity","https://th.bing.com/th/id/R.a97244f8d0dd7daa9b5327c96ee6b33a?rik=pjesfIJqs6fKKw&pid=ImgRaw&r=0"))
        scienceFictionList.add(Movie("Tenet","https://th.bing.com/th/id/R.c70e7f39efc3d8fd0a09ddce7a8f6b67?rik=LomB%2bp%2fPAfPlsw&pid=ImgRaw&r=0"))
        scienceFictionList.add(Movie("Oblivion","https://th.bing.com/th/id/R.f765085fe5cc25294b733fea48c65889?rik=wwh24Zg9hohwcA&pid=ImgRaw&r=0"))

        actionList.add(Movie("The Batman","https://th.bing.com/th/id/R.625b11cefe5c064d869ddf910fe100b7?rik=yx%2fPFkCMxj27nw&pid=ImgRaw&r=0"))
        actionList.add(Movie("1917","https://th.bing.com/th/id/R.698f652317e488936802ed931f65e575?rik=Cm75PJ4Il65K3Q&pid=ImgRaw&r=0"))
        actionList.add(Movie("Avatar","https://th.bing.com/th/id/R.a3d20cfa04c5affc24975d409ea20974?rik=PafJFHKVzjS2BA&pid=ImgRaw&r=0"))
        actionList.add(Movie("Dunkirk","https://th.bing.com/th/id/R.bad05ea95db4821d9a3d25f3aac21beb?rik=8K75I5MAcWcKOA&pid=ImgRaw&r=0"))
        actionList.add(Movie("Looper","https://th.bing.com/th/id/R.ae8b9741d3295295b29b5367e0d5b709?rik=hWHPtUD5LSqEuQ&pid=ImgRaw&r=0"))
        actionList.add(Movie("Rush","https://th.bing.com/th/id/R.2e0bd713aaaf70f6298df4322e16e7c0?rik=4ZEFLR%2f3UJSSkA&pid=ImgRaw&r=0"))

        ambiguityList.add(Movie("Memento","https://th.bing.com/th/id/R.f91489e87595385a61b7a20b2dbe05df?rik=81ieavRlcUV3uA&riu=http%3a%2f%2f13movies.files.wordpress.com%2f2014%2f01%2fmemento-poster.jpg&ehk=X0DQohXTxzX5j5zl74nNmrT9er%2bWbs%2fUME2%2f%2btHBnxE%3d&risl=&pid=ImgRaw&r=0"))
        ambiguityList.add(Movie("Sicario","https://th.bing.com/th/id/OIP.NOhk2zsIhL8MdjmwuZcnlgHaLa?pid=ImgDet&rs=1"))
        ambiguityList.add(Movie("Se7en","https://th.bing.com/th/id/R.c79dc8ec7b88e71254ddd95ebec23b4c?rik=bA95cQd1VrhrPg&pid=ImgRaw&r=0"))
        ambiguityList.add(Movie("Us","https://th.bing.com/th/id/R.36fe8f77da0db16e8229d1636a08fd8e?rik=ENwQb7QnU4DIvQ&riu=http%3a%2f%2fwww.impawards.com%2f2019%2fposters%2fus_ver3.jpg&ehk=q6aw0o4qT%2fHPDMiPd7XOMntJUFpnkstn3kVH449ajMY%3d&risl=&pid=ImgRaw&r=0"))
        ambiguityList.add(Movie("Zodiac","https://th.bing.com/th/id/R.0ad380e2d575ceb706950dd9f609f5f8?rik=v7h4pZA5AEWpig&pid=ImgRaw&r=0"))
        ambiguityList.add(Movie("Searching","https://th.bing.com/th/id/R.72b64c9d92f1d1ca6504857f89d31062?rik=WxQzEsr7bn6GaA&pid=ImgRaw&r=0"))

        parentList.add(Header("Home Cinema"))
        parentList.add(Parent("Animation", animationList))
        parentList.add(Parent("Adventure", adventureList))
        parentList.add(Parent("Science-Fiction", scienceFictionList))
        parentList.add(Parent("Action", actionList))
        parentList.add(Parent("Ambiguity", ambiguityList))
    }
}