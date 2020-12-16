require 'sinatra'

module Dojo
  def self.answer(q)
    case q
    when /the sum of (\d+) and (\d+)/
      $1.to_i + $2.to_i
    when /what's santa clause's real name/
      "Kris Kringle"
    else
      "team name"
    end
  end
end

# Sinatra configuration
set :port, 1337
set :bind, '0.0.0.0'

get '/' do
  puts "Request received: #{params[:q]}"
  answer = Dojo.answer(params[:q]).to_s
  puts "Answering with: #{answer}"
  answer
end
