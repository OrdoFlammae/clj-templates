# clj-lib

My default template for creating a clojure library. 

## Purpose
I created this because I'd like the default lib template to be slightly different (different license, extra dependencies, etc).

## Usage

Build a deployable jar of this template:

    $ clojure -A:jar

Install it locally:

    $ clojure -A:install

Deploy it to Clojars -- needs `CLOJARS_USERNAME` and `CLOJARS_PASSWORD` environment variables:

    $ clojure -A:deploy
    
Use it to generate a lib.

    $ clojure -A:new clj-lib my-new-lib

## License

Copyright © 2020 Ordoflammae

Distributed under the MIT License.
