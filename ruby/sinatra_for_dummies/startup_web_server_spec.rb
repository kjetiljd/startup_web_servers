require './startup_web_server'

describe StartupWebServer do

  it "parses numeric question" do
    a = StartupWebServer.new.answer("what the sum of 4 and 12")
    a.should == "16"
  end

end
