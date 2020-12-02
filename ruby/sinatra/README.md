# Sinatra

> Sinatra is a DSL for quickly creating web applications in Ruby with minimal effort

Sinatra is a lightweight and simple HTTP server for Ruby.
The code in `app.rb` can be used as a base for a web app, and `app_spec.rb` is a start for testing that said web app.

Recommend using newest Ruby when coding.
All dependencies can be found in the `Gemfile`, install them with `bundle install`.

Sinatra will automatically log incomming requests.

## Running

Running a standalone Sinatra-app is as simple as running `ruby app.rb`.
Kill it with `Ctrl + C`, and start it again with the same commando.

A simple test after you have starter the server, is to go to http://localhost:1337/?q=what+is+the+sum+of+8+and+22 and see that it returns `30`.

### Hot reloading

If you want automatic reloading/restarting of your app when working, you can use either `rerun` og `shotgun`.

#### Rerun

Rerun is the simplest reloading tool to use, as it just watches for file changes in the current directory, and restarts it.
Should work on all systems out of the box.

```
rerun ruby app.rb
```

https://github.com/alexch/rerun

#### Shotgun

> Each time a request is received, it forks, loads the application in the child process, processes the request, and exits the child process

A bit more advanced, but quicker. As it runs it's own web server you need to specify port and host.

```
shotgun --port 1337 --host 0.0.0.0
```

https://github.com/rtomayko/shotgun

## Testing

Testing are done with rspec, and tests are runned with `rspec .`.

Read more about how to write test with rspec at [relishapp.com](https://relishapp.com/rspec/docs/gettingstarted)
