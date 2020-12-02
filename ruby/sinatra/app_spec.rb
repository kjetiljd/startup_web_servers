require './app'

describe Dojo do
  def q(a)
    Dojo.answer(a)
  end

  it "parses numeric question" do
    expect(q("what the sum of 4 and 12")).to eq(16)
  end
end
