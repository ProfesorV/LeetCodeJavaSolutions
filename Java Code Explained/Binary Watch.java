class Solution {
  //int
  public List<String> readBinaryWatch(int turnedOn) {
    //.range()
    return IntStream.range(0, 12)
        //.boxed()
        .boxed()
        //.flatMap()
        .flatMap(
            //.range()
            h -> IntStream.range(0, 60)
                //.boxed()
                .boxed()
                //.filter(int -> .bitCount(int)+ .bitCount(int) == int)
                .filter(s -> Integer.bitCount(h) + Integer.bitCount(s) == turnedOn)
                //.map(int -> .format(""int, int))
                .map(m -> String.format("%d:%02d", h, m))
        )
        //.collect(.toList())
        .collect(Collectors.toList());
  }
}
