# aku

aku is a template for building websites in clojure.
ring server has been swapped out and http-kit is being used instead.

There are two modes of running aku

###dev-mode
to run in dev mode you can either use 

    $ lein run
or 

    $ java -jar aku.jar
    
dev mode adds the reload middleware on the application.

###production-mode
for production mode you have to set the environment variable "production=true"

    $ production=true lein run
    
or
    
    $ production=true java -jar aku.jar

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein run

## License

Copyright © 2014 akshay shekher
