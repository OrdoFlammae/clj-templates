# clj-template

My default template for creating a [clj-new](https://github.com/seancorfield/clj-new) template. 

## Purpose
I created this because I'd like the default clj-new template to be slightly different (different license, extra dependencies, etc).

## Usage

Build a deployable jar of this template:

    $ clojure -A:jar

Install it locally:

    $ clojure -A:install

Deploy it to Clojars -- needs `CLOJARS_USERNAME` and `CLOJARS_PASSWORD` environment variables:

    $ clojure -A:deploy
    
Use it to generate a template.

    $ clojure -A:new clj-template my-new-template

## License

Copyright © 2020 Ordoflammae

Distributed under the MIT License.
