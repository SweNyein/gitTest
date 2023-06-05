package com.example.udemymovieapp.model

data class Movie(val id: String ,
                 val title: String,
                 val year: String,
                 val genre : String,
                 val director : String,
                 val actors: String,
                 val plot: String,
                 val poster : String,
                 val images: List<String>,
                 val rating : String)


fun getMovies(): List<Movie> {
    return listOf(
        Movie(id = "001",
            title = "Avatar",
            year = "2020",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang",
            poster =  "http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg Metascore: 83",
            images = listOf("https://images-na.ssl-images-amazon.com/images/M/MV5BMjEyOTYyMzUxNl5BMl5BanBnXkFtZTcwNTg0MTUzNA@@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNzM2MDk3MTcyMV5BMl5BanBnXkFtZTcwNjg0MTUzNA@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
            ),
            plot = "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",

        rating = "3 Stars"

            ),

        Movie(id = "002",
        title = "Avatar movie",
        year = "2022",
        genre = "Action, Adventure, Fantasy",
        director = "James Cameron",
        actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang",
            plot = "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",

            poster =  "http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg Metascore: 83",
            images = listOf("https://images-na.ssl-images-amazon.com/images/M/MV5BMTI0NTI4NjE3NV5BMl5BanBnXkFtZTYwMDA0Nzc4._V1_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNzM2MDk3MTcyMV5BMl5BanBnXkFtZTcwNjg0MTUzNA@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
            ),
        rating = "3 Stars"

    ),


        Movie(id = "003",
            title = "Avatar movie",
            year = "2022",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang",
            plot = "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",

            poster =  "http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg Metascore: 83",
            images = listOf(      "https://images-na.ssl-images-amazon.com/images/M/MV5BMTIwMDg2MDU4M15BMl5BanBnXkFtZTYwMTA0Nzc4._V1_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTIwMDg2MDU4M15BMl5BanBnXkFtZTYwMTA0Nzc4._V1_.jpg"
            ),
            rating = "3 Stars"

        ),



        Movie(id = "004",
            title = "Avatar movie",
            year = "2022",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang",
            plot = "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",

            poster =  "http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg Metascore: 83",
            images = listOf(           "https://images-na.ssl-images-amazon.com/images/M/MV5BMTMwNTg5MzMwMV5BMl5BanBnXkFtZTcwMzA2NTIyMw@@._V1_SX1777_CR0,0,1777,937_AL_.jpg",

                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTIwMDg2MDU4M15BMl5BanBnXkFtZTYwMTA0Nzc4._V1_.jpg"
            ),
            rating = "3 Stars"

        ),



        Movie(id = "005",
            title = "Avatar movie",
            year = "2022",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang",
            plot = "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",

            poster =  "http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg Metascore: 83",
            images = listOf(            "https://images-na.ssl-images-amazon.com/images/M/MV5BMTA0NjY0NzE4OTReQTJeQWpwZ15BbWU3MDczODg2Nzc@._V1_SX1777_CR0,0,1777,999_AL_.jpg",

                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTIwMDg2MDU4M15BMl5BanBnXkFtZTYwMTA0Nzc4._V1_.jpg"
            ),
            rating = "3 Stars"

        ),




        Movie(id = "006",
            title = "Avatar movie",
            year = "2022",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang",
            plot = "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",

            poster =  "http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg Metascore: 83",
            images = listOf(      "https://images-na.ssl-images-amazon.com/images/M/MV5BNDIwMDIxNzk3Ml5BMl5BanBnXkFtZTgwMTg0MzQ4MDE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",

                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTIwMDg2MDU4M15BMl5BanBnXkFtZTYwMTA0Nzc4._V1_.jpg"
            ),
            rating = "3 Stars"

        ),

        Movie(id = "007",
            title = "Avatar movie",
            year = "2022",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang",
            plot = "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",

            poster =  "http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg Metascore: 83",
            images = listOf("https://images-na.ssl-images-amazon.com/images/M/MV5BMTIwMDg2MDU4M15BMl5BanBnXkFtZTYwMTA0Nzc4._V1_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTIwMDg2MDU4M15BMl5BanBnXkFtZTYwMTA0Nzc4._V1_.jpg"
            ),
            rating = "3 Stars"

        )

    )
}


