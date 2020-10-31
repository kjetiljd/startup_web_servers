require 'rubygems'
require 'sinatra'

class StartupWebServer

  def answer(q)
    if q =~ /the sum of (\d+) and (\d+)/
      return ($1.to_i + $2.to_i).to_s
    elsif q =~ /what's santa clause's real name/
      return "Kris Kringle"
    else
      return "team name"
    end
  end

end

server = StartupWebServer.new

configure do
  set :port, 1337
end

get '/' do
  puts "A request has arrived"
  server.answer(params[:q])
end
