# clj-app

My default template for creating an app.

## Purpose
I created this because I'd like the default app template to be slightly different (different license, extra dependencies, etc).

## Usage

Build a deployable jar of this template:

    $ clojure -A:jar

Install it locally:

    $ clojure -A:install

Deploy it to Clojars -- needs `CLOJARS_USERNAME` and `CLOJARS_PASSWORD` environment variables:

    $ clojure -A:deploy
    
Use it to generate an app.

    $ clojure -A:new clj-app my-new-app

## License

Copyright © 2020 Ordoflammae

Distributed under the MIT License.
